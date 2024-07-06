
package com.mycompany.ketoan.utils;

import com.mycompany.ketoan.constants.ApplicationConstants;
import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.security.Principal;

public class SecurityUtils {
	
	private static Principal principal = null;
	
	public static void setPrincipal(EmployeeDTO userDTO) {
		if (principal == null) principal = new Principal();
		principal.setId(userDTO.getId());
		principal.setUsername(userDTO.getUsername());
		principal.setRole(userDTO.getRole());
	}
	
	public static Principal getUserCurrent() {
		return principal;
	}
        
        public static boolean isAdmin(){
            return principal.getRole().equals(ApplicationConstants.Application.Role.ADMIN);
        }
        
        public static boolean isAccountant(){
            return principal.getRole().equals(ApplicationConstants.Application.Role.ACCOUNTANT);
        }
        
         public static boolean isSaler(){
            return principal.getRole().equals(ApplicationConstants.Application.Role.SALER);
        }
}
