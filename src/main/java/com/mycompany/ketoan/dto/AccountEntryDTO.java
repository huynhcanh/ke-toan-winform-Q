package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class AccountEntryDTO {
	
	@JsonProperty("MaBT")
	private Integer Id;
	
	@JsonProperty("NgayCT")
	private Date createdDate;
	
	@JsonProperty("NgayHT")
	private Date ngayHT;
	
	@JsonProperty("DienGiai")
	private String description;
	
	@JsonProperty("TKNo")
	private Integer accountNoId;
	
	@JsonProperty("TkCo")
	private Integer accountCoId;
	
	@JsonProperty("TienPhatSinh")
	private BigDecimal additionalPrice;
	
	@JsonProperty("MaCT")
	private Integer documentId;
	
	@JsonProperty("SoCT")
	private String documentNumber;
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getNgayHT() {
		return ngayHT;
	}
	
	public void setNgayHT(Date ngayHT) {
		this.ngayHT = ngayHT;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
	
	public BigDecimal getAdditionalPrice() {
		return additionalPrice;
	}
	
	public void setAdditionalPrice(BigDecimal additionalPrice) {
		this.additionalPrice = additionalPrice;
	}
	
	public Integer getDocumentId() {
		return documentId;
	}
	
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}
