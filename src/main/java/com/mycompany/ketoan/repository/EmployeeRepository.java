
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
	
	private static final String LOGIN_QUERY = "SELECT * FROM NhanVien where TenDN = :TenDN and MatKhau = :MatKhau";
	
	private static final String LIST_EMPLOYEE_QUERY = "SELECT MaNV, TenDN, MatKhau, VaiTro, Ten, Sdt, DiaChi FROM NhanVien";
	
	private static final String DETAIL_EMPLOYEE_QUERY = "SELECT MaNV, TenDN, MatKhau, VaiTro, Ten, Sdt, DiaChi FROM NhanVien WHERE MaNV =:MaNV ";
	
	private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM NhanVien WHERE MaNV =:MaNV";
	
	private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO NhanVien (TenDN, MatKhau, VaiTro, Ten, Sdt, DiaChi) VALUES(:TenDN, :MatKhau, :VaiTro, :Ten, :Sdt, :DiaChi)";
	
	private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE NhanVien SET TenDN=:TenDN, MatKhau=:MatKhau, VaiTro=:VaiTro, Ten=:Ten, Sdt=:Sdt, DiaChi=:DiaChi WHERE MaNV=:MaNV";
	
	private static final String EXISTED_USERNAME_QUERY = "SELECT 1 FROM NhanVien WHERE TenDN = :TenDN";
	
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
		ResultSet rs = QueryRepository.executeQuery(DETAIL_EMPLOYEE_QUERY, Map.of("MaNV", id));
		return ObjectMapper.toDTO(rs, EmployeeDTO.class);
	}
	
	public static int delete(Integer id) throws SQLException {
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(DELETE_EMPLOYEE_QUERY, Map.of("MaNV", id));
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
