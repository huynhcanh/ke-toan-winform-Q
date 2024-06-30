package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.AccountDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class AccountRepository {
	
	private static final String LIST_ACCOUNT_QUERY = "SELECT \n" +
			"case when ua.Cap = 'LEVEL1' then ua.Cap1 end as Cap1,\n" +
			"case when ua.Cap = 'LEVEL2' then ua.Cap2 end as Cap2,\n" +
			"case when ua.Cap = 'LEVEL3' then ua.Cap3 end as Cap3,\n" +
			"ua.TenTK\n" +
			"from (\n" +
			"SELECT MaTaiKhoan as Cap1, null as Cap2, null as Cap3, TenTaiKhoan as TenTK, 'LEVEL1' as Cap FROM TaiKhoan\n" +
			"union all\n" +
			"SELECT tk1.MaTaiKhoan as Cap1, tk2.MaTaiKhoan as Cap2, null as Cap3, tk2.TenTaiKhoan as TenTK, 'LEVEL2' as Cap  FROM TieuKhoan tk2 join TaiKhoan tk1 on tk2.MaTaiKhoan = tk1.MaTaiKhoan \n" +
			"union all\n" +
			"SELECT tk2.MaTaiKhoan1 as Cap1, tk2.MaTaiKhoan2 as Cap2, tk3.MaTietKhoan as Cap3, tk3.TenTaiKhoan, 'LEVEL3' as Cap FROM TietKhoan tk3 join (SELECT tk1.MaTaiKhoan as MaTaiKhoan1 , tk2.MaTaiKhoan as MaTaiKhoan2\n" +
			"FROM TieuKhoan tk2 join TaiKhoan tk1 on tk2.MaTaiKhoan = tk1.MaTaiKhoan) tk2\n" +
			") ua where (:keyword is null or (ua.Cap1 like :keyword  or ua.Cap1 like :keyword  or  ua.Cap1 like :keyword )) \n" +
			"ORDER BY ua.Cap1 asc, ua.Cap2 asc, ua.Cap3 asc";
	
	public static List<AccountDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, AccountDTO.class);
	}
}
