
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.constants.ApplicationProperties;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueryRepository {
	
	private static Connection connection = null;
	
	private static final Logger LOGGER = Logger.getLogger(QueryRepository.class.getName());
	
	private static Connection getConnection() throws SQLException {
		if (connection == null) connection = ApplicationProperties.getConnection();
		return connection;
	}
	
	//Thực thi câu lệnh SELECT
	public static ResultSet executeQuery(String query) {
		try {
			PreparedStatement stmt = getConnection().prepareStatement(query);
			LOGGER.log(Level.INFO, query);
			ResultSet rs = stmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				return null; // No records returned
			}
			return rs;
		} catch (SQLException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		}
		return null;
	}
	
	public static ResultSet executeQuery(String query, Map<String, Object> namedParameters) {
		String processedQuery = replaceNamedParameters(query, namedParameters);
		return executeQuery(processedQuery);
	}
	
	//Thực thi INSERT, DELETE, UPDATE
	public static int executeQueryUpdateDB(String query) {
		try (PreparedStatement stmt = getConnection().prepareStatement(query)) {
			return stmt.executeUpdate();
		} catch (SQLException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		}
		return 0;
	}
	
	public static int executeQueryUpdateDBReturnId(String query) {
		try (PreparedStatement stmt = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
			int affectedRows = stmt.executeUpdate();
			
			if (affectedRows > 0) {
				try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						return generatedKeys.getInt(1);
					}
				}
			}
		} catch (SQLException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		}
		return 0;
	}
	
	public static int executeQueryUpdateDBThrowExceptionIf(String query) throws SQLException {
		PreparedStatement stmt = getConnection().prepareStatement(query);
		return stmt.executeUpdate();
	}
	
	public static boolean checkExistQuery(String query, Map<String, Object> namedParameters) {
		ResultSet rs = executeQuery(query, namedParameters);
		try {
			if (rs == null) return false;
			return rs.next();
		} catch (SQLException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
		}
		return false;
	}
	
	public static int executeQueryUpdateDB(String query, Map<String, Object> namedParameters) {
		String processedQuery = replaceNamedParameters(query, namedParameters);
		LOGGER.log(Level.INFO, processedQuery);
		return executeQueryUpdateDB(processedQuery);
	}
	
	public static int executeQueryUpdateDBReturnId(String query, Map<String, Object> namedParameters) {
		String processedQuery = replaceNamedParameters(query, namedParameters);
		LOGGER.log(Level.INFO, processedQuery);
		return executeQueryUpdateDBReturnId(processedQuery);
	}
	
	public static int executeQueryUpdateDBThrowExceptionIf(String query, Map<String, Object> namedParameters) throws SQLException {
		String processedQuery = replaceNamedParameters(query, namedParameters);
		LOGGER.log(Level.INFO, processedQuery);
		return executeQueryUpdateDBThrowExceptionIf(processedQuery);
	}
	
	private static String replaceNamedParameters(String query, Map<String, Object> namedParameters) {
		for (Map.Entry<String, Object> entry : namedParameters.entrySet()) {
			String paramPlaceholder = ":" + entry.getKey();
			String value = entry.getValue() == null ? "NULL" : "'" + entry.getValue() + "'";
			query = query.replace(paramPlaceholder, value);
		}
		return query;
	}
}
