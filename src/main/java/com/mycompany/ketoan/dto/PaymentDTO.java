package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentDTO {
	
	@JsonProperty("MaPC")
	private Integer id;
	
	@JsonProperty("LydoNop")
	private String reason;
	
	@JsonProperty("NgayTao")
	private Date createdDate;
	
	@JsonProperty("SoTien")
	private BigDecimal price;
	
	@JsonProperty("TaiLieuDinhKem")
	private String document;
	
	@JsonProperty("MaTietKhoanNo")
	private Integer accountNoId;
	
	@JsonProperty("MaTietKhoanCo")
	private Integer accountCoId;
	
	@JsonProperty("QuyenSo")
	private Integer bookNumber;
	
	@JsonProperty("MaNV")
	private Integer employeeId;
	
	@JsonProperty("TenNV")
	private String employeeName;
	
	@JsonProperty("DiaChiNV")
	private String employeeAddress;
	
	@JsonProperty("MaCT")
	private Integer documentId;
        
        @JsonProperty("DaXuat")
	private Boolean isExported;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public Integer getAccountNoId() {
		return accountNoId;
	}
	
	public void setAccountNoId(Integer accountNoId) {
		this.accountNoId = accountNoId;
	}
	
	public Integer getAccountCoId() {
		return accountCoId;
	}
	
	public void setAccountCoId(Integer accountCoId) {
		this.accountCoId = accountCoId;
	}
	
	public Integer getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
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
	
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	public Integer getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

    public Boolean getIsExported() {
        return isExported;
    }

    public void setIsExported(Boolean isExported) {
        this.isExported = isExported;
    }
	
}
