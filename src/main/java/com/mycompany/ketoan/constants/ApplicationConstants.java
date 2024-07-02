
package com.mycompany.ketoan.constants;

public class ApplicationConstants {
	
	public static class Alert {
		
		public static class ShowRole {
			public static final String TITLE = "Thông báo phân quyền";
			public static final String LOGIN_WITH_ADMIN_CONTENT = "Bạn đang truy cập với quyền Admin";
			public static final String LOGIN_WITH_ACCOUNTANT_CONTENT = "Bạn đang truy cập với quyền Kế Toán";
                        public static final String LOGIN_WITH_SALER_CONTENT = "Bạn đang truy cập với quyền Nhân Viên Bán Hàng";
		}
		
		public static class LoginFail {
			public static final String TITLE = "Lỗi đăng nhập";
			public static final String CONTENT = "Bạn nhập sai tài khoản hoặc mật khẩu";
		}
		
		public static class Validate {
			public static final String TITLE = "Thiếu thông tin";
			public static final String ENOUGH_FIELD = "Vui lòng nhập đủ thông tin";
		}
		
		public static class Constraint {
			public static final String TITLE = "Lỗi tham chiếu";
			public static final String FAIL_MESSAGE = "Không thành công vì đã được sử dụng";
		}
	}
	
	public static class Form {
		
		public static class Login {
			public static final String TITLE = "ĐĂNG NHẬP";
		}
	}
	
	public static class Application {
		
		public static class Role {
			public static final String ADMIN = "ADMIN";
                        public static final String ACCOUNTANT = "ACCOUNTANT";
                        
		}
	}
	
}
