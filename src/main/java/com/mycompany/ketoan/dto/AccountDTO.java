package com.mycompany.ketoan.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDTO {
	
	@JsonProperty("cap1")
	private String level1;
	
	@JsonProperty("cap2")
	private String level2;
	
	@JsonProperty("cap3")
	private String level3;
	
	@JsonProperty("noiDung")
	private String content;

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

        
        
}
