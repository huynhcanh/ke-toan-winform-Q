
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.CategoryDTO;
import com.mycompany.ketoan.repository.CategoryRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CategoryService {
	
	public static void getTables(JTable tblOrder) {
		Object[] obj = new Object[]{"STT", "Mã loại", "Tên loại"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<CategoryDTO> categories = CategoryRepository.findAll();
		if (categories != null) {
			for (int i = 0; i < categories.size(); i++) {
				CategoryDTO categoryDTO = categories.get(i);
				Object[] item = new Object[]{
						i + 1,
						categoryDTO.getId(),
						categoryDTO.getName()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static void fillDetailToForm(Integer id,
										JTextField nameE) {
		CategoryDTO categoryDTO = CategoryRepository.findById(id);
		nameE.setText(categoryDTO.getName());
	}
	
	public static void setComboBoxList(JComboBox comboBox) {
		List<CategoryDTO> categories = CategoryRepository.findAll();
                if(categories == null || categories.isEmpty()) return;
		List<ElementUtils.ComboxModel> dataComboBox = categories.stream().map(c -> new ElementUtils.ComboxModel(c.getId(), c.getName())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
}
