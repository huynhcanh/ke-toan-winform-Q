--
-- Table structure for table `TaiKhoan`
--
CREATE TABLE `TaiKhoan`
(
    `MaTaiKhoan`  int          NOT NULL,
    `TenTaiKhoan` varchar(100) NOT NULL,
    PRIMARY KEY (`MaTaiKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `TieuKhoan`
--
CREATE TABLE `TieuKhoan`
(
    `MaTieuKhoan`  int NOT NULL,
    `TenTieuKhoan` int NOT NULL,
    `MaTaiKhoan`   int DEFAULT NULL,
    PRIMARY KEY (`MaTieuKhoan`),
    KEY            `fk_MaTaiKhoan_TieuKhoan_TaiKhoan` (`MaTaiKhoan`),
    CONSTRAINT `fk_MaTaiKhoan_TieuKhoan_TaiKhoan` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `TaiKhoan` (`MaTaiKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `TietKhoan`
--
CREATE TABLE `TietKhoan`
(
    `MaTietKhoan`  int NOT NULL,
    `TenTietKhoan` int NOT NULL,
    `MaTieuKhoan`  int DEFAULT NULL,
    PRIMARY KEY (`MaTietKhoan`),
    KEY            `fk_MaTieuKhoan_TietKhoan_TieuKhoan` (`MaTieuKhoan`),
    CONSTRAINT `fk_MaTieuKhoan_TietKhoan_TieuKhoan` FOREIGN KEY (`MaTieuKhoan`) REFERENCES `TieuKhoan` (`MaTieuKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `LoaiChungTu`
--
CREATE TABLE `LoaiChungTu`
(
    `MaLoaiCT` int NOT NULL AUTO_INCREMENT,
    `TenCT`    int DEFAULT NULL,
    PRIMARY KEY (`MaLoaiCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChungTu`
--
CREATE TABLE `ChungTu`
(
    `MaCT`     int NOT NULL AUTO_INCREMENT,
    `NgayCT`   datetime DEFAULT NULL,
    `SoCT`     int      DEFAULT NULL,
    `MaLoaiCT` int      DEFAULT NULL,
    PRIMARY KEY (`MaCT`),
    KEY        `fk_MaLoaiCT_ChungTu_LoaiChungTu` (`MaLoaiCT`),
    CONSTRAINT `fk_MaLoaiCT_ChungTu_LoaiChungTu` FOREIGN KEY (`MaLoaiCT`) REFERENCES `LoaiChungTu` (`MaLoaiCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ButToan`
--
CREATE TABLE `ButToan`
(
    `MaBT`         int          NOT NULL AUTO_INCREMENT,
    `NgayCT`       date         NOT NULL,
    `NgayHT`       date         NOT NULL,
    `DienGiai`     varchar(100) NOT NULL,
    `TKNo`         int            DEFAULT NULL,
    `TkCo`         int            DEFAULT NULL,
    `TienPhatSinh` decimal(10, 2) DEFAULT NULL,
    `MaCT`         int            DEFAULT NULL,
    PRIMARY KEY (`MaBT`),
    KEY            `fk_TKNo_ButToan_TietKhoan` (`TKNo`),
    KEY            `fk_TKCo_ButToan_TietKhoan` (`TkCo`),
    KEY            `fk_MaCT_ButToan_ChungTu` (`MaCT`),
    CONSTRAINT `fk_TKNo_ButToan_TietKhoan` FOREIGN KEY (`TKNo`) REFERENCES `TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_TKCo_ButToan_TietKhoan` FOREIGN KEY (`TkCo`) REFERENCES `TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_MaCT_ButToan_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`MaCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `KhachHang`
--
CREATE TABLE `KhachHang`
(
    `MaKH`     int          NOT NULL AUTO_INCREMENT,
    `Ten`      varchar(100) NOT NULL,
    `DiaChi`   varchar(300) NOT NULL,
    `SDT`      varchar(11)  NOT NULL,
    `MaSoThue` varchar(100) NOT NULL,
    PRIMARY KEY (`MaKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `NguoiDung`
--
CREATE TABLE `NguoiDung`
(
    `MaND`    int          NOT NULL AUTO_INCREMENT,
    `TenDN`   varchar(100) NOT NULL,
    `MatKhau` varchar(100) NOT NULL,
    `VaiTro`  varchar(70)  NOT NULL,
    PRIMARY KEY (`MaND`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `LoaiHangHoa`
--
CREATE TABLE `LoaiHangHoa`
(
    `MaLoaiHH` int          NOT NULL AUTO_INCREMENT,
    `Ten`      varchar(200) NOT NULL,
    PRIMARY KEY (`MaLoaiHH`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `HangHoa`
--
CREATE TABLE `HangHoa`
(
    `MaHH`      int          NOT NULL AUTO_INCREMENT,
    `Ten`       varchar(255) NOT NULL,
    `GiaBan`    decimal(10, 2) DEFAULT NULL,
    `Dvt`       varchar(20)  NOT NULL,
    `KichThuoc` varchar(10)  NOT NULL,
    `MaLoaiHH`  int          NOT NULL,
    `HinhAnh`   varchar(255)   DEFAULT NULL,
    PRIMARY KEY (`MaHH`),
    KEY         `fk_MaLoaiHH_HangHoa_LoaiHangHoa` (`MaLoaiHH`),
    CONSTRAINT `fk_MaLoaiHH_HangHoa_LoaiHangHoa` FOREIGN KEY (`MaLoaiHH`) REFERENCES `LoaiHangHoa` (`MaLoaiHH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `Kho`
--
CREATE TABLE `Kho`
(
    `MaKho`   int NOT NULL AUTO_INCREMENT,
    `MaHH`    int DEFAULT NULL,
    `SoLuong` int DEFAULT NULL,
    PRIMARY KEY (`MaKho`),
    KEY       `fk_MaHH_Kho_HangHoa` (`MaHH`),
    CONSTRAINT `fk_MaHH_Kho_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `HangHoa` (`MaHH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `DonHang`
--
CREATE TABLE `DonHang`
(
    `MaDH`     int NOT NULL AUTO_INCREMENT,
    `MaKH`     int            DEFAULT NULL,
    `TongTien` decimal(10, 2) DEFAULT NULL,
    `MaNV`     int            DEFAULT NULL,
    `NgayTao`  datetime       DEFAULT NULL,
    `NgayGiao` datetime       DEFAULT NULL,
    `GhiChu`   text,
    PRIMARY KEY (`MaDH`),
    KEY        `fk_MaKH_donhang_khachhang` (`MaKH`),
    KEY        `fk_MaNV_donhang_nguoidung` (`MaNV`),
    CONSTRAINT `fk_MaKH_donhang_khachhang` FOREIGN KEY (`MaKH`) REFERENCES `KhachHang` (`MaKH`),
    CONSTRAINT `fk_MaNV_donhang_nguoidung` FOREIGN KEY (`MaNV`) REFERENCES `NguoiDung` (`MaND`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChiTietDonHang`
--
CREATE TABLE `ChiTietDonHang`
(
    `MaHH`    int NOT NULL,
    `MaDH`    int NOT NULL,
    `SoLuong` int DEFAULT NULL,
    PRIMARY KEY (`MaHH`, `MaDH`),
    KEY       `fk_MaHH_ChiTietDonHang_HangHoa` (`MaHH`),
    KEY       `fk_MaHH_ChiTietDonHang_DonHang` (`MaDH`),
    CONSTRAINT `fk_MaHH_ChiTietDonHang_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `HangHoa` (`MaHH`),
    CONSTRAINT `fk_MaHH_ChiTietDonHang_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `DonHang` (`MaDH`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `HoaDonDatHang`
--
CREATE TABLE `HoaDonDatHang`
(
    `MaHDDH`  int NOT NULL AUTO_INCREMENT,
    `GhiChu`  text,
    `MaDH`    int      DEFAULT NULL,
    `NgayLap` datetime DEFAULT NULL,
    PRIMARY KEY (`MaHDDH`),
    KEY       `fk_MaDH_HoaDonDatHang_DonHang` (`MaDH`),
    CONSTRAINT `fk_MaDH_HoaDonDatHang_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `DonHang` (`MaDH`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `NhaCungCap`
--
CREATE TABLE `NhaCungCap`
(
    `MaNCC`       int          NOT NULL AUTO_INCREMENT,
    `Ten`         varchar(100) NOT NULL,
    `DiaChi`      varchar(300) NOT NULL,
    `SDT`         varchar(11)  NOT NULL,
    `MaTietKhoan` int DEFAULT NULL,
    PRIMARY KEY (`MaNCC`),
    KEY           `fk_MaTietKhoan_NhaCungCap_TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_MaTietKhoan_NhaCungCap_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `TietKhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `SDDK`
--
CREATE TABLE `SDDK`
(
    `MaTietKhoan` int            NOT NULL,
    `NgayDauKy`   datetime       NOT NULL,
    `SoTienDK`    decimal(10, 2) NOT NULL,
    `LoaiTK`      varchar(255) DEFAULT NULL,
    PRIMARY KEY (`MaTietKhoan`, `NgayDauKy`),
    KEY           `fk_MaTietKhoan_SDDK_TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_MaTietKhoan_SDDK_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `TietKhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuXuat`
--
CREATE TABLE `PhieuXuat`
(
    `MaPX`             int NOT NULL AUTO_INCREMENT,
    `MucDichXuatKho`   text,
    `TenNguoiNhan`     varchar(255) DEFAULT NULL,
    `TenNguoiXuatHang` varchar(255) DEFAULT NULL,
    `GhiChu`           text,
    `TaiLieuDinhKem`   text,
    `MaDH`             int          DEFAULT NULL,
    `NgayTao`          datetime     DEFAULT NULL,
    `MaNV`             int          DEFAULT NULL,
    `MaCT`             int          DEFAULT NULL,
    PRIMARY KEY (`MaPX`),
    KEY                `fk_MaDHH_PhieuXuat_DonHang` (`MaDH`),
    KEY                `fk_MaNV_PhieuXuat_NguoiDung` (`MaNV`),
    KEY                `fk_MaCT_PhieuXuat_ChungTu` (`MaCT`),
    CONSTRAINT `fk_MaDHH_PhieuXuat_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `DonHang` (`MaDH`),
    CONSTRAINT `fk_MaNV_PhieuXuat_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `NguoiDung` (`MaND`),
    CONSTRAINT `fk_MaCT_PhieuXuat_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`MaCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChiTietPhieuXuat`
--
CREATE TABLE `ChiTietPhieuXuat`
(
    `MaCTPX`  int NOT NULL AUTO_INCREMENT,
    `MaHH`    int DEFAULT NULL,
    `MaPX`    int DEFAULT NULL,
    `SoLuong` int DEFAULT NULL,
    PRIMARY KEY (`MaCTPX`),
    KEY       `fk_MaHH_ChiTietPhieuXuat_HangHoa` (`MaHH`),
    KEY       `fk_MaPX_ChiTietPhieuXuat_PhieuXuat` (`MaPX`),
    CONSTRAINT `fk_MaHH_ChiTietPhieuXuat_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `HangHoa` (`MaHH`),
    CONSTRAINT `fk_MaPX_ChiTietPhieuXuat_PhieuXuat` FOREIGN KEY (`MaPX`) REFERENCES `PhieuXuat` (`MaPX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuNhap`
--
CREATE TABLE `PhieuNhap`
(
    `MaPN`             int NOT NULL AUTO_INCREMENT,
    `MucDich`          varchar(255)   DEFAULT NULL,
    `NhapTuNguon`      varchar(255)   DEFAULT NULL,
    `TenNguoiGiao`     varchar(255)   DEFAULT NULL,
    `TenNguoiKiemHang` varchar(255)   DEFAULT NULL,
    `GhiChu`           text,
    `TaiLieuDinhKem`   varchar(255)   DEFAULT NULL,
    `NgayTao`          datetime       DEFAULT NULL,
    `TongTien`         decimal(10, 2) DEFAULT NULL,
    `MaNV`             int            DEFAULT NULL,
    `MaNCC`            int            DEFAULT NULL,
    `MaCT`             int            DEFAULT NULL,
    PRIMARY KEY (`MaPN`),
    KEY                `fk_MaNV_PhieuNhap_NguoiDung` (`MaNV`),
    KEY                `fk_MaNCC_PhieuNhap_NhaCungCap` (`MaNCC`),
    KEY                `fk_MaCT_PhieuNhap_ChungTu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuNhap_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `NguoiDung` (`MaND`),
    CONSTRAINT `fk_MaNCC_PhieuNhap_NhaCungCap` FOREIGN KEY (`MaNCC`) REFERENCES `NhaCungCap` (`MaNCC`),
    CONSTRAINT `fk_MaCT_PhieuNhap_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`MaCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChiTietPhieuNhap`
--
CREATE TABLE `ChiTietPhieuNhap`
(
    `MaCTPN`  int NOT NULL AUTO_INCREMENT,
    `MaHH`    int            DEFAULT NULL,
    `SoLuong` int            DEFAULT NULL,
    `MaPN`    int            DEFAULT NULL,
    `GiaGoc`  decimal(10, 2) DEFAULT NULL,
    PRIMARY KEY (`MaCTPN`),
    KEY       `fk_MaHH_ChiTietPhieuNhap_HangHoa` (`MaHH`),
    KEY       `fk_MaPN_ChiTietPhieuNhap_PhieuNhap` (`MaPN`),
    CONSTRAINT `fk_MaHH_ChiTietPhieuNhap_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `HangHoa` (`MaHH`),
    CONSTRAINT `fk_MaPN_ChiTietPhieuNhap_PhieuNhap` FOREIGN KEY (`MaPN`) REFERENCES `PhieuNhap` (`MaPN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuThu`
--
CREATE TABLE `PhieuThu`
(
    `MaPT`           int NOT NULL AUTO_INCREMENT,
    `HoVaTen`        varchar(255)   DEFAULT NULL,
    `DiaChi`         varchar(20)    DEFAULT NULL,
    `LydoNop`        varchar(255)   DEFAULT NULL,
    `NgayTao`        datetime       DEFAULT NULL,
    `GiaTien`        decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTKCTNo`       int            DEFAULT NULL,
    `MaTKCTCo`       int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    PRIMARY KEY (`MaPT`),
    KEY              `fk_MaNV_PhieuThu_NguoiDung`(`MaNV`),
    KEY              `fk_MaCT_PhieuThu_ChungTu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuThu_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `NguoiDung` (`MaND`),
    CONSTRAINT `fk_MaCT_PhieuThu_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`MaCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuChi`
--
CREATE TABLE `PhieuChi`
(
    `MaPC`           int NOT NULL AUTO_INCREMENT,
    `HoVaTen`        varchar(255)   DEFAULT NULL,
    `DiaChi`         varchar(20)    DEFAULT NULL,
    `LydoNop`        varchar(255)   DEFAULT NULL,
    `NgayTao`        datetime       DEFAULT NULL,
    `GiaTien`        decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTKCTNo`       int            DEFAULT NULL,
    `MaTKCTCo`       int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    PRIMARY KEY (`MaPC`),
    KEY              `fk_MaNV_PhieuChi_NguoiDung` (`MaNV`),
    KEY              `fk_MaCT_PhieuChi_chungtu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuChi_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `NguoiDung` (`MaND`),
    CONSTRAINT `fk_MaCT_PhieuChi_chungtu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;