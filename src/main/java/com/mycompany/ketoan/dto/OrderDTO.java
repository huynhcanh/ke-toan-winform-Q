/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;


public class OrderDTO {
	
	@JsonProperty("MaPBH")
	private Integer id;
	
	@JsonProperty("TongTien")
	private BigDecimal totalMoney;
	
	@JsonProperty("MaKH")
	private Integer customerId;
	
	@JsonProperty("TenKH")
	private String customerName;
	
	@JsonProperty("MaNV")
	private Integer employeeId;
	
	@JsonProperty("TenNV")
	private String employeeName;
	
	@JsonProperty("NgayTao")
	private Date createdDate;
	
	@JsonProperty("GhiChu")
	private String note;
	
	@JsonProperty("DaXuat")
	private Boolean isExported;
	
        @JsonProperty("DaXoa")
	private Boolean isDeleted;

    public Boolean getIsExported() {
        return isExported;
    }

    public void setIsExported(Boolean isExported) {
        this.isExported = isExported;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
        
        
        
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public BigDecimal getTotalMoney() {
		return totalMoney;
	}
	
	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public Boolean getExported() {
		return isExported;
	}
	
	public void setExported(Boolean exported) {
		isExported = exported;
	}
}
