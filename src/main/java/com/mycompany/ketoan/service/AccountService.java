/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.service;

import com.mycompany.ketoan.dto.AccountDTO;
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
        
        public static void setComboBoxList(JComboBox comboBox) {
		List<Integer> noIds = AccountRepository.findAllIdAccountLevel3();
                if(noIds == null || noIds.isEmpty()) return;
		List<ComboxModel> dataComboBox = noIds.stream().map(id -> new ElementUtils.ComboxModel(id, id)).toList();
		comboBox.setModel(ElementUtils.getDataCbb(dataComboBox));
	}
        
        public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
                
                Object lv1 = table.getValueAt(indexRowSelected, 1);
                if(!lv1.equals("")) return (Integer) lv1;
                Object lv2 = table.getValueAt(indexRowSelected, 2);
                if(!lv2.equals("")) return (Integer) lv2;
		return (Integer) table.getValueAt(indexRowSelected, 3);
	}
        
        public static String getLevel(JTable table) {
		int indexRowSelected = table.getSelectedRow();
                
                Object lv1 = table.getValueAt(indexRowSelected, 1);
                if(!lv1.equals("")) return "LEVEL1";
                Object lv2 = table.getValueAt(indexRowSelected, 2);
                if(!lv2.equals("")) return "LEVEL2";
		 return "LEVEL3";
	}
        
        public static void fillDetailToForm(Integer id, String type, 
                                            JTextField txtNumberAccountLv1_Lv1_Account,
                                            JTextField txtNameAccountLv1_Lv1_Account,
                                            JComboBox cbbNumberAccountLv1_Lv2_Account,
                                            JTextField txtNumberAccountLv2_Lv2_Account,
                                            JTextField txtNameAccountLv2_Lv2_Account,
                                            JComboBox cbbNumberAccountLv1_Lv3_Account,
                                            JComboBox cbbNumberAccountLv2_Lv3_Account,
                                            JTextField txtNumberAccountLv3_Lv3_Account,
                                            JTextField txtNameAccountLv3_Lv3_Account,
                                            JButton btnAdd_Lv1_Account, 
                                            JButton btnAdd_Lv2_Account, 
                                            JButton btnAdd_Lv3_Account){
            
//            switch (type) {
//                case "LEVEL1":
//                    
//                    AccountDTO accountDTO = AccountRepository.findById(id);
//                    txtNumberAccountLv1_Lv1_Account.setText(accountDTO.getLevel1());
//                    txtNameAccountLv1_Lv1_Account.setText(accountDTO.getContent());
//                    btnAdd_Lv1_Account.setEnabled(false);
//                    break;
//                case "LEVEL2":
//                    
//                    AccountDTO accountDTO = AccountRepository.findById(id);
//                    ElementUtils.setSelectedCombobox(accountDTO.getLevel2(), cbbNumberAccountLv1_Lv2_Account);
//                    txtNumberAccountLv2_Lv2_Account.setText(accountDTO.getLevel2());
//                    txtNameAccountLv2_Lv2_Account.setText(accountDTO.getContent());
//                    btnAdd_Lv2_Account.setEnabled(false);
//                    break;
//                case "LEVEL3":
//                    
//                    AccountDTO accountDTO = AccountRepository.findById(id);
//                    ElementUtils.setSelectedCombobox(accountDTO.getLevel2(), cbbNumberAccountLv1_Lv3_Account);
//                    ElementUtils.setSelectedCombobox(accountDTO.getLevel2(), cbbNumberAccountLv2_Lv3_Account);
//                    txtNumberAccountLv1_Lv1_Account.setText(accountDTO.getLevel3());
//                    txtNameAccountLv1_Lv1_Account.setText(accountDTO.getContent());
//                    btnAdd_Lv3_Account.setEnabled(false);
//                    break;
//                default:
//                    break;
//            }   
        }
}
