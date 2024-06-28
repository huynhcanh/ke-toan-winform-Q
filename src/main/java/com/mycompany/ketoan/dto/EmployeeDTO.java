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
	
	@JsonProperty("Ten")
	private String name;
	
	@JsonProperty("Sdt")
	private String phone;
	
	@JsonProperty("DiaChi")
	private String address;
	
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
