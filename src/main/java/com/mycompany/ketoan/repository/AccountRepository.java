package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.*;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class AccountRepository {
    
        private static final String LIST_ID_ACCOUNT_LV2 = "SELECT MaTieuKhoan FROM TieuKhoan";
    
        private static final String LIST_ID_ACCOUNT_LV1 = "SELECT MaTaiKhoan FROM TaiKhoan";
	
	private static final String LIST_ID_ACCOUNT_LV3 = "SELECT MaTietKhoan FROM TietKhoan";
	
	private static final String LIST_ACCOUNT_QUERY = "SELECT case when ua.Cap = 'LEVEL1' then ua.Cap1 end as Cap1, case when ua.Cap = 'LEVEL2' then ua.Cap2 end as Cap2, case when ua.Cap = 'LEVEL3' then ua.Cap3 end as Cap3, ua.TenTK \n" +
			"from (SELECT MaTaiKhoan as Cap1, null as Cap2, null as Cap3, TenTaiKhoan as TenTK, 'LEVEL1' as Cap\n" +
			" FROM TaiKhoan union all SELECT tk1.MaTaiKhoan as Cap1, tk2.MaTieuKhoan as Cap2, null as Cap3, tk2.TenTieuKhoan as TenTK, 'LEVEL2' as Cap \n" +
			" FROM TieuKhoan tk2 join TaiKhoan tk1 on tk2.MaTaiKhoan = tk1.MaTaiKhoan union all \n" +
			" SELECT tk12.MaTaiKhoan as Cap1, tk12.MaTieuKhoan as Cap2, tk3.MaTietKhoan as Cap3, tk3.TenTietKhoan as TenTK, 'LEVEL3' as Cap FROM TietKhoan tk3\n" +
			"LEFT JOIN (SELECT tk2.MaTieuKhoan, tk1.MaTaiKhoan FROM TieuKhoan tk2 join TaiKhoan tk1 ON tk2.MaTaiKhoan = tk1.MaTaiKhoan) tk12 ON tk12.MaTieuKhoan = tk3.MaTieuKhoan) ua\n" +
			" where (:keyword is null or (ua.Cap1 like :keyword or ua.Cap2 like :keyword or ua.Cap3 like :keyword)) ORDER BY ua.Cap1 asc, ua.Cap2 asc, ua.Cap3 asc";
	
	private static final String DETAIL_ACCOUNTLV1_QUERY = "SELECT MaTaiKhoan, TenTaiKhoan FROM TaiKhoan WHERE MaTaiKhoan=:MaTaiKhoan";
	
	private static final String INSERT_ACCOUNTLV1_QUERY = "INSERT INTO TaiKhoan\n" +
			"(MaTaiKhoan, TenTaiKhoan)\n" +
			"VALUES(:MaTaiKhoan, :TenTaiKhoan)";
	
	private static final String UPDATE_ACCOUNTLV1_QUERY = "UPDATE TaiKhoan\n" +
			"SET TenTaiKhoan=:TenTaiKhoan\n" +
			"WHERE MaTaiKhoan=:MaTaiKhoan";
	
	private static final String DELETE_ACCOUNTLV1_QUERY = "DELETE FROM TaiKhoan\n" +
			"WHERE MaTaiKhoan=:MaTaiKhoan";
	
	private static final String DETAIL_ACCOUNTLV2_QUERY = "SELECT MaTieuKhoan, TenTieuKhoan, MaTaiKhoan FROM TieuKhoan WHERE MaTieuKhoan =:MaTieuKhoan";
	
	private static final String INSERT_ACCOUNTLV2_QUERY = "INSERT INTO TieuKhoan\n" +
			"(MaTieuKhoan, TenTieuKhoan, MaTaiKhoan)\n" +
			"VALUES(:MaTieuKhoan, :TenTieuKhoan, :MaTaiKhoan)";
	
	private static final String UPDATE_ACCOUNTLV2_QUERY = "UPDATE TieuKhoan\n" +
			"SET TenTieuKhoan=:TenTieuKhoan, MaTaiKhoan=:MaTaiKhoan\n" +
			"WHERE MaTieuKhoan=:MaTieuKhoan";
	
	private static final String DELETE_ACCOUNTLV2_QUERY = "DELETE FROM TieuKhoan\n" +
			"WHERE MaTieuKhoan=:MaTieuKhoan";
	
	private static final String DETAIL_ACCOUNTLV3_QUERY = "SELECT tk3.MaTietKhoan, tk3.TenTietKhoan, tk3.MaTieuKhoan, tk12.MaTaiKhoan\n" +
			"FROM TietKhoan tk3 JOIN (SELECT tk2.MaTaiKhoan, tk2.MaTieuKhoan  FROM TieuKhoan tk2 ) tk12 on tk12.MaTieuKhoan = tk3.MaTieuKhoan \n" +
			"WHERE MaTietKhoan =:MaTietKhoan";
	
	private static final String INSERT_ACCOUNTLV3_QUERY = "INSERT INTO TietKhoan\n" +
			"(MaTietKhoan, TenTietKhoan, MaTieuKhoan)\n" +
			"VALUES(:MaTietKhoan, :TenTietKhoan, :MaTieuKhoan)";
	
	private static final String UPDATE_ACCOUNTLV3_QUERY = "UPDATE TietKhoan\n" +
			"SET TenTietKhoan=:TenTietKhoan, MaTieuKhoan=:MaTieuKhoan\n" +
			"WHERE MaTietKhoan=:MaTietKhoan";
	
	private static final String DELETE_ACCOUNTLV3_QUERY = "DELETE FROM TietKhoan\n" +
			"WHERE MaTietKhoan=:MaTietKhoan";
	
	public static List<AccountDTO> findAll(String keyword) {
		ResultSet rs = QueryRepository.executeQuery(LIST_ACCOUNT_QUERY, Map.of("keyword", "%" + keyword + "%"));
		return ObjectMapper.toDTOs(rs, AccountDTO.class);
	}
        
        public static List<Integer> findAllIdAccountLevel1() {
		ResultSet rs = QueryRepository.executeQuery(LIST_ID_ACCOUNT_LV1);
		return ObjectMapper.toDTOs(rs, Integer.class);
	}
        
        public static List<Integer> findAllIdAccountLevel2() {
		ResultSet rs = QueryRepository.executeQuery(LIST_ID_ACCOUNT_LV2);
		return ObjectMapper.toDTOs(rs, Integer.class);
	}
	
	public static List<Integer> findAllIdAccountLevel3() {
		ResultSet rs = QueryRepository.executeQuery(LIST_ID_ACCOUNT_LV3);
		return ObjectMapper.toDTOs(rs, Integer.class);
	}
	
	public static AccountLv1DTO findByAccountLv1Id(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ACCOUNTLV1_QUERY, Map.of("MaTaiKhoan", id));
		return ObjectMapper.toDTO(rs, AccountLv1DTO.class);
	}
	
	public static int insertAccountLv1(AccountLv1DTO accountLv1DTO) throws SQLException {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv1DTO);
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(INSERT_ACCOUNTLV1_QUERY, param);
	}
	
	public static int updateAccountLv1(AccountLv1DTO accountLv1DTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv1DTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_ACCOUNTLV1_QUERY, param);
	}
	
	public static int deleteAccountLv1(Integer accountLv1Id) throws SQLException {
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(DELETE_ACCOUNTLV1_QUERY, Map.of("MaTaiKhoan", accountLv1Id));
	}
	
	public static AccountLv2DTO findByAccountLv2Id(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ACCOUNTLV2_QUERY, Map.of("MaTieuKhoan", id));
		return ObjectMapper.toDTO(rs, AccountLv2DTO.class);
	}
	
	public static int insertAccountLv2(AccountLv2DTO accountLv2DTO) throws SQLException {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv2DTO);
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(INSERT_ACCOUNTLV2_QUERY, param);
	}
	
	public static int updateAccountLv2(AccountLv2DTO accountLv2DTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv2DTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_ACCOUNTLV2_QUERY, param);
	}
	
	public static int deleteAccountLv2(Integer accountLv2Id) throws SQLException {
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(DELETE_ACCOUNTLV2_QUERY, Map.of("MaTieuKhoan", accountLv2Id));
	}
	
	public static AccountLv3DTO findByAccountLv3Id(Integer id) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_ACCOUNTLV3_QUERY, Map.of("MaTietKhoan", id));
		return ObjectMapper.toDTO(rs, AccountLv3DTO.class);
	}
	
	public static int insertAccountLv3(AccountLv3DTO accountLv3DTO) throws SQLException {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv3DTO);
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(INSERT_ACCOUNTLV3_QUERY, param);
	}
	
	public static int updateAccountLv3(AccountLv3DTO accountLv3DTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(accountLv3DTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_ACCOUNTLV3_QUERY, param);
	}
	
	public static int deleteAccountLv3(Integer accountLv3Id) throws SQLException {
		return QueryRepository.executeQueryUpdateDBThrowExceptionIf(DELETE_ACCOUNTLV3_QUERY, Map.of("MaTietKhoan", accountLv3Id));
	}
}
