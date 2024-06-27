package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeDTO {
	
	@JsonProperty("MaND")
	private Integer id;
	
	@JsonProperty("TenDN")
	private String username;
	
	@JsonProperty("MatKhau")
	private String password;
	
	@JsonProperty("VaiTro")
	private String role;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
