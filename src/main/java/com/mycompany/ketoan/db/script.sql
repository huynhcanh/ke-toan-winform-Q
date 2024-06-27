--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan`
(
    `maTK`       int NOT NULL AUTO_INCREMENT,
    `soTaiKhoan` varchar(50)  DEFAULT NULL,
    `noiDung`    varchar(255) DEFAULT NULL,
    `loai`       varchar(45)  DEFAULT NULL,
    PRIMARY KEY (`maTK`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `taikhoanchitiet`
--
CREATE TABLE `taikhoanchitiet`
(
    `maTKCT`     int NOT NULL,
    `maTK`       int         DEFAULT NULL,
    `soTaiKhoan` varchar(45) DEFAULT NULL,
    `maTKCTGoc`  int         DEFAULT NULL,
    `ten`        varchar(45) DEFAULT NULL,
    PRIMARY KEY (`maTKCT`),
    KEY          `fk_maTK_taikhoanchitiet_taikhoan` (`maTK`),
    KEY          `fk_maTKCTGoc_taikhoanchitiet` (`maTKCTGoc`),
    CONSTRAINT `fk_maTK_taikhoanchitiet_taikhoan` FOREIGN KEY (`maTK`) REFERENCES `taikhoan` (`maTK`),
    CONSTRAINT `fk_maCapHai_parent` FOREIGN KEY (`maTKCTGoc`) REFERENCES `taikhoanchitiet` (`maTKCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
-- Table structure for table `chungtu`
--
CREATE TABLE `chungtu`
(
    `maCT`    int NOT NULL,
    `maPhieu` int DEFAULT NULL,
    PRIMARY KEY (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `buttoan`
--
CREATE TABLE `buttoan`
(
    `maBT`     int NOT NULL AUTO_INCREMENT,
    `maCT`     int            DEFAULT NULL,
    `soTKNo`   int            DEFAULT NULL,
    `soTKCo`   int            DEFAULT NULL,
    `ngayTao`  date           DEFAULT NULL,
    `soLuong`  int            DEFAULT NULL,
    `donGia`   decimal(10, 2) DEFAULT NULL,
    `tongTien` decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`maBT`),
    KEY        `fk_soTKNo_buttoan_taikhoanchitiet` (`soTKNo`),
    KEY        `fk_soTKCo_buttoan_taikhoanchitiet` (`soTKCo`),
    KEY        `fk_maCT_buttoan_chungtu` (`maCT`),
    CONSTRAINT `fk_soTKNo_buttoan_taikhoanchitiet` FOREIGN KEY (`soTKNo`) REFERENCES `taikhoanchitiet` (`maTKCT`),
    CONSTRAINT `fk_soTKCo_buttoan_taikhoanchitiet` FOREIGN KEY (`soTKCo`) REFERENCES `taikhoanchitiet` (`maTKCT`),
    CONSTRAINT `fk_maCT_buttoan_chungtu` FOREIGN KEY (`maCT`) REFERENCES `chungtu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `sodudauky`
--

CREATE TABLE `sodudauky`
(
    `maSDDK`    int NOT NULL AUTO_INCREMENT,
    `gia`       decimal(10, 2) DEFAULT NULL,
    `ngayTao`   date           DEFAULT NULL,
    `maTKCT`    int            DEFAULT NULL,
    `nguonTien` varchar(50)    DEFAULT NULL,
    `trangThai` varchar(50)    DEFAULT NULL,
    PRIMARY KEY (`maSDDK`),
    KEY         `fk_soTKCT_sodudauky_taikhoanchitiet` (`maTKCT`),
    CONSTRAINT `fk_soTKCT_sodudauky_taikhoanchitiet` FOREIGN KEY (`maTKCT`) REFERENCES `taikhoanchitiet` (`maTKCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `loaisanpham`
--

CREATE TABLE `loaisanpham`
(
    `maLSP`    int NOT NULL AUTO_INCREMENT,
    `maLoai`   varchar(50)  DEFAULT NULL,
    `ten`      varchar(255) DEFAULT NULL,
    `maLSPGoc` int          DEFAULT NULL,
    PRIMARY KEY (`maLSP`),
    KEY        `fk_maLSPGoc_loaisanpham` (`maLSPGoc`),
    CONSTRAINT `fk_maLSPGoc_loaisanpham` FOREIGN KEY (`maLSPGoc`) REFERENCES `loaisanpham` (`maLSP`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `kichthuoc`
--

CREATE TABLE `kichthuoc`
(
    `maKT` int NOT NULL AUTO_INCREMENT,
    `ten`  varchar(255) DEFAULT NULL,
    PRIMARY KEY (`maKT`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `sanpham`
--

CREATE TABLE `sanpham`
(
    `maSP`      int NOT NULL AUTO_INCREMENT,
    `ten`       varchar(255)   DEFAULT NULL,
    `mauSac`    varchar(50)    DEFAULT NULL,
    `giaBan`    decimal(10, 2) DEFAULT NULL,
    `moTa`      text,
    `maLSP`     int            DEFAULT NULL,
    `donViTinh` varchar(50)    DEFAULT NULL,
    `hinhAnh`   varchar(255)   DEFAULT NULL,
    PRIMARY KEY (`maSP`),
    KEY         `fk_maLSP_sanpham_loaisanpham` (`maLSP`),
    CONSTRAINT `fk_maLSP_sanpham_loaisanpham` FOREIGN KEY (`maLSP`) REFERENCES `loaisanpham` (`maLSP`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `kho`
--

CREATE TABLE `kho`
(
    `maKho`   int NOT NULL AUTO_INCREMENT,
    `maSP`    int DEFAULT NULL,
    `maKT`    int DEFAULT NULL,
    `soLuong` int DEFAULT NULL,
    PRIMARY KEY (`maKho`),
    KEY       `fk_maSP_kho_sanpham` (`maSP`),
    KEY       `fk_maKT_kho_kichthuoc` (`maKT`),
    CONSTRAINT `fk_maSP_kho_sanpham` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`),
    CONSTRAINT `fk_maKT_kho_kichthuoc` FOREIGN KEY (`maKT`) REFERENCES `kichthuoc` (`maKT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang`
(
    `maKH`     int NOT NULL AUTO_INCREMENT,
    `ten`      varchar(255) DEFAULT NULL,
    `sdt`      varchar(20)  DEFAULT NULL,
    `diaChi`   varchar(255) DEFAULT NULL,
    `maSoThue` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`maKH`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `nguoidung`
--

CREATE TABLE `nguoidung`
(
    `maND`    int NOT NULL AUTO_INCREMENT,
    `tenDN`   varchar(50)                                                  DEFAULT NULL,
    `matKhau` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
    `vaiTro`  varchar(50)                                                  DEFAULT NULL,
    PRIMARY KEY (`maND`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Table structure for table `donhang`
--

CREATE TABLE `donhang`
(
    `maDH`     int NOT NULL AUTO_INCREMENT,
    `maKH`     int            DEFAULT NULL,
    `tongTien` decimal(10, 2) DEFAULT NULL,
    `maNV`     int            DEFAULT NULL,
    `ngayTao`  date           DEFAULT NULL,
    `ngayGiao` date           DEFAULT NULL,
    `ghiChu`   text,
    PRIMARY KEY (`maDH`),
    KEY        `fk_maKH_donhang_khachhang` (`maKH`),
    KEY        `fk_maNV_donhang_nguoidung` (`maNV`),
    CONSTRAINT `fk_maKH_donhang_khachhang` FOREIGN KEY (`maKH`) REFERENCES `khachhang` (`maKH`),
    CONSTRAINT `fk_maNV_donhang_nguoidung` FOREIGN KEY (`maNV`) REFERENCES `nguoidung` (`maND`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `chitietdonhang`
--

CREATE TABLE `chitietdonhang`
(
    `maSP`    int NOT NULL,
    `maDH`    int NOT NULL,
    `soLuong` int DEFAULT NULL,
    PRIMARY KEY (`maSP`, `maDH`),
    KEY       `fk_maSP_chitietdonhang_sanpham` (`maSP`),
    KEY       `fk_maDH_chitietdonhang_sanpham` (`maDH`),
    CONSTRAINT `fk_maSP_chitietdonhang_sanpham` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`),
    CONSTRAINT `fk_maDH_chitietdonhang_sanpham` FOREIGN KEY (`maDH`) REFERENCES `donhang` (`maDH`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `hoadondathang`
--

CREATE TABLE `hoadondathang`
(
    `maHDDH`  int NOT NULL AUTO_INCREMENT,
    `ghiChu`  text,
    `maDH`    int  DEFAULT NULL,
    `ngayTao` date DEFAULT NULL,
    PRIMARY KEY (`maHDDH`),
    KEY       `fk_maDH_hoadondathang_donhang` (`maDH`),
    CONSTRAINT `fk_maDH_hoadondathang_donhang` FOREIGN KEY (`maDH`) REFERENCES `donhang` (`maDH`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `phieuchi`
--

CREATE TABLE `phieuchi`
(
    `maPC`           int NOT NULL AUTO_INCREMENT,
    `hoVaTen`        varchar(255)   DEFAULT NULL,
    `diaChi`         varchar(20)    DEFAULT NULL,
    `lydoNop`        varchar(255)   DEFAULT NULL,
    `ngayTao`        date           DEFAULT NULL,
    `giaTien`        decimal(10, 2) DEFAULT NULL,
    `taiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `maTKCTNo`       int            DEFAULT NULL,
    `maTKCTCo`       int            DEFAULT NULL,
    `quyenSo`        int            DEFAULT NULL,
    `maNV`           int            DEFAULT NULL,
    `maCT`           int            DEFAULT NULL,
    PRIMARY KEY (`maPC`),
    KEY              `fk_maNV_phieuchi_nguoidung` (`maNV`),
    KEY              `fk_maCT_phieuchi_chungtu` (`maCT`),
    CONSTRAINT `fk_maNV_phieuchi_nguoidung` FOREIGN KEY (`maNV`) REFERENCES `nguoidung` (`maND`),
    CONSTRAINT `fk_maCT_phieuchi_chungtu` FOREIGN KEY (`maCT`) REFERENCES `chungtu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap`
(
    `maNCC`    int NOT NULL AUTO_INCREMENT,
    `ten`      varchar(255) DEFAULT NULL,
    `maSoThue` varchar(50)  DEFAULT NULL,
    `diaChi`   varchar(255) DEFAULT NULL,
    `sdt`      varchar(11)  DEFAULT NULL,
    PRIMARY KEY (`maNCC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `phieuthu`
--

CREATE TABLE `phieuthu`
(
    `maPT`           int NOT NULL AUTO_INCREMENT,
    `hoVaTen`        varchar(255)   DEFAULT NULL,
    `diaChi`         varchar(20)    DEFAULT NULL,
    `lydoNop`        varchar(255)   DEFAULT NULL,
    `ngayTao`        date           DEFAULT NULL,
    `giaTien`        decimal(10, 2) DEFAULT NULL,
    `taiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `maTKCTNo`       int            DEFAULT NULL,
    `maTKCTCo`       int            DEFAULT NULL,
    `quyenSo`        int            DEFAULT NULL,
    `maNV`           int            DEFAULT NULL,
    `maCT`           int            DEFAULT NULL,
    PRIMARY KEY (`maPT`),
    KEY              `fk_maNV_phieuthu_nguoidung`(`maNV`),
    KEY              `fk_maCT_phieuthu_chungtu` (`maCT`),
    CONSTRAINT `fk_maNV_phieuthu_nguoidung` FOREIGN KEY (`maNV`) REFERENCES `nguoidung` (`maND`),
    CONSTRAINT `fk_maCT_phieuthu_chungtu` FOREIGN KEY (`maCT`) REFERENCES `chungtu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `phieuxuat`
--

CREATE TABLE `phieuxuat`
(
    `maPX`             int NOT NULL AUTO_INCREMENT,
    `mucDichXuatKho`   text,
    `tenNguoiNhan`     varchar(255)   DEFAULT NULL,
    `tenNguoiXuatHang` varchar(255)   DEFAULT NULL,
    `ghiChu`           text,
    `taiLieuDinhKem`   text,
    `maDH`             int            DEFAULT NULL,
    `ngayTao`          date           DEFAULT NULL,
    `maNV`             int            DEFAULT NULL,
    `maCT`             int            DEFAULT NULL,
    `tongTien`         decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`maPX`),
    KEY                `fk_maDH_phieuxuat_donhang` (`maDH`),
    KEY                `fk_maNV_phieuxuat_nguoidung` (`maNV`),
    KEY                `fk_maCT_phieuxuat_chungtu` (`maCT`),
    CONSTRAINT `fk_maDH_phieuxuat_donhang` FOREIGN KEY (`maDH`) REFERENCES `donhang` (`maDH`),
    CONSTRAINT `fk_maNV_phieuxuat_nguoidung` FOREIGN KEY (`maNV`) REFERENCES `nguoidung` (`maND`),
    CONSTRAINT `fk_maCT_phieuxuat_chungtu` FOREIGN KEY (`maCT`) REFERENCES `chungtu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `chitietphieuxuat`
--

CREATE TABLE `chitietphieuxuat`
(
    `maCTPX`    int NOT NULL AUTO_INCREMENT,
    `maSP`      int            DEFAULT NULL,
    `maPX`      int            DEFAULT NULL,
    `soLuong`   int            DEFAULT NULL,
    `donGia`    decimal(10, 2) DEFAULT NULL,
    `thanhTien` decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`maCTPX`),
    KEY         `fk_maSP_chitietphieuxuat_sanpham` (`maSP`),
    KEY         `fk_maPX_chitietphieuxuat_phieuxuat` (`maPX`),
    CONSTRAINT `fk_maSP_chitietphieuxuat_sanpham` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`),
    CONSTRAINT `fk_maPX_chitietphieuxuat_phieuxuat` FOREIGN KEY (`maPX`) REFERENCES `phieuxuat` (`maPX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap`
(
    `maPN`             int NOT NULL AUTO_INCREMENT,
    `mucDich`          varchar(255)   DEFAULT NULL,
    `nhapTuNguon`      varchar(255)   DEFAULT NULL,
    `tenNguoiGiao`     varchar(255)   DEFAULT NULL,
    `tenNguoiKiemHang` varchar(255)   DEFAULT NULL,
    `ghiChu`           text,
    `taiLieuDinhKem`   varchar(255)   DEFAULT NULL,
    `ngayTao`          date           DEFAULT NULL,
    `tongTien`         decimal(10, 2) DEFAULT NULL,
    `maNV`             int            DEFAULT NULL,
    `maNCC`            int            DEFAULT NULL,
    `maCT`             int            DEFAULT NULL,
    PRIMARY KEY (`maPN`),
    KEY                `fk_maNV_phieunhap_nguoidung` (`maNV`),
    KEY                `fk_maNCC_phieunhap_nhacungcap` (`maNCC`),
    KEY                `fk_dmaCT_phieunhap_chungtu` (`maCT`),
    CONSTRAINT `fk_maNV_phieunhap_nguoidung` FOREIGN KEY (`maNV`) REFERENCES `nguoidung` (`maND`),
    CONSTRAINT `fk_maNCC_phieunhap_nhacungcap` FOREIGN KEY (`maNCC`) REFERENCES `nhacungcap` (`maNCC`),
    CONSTRAINT `fk_dmaCT_phieunhap_chungtu` FOREIGN KEY (`maCT`) REFERENCES `chungtu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap`
(
    `maCTPN`    int NOT NULL AUTO_INCREMENT,
    `maSP`      int            DEFAULT NULL,
    `maPN`      int            DEFAULT NULL,
    `soLuong`   int            DEFAULT NULL,
    `donGia`    decimal(10, 2) DEFAULT NULL,
    `thanhTien` decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`maCTPN`),
    KEY         `fk_maSP_chitietphieunhap` (`maSP`),
    KEY         `fk_maPN_chitietphieunhap_phieunhap` (`maPN`),
    CONSTRAINT `fk_maSP_chitietphieunhap_sanpham` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`),
    CONSTRAINT `fk_maPN_chitietphieunhap_phieunhap` FOREIGN KEY (`maPN`) REFERENCES `phieunhap` (`maPN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



