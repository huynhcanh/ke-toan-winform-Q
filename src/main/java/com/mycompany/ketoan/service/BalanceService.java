
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BalanceService {
	
//	public static void getTables(JTable tblOrder, String keyword) {
//		Object[] obj = new Object[]{"STT", "Mã", "Ngày Đầu Kì", "Mã Tiết Khoản", "Số Tiền", "Trạng Thái"};
//		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//		tblOrder.setModel(tableModel);
//		
//		List<EmployeeDTO> employees = EmployeeRepository.findAll(keyword);
//		if (employees != null) {
//			for (int i = 0; i < employees.size(); i++) {
//				EmployeeDTO employeeDTO = employees.get(i);
//				Object[] item = new Object[]{
//						i + 1,
//						employeeDTO.getId(),
//						employeeDTO.getUsername(),
//						employeeDTO.getPassword(),
//						BalanceService.getRole(employeeDTO.getRole()),
//                                                employeeDTO.getName(),
//						employeeDTO.getPhone(),
//						employeeDTO.getAddress(),
//				};
//				tableModel.addRow(item);
//			}
//		}
//	}
//	
//	public static Integer getId(JTable table) {
//		int indexRowSelected = table.getSelectedRow();
//		return (Integer) table.getValueAt(indexRowSelected, 1);
//	}
//	
//	public static void resetForm(
//			JTextField idE,
//			JTextField usernameE,
//			JTextField passwordE,
//			JComboBox roleE,
//                        JTextField nameE,
//                        JTextField phoneE,
//			JTextField addressE) {
//		idE.setText("");
//		usernameE.setText("");
//		passwordE.setText("");
//                nameE.setText("");
//		phoneE.setText("");
//                addressE.setText("");
//		ElementUtils.setSelectedCombobox(null, roleE);
//	}
//	
//	public static boolean isValidated(JTextField idE,
//									  JTextField usernameE,
//									  JTextField passwordE,
//									  JComboBox roleE,
//                                                                          JTextField nameE,
//                                                                            JTextField phoneE,
//                                                                            JTextField addressE,
//									  boolean isAddAction) {
//		if ((!isAddAction && idE.getText().equals("")) || usernameE.getText().equals("")
//				|| passwordE.getText().equals("") || ElementUtils.getCbbSelected(roleE) == null
//                                || nameE.getText().equals("") || phoneE.getText().equals("") || addressE.getText().equals("")) {
//			
//			AlertUtils.showAlertValidate();
//			return false;
//		}
//		return true;
//	}
//	
//	
//	public static void fillDetailToForm(Integer id,
//										JTextField idE,
//										JTextField usernameE,
//										JTextField passwordE,
//										JComboBox roleE,
//                                                                                JTextField nameE,
//                                                                            JTextField phoneE,
//                                                                            JTextField addressE) {
//		EmployeeDTO employeeDTO = EmployeeRepository.findById(id);
//		idE.setText(employeeDTO.getId().toString());
//		usernameE.setText(employeeDTO.getUsername());
//		passwordE.setText(employeeDTO.getPassword());
//		ElementUtils.setSelectedCombobox(employeeDTO.getRole(), roleE);
//               nameE.setText(employeeDTO.getName());
//		phoneE.setText(employeeDTO.getPhone());
//                addressE.setText(employeeDTO.getAddress());
//	}
}
