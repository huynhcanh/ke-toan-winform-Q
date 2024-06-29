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
    `NgayCT`   date DEFAULT NULL,
    `SoCT`     int  DEFAULT NULL,
    `MaLoaiCT` int  DEFAULT NULL,
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
    `MaSoThue` varchar(100) DEFAULT NULL,
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
    `GhiChu`  text,
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
    `NgayDauKy`   date           NOT NULL,
    `SoTienDK`    decimal(10, 2) NOT NULL,
    `LoaiTK`      varchar(255)   DEFAULT NULL,
    `DuNo`        decimal(10, 2) DEFAULT NULL,
    `DuCo`        decimal(10, 2) DEFAULT NULL,
    `MaBT`        int            DEFAULT NULL,
    PRIMARY KEY (`MaTietKhoan`, `NgayDauKy`),
    KEY           `fk_MaTietKhoan_SDDK_TietKhoan` (`MaTietKhoan`),
    KEY           `fk_MaBT_SDDK_ButToan` (`MaBT`),
    CONSTRAINT `fk_MaTietKhoan_SDDK_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `TietKhoan` (`MaTietKhoan`),
    CONSTRAINT `fk_MaBT_SDDK_ButToan` FOREIGN KEY (`MaBT`) REFERENCES `ButToan` (`MaBT`)
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
    `NgayTao`        date           DEFAULT NULL,
    `GiaTien`        decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTKCTNo`       int            DEFAULT NULL,
    `MaTKCTCo`       int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    PRIMARY KEY (`MaPT`),
    KEY              `fk_MaNV_PhieuThu_NhanVien`(`MaNV`),
    KEY              `fk_MaCT_PhieuThu_ChungTu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuThu_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `NhanVien` (`MaNV`),
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
    `NgayTao`        date           DEFAULT NULL,
    `GiaTien`        decimal(10, 2) DEFAULT NULL,
    `TaiLieuDinhKem` varchar(255)   DEFAULT NULL,
    `MaTKCTNo`       int            DEFAULT NULL,
    `MaTKCTCo`       int            DEFAULT NULL,
    `QuyenSo`        int            DEFAULT NULL,
    `MaNV`           int            DEFAULT NULL,
    `MaCT`           int            DEFAULT NULL,
    PRIMARY KEY (`MaPC`),
    KEY              `fk_MaNV_PhieuChi_NhanVien` (`MaNV`),
    KEY              `fk_MaCT_PhieuChi_chungtu` (`MaCT`),
    CONSTRAINT `fk_MaNV_PhieuChi_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `NhanVien` (`MaNV`),
    CONSTRAINT `fk_MaCT_PhieuChi_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `ChungTu` (`maCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;