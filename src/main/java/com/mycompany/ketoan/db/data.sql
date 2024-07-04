




INSERT INTO `NhanVien` (`TenDN`, `MatKhau`, `VaiTro`, `Ten`, `Sdt`, `DiaChi`)
VALUES 
('admin', 'admin123', 'ADMIN', 'Nguyen Van A', '0912345678', '123 Nguyen Trai'),
('tranthib', 'password123', 'ACCOUNANT', 'Tran Thi B', '0912345679', '456 Le Duan'),
('phamthic', 'password123', 'SALER', 'Pham Thi C', '0912345680', '789 Tran Hung Dao'),
('lethid', 'password123', 'ADMIN', 'Le Thi D', '0912345681', '101 Hai Ba Trung'),
('nguyenthie', 'password123', 'ACCOUNANT', 'Nguyen Thi E', '0912345682', '202 Phan Boi Chau'),
('hoangvanf', 'password123', 'SALER', 'Hoang Van F', '0912345683', '303 Ton Duc Thang'),
('phamhg', 'password123', 'ADMIN', 'Pham H G', '0912345684', '404 Nguyen Hue'),
('doanhh', 'password123', 'ACCOUNANT', 'Do Anh H', '0912345685', '505 Le Loi'),
('buidn', 'password123', 'SALER', 'Bui D N', '0912345686', '606 Tran Phu'),
('trandk', 'password123', 'ADMIN', 'Tran D K', '0912345687', '707 Le Thanh Ton'),
('lethit', 'password123', 'ACCOUNANT', 'Le Thi T', '0912345688', '808 Ly Tu Trong'),
('ngothig', 'password123', 'SALER', 'Ngo Thi G', '0912345689', '909 Nguyen Dinh Chieu'),
('phamvanh', 'password123', 'ADMIN', 'Pham Van H', '0912345690', '1111 Ba Trieu'),
('nguyenthib', 'password123', 'ACCOUNANT', 'Nguyen Thi B', '0912345691', '1212 Hang Bai'),
('dangthiv', 'password123', 'SALER', 'Dang Thi V', '0912345692', '1313 Cat Linh'),
('votuanm', 'password123', 'ADMIN', 'Vo Tuan M', '0912345693', '1414 Giang Vo'),
('truongtnd', 'password123', 'ACCOUNANT', 'Truong T N D', '0912345694', '1515 Dien Bien Phu'),
('nguyenanhp', 'password123', 'SALER', 'Nguyen Anh P', '0912345695', '1616 Tay Son'),
('lethimy', 'password123', 'ADMIN', 'Le Thi My', '0912345696', '1717 Kim Ma'),
('ngothiv', 'password123', 'ACCOUNANT', 'Ngo Thi V', '0912345697', '1818 Lac Long Quan');



INSERT INTO `LoaiHangHoa` (`Ten`) VALUES ('Áo sơ mi nam'), ('Áo phông nam'), ('Quần jeans nam'), ('Áo khoác nam'), ('Áo vest nam'), ('Quần tây nam'), ('Đầm nữ'), ('Chân váy nữ'), ('Quần short nữ'), ('Áo phông nữ'), ('Áo khoác nữ'), ('Áo sơ mi nữ'), ('Đồ thể thao nam'), ('Đồ thể thao nữ'), ('Đồ lót nam'), ('Đồ lót nữ'), ('Đồ ngủ nam'), ('Đồ ngủ nữ'), ('Áo len nam'), ('Áo len nữ');


INSERT INTO `HangHoa` (`Ten`, `GiaBan`, `Dvt`, `KichThuoc`, `MaLoaiHH`, `HinhAnh`) VALUES ('Áo sơ mi nam trắng', 299000, 'cái', 'L', 8, NULL), ('Áo phông nam đen', 199000, 'cái', 'M', 9, NULL), ('Quần jeans nam xanh', 499000, 'cái', '32', 10, NULL), ('Áo khoác nam xám', 699000, 'cái', 'L', 11, NULL), ('Áo vest nam xanh', 999000, 'cái', 'M', 12, NULL), ('Quần tây nam đen', 399000, 'cái', '32', 13, NULL), ('Đầm nữ đỏ', 599000, 'cái', 'S', 14, NULL), ('Chân váy nữ trắng', 299000, 'cái', 'M', 15, NULL), ('Quần short nữ hồng', 199000, 'cái', 'S', 16, NULL), ('Áo phông nữ xanh', 199000, 'cái', 'M', 17, NULL), ('Áo khoác nữ đen', 799000, 'cái', 'L', 18, NULL), ('Áo sơ mi nữ trắng', 299000, 'cái', 'S', 19, NULL), ('Đồ thể thao nam', 499000, 'bộ', 'L', 20, NULL), ('Đồ thể thao nữ', 499000, 'bộ', 'M', 21, NULL), ('Đồ lót nam', 99000, 'bộ', 'L', 22, NULL), ('Đồ lót nữ', 99000, 'bộ', 'M', 23, NULL), ('Đồ ngủ nam', 199000, 'bộ', 'L', 24, NULL), ('Đồ ngủ nữ', 199000, 'bộ', 'M', 25, NULL), ('Áo len nam', 299000, 'cái', 'L', 26, NULL), ('Áo len nữ', 299000, 'cái', 'M', 27, NULL);



INSERT INTO `KhachHang` (`Ten`, `DiaChi`, `SDT`, `MaSoThue`)
VALUES
('Nguyen Van A', '123 Nguyen Trai, Ha Noi', '0912345678', '0101234567'),
('Tran Thi B', '456 Le Duan, Ha Noi', '0912345679', '0101234568'),
('Pham Van C', '789 Tran Hung Dao, Ha Noi', '0912345680', '0101234569'),
('Le Thi D', '101 Hai Ba Trung, Ha Noi', '0912345681', '0101234570'),
('Nguyen Thi E', '202 Phan Boi Chau, Ha Noi', '0912345682', '0101234571'),
('Hoang Van F', '303 Ton Duc Thang, Ha Noi', '0912345683', '0101234572'),
('Pham Thi G', '404 Nguyen Hue, Ha Noi', '0912345684', '0101234573'),
('Do Anh H', '505 Le Loi, Ha Noi', '0912345685', '0101234574'),
('Bui D N', '606 Tran Phu, Ha Noi', '0912345686', '0101234575'),
('Tran D K', '707 Le Thanh Ton, Ha Noi', '0912345687', '0101234576'),
('Le Thi T', '808 Ly Tu Trong, Ha Noi', '0912345688', '0101234577'),
('Ngo Thi G', '909 Nguyen Dinh Chieu, Ha Noi', '0912345689', '0101234578'),
('Pham Van H', '1111 Ba Trieu, Ha Noi', '0912345690', '0101234579'),
('Nguyen Thi B', '1212 Hang Bai, Ha Noi', '0912345691', '0101234580'),
('Dang Thi V', '1313 Cat Linh, Ha Noi', '0912345692', '0101234581'),
('Vo Tuan M', '1414 Giang Vo, Ha Noi', '0912345693', '0101234582'),
('Truong T N D', '1515 Dien Bien Phu, Ha Noi', '0912345694', '0101234583'),
('Nguyen Anh P', '1616 Tay Son, Ha Noi', '0912345695', '0101234584'),
('Le Thi My', '1717 Kim Ma, Ha Noi', '0912345696', '0101234585'),
('Ngo Thi V', '1818 Lac Long Quan, Ha Noi', '0912345697', '0101234586');




INSERT INTO `PhieuBanHang` (`MaKH`, `MaNV`, `NgayTao`, `GhiChu`, `DaXuat`)
VALUES
(1, 5, '2024-07-01', 'Ghi chú 1', false),
(2, 6, '2024-07-02', 'Ghi chú 2', false),
(3, 7, '2024-07-03', 'Ghi chú 3', false),
(4, 8, '2024-07-04', 'Ghi chú 4', false),
(5, 9, '2024-07-05', 'Ghi chú 5', false),
(6, 10, '2024-07-06', 'Ghi chú 6', false),
(7, 11, '2024-07-07', 'Ghi chú 7', false),
(8, 12, '2024-07-08', 'Ghi chú 8', false),
(9, 13, '2024-07-09', 'Ghi chú 9', false),
(10, 14, '2024-07-10', 'Ghi chú 10', false),
(11, 15, '2024-07-11', 'Ghi chú 11', false),
(12, 16, '2024-07-12', 'Ghi chú 12', false),
(13, 17, '2024-07-13', 'Ghi chú 13', false),
(14, 18, '2024-07-14', 'Ghi chú 14', false),
(15, 19, '2024-07-15', 'Ghi chú 15', false),
(16, 20, '2024-07-16', 'Ghi chú 16', false),
(17, 5, '2024-07-17', 'Ghi chú 17', false),
(18, 6, '2024-07-18', 'Ghi chú 18', false),
(19, 7, '2024-07-19', 'Ghi chú 19', false),
(20, 8, '2024-07-20', 'Ghi chú 20', false);



INSERT INTO `ChiTietPhieuBanHang` (`MaHH`, `MaPBH`, `SoLuong`)
VALUES
(1, 33, 2),
(2, 34, 1),
(3, 35, 3),
(4, 36, 4),
(5, 37, 2),
(6, 38, 1),
(7, 39, 5),
(8, 40, 2),
(9, 41, 3),
(10, 42, 1),
(11, 43, 4),
(12, 44, 2),
(13, 45, 3),
(14, 46, 1),
(15, 47, 2),
(16, 48, 4),
(17, 49, 5),
(18, 50, 2),
(19, 51, 3),
(20, 52, 1);



INSERT INTO `TaiKhoan` (`MaTaiKhoan`, `TenTaiKhoan`) VALUES
(1, 'Tài khoản 1'),
(2, 'Tài khoản 2'),
(3, 'Tài khoản 3'),
(4, 'Tài khoản 4');

INSERT INTO `TieuKhoan` (`MaTieuKhoan`, `TenTieuKhoan`, `MaTaiKhoan`) VALUES
(101, 'Tiểu khoản 1.1', 1),
(102, 'Tiểu khoản 1.2', 1),
(103, 'Tiểu khoản 2.1', 2),
(104, 'Tiểu khoản 2.2', 2),
(105, 'Tiểu khoản 3.1', 3),
(106, 'Tiểu khoản 3.2', 3),
(107, 'Tiểu khoản 4.1', 4),
(108, 'Tiểu khoản 4.2', 4);

INSERT INTO `TietKhoan` (`MaTietKhoan`, `TenTietKhoan`, `MaTieuKhoan`) VALUES
(1001, 'Tiết khoản 1.1.1', 101),
(1002, 'Tiết khoản 1.1.2', 101),
(1003, 'Tiết khoản 1.2.1', 102),
(1004, 'Tiết khoản 1.2.2', 102),
(1005, 'Tiết khoản 2.1.1', 103),
(1006, 'Tiết khoản 2.1.2', 103),
(1007, 'Tiết khoản 2.2.1', 104),
(1008, 'Tiết khoản 2.2.2', 104),
(1009, 'Tiết khoản 3.1.1', 105),
(1010, 'Tiết khoản 3.1.2', 105),
(1011, 'Tiết khoản 3.2.1', 106),
(1012, 'Tiết khoản 3.2.2', 106),
(1013, 'Tiết khoản 4.1.1', 107),
(1014, 'Tiết khoản 4.1.2', 107),
(1015, 'Tiết khoản 4.2.1', 108),
(1016, 'Tiết khoản 4.2.2', 108);


INSERT INTO `SDDK` (`MaTietKhoan`, `NgayDauKy`, `SoTien`, `TrangThai`) VALUES (1001, '2023-01-01', 10000.00, 'DU_NO'), (1002, '2023-01-02', 15000.00, 'DU_CO'), (1003, '2023-01-03', 20000.00, 'DU_NO'), (1004, '2023-01-04', 25000.00, 'DU_CO'), (1005, '2023-01-05', 30000.00, 'DU_NO'), (1006, '2023-01-06', 35000.00, 'DU_CO'), (1007, '2023-01-07', 40000.00, 'DU_NO'), (1008, '2023-01-08', 45000.00, 'DU_CO'), (1009, '2023-01-09', 50000.00, 'DU_NO'), (1010, '2023-01-10', 55000.00, 'DU_CO'), (1011, '2023-01-11', 60000.00, 'DU_NO'), (1012, '2023-01-12', 65000.00, 'DU_CO'), (1013, '2023-01-13', 70000.00, 'DU_NO'), (1014, '2023-01-14', 75000.00, 'DU_CO'), (1015, '2023-01-15', 80000.00, 'DU_NO'), (1016, '2023-01-16', 85000.00, 'DU_CO'), (1001, '2023-01-19', 5000.00, 'DU_NO'), (1002, '2023-01-20', 10000.00, 'DU_CO');
