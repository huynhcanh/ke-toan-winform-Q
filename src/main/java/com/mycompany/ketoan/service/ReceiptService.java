
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
		Object[] obj = new Object[]{"STT", "Mã PT", "Nhân Viên", "Khách Hàng", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Lý Do"};
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
                                                receiptDTO.getReason()
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
			JComboBox employeeE,
			JComboBox customerE,
                        JComboBox noAccountE,
                        JComboBox coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea ressonE) {
		idE.setText("");
		ElementUtils.setSelectedCombobox(null, employeeE);
                ElementUtils.setSelectedCombobox(null, customerE);
		ElementUtils.setSelectedCombobox(null, noAccountE);
                ElementUtils.setSelectedCombobox(null, coAccountE);
		priceE.setText("");
                bookNumberE.setText("");
		ressonE.setText("");
	}
	
	public static boolean isValidated(JTextField idE,
			JComboBox employeeE,
			JComboBox customerE,
                        JComboBox noAccountE,
                        JComboBox coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
			boolean isAddAction) {
		if ((!isAddAction && idE.getText().equals("")) || ElementUtils.getCbbSelected(noAccountE) == null
				|| ElementUtils.getCbbSelected(coAccountE) == null
                                || ElementUtils.getCbbSelected(employeeE) == null || ElementUtils.getCbbSelected(customerE) == null
                                || priceE.getText().equals("") || bookNumberE.getText().equals("")) {
			
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
	
	
	public static void fillDetailToForm(Integer id,
                        JTextField idE,
			JComboBox employeeE,
			JComboBox customerE,
                        JComboBox noAccountE,
                        JComboBox coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea reasonE) {
		ReceiptDTO receiptDTO = ReceiptRepository.findById(id);
		idE.setText(receiptDTO.getId().toString());
                ElementUtils.setSelectedCombobox(receiptDTO.getEmployeeId(), employeeE);
                ElementUtils.setSelectedCombobox(receiptDTO.getCustomerId(), customerE);
		ElementUtils.setSelectedCombobox(receiptDTO.getAccountNoId(), noAccountE);
		ElementUtils.setSelectedCombobox(receiptDTO.getAccountCoId(), coAccountE);
                priceE.setText(PriceUtils.convertToVND(receiptDTO.getPrice()));
		bookNumberE.setText(receiptDTO.getBookNumber() != null ? receiptDTO.getBookNumber().toString(): "");
                reasonE.setText(receiptDTO.getReason());
	}
}
