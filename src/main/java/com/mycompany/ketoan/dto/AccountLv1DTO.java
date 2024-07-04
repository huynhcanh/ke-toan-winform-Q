package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountLv1DTO {
	
	@JsonProperty("MaTaiKhoan")
	private Integer id;
	
	@JsonProperty("TenTaiKhoan")
	private String name;
	
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
}
