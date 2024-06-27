
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
	
	private static final String LOGIN_QUERY = "SELECT * FROM NguoiDung where TenDN = :TenDN and MatKhau = :MatKhau";
	
	private static final String LIST_EMPLOYEE_QUERY = "SELECT MaND, TenDN, MatKhau, VaiTro FROM NguoiDung";
	
	private static final String DETAIL_EMPLOYEE_QUERY = "SELECT MaND, TenDN, MatKhau, VaiTro FROM NguoiDung WHERE MaND =:MaND ";
	
	private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM NguoiDung WHERE MaND =:MaND";
	
	private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO NguoiDung (TenDN, MatKhau, VaiTro) VALUES(:TenDN, :MatKhau, :VaiTro)";
	
	private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE NguoiDung SET TenDN=:TenDN, MatKhau=:MatKhau, VaiTro=:VaiTro WHERE MaND=:MaND";
	
	private static final String EXISTED_USERNAME_QUERY = "SELECT 1 FROM NguoiDung WHERE TenDN = :TenDN";
	
	public static EmployeeDTO getUser(String username, String password) {
		ResultSet rs = QueryRepository.executeQuery(LOGIN_QUERY, Map.of("TenDN", username,
				"MatKhau", password));
		return ObjectMapper.toDTO(rs, EmployeeDTO.class);
	}
	
	public static List<EmployeeDTO> findAll() {
		ResultSet rs = QueryRepository.executeQuery(LIST_EMPLOYEE_QUERY);
		return ObjectMapper.toDTOs(rs, EmployeeDTO.class);
	}
	
	public static EmployeeDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_EMPLOYEE_QUERY, Map.of("MaND", id));
		return ObjectMapper.toDTO(rs, EmployeeDTO.class);
	}
	
	public static int delete(Integer id) throws SQLException {
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(DELETE_EMPLOYEE_QUERY, Map.of("MaND", id));
	}
	
	public static int update(EmployeeDTO employeeDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(employeeDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_EMPLOYEE_QUERY, param);
	}
	
	public static int insert(EmployeeDTO employeeDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(employeeDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_EMPLOYEE_QUERY, param);
	}
	
	public static boolean existUsername(String username) {
		return QueryRepository.checkExistQuery(EXISTED_USERNAME_QUERY, Map.of("TenDN", username));
	}
}
