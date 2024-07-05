
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
		Object[] obj = new Object[]{"STT", "Mã PC", "Nhân Viên", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Trạng Thái", "Lý Do"};
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
                                                paymentDTO.getIsExported() != null && paymentDTO.getIsExported() ? "Đã Xuất" : "Chưa Xuất",
                                                paymentDTO.getReason()
				};
				tableModel.addRow(item);
			}
		}
	}

	public static void fillDetailToForm(Integer id,
			JComboBox employeeE,
                        JComboBox noAccountE,
                        JComboBox coAccountE,
			JTextField priceE,
                        JTextField bookNumberE,
                        JTextArea reasonE) {
		PaymentDTO paymentDTO = PaymentRepository.findById(id);
                ElementUtils.setSelectedCombobox(paymentDTO.getEmployeeId(), employeeE);
		ElementUtils.setSelectedCombobox(paymentDTO.getAccountNoId(), noAccountE);
		ElementUtils.setSelectedCombobox(paymentDTO.getAccountCoId(), coAccountE);
                priceE.setText(PriceUtils.convertToVND(paymentDTO.getPrice()));
		bookNumberE.setText(paymentDTO.getBookNumber() != null ? paymentDTO.getBookNumber().toString(): "");
                reasonE.setText(paymentDTO.getReason());
	}
        
        
         public static String getStatus(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (String) table.getValueAt(indexRowSelected, 8);
	}
         
         public static void updateFieldExportedOfPaymentItemOnTable(JTable tblOrder) {
		int indexRowSelected = tblOrder.getSelectedRow();
		tblOrder.setValueAt("Đã Xuất", indexRowSelected, 8);
	}
}
