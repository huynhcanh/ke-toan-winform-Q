/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;
import com.mycompany.ketoan.utils.DateTimeUtils;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class OrderRepository {
	
	private static final String LIST_ORDER_QUERY = "SELECT pbh.MaPBH, pbh.TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nd.TenDN , pbh.NgayTao, pbh.NgayGiao, pbh.GhiChu " +
			"FROM PhieuBangHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH " +
			"join NhanVien nd on nd.MaNV = pbh.MaNV WHERE pbh.MaPBH like :keyword";
	
	private static final String DETAIL_ORDER_QUERY = "SELECT pbh.MaPBH, pbh.TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nd.TenDN , pbh.NgayTao, pbh.NgayGiao, pbh.GhiChu " +
			"FROM PhieuBangHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH " +
			"join NhanVien nd on nd.MaNV = pbh.MaNV WHERE pbh.MaPBH = :MaPBH";
	
	private static final String INSERT_ORDER_QUERY = "INSERT INTO PhieuBangHang " +
			"(MaKH, TongTien, MaNV, NgayTao, NgayGiao, GhiChu)" +
			"VALUES(:MaKH, 0, :MaNV, NOW(), :NgayGiao, :GhiChu)";
	
	private static final String DELETE_ORDER_QUERY = "DELETE FROM PhieuBangHang WHERE MaPBH=:MaPBH";
	
	private static final String UPDATE_ORDER_QUERY = "UPDATE PhieuBangHang SET TongTien=:TongTien, NgayGiao=:NgayGiao, GhiChu=:GhiChu WHERE MaPBH=:MaPBH";
	
	public static List<OrderDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ORDER_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, OrderDTO.class);
	}
	
	public static OrderDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ORDER_QUERY, Map.of("MaPBH", id));
		return ObjectMapper.toDTO(rs, OrderDTO.class);
	}
	
	public static int insert(OrderDTO orderDTO) {
		return QueryRepository.executeQueryUpdateDB(INSERT_ORDER_QUERY, Map.of("MaNV", orderDTO.getEmployeeId(),
				"MaKH", orderDTO.getCustomerId(),
				"NgayGiao", DateTimeUtils.toString(orderDTO.getDeliveryDate()),
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int update(OrderDTO orderDTO) {
		return QueryRepository.executeQueryUpdateDB(UPDATE_ORDER_QUERY, Map.of("MaPBH", orderDTO.getId(),
				"MaKH", orderDTO.getCustomerId(),
				"NgayGiao", DateTimeUtils.toString(orderDTO.getDeliveryDate()),
				"TongTien", orderDTO.getTotalMoney(),
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ORDER_QUERY, Map.of("MaPBH", id));
	}
}
