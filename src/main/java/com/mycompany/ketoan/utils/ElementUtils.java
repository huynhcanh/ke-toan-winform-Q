
package com.mycompany.ketoan.utils;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ElementUtils {
    
    public static class ComboxModel {

        private Object key;
        private Object value;

        public ComboxModel(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString(){
            if(value == null) return null;
            return value.toString();
        }
        
        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
    
    public static void setSelectedCombobox(Object key, JComboBox cbb) {
        for (int i = 0; i < cbb.getItemCount(); i++) {
            ComboxModel m = (ComboxModel) cbb.getItemAt(i);
            if (m != null) {
                if (String.valueOf(key).trim().equalsIgnoreCase(String.valueOf(m.getKey()))) {
                    cbb.setSelectedItem(m);
                    return;
                }
            }
        }
    }
    
    public static Object getCbbSelected(JComboBox cbb) {
        Object[] obj = cbb.getSelectedObjects();
        ComboxModel item = (ComboxModel) obj[0];
        return item.getKey() == null ? null : item.getKey().toString();
    }
       
    public static DefaultComboBoxModel getDataCbb(List<ComboxModel> list) {
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        cbbmodel.addElement(new ComboxModel(null, "-- Chọn --"));
        list.forEach(c -> {
            ComboxModel valueModel = new ComboxModel(c.key, c.value);
            cbbmodel.addElement(valueModel);
        });
        return cbbmodel;
    }
}
