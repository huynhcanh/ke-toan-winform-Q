INSERT INTO nhanvien (TenDN, MatKhau, VaiTro, Ten, Sdt, DiaChi) VALUES
('admin', 'admin123', 'User', 'Name1', '0123456781', 'Address 1'),
('user2', 'password2', 'Admin', 'Name2', '0123456782', 'Address 2'),
('user3', 'password3', 'User', 'Name3', '0123456783', 'Address 3'),
('user4', 'password4', 'Admin', 'Name4', '0123456784', 'Address 4'),
('user5', 'password5', 'User', 'Name5', '0123456785', 'Address 5'),
('user6', 'password6', 'Admin', 'Name6', '0123456786', 'Address 6'),
('user7', 'password7', 'User', 'Name7', '0123456787', 'Address 7'),
('user8', 'password8', 'Admin', 'Name8', '0123456788', 'Address 8'),
('user9', 'password9', 'User', 'Name9', '0123456789', 'Address 9'),
('user10', 'password10', 'Admin', 'Name10', '01234567810', 'Address 10');

INSERT INTO loaihanghoa (Ten) VALUES
('Category1'),
('Category2'),
('Category3'),
('Category4'),
('Category5'),
('Category6'),
('Category7'),
('Category8'),
('Category9'),
('Category10');

INSERT INTO hanghoa (Ten, GiaBan, Dvt, KichThuoc, MaLoaiHH, HinhAnh) VALUES
('Product1', 61.40, 'pcs', 'Small', 1, 'image1.jpg'),
('Product2', 69.19, 'kg', 'Large', 2, 'image2.jpg'),
('Product3', 60.08, 'pcs', 'Small', 3, 'image3.jpg'),
('Product4', 58.62, 'kg', 'Large', 4, 'image4.jpg'),
('Product5', 90.69, 'pcs', 'Small', 5, 'image5.jpg'),
('Product6', 40.08, 'kg', 'Large', 6, 'image6.jpg'),
('Product7', 60.62, 'pcs', 'Small', 7, 'image7.jpg'),
('Product8', 67.70, 'kg', 'Large', 8, 'image8.jpg'),
('Product9', 55.69, 'pcs', 'Small', 9, 'image9.jpg'),
('Product10', 82.27, 'kg', 'Large', 10, 'image10.jpg');

INSERT INTO khachhang (Ten, DiaChi, SDT, MaSoThue) VALUES
('Customer1', 'Address 1', '0123456789', 'TaxCode1'),
('Customer2', 'Address 2', '0123456790', 'TaxCode2'),
('Customer3', 'Address 3', '0123456791', 'TaxCode3'),
('Customer4', 'Address 4', '0123456792', 'TaxCode4'),
('Customer5', 'Address 5', '0123456793', 'TaxCode5'),
('Customer6', 'Address 6', '0123456794', 'TaxCode6'),
('Customer7', 'Address 7', '0123456795', 'TaxCode7'),
('Customer8', 'Address 8', '0123456796', 'TaxCode8'),
('Customer9', 'Address 9', '0123456797', 'TaxCode9'),
('Customer10', 'Address 10', '0123456798', 'TaxCode10');

INSERT INTO phieubanhang (MaKH, MaNV, NgayTao, GhiChu) VALUES
(1, 11, '2023-06-01', 'Note 1'),
(2, 12, '2023-06-02', 'Note 2'),
(3, 13, '2023-06-03', 'Note 3'),
(4, 14, '2023-06-04', 'Note 4'),
(5, 5, '2023-06-05', 'Note 5'),
(6, 6, '2023-06-06', 'Note 6'),
(7, 7, '2023-06-07', 'Note 7'),
(8, 8, '2023-06-08', 'Note 8'),
(9, 9, '2023-06-09', 'Note 9'),
(10, 10, '2023-06-10', 'Note 10');

INSERT INTO chitietphieubanhang (MaHH, MaPBH, SoLuong) VALUES
(21, 51, 5),
(22, 50, 10),
(23, 49, 7),
(24, 48, 3),
(25, 43, 8),
(26, 43, 6),
(27, 44, 2),
(28, 45, 9),
(29, 46, 1),
(30, 47, 4);