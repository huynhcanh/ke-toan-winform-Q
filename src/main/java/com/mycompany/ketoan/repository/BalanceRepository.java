package com.mycompany.ketoan.repository;

import com.mycompany.ketoan.dto.BalanceDTO;
import com.mycompany.ketoan.mapper.ObjectMapper;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class BalanceRepository {
	
	private static final String LIST_BALANCE_QUERY = "SELECT sd.MaTietKhoan, tk.TenTietKhoan, sd.NgayDauKy, sd.SoTien, sd.TrangThai\n" +
			" FROM SDDK sd join TietKhoan tk ON tk.MaTietKhoan = sd.MaTietKhoan";
	
	private static final String DETAIL_BALANCE_QUERY = "SELECT sd.MaTietKhoan, tk.TenTietKhoan, sd.NgayDauKy, sd.SoTien, sd.TrangThai\n" +
			" FROM SDDK sd join TietKhoan tk ON tk.MaTietKhoan = sd.MaTietKhoan WHERE sd.NgayDauKy=:NgayDauKy AND tk.MaTietKhoan =:MaTietKhoan";
	
	private static final String INSERT_BALANCE_QUERY = "INSERT INTO SDDK\n" +
			" (MaTietKhoan, NgayDauKy, SoTien, TrangThai)\n" +
			" VALUES(:MaTietKhoan, :NgayDauKy, :SoTien, :TrangThai)";
	
	private static final String DELETE_BALANCE_QUERY = "DELETE FROM SDDK\n" +
			"WHERE MaTietKhoan=:MaTietKhoan AND NgayDauKy=:NgayDauKy";
	
	private static final String UPDATE_BALANCE_QUERY = "UPDATE SDDK\n" +
			" SET SoTien=:SoTien, TrangThai=:TrangThai\n" +
			" WHERE MaTietKhoan=:MaTietKhoan AND NgayDauKy=:NgayDauKy";
	
	public static List<BalanceDTO> findAll() {
		ResultSet rs = QueryRepository.executeQuery(LIST_BALANCE_QUERY);
		return ObjectMapper.toDTOs(rs, BalanceDTO.class);
	}
	
	public static BalanceDTO findById(Integer accountIdLv3, Date firstDateOfPeriod) {
		ResultSet rs = QueryRepository.executeQuery(DETAIL_BALANCE_QUERY, Map.of("MaTietKhoan", accountIdLv3, "NgayDauKy", firstDateOfPeriod));
		return ObjectMapper.toDTO(rs, BalanceDTO.class);
	}
	
	public static int insert(BalanceDTO orderDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(orderDTO);
		return QueryRepository.executeQueryUpdateDB(INSERT_BALANCE_QUERY, param);
	}
	
	public static int update(BalanceDTO orderDTO) {
		Map<String, Object> param = ObjectMapper.convertToMap(orderDTO);
		return QueryRepository.executeQueryUpdateDB(UPDATE_BALANCE_QUERY, param);
	}
	
	public static int delete(Integer accountIdLv3, Date firstDateOfPeriod) {
		return QueryRepository.executeQueryUpdateDB(DELETE_BALANCE_QUERY, Map.of("MaTietKhoan", accountIdLv3, "NgayDauKy", firstDateOfPeriod));
	}
}
