package com.mycompany.ketoan.service;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.repository.OrderRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;

import java.math.BigDecimal;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class OrderService {
	
	public static void getTable(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã Đơn Hàng", "Nhân Viên ", "Khách Hàng", "Ngày Tạo", "Tổng Tiền", "Ghi Chú"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<OrderDTO> orders = OrderRepository.findAll(keyword);
		if (orders != null) {
			for (int i = 0; i < orders.size(); i++) {
				OrderDTO orderDTO = orders.get(i);
				Object[] item = new Object[]{
						i + 1,
						orderDTO.getId(),
						orderDTO.getEmployeeName(),
						orderDTO.getCustomerName(),
						DateTimeUtils.toString(orderDTO.getCreatedDate()),
						PriceUtils.convertToVND(orderDTO.getTotalMoney()),
						orderDTO.getNote()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static void fillDetailToForm(Integer orderId,
										JTextField idE,
										JComboBox customerE,
										JTextField totalMoneyE,
										JTextField noteE) {
		OrderDTO orderDTO = OrderRepository.findById(orderId);
		idE.setText(orderDTO.getId().toString());
		ElementUtils.setSelectedCombobox(orderDTO.getCustomerId(), customerE);
		totalMoneyE.setText(PriceUtils.convertToVND(orderDTO.getTotalMoney()));
		noteE.setText(orderDTO.getNote());
	}
	
	public static void updateFieldTotalMoneyOfOrderItemOnTable(JTable tblOrder, BigDecimal totalMoney) {
		int indexRowSelected = tblOrder.getSelectedRow();
		tblOrder.setValueAt(totalMoney, indexRowSelected, 6);
	}
	
	public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 1);
	}
	
	public static void resetForm(JTextField idE,
								 JComboBox customerE,
								 JTextField totalMoneyE,
								 JTextField noteE,
								 JButton btnThem_HoaDon) {
		idE.setText("");
		ElementUtils.setSelectedCombobox(null, customerE);
		totalMoneyE.setText("0");
		noteE.setText("");
		
		btnThem_HoaDon.setEnabled(true);
	}
	
	public static boolean isValidated(JComboBox customerE) {
		if (ElementUtils.getCbbSelected(customerE) == null) {
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
}
