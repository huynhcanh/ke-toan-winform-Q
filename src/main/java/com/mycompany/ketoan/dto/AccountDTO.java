package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDTO {
	
	@JsonProperty("Cap1")
	private Integer level1;
	
	@JsonProperty("Cap2")
	private Integer level2;
	
	@JsonProperty("Cap3")
	private Integer level3;
	
	@JsonProperty("TenTK")
	private String content;

    public Integer getLevel1() {
        return level1;
    }

    public void setLevel1(Integer level1) {
        this.level1 = level1;
    }

    public Integer getLevel2() {
        return level2;
    }

    public void setLevel2(Integer level2) {
        this.level2 = level2;
    }

    public Integer getLevel3() {
        return level3;
    }

    public void setLevel3(Integer level3) {
        this.level3 = level3;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

   
}
