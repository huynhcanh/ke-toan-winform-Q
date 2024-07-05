/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.AccountDTO;
import com.mycompany.ketoan.dto.AccountLv1DTO;
import com.mycompany.ketoan.dto.AccountLv2DTO;
import com.mycompany.ketoan.dto.AccountLv3DTO;
import com.mycompany.ketoan.repository.AccountRepository;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;

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
        
        public static void setComboBoxListLevel3(JComboBox comboBox) {
		List<Integer> noIds = AccountRepository.findAllIdAccountLevel3();
                if(noIds == null || noIds.isEmpty()) return;
		List<ComboxModel> dataComboBox = noIds.stream().map(id -> new ElementUtils.ComboxModel(id, id)).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
        
        public static void setComboBoxListLevel2(JComboBox comboBox) {
		List<Integer> noIds = AccountRepository.findAllIdAccountLevel2();
                if(noIds == null || noIds.isEmpty()) return;
		List<ComboxModel> dataComboBox = noIds.stream().map(id -> new ElementUtils.ComboxModel(id, id)).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
        
        public static void setComboBoxListLevel1(JComboBox comboBox) {
		List<Integer> noIds = AccountRepository.findAllIdAccountLevel1();
                if(noIds == null || noIds.isEmpty()) return;
		List<ComboxModel> dataComboBox = noIds.stream().map(id -> new ElementUtils.ComboxModel(id, id)).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
        
        public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
                
                Object lv1 = table.getValueAt(indexRowSelected, 1);
                if(lv1!= null) return (Integer) lv1;
                Object lv2 = table.getValueAt(indexRowSelected, 2);
                if(lv2!= null) return (Integer) lv2;
		return (Integer) table.getValueAt(indexRowSelected, 3);
	}
        
        public static String getLevel(JTable table) {
		int indexRowSelected = table.getSelectedRow();
                
                Object lv1 = table.getValueAt(indexRowSelected, 1);
                if(lv1!= null) return "LEVEL1";
                Object lv2 = table.getValueAt(indexRowSelected, 2);
                if(lv2!= null) return "LEVEL2";
		 return "LEVEL3";
	}
        
        public static void fillDetailToForm(Integer id, String type, 
                                            JTextField txtNumberAccountLv1_Lv1_Account,
                                            JTextField txtNameAccountLv1_Lv1_Account,
                                            JComboBox cbbNumberAccountLv1_Lv2_Account,
                                            JTextField txtNumberAccountLv2_Lv2_Account,
                                            JTextField txtNameAccountLv2_Lv2_Account,
                                            JComboBox cbbNumberAccountLv2_Lv3_Account,
                                            JTextField txtNumberAccountLv3_Lv3_Account,
                                            JTextField txtNameAccountLv3_Lv3_Account,
                                            JButton btnAdd_Lv1_Account, 
                                            JButton btnAdd_Lv2_Account, 
                                            JButton btnAdd_Lv3_Account){
            AccountLv1DTO accountDTO = null;
            switch (type) {
                case "LEVEL1":
                    
                    AccountLv1DTO data1 = AccountRepository.findByAccountLv1Id(id);
                    txtNumberAccountLv1_Lv1_Account.setText(data1.getId().toString());
                    txtNameAccountLv1_Lv1_Account.setText(data1.getName());
                    btnAdd_Lv1_Account.setEnabled(false);
                    break;
                case "LEVEL2":
                    
                    AccountLv2DTO data2 = AccountRepository.findByAccountLv2Id(id);
                    ElementUtils.setSelectedCombobox(data2.getAccountLv1Id(), cbbNumberAccountLv1_Lv2_Account);
                    txtNumberAccountLv2_Lv2_Account.setText(data2.getId().toString());
                    txtNameAccountLv2_Lv2_Account.setText(data2.getName());
                    btnAdd_Lv2_Account.setEnabled(false);
                    break;
                case "LEVEL3":
                    
                    AccountLv3DTO data3 = AccountRepository.findByAccountLv3Id(id);
                    ElementUtils.setSelectedCombobox(data3.getAccountLv2Id(), cbbNumberAccountLv2_Lv3_Account);
                    txtNumberAccountLv3_Lv3_Account.setText(data3.getId().toString());
                    txtNameAccountLv3_Lv3_Account.setText(data3.getName());
                    btnAdd_Lv3_Account.setEnabled(false);
                    break;
                default:
                    break;
            }   
        }
}
