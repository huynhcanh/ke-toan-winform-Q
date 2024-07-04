
package com.mycompany.ketoan.utils;

import com.mycompany.ketoan.constants.ApplicationConstants.Alert;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AlertUtils {
	
	private static void showAlert(String content, String title, int icon) {
		JOptionPane.showMessageDialog(new JFrame(), content, title, icon);
	}
	
	public static void showAlertRole(String content) {
		showAlert(content, Alert.ShowRole.TITLE, 1);
	}
	
	public static void showAlertLoginFail(String content) {
		showAlert(content, Alert.LoginFail.TITLE, 2);
	}
	
	public static void showAlertValidate() {
		showAlert(Alert.Validate.ENOUGH_FIELD, Alert.Validate.TITLE, 2);
	}
	
	public static void showAlertCategoryNameExsit() {
		showAlert("Tên loại hàng hóa đã tồn tại", "Trùng dữ liệu", 2);
	}
	
	public static void showAlertCategoryExsitChild() {
		showAlert("Không thể xoá vì loại sản phẩm này đang chứa các loại sản phẩm con", "Lỗi xoá loại sản phẩm", 2);
	}
	
	public static void showAlertCategoryExsitProduct() {
		showAlert("Không thể xoá vì loại sản phẩm này đang chứa các sản phẩm", "Lỗi xoá loại sản phẩm", 2);
	}
	
	public static void showAlertOrderExsitCustomer() {
		showAlert("Không thể xoá vì khách hàng đã tồn tại trong đơn hàng", "Lỗi xoá khách hàng", 2);
	}
	
	public static void showAlertSomeTableExsitEmployee() {
		showAlert("Không thể xoá vì người dùng đang được sử dụng", "Lỗi xoá người dùng", 2);
	}
	
	public static void showAlertEmployeeUsernameExsit() {
		showAlert("Tên đăng nhập của người dùng đã tồn tại", "Lỗi cập nhật người dùng", 2);
	}
        
        public static void showAlertBalanceKeyExsit() {
		showAlert("Mã tiết khoản và ngày đã tồn tại", "Lỗi thêm số dư đầu kì", 2);
	}
	
	public static void showAlertConstraint() {
		showAlert(Alert.Constraint.FAIL_MESSAGE, Alert.Constraint.TITLE, 2);
	}
}
