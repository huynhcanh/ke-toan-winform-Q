package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.CategoryDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryRepository {
	
	private static final String LIST_CATEGORY_QUERY = "SELECT MaLoaiHH, Ten FROM LoaiHangHoa";
	
	private static final String DETAIL_CATEGORY_QUERY = "SELECT MaLoaiHH, Ten FROM LoaiHangHoa WHERE MaLoaiHH=:MaLoaiHH";
	
	private static final String INSERT_CATEGORY_QUERY = "INSERT INTO LoaiHangHoa (Ten) VALUES (:Ten)";
        
        private static final String UPDATE_CATEGORY_QUERY = "UPDATE LoaiHangHoa SET Ten=:Ten WHERE MaLoaiHH=:MaLoaiHH";
	
	private static final String DELETE_CATEGORY_QUERY = "DELETE FROM LoaiHangHoa WHERE MaLoaiHH=:MaLoaiHH";
	
	private static final String EXISTED_PRODUCT_CATEGORY_QUERY = "SELECT 1 FROM LoaiHangHoa mlhh WHERE mlhh.MaLoaiHH = :MaLoaiHH AND EXISTS(SELECT 1 FROM HangHoa hh WHERE hh.MaLoaiHH =:MaLoaiHH)";
	
        private static final String EXISTED_CATEGORY_NAME_QUERY = "SELECT 1 FROM LoaiHangHoa WHERE Ten = :Ten";
        
	public static List<CategoryDTO> findAll() {
		ResultSet rs = QueryRepository.executeQuery(LIST_CATEGORY_QUERY);
		return ObjectMapper.toDTOs(rs, CategoryDTO.class);
	}
	
	public static CategoryDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_CATEGORY_QUERY, Map.of("MaLoaiHH", id));
		return ObjectMapper.toDTO(rs, CategoryDTO.class);
	}
	
	public static int insert(CategoryDTO categoryDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(categoryDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_CATEGORY_QUERY, param);
	}
	
	public static int update(CategoryDTO categoryDTO) {
		Map<String, Object> namedParameters = new HashMap<>();
		namedParameters.put("Ten", categoryDTO.getName());
		namedParameters.put("MaLoaiHH", categoryDTO.getId());
		return QueryRepository.executeQueryUpdateDB(UPDATE_CATEGORY_QUERY, namedParameters);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_CATEGORY_QUERY, Map.of("MaLoaiHH", id));
	}
	
	public static boolean existProductCategory(Integer categoryId) {
		return QueryRepository.checkExistQuery(EXISTED_PRODUCT_CATEGORY_QUERY, Map.of("MaLoaiHH", categoryId));
	}
        
        public static boolean existCategoryName(String categoryName) {
		return QueryRepository.checkExistQuery(EXISTED_CATEGORY_NAME_QUERY, Map.of("Ten", categoryName));
	}
}
