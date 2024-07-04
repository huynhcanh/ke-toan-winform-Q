
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.helper.HelperObject;
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
										JTextField unitE,
                                                                                JLabel lab_HinhAnh_HangHoa) {
		ProductDTO productDTO = ProductRepository.findById(id);
		nameE.setText(productDTO.getName().toString());
		ElementUtils.setSelectedCombobox(productDTO.getCategoryId(), categoryE);
		priceE.setText(PriceUtils.convertToVND(productDTO.getPrice()));
		sizeE.setText(productDTO.getSize());
		unitE.setText(productDTO.getUnit());
                ElementUtils.showImage(lab_HinhAnh_HangHoa, productDTO.getImage());
	}
}
