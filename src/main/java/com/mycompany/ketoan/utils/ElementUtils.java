
package com.mycompany.ketoan.utils;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ElementUtils {
	
	public static class ComboxModel {
		
		private Object key;
		private Object value;
		
		public ComboxModel(Object key, Object value) {
			this.key = key;
			this.value = value;
		}
		
		@Override
		public String toString() {
			if (value == null) return null;
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
        
        public static void resetForm(Object... components) {
            for (Object component : components) {
                if (component instanceof JTextField) {
                    ((JTextField) component).setText("");
                } else if (component instanceof JComboBox) {
                    JComboBox<?> comboBox = (JComboBox<?>) component;
                    if(comboBox != null && comboBox.getSelectedIndex() > 0){
                        comboBox.setSelectedIndex(0);
                    }
                } else if (component instanceof JLabel) {
                   ((JLabel)component).setIcon(null);
                } else if (component instanceof JDateChooser) {
                   ((JDateChooser)component).setDate(null);
                }
            }
        }
        
        public static Integer getId(JTable table) {
		int indexRowSelected = table.getSelectedRow();
		return (Integer) table.getValueAt(indexRowSelected, 1);
	}
        
        public static boolean isValidated(Object... components) {
        for (Object component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    AlertUtils.showAlertValidate();
                    return false;
                }
            } else if (component instanceof JComboBox) {
                if (getCbbSelected((JComboBox<?>) component) == null) {
                    AlertUtils.showAlertValidate();
                    return false;
                }
            } else if (component instanceof JLabel) {
                if(((JLabel)component).getIcon() == null)
                   AlertUtils.showAlertValidate();
                    return false;
                }
        }
        return true;
    }
    
  
public static void showImage(JLabel label, String path) {
    try {
        if (path == null || path.isEmpty()) {
            // Reset label to default state
            label.setIcon(null); // Remove current icon
        } else {
            BufferedImage bufferedImage = ImageIO.read(new File(path));
            // Resize the image to fit the label's width while maintaining aspect ratio
            int labelWidth = label.getWidth();
            int originalWidth = bufferedImage.getWidth();
            int originalHeight = bufferedImage.getHeight();
            int newHeight = (labelWidth * originalHeight) / originalWidth;
            
            Image scaledImage = bufferedImage.getScaledInstance(labelWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(scaledImage);
            label.setIcon(imageIcon);
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: Unable to open image file", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public static void disableAllButtons(Container container) {
        // Duyệt qua tất cả các component trong container
        for (Component component : container.getComponents()) {
            if (component instanceof JButton) {
                // Disable button nếu component là JButton
                component.setEnabled(false);
            }
            else if (component instanceof Container) {
                // Gọi đệ quy để disable button trong các container con
                disableAllButtons((Container) component);
            }
        }
    }
}
