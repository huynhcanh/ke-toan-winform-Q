
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.repository.ProductRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;
import com.mycompany.ketoan.utils.PriceUtils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ProductService {
	
	public static void getTables(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã HH", "Tên HH", "Loại HH", "Giá Bán", "Kích Thước", "Đơn Vị"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<ProductDTO> products = ProductRepository.findAll(keyword);
		if (products != null) {
			for (int i = 0; i < products.size(); i++) {
				ProductDTO productDTO = products.get(i);
				Object[] item = new Object[]{
						i + 1,
						productDTO.getId(),
						productDTO.getName(),
						productDTO.getCategoryName(),
						PriceUtils.convertToVND(productDTO.getPrice()),
						productDTO.getSize(),
						productDTO.getUnit()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 1);
	}
	
	public static void resetForm(JTextField nameE,
								 JComboBox categoryE,
								 JTextField priceE,
								 JTextField sizeE,
								 JTextField unitE) {
		nameE.setText("");
		ElementUtils.setSelectedCombobox(null, categoryE);
		priceE.setText("");
		sizeE.setText("");
		unitE.setText("");
	}
	
	public static void setComboBoxList(JComboBox comboBox) {
		List<ProductDTO> products = ProductRepository.findAll("");
                if(products == null || products.isEmpty()) return;
		List<ComboxModel> dataComboBox = products.stream().map(c -> new ComboxModel(c.getId(), c.getName())).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
	
	public static void fillDetailToForm(Integer id,
										JTextField nameE,
										JComboBox categoryE,
										JTextField priceE,
										JTextField sizeE,
										JTextField unitE) {
		ProductDTO productDTO = ProductRepository.findById(id);
		nameE.setText(productDTO.getName().toString());
		ElementUtils.setSelectedCombobox(productDTO.getCategoryId(), categoryE);
		priceE.setText(PriceUtils.convertToVND(productDTO.getPrice()));
		sizeE.setText(productDTO.getSize());
		unitE.setText(productDTO.getUnit());
	}
	
	public static boolean isValidated(JTextField nameE,
									  JComboBox categoryE,
									  JTextField priceE,
									  JTextField sizeE,
									  JTextField unitE) {
		if (nameE.getText().equals("")
				|| ElementUtils.getCbbSelected(categoryE) == null
				|| priceE.getText().equals("")
				|| sizeE.getText().equals("")
				|| unitE.getText().equals("")) {
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
}
