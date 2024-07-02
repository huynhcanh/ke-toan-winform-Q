package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.PaymentDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class PaymentRepository {
	
	private static final String LIST_PAYMENT_QUERY = "SELECT pc.MaPC, pc.LydoNop, pc.NgayTao, pc.SoTien, pc.TaiLieuDinhKem, pc.MaTietKhoanNo, pc.MaTietKhoanCo, pc.QuyenSo, pc.MaNV, nv.Ten as TenNV, pc.MaCT, pc.DaXuat " +
			" FROM PhieuChi pc left join NhanVien nv on nv.MaNV = pc.MaNV WHERE pc.MaPC like :keyword";
	
	private static final String DETAIL_PAYMENT_QUERY = "SELECT pc.MaPC, pc.LydoNop, pc.NgayTao, pc.SoTien, pc.TaiLieuDinhKem, pc.MaTietKhoanNo, pc.MaTietKhoanCo, pc.QuyenSo, pc.MaNV, nv.Ten as TenNV, nv.DiaChi as DiaChiNV, pc.MaCT " +
			" FROM PhieuChi pc left join NhanVien nv on nv.MaNV = pc.MaNV WHERE pc.MaPC = :MaPC";
	
	private static final String INSERT_PAYMENT_QUERY = "INSERT INTO PhieuChi " +
			" (LydoNop, NgayTao, SoTien, TaiLieuDinhKem, MaTietKhoanNo, MaTietKhoanCo, QuyenSo, MaNV, MaCT, DaXuat) " +
			" VALUES(:LydoNop, NOW(), :SoTien, :TaiLieuDinhKem, :MaTietKhoanNo, :MaTietKhoanCo, :QuyenSo, :MaNV, :MaCT, 0)";
	
	private static final String UPDATE_PAYMENT_QUERY = "UPDATE PhieuChi " +
			" SET LydoNop=:LydoNop, NgayTao=:NgayTao, SoTien=:SoTien, TaiLieuDinhKem=:TaiLieuDinhKem, MaTietKhoanNo=MaTietKhoanNo," +
			" MaTietKhoanCo=:MaTietKhoanCo, QuyenSo=:QuyenSo, MaNV=:MaNV, DaXuat=:DaXuat " +
			" WHERE MaPC=:MaPC";
	
	private static final String DELETE_PAYMENT_QUERY = "DELETE FROM PhieuChi WHERE MaPC=:MaPC";
	
	private static final String DELETE_PAYMENT_WITH_DOCUMENT_QUERY = "DELETE FROM PhieuChi WHERE MaCT = :MaCT";
	
	
	public static List<PaymentDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_PAYMENT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, PaymentDTO.class);
	}
	
	public static PaymentDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_PAYMENT_QUERY, Map.of("MaPC", id));
		return ObjectMapper.toDTO(rs, PaymentDTO.class);
	}
	
	public static int insert(PaymentDTO categoryDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(categoryDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_PAYMENT_QUERY, param);
	}
	
	public static int update(PaymentDTO categoryDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(categoryDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_PAYMENT_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_PAYMENT_QUERY, Map.of("MaPC", id));
	}
	
	public static int deleteByDocumentId(Integer documentId) {
		return QueryRepository.executeQueryUpdateDB(DELETE_PAYMENT_WITH_DOCUMENT_QUERY, Map.of("MaCT", documentId));
	}
}
