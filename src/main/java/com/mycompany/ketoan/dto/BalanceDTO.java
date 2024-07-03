package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class BalanceDTO {
    
        @JsonProperty("MaSDDDK")
	private Integer id;
	
	@JsonProperty("MaTietKhoan")
	private Integer accountIdLv3;
	
	@JsonProperty("TenTietKhoan")
	private String accountNameLv3;
	
	@JsonProperty("NgayDauKy")
	private Date firstDateOfPeriod;
	
	@JsonProperty("SoTien")
	private BigDecimal price;
        
        @JsonProperty("TrangThai")
        private String status;
	
	public Integer getAccountIdLv3() {
		return accountIdLv3;
	}
	
	public void setAccountIdLv3(Integer accountIdLv3) {
		this.accountIdLv3 = accountIdLv3;
	}
	
	public String getAccountNameLv3() {
		return accountNameLv3;
	}
	
	public void setAccountNameLv3(String accountNameLv3) {
		this.accountNameLv3 = accountNameLv3;
	}
	
	public Date getFirstDateOfPeriod() {
		return firstDateOfPeriod;
	}
	
	public void setFirstDateOfPeriod(Date firstDateOfPeriod) {
		this.firstDateOfPeriod = firstDateOfPeriod;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
        
}
