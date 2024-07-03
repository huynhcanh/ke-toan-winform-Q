-- Follow this link
-- https://docs.google.com/document/d/15S3iUvsAs7sO1015egOQ5MC65W3DS7w59aP16bIC0g4/edit

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
    `MaTieuKhoan`  int          NOT NULL,
    `TenTieuKhoan` varchar(100) NOT NULL,
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
    `MaTietKhoan`  int          NOT NULL,
    `TenTietKhoan` varchar(100) NOT NULL,
    `MaTieuKhoan`  int DEFAULT NULL,
    PRIMARY KEY (`MaTietKhoan`),
    KEY            `fk_MaTieuKhoan_TietKhoan_TieuKhoan` (`MaTieuKhoan`),
    CONSTRAINT `fk_MaTieuKhoan_TietKhoan_TieuKhoan` FOREIGN KEY (`MaTieuKhoan`) REFERENCES `TieuKhoan` (`MaTieuKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChungTu`
--
CREATE TABLE `ChungTu`
(
    `MaCT`   int          NOT NULL AUTO_INCREMENT,
    `NgayCT` date DEFAULT NULL,
    `SoCT`   varchar(100) NOT NULL,
    `LoaiCT` varchar(100) NOT NULL,
    PRIMARY KEY (`MaCT`)
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
-- Table structure for table `NhanVien`
--
CREATE TABLE `NhanVien`
(
    `MaNV`    int          NOT NULL AUTO_INCREMENT,
    `TenDN`   varchar(100) NOT NULL,
    `MatKhau` varchar(100) NOT NULL,
    `VaiTro`  varchar(70)  NOT NULL,
    `Ten`     varchar(70)  NOT NULL,
    `Sdt`     varchar(70)  NOT NULL,
    `DiaChi`  varchar(70)  NOT NULL,
    PRIMARY KEY (`MaNV`)
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
-- Table structure for table `PhieuBanHang`
--
CREATE TABLE `PhieuBanHang`
(
    `MaPBH`   int NOT NULL AUTO_INCREMENT,
    `MaKH`    int  DEFAULT NULL,
    `MaNV`    int  DEFAULT NULL,
    `NgayTao` date DEFAULT NULL,
    `GhiChu`  text DEFAULT NULL,
    `DaXuat`  bool DEFAULT NULL,
    `DaXoa`  bool DEFAULT NULL,
    PRIMARY KEY (`MaPBH`),
    KEY       `fk_MaKH_PhieuBanHang_KhachHang` (`MaKH`),
    KEY       `fk_MaNV_PhieuBanHang_NhanVien` (`MaNV`),
    CONSTRAINT `fk_MaKH_PhieuBanHang_KhachHang` FOREIGN KEY (`MaKH`) REFERENCES `KhachHang` (`MaKH`),
    CONSTRAINT `fk_MaNV_PhieuBanHang_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `NhanVien` (`MaNV`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `ChiTietPhieuBanHang`
--
CREATE TABLE `ChiTietPhieuBanHang`
(
    `MaHH`    int NOT NULL,
    `MaPBH`   int NOT NULL,
    `SoLuong` int DEFAULT NULL,
    PRIMARY KEY (`MaHH`, `MaPBH`),
    KEY       `fk_MaHH_ChiTietPhieuBanHang_HangHoa` (`MaHH`),
    KEY       `fk_MaHH_ChiTietPhieuBanHang_PhieuBanHang` (`MaPBH`),
    CONSTRAINT `fk_MaHH_ChiTietPhieuBanHang_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `HangHoa` (`MaHH`),
    CONSTRAINT `fk_MaHH_ChiTietPhieuBanHang_PhieuBanHang` FOREIGN KEY (`MaPBH`) REFERENCES `PhieuBanHang` (`MaPBH`)
) ENGINE=InnoDB AUTO_INCREMENT=132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Table structure for table `SDDK`
--
CREATE TABLE `SDDK`
(
    `MaTietKhoan` int  NOT NULL,
    `NgayDauKy`   date NOT NULL,
    `SoTien`      decimal(10, 2) DEFAULT NULL,
    `TrangThai`   varchar(255) DEFAULT NULL,
    PRIMARY KEY (`MaTietKhoan`, `NgayDauKy`),
    KEY           `fk_MaTietKhoan_SDDK_TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_MaTietKhoan_SDDK_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `TietKhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuThu`
--
CREATE TABLE `PhieuThu`
(
    `MaPT`           int NOT NULL AUTO_INCREMENT,
    `LydoNop`        varchar(255)   DEFAULT NULL,
    `NgayTao`        date           DEFAULT NULL,
    `SoTien`         decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTietKhoanNo`  int            DEFAULT NULL,
    `MaTietKhoanCo`  int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    `MaKH`           int            DEFAULT NULL,
    `DaXuat`         bool           DEFAULT NULL,
    PRIMARY KEY (`MaPT`),
    KEY              `fk_MaNV_PhieuThu_NhanVien`(`MaNV`),
    KEY              `fk_MaCT_PhieuThu_ChungTu` (`MaCT`),
    KEY              `fk_MaKH_PhieuThu_KhachHang` (`MaKH`),
    CONSTRAINT `fk_MaNV_PhieuThu_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `NhanVien` (`MaNV`),
    CONSTRAINT `fk_MaCT_PhieuThu_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`MaCT`),
    CONSTRAINT `fk_MaKH_PhieuThu_KhachHang` FOREIGN KEY (`MaKH`) REFERENCES `KhachHang` (`MaKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `PhieuChi`
--
CREATE TABLE `PhieuChi`
(
    `MaPC`           int NOT NULL AUTO_INCREMENT,
    `LydoNop`        varchar(255)   DEFAULT NULL,
    `NgayTao`        date           DEFAULT NULL,
    `SoTien`         decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTietKhoanNo`  int            DEFAULT NULL,
    `MaTietKhoanCo`  int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    `DaXuat`         bool           DEFAULT NULL,
    PRIMARY KEY (`MaPC`),
    KEY              `fk_MaNV_PhieuChi_NhanVien` (`MaNV`),
    KEY              `fk_MaCT_PhieuChi_chungtu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuChi_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `NhanVien` (`MaNV`),
    CONSTRAINT `fk_MaCT_PhieuChi_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
