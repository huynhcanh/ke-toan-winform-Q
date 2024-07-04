
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.CustomerDTO;
import com.mycompany.ketoan.repository.CustomerRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomerService {
	
	public static void getTables(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã KH", "Tên KH", "Số Điện Thoại", "Địa Chỉ", "Mã Số Thuế"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<CustomerDTO> customers = CustomerRepository.findAll(keyword);
		if (customers != null) {
			for (int i = 0; i < customers.size(); i++) {
				CustomerDTO customerDTO = customers.get(i);
				Object[] item = new Object[]{
						i + 1,
						customerDTO.getId(),
						customerDTO.getName(),
						customerDTO.getPhone(),
						customerDTO.getAddress(),
						customerDTO.getTaxCode()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static void setComboBoxList(JComboBox comboBox) {
		List<CustomerDTO> customers = CustomerRepository.findAll("");
                if(customers == null || customers.isEmpty()) return;
		List<ComboxModel> dataComboBox = customers.stream().map(c -> new ComboxModel(c.getId(), c.getName())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
	
	public static void fillDetailToForm(Integer id,
										JTextField idE,
										JTextField nameE,
										JTextField phoneE,
										JTextField addressE,
										JTextField taxCodeE) {
		CustomerDTO customerDTO = CustomerRepository.findById(id);
		idE.setText(customerDTO.getId().toString());
		nameE.setText(customerDTO.getName());
		phoneE.setText(customerDTO.getPhone());
		addressE.setText(customerDTO.getAddress());
		taxCodeE.setText(customerDTO.getTaxCode());
	}
}
