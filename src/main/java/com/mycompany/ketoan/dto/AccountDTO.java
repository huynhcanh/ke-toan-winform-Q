package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
	
	@JsonProperty("maTK1")
	private Integer accountLevel1Id;
	
	@JsonProperty("soTaiKhoan")
	private String accountNumber;
	
	@JsonProperty("noiDung")
	private String content;
	
	@JsonProperty("loai")
	private String type;
	
	@JsonProperty("maTKCTGoc")
	private Integer accountParentId;
	
	@JsonProperty("ten")
	private String name;
	
}
