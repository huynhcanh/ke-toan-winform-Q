package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.PaymentDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class PaymentRepository {
	
	private static final String LIST_PAYMENT_QUERY = "SELECT pc.MaPC, pc.LydoNop, pc.NgayTao, pc.SoTien, pc.TaiLieuDinhKem, pc.MaTietKhoanNo, pc.MaTietKhoanCo, pc.QuyenSo, pc.MaNV, nv.Ten as TenNV, nv.DiaChi as DiaChiNV, pc.MaCT,\n" +
			" pc.MaKH, kh.Ten as TenKH, kh.DiaChi as DiaChiKH\n" +
			" FROM PhieuChi pc left join NhanVien nv on nv.MaNV = pc.MaNV\n" +
			" LEFT JOIN KhachHang kh on kh.MaKH = pc.MaKH WHERE pc.MaPC like :keyword";
	
	private static final String DETAIL_PAYMENT_QUERY = "SELECT pc.MaPC, pc.LydoNop, pc.NgayTao, pc.SoTien, pc.TaiLieuDinhKem, pc.MaTietKhoanNo, pc.MaTietKhoanCo, pc.QuyenSo, pc.MaNV, nv.Ten as TenNV, nv.DiaChi as DiaChiNV, pc.MaCT,\n" +
			" pc.MaKH, kh.Ten as TenKH, kh.DiaChi as DiaChiKH\n" +
			" FROM PhieuChi pc left join NhanVien nv on nv.MaNV = pc.MaNV\n" +
			" LEFT JOIN KhachHang kh on kh.MaKH = pc.MaKH WHERE pc.MaPC = :MaPC";
	
	private static final String INSERT_PAYMENT_QUERY = "INSERT INTO PhieuChi\n" +
			" (LydoNop, NgayTao, SoTien, TaiLieuDinhKem, MaTietKhoanNo, MaTietKhoanCo, QuyenSo, MaNV, MaCT, MaKH, DaXuat)\n" +
			" VALUES(:LydoNop, NOW(), :SoTien, :TaiLieuDinhKem, :MaTietKhoanNo, :MaTietKhoanCo, :QuyenSo, :MaNV, :MaCT, :MaKH, 0)";
	
	private static final String UPDATE_PAYMENT_QUERY = "UPDATE PhieuChi\n" +
			" SET LydoNop=:LydoNop, NgayTao=:NgayTao, SoTien=:SoTien, TaiLieuDinhKem=:TaiLieuDinhKem, MaTietKhoanNo=MaTietKhoanNo," +
			" MaTietKhoanCo=:MaTietKhoanCo, QuyenSo=:QuyenSo, MaNV=:MaNV, MaKH=:MaKH, DaXuat=:DaXuat\n" +
			" WHERE MaPC=:MaPC";
	
	private static final String DELETE_PAYMENT_QUERY = "DELETE FROM PhieuChi WHERE MaPC=:MaPC";
	
	
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
}
