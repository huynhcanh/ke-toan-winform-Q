package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.DocumentDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.Map;

public class DocumentRepository {
	
	
	private static final String DETAIL_DOCUMENT_QUERY = "SELECT MaCT, NgayCT, SoCT, LoaiCT\n" +
			"\tFROM ChungTu WHERE MaCT =:MaCT";
	private static final String INSERT_DOCUMENT_QUERY = "INSERT INTO ChungTu\n" +
			"(NgayCT, SoCT, LoaiCT)\n" +
			"VALUES(NOW(), :SoCT, :LoaiCT)";
	
	private static final String DELETE_DOCUMENT_QUERY = "DELETE FROM ChungTu WHERE MaCT=:MaCT";
	
	public static DocumentDTO findById(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_DOCUMENT_QUERY, Map.of("MaCT", id));
		return ObjectMapper.toDTO(rs, DocumentDTO.class);
	}
	
	public static int insert(DocumentDTO documentDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(documentDTO);
		return QueryRepository.executeQueryUpdateDBReturnId(INSERT_DOCUMENT_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_DOCUMENT_QUERY, Map.of("MaCT", id));
	}
}
