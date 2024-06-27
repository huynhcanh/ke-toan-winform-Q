package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDTO {
    
    @JsonProperty("MaKH")
    private Integer id;

    @JsonProperty("Ten")
    private String name;

    @JsonProperty("SDT")
    private String phone; 

    @JsonProperty("DiaChi")
    private String address;
    
    @JsonProperty("MaSoThue")
    private String taxCode;
	
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

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}
