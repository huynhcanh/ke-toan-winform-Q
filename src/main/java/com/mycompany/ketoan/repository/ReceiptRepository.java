package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class ReceiptRepository {
	
	private static final String LIST_RECEIPT_QUERY = "SELECT pt.MaPT, pt.LydoNop, pt.NgayTao, pt.SoTien, pt.TaiLieuDinhKem, pt.MaTietKhoanNo, pt.MaTietKhoanCo, pt.QuyenSo, pt.MaNV, nv.Ten as TenNV, pt.MaCT,\n" +
			" pt.MaKH, kh.Ten as TenKH\n" +
			" FROM PhieuThu pt left join NhanVien nv on nv.MaNV = pt.MaNV\n" +
			" LEFT JOIN KhachHang kh on kh.MaKH = pt.MaKH WHERE pt.MaPT like :keyword";
	
	private static final String DETAIL_RECEIPT_QUERY = "SELECT pt.MaPT, pt.LydoNop, pt.NgayTao, pt.SoTien, pt.TaiLieuDinhKem, pt.MaTietKhoanNo, pt.MaTietKhoanCo, pt.QuyenSo, pt.MaNV, nv.Ten as TenNV, pt.MaCT,\n" +
			" pt.MaKH, kh.Ten as TenKH\n" +
			" FROM PhieuThu pt left join NhanVien nv on nv.MaNV = pt.MaNV\n" +
			" LEFT JOIN KhachHang kh on kh.MaKH = pt.MaKH WHERE pt.MaPT = :MaPT";
	
	private static final String INSERT_RECEIPT_QUERY = "INSERT INTO PhieuThu\n" +
			" (LydoNop, NgayTao, SoTien, TaiLieuDinhKem, MaTietKhoanNo, MaTietKhoanCo, QuyenSo, MaNV, MaCT, MaKH)\n" +
			" VALUES(:LydoNop, NOW(), :SoTien, :TaiLieuDinhKem, :MaTietKhoanNo, :MaTietKhoanCo, :QuyenSo, :MaNV, :MaCT, :MaKH)";
	
	private static final String UPDATE_RECEIPT_QUERY = "UPDATE PhieuThu\n" +
			" SET LydoNop=:LydoNop, SoTien=:SoTien, TaiLieuDinhKem=:TaiLieuDinhKem, MaTietKhoanNo=MaTietKhoanNo," +
			" MaTietKhoanCo=:MaTietKhoanCo, QuyenSo=:QuyenSo, MaNV=:MaNV, MaKH=:MaKH\n" +
			" WHERE MaPT=:MaPT";
	
	private static final String DELETE_RECEIPT_QUERY = "DELETE FROM PhieuThu WHERE MaPT=:MaPT";
	
	
	public static List<ReceiptDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_RECEIPT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, ReceiptDTO.class);
	}
	
	public static ReceiptDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_RECEIPT_QUERY, Map.of("MaPT", id));
		return ObjectMapper.toDTO(rs, ReceiptDTO.class);
	}
	
	public static int insert(ReceiptDTO categoryDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(categoryDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_RECEIPT_QUERY, param);
	}
	
	public static int update(ReceiptDTO categoryDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(categoryDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_RECEIPT_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_RECEIPT_QUERY, Map.of("MaPT", id));
	}
}
