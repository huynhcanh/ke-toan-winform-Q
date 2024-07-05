package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountLv3DTO {
	
	@JsonProperty("MaTietKhoan")
	private Integer id;
	
	@JsonProperty("TenTietKhoan")
	private String name;
	
	@JsonProperty("MaTieuKhoan")
	private Integer accountLv2Id;
	
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
	
	public Integer getAccountLv2Id() {
		return accountLv2Id;
	}
	
	public void setAccountLv2Id(Integer accountLv2Id) {
		this.accountLv2Id = accountLv2Id;
	}
	
	public Integer getAccountLv1Id() {
		return accountLv1Id;
	}
	
	public void setAccountLv1Id(Integer accountLv3Id) {
		this.accountLv1Id = accountLv3Id;
	}
}
