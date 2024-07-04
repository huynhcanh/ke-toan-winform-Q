
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.AccountEntryDTO;
import com.mycompany.ketoan.repository.AccountEntryRepository;
import com.mycompany.ketoan.utils.PriceUtils;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountEntryService {
	
	public static void getTables(JTable tblOrder, String keyword, String type) {
		Object[] obj = new Object[]{"STT", "Mã BT", "Ngày CT", "Số CT", "Diễn Giải", "TK Nợ", "TK Có", "Số Tiền"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<AccountEntryDTO> accoutnEntries = AccountEntryRepository.findAll(keyword, type);
		if (accoutnEntries != null) {
			for (int i = 0; i < accoutnEntries.size(); i++) {
				AccountEntryDTO accountEntryDTO = accoutnEntries.get(i);
				Object[] item = new Object[]{
						i + 1,
						accountEntryDTO.getId(),
						accountEntryDTO.getDocumentDate(),
						accountEntryDTO.getDocumentNumber(),
						accountEntryDTO.getDescription(),
                                                accountEntryDTO.getAccountNoId(),
						accountEntryDTO.getAccountCoId(),
						PriceUtils.convertToVND(accountEntryDTO.getAdditionalPrice()),
				};
				tableModel.addRow(item);
			}
		}
	}
}
