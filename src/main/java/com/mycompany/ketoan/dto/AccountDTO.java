package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
	
	@JsonProperty("Cap1")
	private Integer level1;
	
	@JsonProperty("Cap2")
	private Integer level2;
	
	@JsonProperty("Cap3")
	private Integer level3;
	
	@JsonProperty("tenTK")
	private String content;
	
}
