package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.AccountDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class AccountRepository {
	
	private static final String LIST_ACCOUNT_QUERY = "SELECT case when ua.Cap = 'LEVEL1' then ua.Cap1 end as Cap1, case when ua.Cap = 'LEVEL2' then ua.Cap2 end as Cap2, case when ua.Cap = 'LEVEL3' then ua.Cap3 end as Cap3, ua.TenTK \n" +
			"from (SELECT MaTaiKhoan as Cap1, null as Cap2, null as Cap3, TenTaiKhoan as TenTK, 'LEVEL1' as Cap\n" +
			" FROM TaiKhoan union all SELECT tk1.MaTaiKhoan as Cap1, tk2.MaTieuKhoan as Cap2, null as Cap3, tk2.TenTieuKhoan as TenTK, 'LEVEL2' as Cap \n" +
			" FROM TieuKhoan tk2 join TaiKhoan tk1 on tk2.MaTaiKhoan = tk1.MaTaiKhoan union all \n" +
			" SELECT tk12.MaTaiKhoan as Cap1, tk12.MaTieuKhoan as Cap2, tk3.MaTietKhoan as Cap3, tk3.TenTietKhoan as TenTK, 'LEVEL3' as Cap FROM TietKhoan tk3\n" +
			"LEFT JOIN (SELECT tk2.MaTieuKhoan, tk1.MaTaiKhoan FROM TieuKhoan tk2 join TaiKhoan tk1 ON tk2.MaTaiKhoan = tk1.MaTaiKhoan) tk12 ON tk12.MaTieuKhoan = tk3.MaTieuKhoan) ua\n" +
			" where (:keyword is null or (ua.Cap1 like :keyword or ua.Cap1 like :keyword or ua.Cap1 like :keyword)) ORDER BY ua.Cap1 asc, ua.Cap2 asc, ua.Cap3 asc";
	
	public static List<AccountDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, AccountDTO.class);
	}
}
