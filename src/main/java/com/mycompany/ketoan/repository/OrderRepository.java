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
	
	private static final String LIST_ORDER_QUERY = "SELECT pbh.MaPBH, COALESCE(ctpbhg.TongTien, 0) as TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nv.Ten as TenNV, pbh.NgayTao, pbh.GhiChu " +
			"FROM qlbh_quanao.PhieuBanHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH join NhanVien nv on nv.MaNV = pbh.MaNV " +
			"LEFT JOIN (SELECT ctpbh.MaPBH, sum(ctpbh.SoLuong * hh.GiaBan) as TongTien " +
			"FROM ChiTietPhieuBanHang ctpbh join HangHoa hh on hh.MaHH = ctpbh.MaHH " +
			"GROUP BY ctpbh.MaPBH ) ctpbhg on ctpbhg.MaPBH = pbh.MaPBH WHERE pbh.MaPBH like :keyword";
	
	private static final String DETAIL_ORDER_QUERY = "SELECT pbh.MaPBH, COALESCE(ctpbhg.TongTien, 0) as TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nv.Ten as TenNV, pbh.NgayTao, pbh.GhiChu " +
			"FROM qlbh_quanao.PhieuBanHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH join NhanVien nv on nv.MaNV = pbh.MaNV " +
			"LEFT JOIN (SELECT ctpbh.MaPBH, sum(ctpbh.SoLuong * hh.GiaBan) as TongTien " +
			"FROM ChiTietPhieuBanHang ctpbh join HangHoa hh on hh.MaHH = ctpbh.MaHH " +
			"GROUP BY ctpbh.MaPBH ) ctpbhg on ctpbhg.MaPBH = pbh.MaPBH WHERE pbh.MaPBH = :MaPBH";
	
	private static final String INSERT_ORDER_QUERY = "INSERT INTO PhieuBanHang " +
			"(MaKH, MaNV, NgayTao, NgayGiao, GhiChu)" +
			"VALUES(:MaKH, :MaNV, NOW(), :NgayGiao, :GhiChu)";
	
	private static final String DELETE_ORDER_QUERY = "DELETE FROM PhieuBanHang WHERE MaPBH=:MaPBH";
	
	private static final String UPDATE_ORDER_QUERY = "UPDATE PhieuBanHang SET NgayGiao=:NgayGiao, GhiChu=:GhiChu WHERE MaPBH=:MaPBH";
	
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
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int update(OrderDTO orderDTO) {
		return QueryRepository.executeQueryUpdateDB(UPDATE_ORDER_QUERY, Map.of("MaPBH", orderDTO.getId(),
				"MaKH", orderDTO.getCustomerId(),
				"GhiChu", orderDTO.getNote()));
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ORDER_QUERY, Map.of("MaPBH", id));
	}
}
