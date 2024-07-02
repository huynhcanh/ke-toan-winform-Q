
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.PaymentDTO;
import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.repository.PaymentRepository;
import com.mycompany.ketoan.repository.ReceiptRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PaymentService {
	
	public static void getTables(JTable tblOrder, String keyword) {
		Object[] obj = new Object[]{"STT", "Mã PC", "Nhân Viên", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Lý Do"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<PaymentDTO> payments = PaymentRepository.findAll(keyword);
		if (payments != null) {
			for (int i = 0; i < payments.size(); i++) {
				PaymentDTO paymentDTO = payments.get(i);
				Object[] item = new Object[]{
						i + 1,
						paymentDTO.getId(),
						paymentDTO.getEmployeeName(),
						paymentDTO.getAccountNoId(),
						paymentDTO.getAccountCoId(),
                                                PriceUtils.convertToVND(paymentDTO.getPrice()),
						paymentDTO.getCreatedDate(),
						paymentDTO.getBookNumber(),
                                                paymentDTO.getReason()
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
                        JTextField noAccountE,
                        JTextField coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea ressonE) {
		idE.setText("");
		ElementUtils.setSelectedCombobox(null, employeeE);
		noAccountE.setText("");
                coAccountE.setText("");
		priceE.setText("");
                bookNumberE.setText("");
		ressonE.setText("");
	}
	
	public static boolean isValidated(JTextField idE,
			JComboBox employeeE,
                        JTextField noAccountE,
                        JTextField coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
			boolean isAddAction) {
		if ((!isAddAction && idE.getText().equals("")) || noAccountE.getText().equals("")
				|| coAccountE.getText().equals("")
                                || ElementUtils.getCbbSelected(employeeE) == null
                                || priceE.getText().equals("") || bookNumberE.getText().equals("")) {
			
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
	
	
	public static void fillDetailToForm(Integer id,
                        JTextField idE,
			JComboBox employeeE,
                        JTextField noAccountE,
                        JTextField coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea reasonE) {
		PaymentDTO paymentDTO = PaymentRepository.findById(id);
		idE.setText(paymentDTO.getId().toString());
                ElementUtils.setSelectedCombobox(paymentDTO.getEmployeeId(), employeeE);
		noAccountE.setText(paymentDTO.getAccountNoId() != null? paymentDTO.getAccountNoId().toString(): "");
		coAccountE.setText(paymentDTO.getAccountCoId() != null? paymentDTO.getAccountCoId().toString() : "");
                priceE.setText(PriceUtils.convertToVND(paymentDTO.getPrice()));
		bookNumberE.setText(paymentDTO.getBookNumber() != null ? paymentDTO.getBookNumber().toString(): "");
                reasonE.setText(paymentDTO.getReason());
	}
}
