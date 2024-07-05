package com.mycompany.ketoan.service;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.repository.OrderRepository;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;

import java.math.BigDecimal;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class OrderService {
	
	public static void getTable(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã Đơn Hàng", "Nhân Viên ", "Khách Hàng", "Ngày Tạo", "Tổng Tiền", "Trạng Thái", "Ghi Chú"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<OrderDTO> orders = OrderRepository.findAll(keyword, null, null, null, null);
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
						orderDTO.getExported() != null && orderDTO.getExported() ? "Đã Xuất" : "Chưa Xuất",
						orderDTO.getNote()
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static void fillDetailToForm(Integer orderId,
										JComboBox customerE,
										JTextField noteE) {
		OrderDTO orderDTO = OrderRepository.findById(orderId);
		ElementUtils.setSelectedCombobox(orderDTO.getCustomerId(), customerE);
		noteE.setText(orderDTO.getNote());
	}
	
	public static void updateFieldTotalMoneyOfOrderItemOnTable(JTable tblOrder, String totalMoney) {
		int indexRowSelected = tblOrder.getSelectedRow();
		tblOrder.setValueAt(totalMoney, indexRowSelected, 5);
	}
        
        public static void updateFieldExportedOfOrderItemOnTable(JTable tblOrder) {
		int indexRowSelected = tblOrder.getSelectedRow();
		tblOrder.setValueAt("Đã Xuất", indexRowSelected, 6);
	}
	
        public static String getStatus(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (String) table.getValueAt(indexRowSelected, 6);
	}
        
        public static void getTableCT(JTable tblOrder, String keyword, Date fromDate, Date toDate) {
		Object[] obj = new Object[]{"STT", "Mã CT", "Nhân Viên ", "Khách Hàng", "Ngày Tạo", "Tổng Tiền", "Ghi Chú"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<OrderDTO> orders = OrderRepository.findAll(keyword, true, false, fromDate, toDate);
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
}
