package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.AccountDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class AccountRepository {
	
	private static final String LIST_ACCOUNT_LEVEL_1_QUERY = "SELECT soTaiKhoan, noiDung, loai FROM taikhoan WHERE soTaiKhoan like :keyword";
	private static final String LIST_ACCOUNT_LEVEL_23_QUERY = "SELECT maTK as maTK1, soTaiKhoan, maTKCTGoc, ten FROM taikhoanchitiet WHERE soTaiKhoan like :keyword";
	
	public static List<AccountDTO> findAllLevel1(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_LEVEL_1_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, AccountDTO.class);
	}
	
	public static List<AccountDTO> findAllLevel23(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_LEVEL_23_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, AccountDTO.class);
	}

//	public static void main(String[] args) {
//		List<AccountDTO> list = findAllLevel23("");
//		System.out.println(list);
//	}
}
