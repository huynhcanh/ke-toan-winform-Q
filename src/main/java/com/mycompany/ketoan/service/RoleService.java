
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.RoleDTO;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;

import java.util.List;
import javax.swing.JComboBox;


public class RoleService {
	
        public static List<RoleDTO> roles = List.of(
                new RoleDTO("ADMIN", "Admin"),
                new RoleDTO("ACCOUNTANT", "Kế Toán"),
                new RoleDTO("SALER", "Nhân Viên Bán Hàng"));
    
	public static void setComboBoxList(JComboBox comboBox) {
		List<RoleDTO> customers = roles;
		List<ComboxModel> dataComboBox = customers.stream().map(c -> new ComboxModel(c.getCode(), c.getName())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
}
