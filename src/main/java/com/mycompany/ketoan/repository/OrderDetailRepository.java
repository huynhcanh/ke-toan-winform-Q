/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.OrderDetailDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class OrderDetailRepository {
	
	private static final String LIST_ORDER_DETAIL_QUERY = "SELECT ct.MaHH, hh.Ten as TenHH, ct.SoLuong, hh.GiaBan, ct.MaDH "
			+ " FROM ChiTietDonHang ct join HangHoa hh ON ct.MaHH = hh.MaHH "
			+ " WHERE ct.MaDH = :MaDH";
	
	private static final String DETAIL_ORDER_DETAIL_QUERY = "SELECT ct.MaHH, hh.Ten as TenHH, ct.SoLuong, hh.GiaBan, ct.MaDH "
			+ " FROM ChiTietDonHang ct join HangHoa hh ON ct.MaHH = hh.MaHH "
			+ " WHERE ct.MaDH = :MaDH and ct.MaHH = :MaHH";
	
	private static final String INSERT_ORDER_DETAIL_QUERY = "INSERT INTO ChiTietDonHang (MaHH, MaDH, SoLuong) VALUES(:MaHH, :MaDH, :SoLuong)";
	
	private static final String UPDATE_ORDER_DETAIL_QUERY = "UPDATE ChiTietDonHang SET SoLuong=:SoLuong WHERE MaHH=:MaHH and MaDH = :MaDH";
	
	private static final String DELETE_ORDER_DETAIL_QUERY = "DELETE FROM ChiTietDonHang WHERE MaDH = :MaDH and MaHH = :MaHH";
	
	private static final String DELETE_LIST_ORDER_DETAIL_QUERY = "DELETE FROM ChiTietDonHang WHERE MaDH = :MaDH";
	
	public static List<OrderDetailDTO> findAllByOrderId(Integer orderId) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ORDER_DETAIL_QUERY, Map.of("MaDH", orderId));
		return ObjectMapper.toDTOs(rs, OrderDetailDTO.class);
	}
	
	public static OrderDetailDTO findByOrderIdAndProductId(Integer orderId, Integer productId) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ORDER_DETAIL_QUERY, Map.of("MaDH", orderId, "MaHH", productId));
		return ObjectMapper.toDTO(rs, OrderDetailDTO.class);
	}
	
	public static int insert(OrderDetailDTO orderDetailDTO) {
		
		return QueryRepository.executeQueryUpdateDB(INSERT_ORDER_DETAIL_QUERY, Map.of("MaDH", orderDetailDTO.getOrderId(),
				"MaHH", orderDetailDTO.getProductId(),
				"SoLuong", orderDetailDTO.getQuantity()));
	}
	
	public static int update(OrderDetailDTO orderDetailDTO) {
		return QueryRepository.executeQueryUpdateDB(UPDATE_ORDER_DETAIL_QUERY, Map.of("MaDH", orderDetailDTO.getOrderId(),
				"MaHH", orderDetailDTO.getProductId(),
				"SoLuong", orderDetailDTO.getQuantity()));
	}
	
	public static int delete(Integer orderId, Integer productId) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ORDER_DETAIL_QUERY, Map.of("MaDH", orderId, "MaHH", productId));
	}
	
	public static int delete(Integer orderId) {
		return QueryRepository.executeQueryUpdateDB(DELETE_LIST_ORDER_DETAIL_QUERY, Map.of("MaDH", orderId));
	}
}
