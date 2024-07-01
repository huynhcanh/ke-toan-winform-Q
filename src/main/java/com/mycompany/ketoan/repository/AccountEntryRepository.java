package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.AccountEntryDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.util.Map;

public class AccountEntryRepository {
	
	private static final String INSERT_ACCOUNT_ENTRY_QUERY = "INSERT INTO ButToan\n" +
			"(NgayCT, NgayHT, DienGiai, TKNo, TkCo, TienPhatSinh, MaCT)\n" +
			"VALUES(NOW(), NOW(), '', :TKNo, :TkCo, :TienPhatSinh, :MaCT)";
	
	private static final String DELETE_ACCOUNT_ENTRY_QUERY = "DELETE FROM ButToan WHERE MaCT=:MaCT";
	
	public static int insert(AccountEntryDTO accountEntyDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(accountEntyDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_ACCOUNT_ENTRY_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ACCOUNT_ENTRY_QUERY, Map.of("MaCT", id));
	}
}
