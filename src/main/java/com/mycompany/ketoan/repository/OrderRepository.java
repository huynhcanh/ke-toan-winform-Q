/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository {
	
	private static final String LIST_ORDER_QUERY = "SELECT pbh.MaPBH, COALESCE(ctpbhg.TongTien, 0) as TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nv.Ten as TenNV, pbh.NgayTao, pbh.GhiChu, pbh.DaXuat, pbh.DaXoa \n" +
			"FROM PhieuBanHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH left join NhanVien nv on nv.MaNV = pbh.MaNV \n" +
			"LEFT JOIN (SELECT ctpbh.MaPBH, sum(ctpbh.SoLuong * hh.GiaBan) as TongTien \n" +
			"FROM ChiTietPhieuBanHang ctpbh join HangHoa hh on hh.MaHH = ctpbh.MaHH \n" +
			"GROUP BY ctpbh.MaPBH ) ctpbhg on ctpbhg.MaPBH = pbh.MaPBH WHERE pbh.MaPBH like :keyword AND (:isExported is null or pbh.DaXuat =:isExported)\n" +
			"AND (:fromDate is null or pbh.NgayTao >= cast(:fromDate as date))\n" +
			"AND (:toDate is null or pbh.NgayTao <= cast(:toDate as date))";
	
	private static final String DETAIL_ORDER_QUERY = "SELECT pbh.MaPBH, COALESCE(ctpbhg.TongTien, 0) as TongTien, pbh.MaKH, kh.Ten as TenKH, pbh.MaNV, nv.Ten as TenNV, pbh.NgayTao, pbh.GhiChu, pbh.DaXuat, pbh.DaXoa " +
			"FROM PhieuBanHang pbh left join KhachHang kh on kh.MaKH = pbh.MaKH left join NhanVien nv on nv.MaNV = pbh.MaNV " +
			"LEFT JOIN (SELECT ctpbh.MaPBH, sum(ctpbh.SoLuong * hh.GiaBan) as TongTien " +
			"FROM ChiTietPhieuBanHang ctpbh join HangHoa hh on hh.MaHH = ctpbh.MaHH " +
			"GROUP BY ctpbh.MaPBH ) ctpbhg on ctpbhg.MaPBH = pbh.MaPBH WHERE pbh.MaPBH = :MaPBH";
	
	private static final String INSERT_ORDER_QUERY = "INSERT INTO PhieuBanHang " +
			" (MaKH, MaNV, NgayTao, GhiChu, DaXuat) " +
			" VALUES(:MaKH, :MaNV, NOW(), :GhiChu, 0)";
	
	private static final String DELETE_ORDER_QUERY = "DELETE FROM PhieuBanHang WHERE MaPBH=:MaPBH";
	
	private static final String UPDATE_ORDER_QUERY = "UPDATE PhieuBanHang SET MaKH=:MaKH, GhiChu=:GhiChu, DaXuat=:DaXuat, DaXoa=:DaXoa WHERE MaPBH=:MaPBH";
	
	public static List<OrderDTO> findAll(String keyword, Boolean isExported, Date fromDate, Date toDate) {
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "%" + keyword + "%");
		map.put("isExported", isExported);
		map.put("fromDate", fromDate);
		map.put("toDate", toDate);
		ResultSet rs = QueryRepository.executeQuery(LIST_ORDER_QUERY, map);
		return ObjectMapper.toDTOs(rs, OrderDTO.class);
	}
	
	public static OrderDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ORDER_QUERY, Map.of("MaPBH", id));
		return ObjectMapper.toDTO(rs, OrderDTO.class);
	}
	
	public static int insert(OrderDTO orderDTO) {
            Map<String, Object> map = new HashMap<>();
            map.put("MaNV", orderDTO.getEmployeeId());
				map.put("MaKH", orderDTO.getCustomerId());
				map.put("GhiChu", orderDTO.getNote());
		return QueryRepository.executeQueryUpdateDB(INSERT_ORDER_QUERY, map);
	}
	
	public static int update(OrderDTO orderDTO) {
            Map<String, Object> map = new HashMap<>();
            map.put("MaPBH", orderDTO.getId());
            map.put("MaKH", orderDTO.getCustomerId());
            map.put("GhiChu", orderDTO.getNote());
            map.put("DaXuat", orderDTO.getExported());
            map.put("DaXoa", orderDTO.getIsDeleted());
		return QueryRepository.executeQueryUpdateDB(UPDATE_ORDER_QUERY, map);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ORDER_QUERY, Map.of("MaPBH", id));
	}
}
