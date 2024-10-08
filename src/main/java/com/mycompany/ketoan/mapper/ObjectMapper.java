/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapper {
	
	private static <T> Map<String, String> getColumnFieldMappings(Class<T> clazz) {
        Map<String, String> mappings = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
            if (jsonProperty != null) {
                mappings.put(jsonProperty.value(), field.getName());
            } else {
                mappings.put(field.getName(), field.getName());
            }
        }
        return mappings;
    }
	
	public static <T> Map<String, Object> convertToMap(T obj) {
		Map<String, Object> resultMap = new HashMap<>();
		if (obj == null) return resultMap;
		Class<?> clazz = obj.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			try {
				String fieldName = null;
				JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
				if (jsonProperty != null) {
					fieldName = jsonProperty.value();
				} else fieldName = field.getName();
				Object fieldValue = field.get(obj);
				resultMap.put(fieldName, fieldValue);
			} catch (IllegalAccessException e) {
				throw new RuntimeException("Error accessing field: " + field.getName(), e);
			}
		}
		return resultMap;
	}

    public static <T> T convertToObject(ResultSet rs, Class<T> clazz) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            Map<String, String> columnFieldMappings = getColumnFieldMappings(clazz);
            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnLabel(i);
                String fieldName = columnFieldMappings.get(columnName);
                if (fieldName != null) {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    Object value = rs.getObject(i);
                    if (value instanceof Timestamp && field.getType().equals(LocalDateTime.class)) {
                        value = ((Timestamp) value).toLocalDateTime();
                    }
                    field.set(obj, value);
                }
            }
            return obj;
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException 
                | NoSuchFieldException | NoSuchMethodException | SecurityException
                | InvocationTargetException | SQLException e) {
            throw new RuntimeException("Error mapping ResultSet to DTO", e);
        }
    }

    public static <T> T toDTO(ResultSet rs, Class<T> clazz) {
        if (rs == null) {
            return null;
        }
        try {
            rs.next(); //warning
            return convertToObject(rs, clazz);
        } catch (SQLException e) {
            throw new RuntimeException("Error mapping ResultSet to DTO object", e);
        }
    }

    public static <T> List<T> toDTOs(ResultSet rs, Class<T> clazz) {
        if (rs == null) {
            return null;
        }
        List<T> list = new ArrayList<>();
        try {
            while (rs.next()) {
				T obj;
				if (clazz.isPrimitive() || isWrapperType(clazz)) {
					obj = getPrimitiveOrWrapperValue(rs, clazz);
				} else {
					obj = convertToObject(rs, clazz);
				}
				list.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error mapping ResultSet to DTO List", e);
        }
        return list;
    }
	
	private static boolean isWrapperType(Class<?> clazz) {
		return clazz == Integer.class || clazz == String.class || clazz == Double.class ||
				clazz == Long.class || clazz == Float.class || clazz == Boolean.class ||
				clazz == Short.class || clazz == Byte.class || clazz == Character.class;
	}
	
	private static <T> T getPrimitiveOrWrapperValue(ResultSet rs, Class<T> clazz) throws SQLException {
		Object value = null;
		if (clazz == Integer.class || clazz == int.class) {
			value = rs.getInt(1);
		} else if (clazz == String.class) {
			value = rs.getString(1);
		} else if (clazz == Double.class || clazz == double.class) {
			value = rs.getDouble(1);
		} else if (clazz == Long.class || clazz == long.class) {
			value = rs.getLong(1);
		} else if (clazz == Float.class || clazz == float.class) {
			value = rs.getFloat(1);
		} else if (clazz == Boolean.class || clazz == boolean.class) {
			value = rs.getBoolean(1);
		} else if (clazz == Short.class || clazz == short.class) {
			value = rs.getShort(1);
		} else if (clazz == Byte.class || clazz == byte.class) {
			value = rs.getByte(1);
		} else if (clazz == Character.class || clazz == char.class) {
			value = rs.getString(1).charAt(0);
		}
		return clazz.cast(value);
	}
}
