/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.OrderDetailDTO;
import com.mycompany.ketoan.repository.OrderDetailRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OrderDetailService {
	
	public static void getTable(Integer orderId, JTable table) {
		Object[] obj = new Object[]{"STT", "Mã HĐ", "Mã HH", "Tên HH", "Số Lượng", "Đơn giá", "Tổng Tiền"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		table.setModel(tableModel);
		
		List<OrderDetailDTO> orderDetails = OrderDetailRepository.findAllByOrderId(orderId);
		if (orderDetails != null) {
			for (int i = 0; i < orderDetails.size(); i++) {
				OrderDetailDTO orderDetailDTO = orderDetails.get(i);
				Object[] item = new Object[]{
						i + 1,
						orderDetailDTO.getOrderId(),
						orderDetailDTO.getProductId(),
						orderDetailDTO.getProductName(),
						orderDetailDTO.getQuantity(),
						PriceUtils.convertToVND(orderDetailDTO.getUnitPrice()),
						PriceUtils.convertToVND(orderDetailDTO.getTotalMoney())
				};
				tableModel.addRow(item);
			}
		}
	}
        
//        public static void clearTable(JTable table) {
//            
//                ((DefaultTableModel)table.getModel()).setRowCount(1);
//            
//		Object[] obj = new Object[]{"STT", "Mã HĐ", "Mã HH", "Tên HH", "Số Lượng", "Đơn giá", "Tổng Tiền"};
//		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//		table.setModel(tableModel);
//		
//		List<OrderDetailDTO> orderDetails = OrderDetailRepository.findAllByOrderId(orderId);
//		if (orderDetails != null) {
//			for (int i = 0; i < orderDetails.size(); i++) {
//				OrderDetailDTO orderDetailDTO = orderDetails.get(i);
//				Object[] item = new Object[]{
//						i + 1,
//						orderDetailDTO.getOrderId(),
//						orderDetailDTO.getProductId(),
//						orderDetailDTO.getProductName(),
//						orderDetailDTO.getQuantity(),
//						PriceUtils.convertToVND(orderDetailDTO.getUnitPrice()),
//						PriceUtils.convertToVND(orderDetailDTO.getTotalMoney())
//				};
//				tableModel.addRow(item);
//			}
//		}
//	}
	
	public static void fillDetailToForm(Integer orderId, Integer productId,
										JComboBox productE,
										JTextField quantityE) {
		OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);
		ElementUtils.setSelectedCombobox(orderDetailDTO.getProductId(), productE);
		
		Integer quantity = orderDetailDTO.getQuantity();
		quantityE.setText(quantity.toString());
	}
	
	public static Integer getOrderId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 1);
	}
	
	public static Integer getProductId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 2);
	}
}
