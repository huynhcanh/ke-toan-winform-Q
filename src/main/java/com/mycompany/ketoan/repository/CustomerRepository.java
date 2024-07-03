package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.CustomerDTO;
import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
	
	private static final String LIST_CUSTOMER_QUERY = "SELECT MaKH, Ten, DiaChi, SDT, MaSoThue FROM KhachHang WHERE maKH like :keyword";
	
	private static final String DETAIL_CUSTOMER_QUERY = "SELECT MaKH, Ten, DiaChi, SDT, MaSoThue FROM KhachHang WHERE MaKH = :MaKH";
	
	private static final String INSERT_CUSTOMER_QUERY = "INSERT INTO KhachHang (Ten, DiaChi, SDT, MaSoThue) VALUES(:Ten, :DiaChi, :SDT, :MaSoThue)";
	
	private static final String UPDATE_CUSTOMER_QUERY = "UPDATE KhachHang SET Ten=:Ten, SDT=:SDT, DiaChi=:DiaChi, MaSoThue=:MaSoThue WHERE MaKH=:MaKH";
	
	private static final String DELETE_CUSTOMER_QUERY = "DELETE FROM KhachHang WHERE MaKH=:MaKH";
	
	private static final String EXIST_ORDER_QUERY = "SELECT 1 FROM KhachHang kh WHERE kh.MaKH = :MaKH AND EXISTS(SELECT 1 FROM PhieuBanHang WHERE MaKH =:MaKH)";
	
	public static List<CustomerDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_CUSTOMER_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, CustomerDTO.class);
	}
	
	public static CustomerDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_CUSTOMER_QUERY, Map.of("MaKH", id));
		return ObjectMapper.toDTO(rs, CustomerDTO.class);
	}
	
	public static int insert(CustomerDTO customerDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(customerDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_CUSTOMER_QUERY, param);
	}
	
	public static int update(CustomerDTO customerDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(customerDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_CUSTOMER_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_CUSTOMER_QUERY, Map.of("MaKH", id));
	}
	
	public static boolean existInOrder(Integer customerId) {
		return QueryRepository.checkExistQuery(EXIST_ORDER_QUERY, Map.of("MaKH", customerId));
	}
	
}
