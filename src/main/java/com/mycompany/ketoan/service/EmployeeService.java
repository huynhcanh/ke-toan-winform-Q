
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmployeeService {
	
	public static void setComboBoxList(JComboBox comboBox) {
		List<EmployeeDTO> customers = EmployeeRepository.findAll();
		List<ComboxModel> dataComboBox = customers.stream().map(c -> new ComboxModel(c.getId(), c.getUsername())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
	
	public static void getTables(JTable tblOrder) {
		Object[] obj = new Object[]{"STT", "Mã Người Dùng", "Tên Đăng Nhập", "Mật Khẩu", "Vai Trò"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<EmployeeDTO> employees = EmployeeRepository.findAll();
		if (employees != null) {
			for (int i = 0; i < employees.size(); i++) {
				EmployeeDTO employeeDTO = employees.get(i);
				Object[] item = new Object[]{
						i + 1,
						employeeDTO.getId(),
						employeeDTO.getUsername(),
						employeeDTO.getPassword(),
						employeeDTO.getRole()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 1);
	}
	
	public static void resetForm(
			JTextField idE,
			JTextField usernameE,
			JTextField passwordE,
			JComboBox roleE) {
		idE.setText("");
		usernameE.setText("");
		passwordE.setText("");
		ElementUtils.setSelectedCombobox(null, roleE);
	}
	
	public static boolean isValidated(JTextField idE,
									  JTextField usernameE,
									  JTextField passwordE,
									  JComboBox roleE,
									  boolean isAddAction) {
		if ((!isAddAction && idE.getText().equals("")) || usernameE.getText().equals("")
				|| passwordE.getText().equals("") || ElementUtils.getCbbSelected(roleE) == null) {
			
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
	
	
	public static void fillDetailToForm(Integer id,
										JTextField idE,
										JTextField usernameE,
										JTextField passwordE,
										JComboBox roleE) {
		EmployeeDTO employeeDTO = EmployeeRepository.findById(id);
		idE.setText(employeeDTO.getId().toString());
		usernameE.setText(employeeDTO.getUsername());
		passwordE.setText(employeeDTO.getPassword());
		ElementUtils.setSelectedCombobox(employeeDTO.getRole(), roleE);
	}
}
