
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmployeeService {
	
	public static void setComboBoxList(JComboBox comboBox) {
		List<EmployeeDTO> customers = EmployeeRepository.findAll("");
                if(customers == null || customers.isEmpty()) return;
		List<ComboxModel> dataComboBox = customers.stream().map(c -> new ComboxModel(c.getId(), c.getName())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
        
        private static String getRole(String code){
            if(code.equals("ADMIN")) return "Admin";
            if(code.equals("ACCOUNTANT")) return "Kế Toán";
            return "Nhân Viên Bán Hàng";
        }
	
	public static void getTables(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã ND", "Tên DN", "Mật Khẩu", "Vai Trò", "Tên", "SDT", "Địa Chỉ"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<EmployeeDTO> employees = EmployeeRepository.findAll(keyword);
		if (employees != null) {
			for (int i = 0; i < employees.size(); i++) {
				EmployeeDTO employeeDTO = employees.get(i);
				Object[] item = new Object[]{
						i + 1,
						employeeDTO.getId(),
						employeeDTO.getUsername(),
						employeeDTO.getPassword(),
						EmployeeService.getRole(employeeDTO.getRole()),
                                                employeeDTO.getName(),
						employeeDTO.getPhone(),
						employeeDTO.getAddress(),
				};
				tableModel.addRow(item);
			}
		}
	}

	public static void fillDetailToForm(Integer id,
										JTextField idE,
										JTextField usernameE,
										JTextField passwordE,
										JComboBox roleE,
                                                                                JTextField nameE,
                                                                            JTextField phoneE,
                                                                            JTextField addressE) {
		EmployeeDTO employeeDTO = EmployeeRepository.findById(id);
		idE.setText(employeeDTO.getId().toString());
		usernameE.setText(employeeDTO.getUsername());
		passwordE.setText(employeeDTO.getPassword());
		ElementUtils.setSelectedCombobox(employeeDTO.getRole(), roleE);
               nameE.setText(employeeDTO.getName());
		phoneE.setText(employeeDTO.getPhone());
                addressE.setText(employeeDTO.getAddress());
	}
}
