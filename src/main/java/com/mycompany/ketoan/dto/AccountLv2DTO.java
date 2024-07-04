package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountLv2DTO {
	
	@JsonProperty("MaTieuKhoan")
	private Integer id;
	
	@JsonProperty("TenTieuKhoan")
	private String name;
	
	@JsonProperty("MaTaiKhoan")
	private Integer accountLv1Id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAccountLv1Id() {
		return accountLv1Id;
	}
	
	public void setAccountLv1Id(Integer accountLv1Id) {
		this.accountLv1Id = accountLv1Id;
	}
}
