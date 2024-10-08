
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.repository.ReceiptRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;
import com.mycompany.ketoan.utils.PriceUtils;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ReceiptService {
	
	public static void getTables(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã PT", "Nhân Viên", "Khách Hàng", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Trạng Thái", "Lý Do"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<ReceiptDTO> receipts = ReceiptRepository.findAll(keyword);
		if (receipts != null) {
			for (int i = 0; i < receipts.size(); i++) {
				ReceiptDTO receiptDTO = receipts.get(i);
				Object[] item = new Object[]{
						i + 1,
						receiptDTO.getId(),
						receiptDTO.getEmployeeName(),
                                                receiptDTO.getCustomerName(),
						receiptDTO.getAccountNoId(),
						receiptDTO.getAccountCoId(),
                                                PriceUtils.convertToVND(receiptDTO.getPrice()),
						receiptDTO.getCreatedDate(),
						receiptDTO.getBookNumber(),
                                                receiptDTO.getIsExported() != null && receiptDTO.getIsExported() ? "Đã Xuất" : "Chưa Xuất",
                                                receiptDTO.getReason()
				};
				tableModel.addRow(item);
			}
		}
	}

	public static void fillDetailToForm(Integer id,
			JComboBox employeeE,
			JComboBox customerE,
                        JComboBox noAccountE,
                        JComboBox coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea reasonE) {
		ReceiptDTO receiptDTO = ReceiptRepository.findById(id);
                ElementUtils.setSelectedCombobox(receiptDTO.getEmployeeId(), employeeE);
                ElementUtils.setSelectedCombobox(receiptDTO.getCustomerId(), customerE);
		ElementUtils.setSelectedCombobox(receiptDTO.getAccountNoId(), noAccountE);
		ElementUtils.setSelectedCombobox(receiptDTO.getAccountCoId(), coAccountE);
                priceE.setText(PriceUtils.convertToVND(receiptDTO.getPrice()));
		bookNumberE.setText(receiptDTO.getBookNumber() != null ? receiptDTO.getBookNumber().toString(): "");
                reasonE.setText(receiptDTO.getReason());
	}
        
         public static String getStatus(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (String) table.getValueAt(indexRowSelected, 9);
	}
         
         public static void updateFieldExportedOfReceiptItemOnTable(JTable tblOrder) {
		int indexRowSelected = tblOrder.getSelectedRow();
		tblOrder.setValueAt("Đã Xuất", indexRowSelected, 9);
	}
}
