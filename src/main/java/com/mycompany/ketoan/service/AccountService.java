/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.AccountDTO;
import com.mycompany.ketoan.repository.AccountRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * @author canhhuynh
 */
public class AccountService {
	
	public static void getTables(JTable tblOrder, String keywords) {
		Object[] obj = new Object[]{"STT", "Level 1", "Level 2", "Level 3", "Tên Tài Khoản"};
		DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
		tblOrder.setModel(tableModel);
		
		List<AccountDTO> accounts = AccountRepository.findAll(keywords);
		if (accounts != null) {
			for (int i = 0; i < accounts.size(); i++) {
				AccountDTO account = accounts.get(i);
				Object[] item = new Object[]{
						i + 1,
						account.getLevel1(),
						account.getLevel2(),
                                                account.getLevel3(),
						account.getContent()
				};
				tableModel.addRow(item);
			}
		}
	}
}
