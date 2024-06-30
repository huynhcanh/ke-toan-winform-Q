package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.DocumentDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.util.Map;

public class DocumentRepository {
	
	private static final String INSERT_DOCUMENT_QUERY = "INSERT INTO ChungTu\n" +
			"(NgayCT, SoCT, MaLoaiCT)\n" +
			"VALUES(NOW(), :SoCT, :MaLoaiCT)";
	
	private static final String DELETE_DOCUMENT_QUERY = "DELETE FROM ChungTu WHERE MaCT=:MaCT";
	
	public static int insert(DocumentDTO documentDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(documentDTO);
		return QueryRepository.executeQueryUpdateDBReturnId(INSERT_DOCUMENT_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_DOCUMENT_QUERY, Map.of("MaCT", id));
	}
}
