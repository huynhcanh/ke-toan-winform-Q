package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.AccountEntryDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class AccountEntryRepository {
	
	private static final String LIST_ACCOUNT_ENTRY_QUERY = "SELECT bt.MaBT, bt.NgayCT, bt.NgayHT, bt.DienGiai, bt.TKNo, bt.TkCo, bt.TienPhatSinh, bt.MaCT, ct.SoCT \n" +
			"FROM ButToan bt join ChungTu ct on ct.MaCT = bt.MaCT WHERE (:type is null or :type like ct.LoaiCT) AND (:keyword is null or bt.MaBT like :keyword)";
	
	private static final String INSERT_ACCOUNT_ENTRY_QUERY = "INSERT INTO ButToan\n" +
			"(NgayCT, NgayHT, DienGiai, TKNo, TkCo, TienPhatSinh, MaCT)\n" +
			"VALUES(NOW(), NOW(), '', :TKNo, :TkCo, :TienPhatSinh, :MaCT)";
	
	private static final String DELETE_ACCOUNT_ENTRY_QUERY = "DELETE FROM ButToan WHERE MaCT=:MaCT";
	
	public static List<AccountEntryDTO> findAll(String keyword, String type) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_ENTRY_QUERY, Map.of("keyword", "%" + keyword + "%", "type", "%" + type + "%"));
		return ObjectMapper.toDTOs(rs, AccountEntryDTO.class);
	}
	
	public static int insert(AccountEntryDTO accountEntyDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(accountEntyDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_ACCOUNT_ENTRY_QUERY, param);
	}
	
	public static int delete(Integer id) {
		return QueryRepository.executeQueryUpdateDB(DELETE_ACCOUNT_ENTRY_QUERY, Map.of("MaCT", id));
	}
}
