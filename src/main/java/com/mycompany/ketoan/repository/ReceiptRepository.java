package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class ReceiptRepository {
	
	private static final String LIST_RECEIPT_QUERY = "SELECT pt.MaPT, pt.LydoNop, pt.NgayTao, pt.GiaTien, pt.TaiLieuDinhKem, pt.MaTKCTNo, pt.MaTKCTCo, pt.QuyenSo, pt.MaNV, nv.Ten as TenNV, nv.DiaChi as DiaChiNV, pt.MaCT " +
			" FROM PhieuThu pt left join NhanVien nv on nv.MaNV = pt.MaNV WHERE pt.MaPT like :keyword";
	
	private static final String DETAIL_RECEIPT_QUERY = "SELECT pt.MaPT, pt.LydoNop, pt.NgayTao, pt.GiaTien, pt.TaiLieuDinhKem, pt.MaTKCTNo, pt.MaTKCTCo, pt.QuyenSo, pt.MaNV, nv.Ten as TenNV, nv.DiaChi as DiaChiNV, pt.MaCT " +
			" FROM PhieuThu pt left join NhanVien nv on nv.MaNV = pt.MaNV WHERE pt.MaPT =:MaPT";
	
	private static final String INSERT_RECEIPT_QUERY = "INSERT INTO PhieuThu (LydoNop, NgayTao, GiaTien, TaiLieuDinhKem, MaTKCTNo, MaTKCTCo, QuyenSo, MaNV, MaCT)" +
			" VALUES(:LydoNop, NOW(), :GiaTien, :TaiLieuDinhKem, :MaTKCTNo, :MaTKCTCo, :QuyenSo, :MaNV, :MaCT)";
	
	private static final String UPDATE_RECEIPT_QUERY = "UPDATE PhieuThu SET LydoNop=:LydoNop, NgayTao=:NgayTao, GiaTien=:GiaTien, TaiLieuDinhKem=:TaiLieuDinhKem," +
			" MaTKCTNo=:MaTKCTNo, MaTKCTCo=:MaTKCTCo, QuyenSo=:QuyenSo, MaNV=:MaNV, MaCT=:MaCT WHERE MaPT=:MaPT";
	
	private static final String DELETE_RECEIPT_QUERY = "DELETE FROM PhieuThu WHERE MaPT=:MaPT";
	
	
	public static List<ReceiptDTO> findAll() {
		ResultSet rs = QueryRepository.executeQuery(LIST_RECEIPT_QUERY);
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
