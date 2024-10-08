
package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;


public class ProductRepository {
	
	private static final String LIST_PRODUCT_QUERY = "SELECT h.MaHH, h.Ten, h.GiaBan, h.Dvt, h.KichThuoc, h.MaLoaiHH, lhh.Ten as TenLoaiHH, h.HinhAnh, h.SLTonKho " +
			"FROM HangHoa h left join LoaiHangHoa lhh on lhh.MaLoaiHH = h.MaLoaiHH WHERE h.MaHH like :keyword";
	
	private static final String DETAIL_PRODUCT_QUERY = "SELECT h.MaHH, h.Ten, h.GiaBan, h.Dvt, h.KichThuoc, h.MaLoaiHH, lhh.Ten as TenLoaiHH, h.HinhAnh, h.SLTonKho " +
			"FROM HangHoa h left join LoaiHangHoa lhh on lhh.MaLoaiHH = h.MaLoaiHH WHERE h.MaHH =:MaHH";
	
	private static final String INSERT_PRODUCT_QUERY = "INSERT INTO HangHoa (Ten, GiaBan, Dvt, KichThuoc, MaLoaiHH, HinhAnh, SLTonKho)" +
			" VALUES(:Ten, :GiaBan, :Dvt, :KichThuoc , :MaLoaiHH, :HinhAnh, 100)";
	
	private static final String UPDATE_PRODUCT_QUERY = "UPDATE HangHoa SET Ten=:Ten, GiaBan=:GiaBan, Dvt=:Dvt, KichThuoc=:KichThuoc, MaLoaiHH=:MaLoaiHH, HinhAnh=:HinhAnh, SLTonKho=:SLTonKho WHERE MaHH=:MaHH";
	
	private static final String DELETE_PRODUCT_QUERY = "DELETE FROM HangHoa WHERE MaHH=:MaHH";
        
	public static List<ProductDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_PRODUCT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, ProductDTO.class);
	}
	
	public static ProductDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_PRODUCT_QUERY, Map.of("MaHH", id));
		return ObjectMapper.toDTO(rs, ProductDTO.class);
	}
	
	public static int insert(ProductDTO productDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(productDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_PRODUCT_QUERY, param);
	}
	
	public static int update(ProductDTO productDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(productDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_PRODUCT_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_PRODUCT_QUERY, Map.of("MaHH", id));
	}
}
