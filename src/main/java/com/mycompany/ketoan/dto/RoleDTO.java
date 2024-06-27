
package com.mycompany.ketoan.dto;

import java.util.List;


public class RoleDTO {
    
    private String code;
    private String name;
    
    public static List<RoleDTO> roles = List.of(new RoleDTO("Admin", "Quản Trị Viên"),new RoleDTO("User", "Người dùng"));

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleDTO(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    
}
