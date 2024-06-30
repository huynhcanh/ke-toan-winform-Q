package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class AccountEntryDTO {
	
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
}
