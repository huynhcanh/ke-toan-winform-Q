package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.DocumentDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.util.Map;

public class DocumentRepository {
	
	private static final String INSERT_DOCUMENT_QUERY = "INSERT INTO qlbh_quanao.ChungTu\n" +
			"(NgayCT, SoCT, LoaiCT)\n" +
			"VALUES(NOW(), :SoCT, :LoaiCT)";
	
	
	public static int insert(DocumentDTO documentDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(documentDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_DOCUMENT_QUERY, param);
	}
}
