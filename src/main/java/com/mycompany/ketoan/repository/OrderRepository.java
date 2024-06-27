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

    private static final String LIST_ORDER_QUERY = "SELECT dh.MaDH, dh.TongTien, dh.MaKH, kh.Ten as TenKH, dh.MaNV, nd.TenDN , dh.NgayTao, dh.NgayGiao, dh.GhiChu " +
			"FROM DonHang dh left join KhachHang kh on kh.MaKH = dh.MaKH " +
			"join NguoiDung nd on nd.MaND = dh.MaNV WHERE dh.MaDH like :keyword";
	
	private static final String DETAIL_ORDER_QUERY = "SELECT dh.MaDH, dh.TongTien, dh.MaKH, kh.Ten as TenKH, dh.MaNV, nd.TenDN , dh.NgayTao, dh.NgayGiao, dh.GhiChu " +
			"FROM DonHang dh left join KhachHang kh on kh.MaKH = dh.MaKH " +
			"join NguoiDung nd on nd.MaND = dh.MaNV WHERE dh.MaDH = :MaDH";
	
	private static final String INSERT_ORDER_QUERY = "INSERT INTO DonHang " +
			"(MaKH, TongTien, MaNV, NgayTao, NgayGiao, GhiChu)" +
			"VALUES(:MaKH, 0, :MaNV, NOW(), :NgayGiao, :GhiChu)";
	
	private static final String DELETE_ORDER_QUERY = "DELETE FROM DonHang WHERE MaDH=:MaDH";
	
	private static final String UPDATE_ORDER_QUERY = "UPDATE DonHang SET TongTien=:TongTien, NgayGiao=:NgayGiao, GhiChu=:GhiChu WHERE MaDH=:MaDH";
	
	public static List<OrderDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ORDER_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, OrderDTO.class);
	}
	
	public static OrderDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ORDER_QUERY, Map.of("MaDH", id));
		return ObjectMapper.toDTO(rs, OrderDTO.class);
	}
	
	public static int insert(OrderDTO orderDTO) {
		return QueryRepository.executeQueryUpdateDB(INSERT_ORDER_QUERY, Map.of("MaNV", orderDTO.getEmployeeId(),
				"MaKH", orderDTO.getCustomerId(),
				"NgayGiao", DateTimeUtils.toString(orderDTO.getDeliveryDate()),
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int update(OrderDTO orderDTO) {
		return QueryRepository.executeQueryUpdateDB(UPDATE_ORDER_QUERY, Map.of("MaDH", orderDTO.getId(),
				"MaKH", orderDTO.getCustomerId(),
				"NgayGiao", DateTimeUtils.toString(orderDTO.getDeliveryDate()),
				"TongTien", orderDTO.getTotalMoney(),
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ORDER_QUERY, Map.of("MaDH", id));
	}
}
