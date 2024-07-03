
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.BalanceDTO;
import com.mycompany.ketoan.repository.BalanceRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;
import java.util.Date;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BalanceService {
	
	public static void getTables(JTable tblOrder) {
		Object[] obj = new Object[]{"STT", "Ngày Đầu Kì", "Mã Tiết Khoản", "Số Tiền", "Trạng Thái"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<BalanceDTO> balanceDTOs = BalanceRepository.findAll();
		if (balanceDTOs != null) {
			for (int i = 0; i < balanceDTOs.size(); i++) {
				BalanceDTO balanceDTO = balanceDTOs.get(i);
				Object[] item = new Object[]{
						i + 1,
						balanceDTO.getFirstDateOfPeriod(),
						balanceDTO.getAccountIdLv3(),
						PriceUtils.convertToVND(balanceDTO.getPrice()),
                                                balanceDTO.getStatus() == null ? "" : balanceDTO.getStatus().equals("DU_NO") ? "Dư Nợ" : "Dư Có"
				};
				tableModel.addRow(item);
			}
		}
	}
	
	public static Date getDate(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Date)table.getValueAt(indexRowSelected, 1);
	}
        
        public static Integer getMTK(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 2);
	}
	
	public static void resetForm(
			JTextField firstDateOfPeriodE,
			JComboBox accountIdLv3E,
                        JTextField priceE,
                        JComboBox statusE) {
		firstDateOfPeriodE.setText("");
                ElementUtils.setSelectedCombobox(null, accountIdLv3E);
		ElementUtils.setSelectedCombobox(null, statusE);
                priceE.setText("");
	}
	
	public static boolean isValidated(JTextField firstDateOfPeriodE,
			JComboBox accountIdLv3E,
                        JTextField priceE,
                        JComboBox statusE) {
		if ((firstDateOfPeriodE.getText().equals("")
				|| priceE.getText().equals("") || ElementUtils.getCbbSelected(accountIdLv3E) == null
                               || ElementUtils.getCbbSelected(statusE) == null)) {
			
			AlertUtils.showAlertValidate();
			return false;
		}
		return true;
	}
	
	
	public static void fillDetailToForm(
                Integer accountIdLv3,  Date firstDateOfPeriod,
                JTextField firstDateOfPeriodE,
			JComboBox accountIdLv3E,
                        JTextField priceE,
                        JComboBox statusE) {
		BalanceDTO balanceDTO = BalanceRepository.findById(accountIdLv3, firstDateOfPeriod);
		
		firstDateOfPeriodE.setText(DateTimeUtils.toString(balanceDTO.getFirstDateOfPeriod()));
                ElementUtils.setSelectedCombobox(balanceDTO.getAccountIdLv3(), accountIdLv3E);
		priceE.setText(PriceUtils.convertToVND(balanceDTO.getPrice()));
		ElementUtils.setSelectedCombobox(balanceDTO.getStatus(), statusE);
             
	}
}
