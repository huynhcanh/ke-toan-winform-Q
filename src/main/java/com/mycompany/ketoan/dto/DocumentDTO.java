package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class DocumentDTO {

	@JsonProperty("MaCT")
	private Integer id;
	
	@JsonProperty("NgayCT")
	private Date createdDate;
	
	@JsonProperty("SoCT")
	private String documentNumber;
	
	@JsonProperty("MaLoaiCT")
	private String type;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
