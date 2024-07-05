
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.BalanceDTO;
import com.mycompany.ketoan.repository.BalanceRepository;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.PriceUtils;
import com.toedter.calendar.JDateChooser;
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
	
	public static void fillDetailToForm(
                Integer accountIdLv3,  Date firstDateOfPeriod,
                JDateChooser firstDateOfPeriodE,
			JComboBox accountIdLv3E,
                        JTextField priceE,
                        JComboBox statusE) {
		BalanceDTO balanceDTO = BalanceRepository.findById(accountIdLv3, firstDateOfPeriod);
		
		firstDateOfPeriodE.setDate(balanceDTO.getFirstDateOfPeriod());
                ElementUtils.setSelectedCombobox(balanceDTO.getAccountIdLv3(), accountIdLv3E);
		priceE.setText(PriceUtils.convertToVND(balanceDTO.getPrice()));
		ElementUtils.setSelectedCombobox(balanceDTO.getStatus(), statusE);
             
	}
}
