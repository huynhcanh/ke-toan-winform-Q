/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class OrderDetailDTO {
    
    @JsonProperty("MaHH")
	private Integer productId;
    
    @JsonProperty("TenHH")
	private String productName;

    @JsonProperty("SoLuong")
	private Integer quantity;

    @JsonProperty("GiaBan")
	private BigDecimal unitPrice;

    @JsonProperty("MaDH")
	private Integer orderId;
    
    public BigDecimal getTotalMoney(){
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    
    
}
