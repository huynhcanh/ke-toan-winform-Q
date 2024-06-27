-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: qlbh_quanao
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `buttoan`
--

DROP TABLE IF EXISTS `buttoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buttoan` (
  `MaBT` int NOT NULL AUTO_INCREMENT,
  `NgayCT` date NOT NULL,
  `NgayHT` date NOT NULL,
  `DienGiai` varchar(100) NOT NULL,
  `TKNo` int DEFAULT NULL,
  `TkCo` int DEFAULT NULL,
  `TienPhatSinh` decimal(10,2) DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaBT`),
  KEY `fk_TKNo_ButToan_TietKhoan` (`TKNo`),
  KEY `fk_TKCo_ButToan_TietKhoan` (`TkCo`),
  KEY `fk_MaCT_ButToan_ChungTu` (`MaCT`),
  CONSTRAINT `fk_MaCT_ButToan_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_TKCo_ButToan_TietKhoan` FOREIGN KEY (`TkCo`) REFERENCES `tietkhoan` (`MaTietKhoan`),
  CONSTRAINT `fk_TKNo_ButToan_TietKhoan` FOREIGN KEY (`TKNo`) REFERENCES `tietkhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buttoan`
--

LOCK TABLES `buttoan` WRITE;
/*!40000 ALTER TABLE `buttoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `buttoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietdonhang`
--

DROP TABLE IF EXISTS `chitietdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhang` (
  `MaHH` int NOT NULL,
  `MaDH` int NOT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`MaHH`,`MaDH`),
  KEY `fk_MaHH_ChiTietDonHang_HangHoa` (`MaHH`),
  KEY `fk_MaHH_ChiTietDonHang_DonHang` (`MaDH`),
  CONSTRAINT `fk_MaHH_ChiTietDonHang_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_MaHH_ChiTietDonHang_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `hanghoa` (`MaHH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES (11,33,2),(12,38,1),(13,35,5),(14,38,2),(15,36,3),(16,38,4),(17,34,1),(18,34,2),(19,34,1),(20,34,3);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietphieunhap`
--

DROP TABLE IF EXISTS `chitietphieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietphieunhap` (
  `MaCTPN` int NOT NULL AUTO_INCREMENT,
  `MaHH` int DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  `MaPN` int DEFAULT NULL,
  `GiaGoc` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`MaCTPN`),
  KEY `fk_MaHH_ChiTietPhieuNhap_HangHoa` (`MaHH`),
  KEY `fk_MaPN_ChiTietPhieuNhap_PhieuNhap` (`MaPN`),
  CONSTRAINT `fk_MaHH_ChiTietPhieuNhap_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `hanghoa` (`MaHH`),
  CONSTRAINT `fk_MaPN_ChiTietPhieuNhap_PhieuNhap` FOREIGN KEY (`MaPN`) REFERENCES `phieunhap` (`MaPN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieunhap`
--

LOCK TABLES `chitietphieunhap` WRITE;
/*!40000 ALTER TABLE `chitietphieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitietphieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietphieuxuat`
--

DROP TABLE IF EXISTS `chitietphieuxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietphieuxuat` (
  `MaCTPX` int NOT NULL AUTO_INCREMENT,
  `MaHH` int DEFAULT NULL,
  `MaPX` int DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`MaCTPX`),
  KEY `fk_MaHH_ChiTietPhieuXuat_HangHoa` (`MaHH`),
  KEY `fk_MaPX_ChiTietPhieuXuat_PhieuXuat` (`MaPX`),
  CONSTRAINT `fk_MaHH_ChiTietPhieuXuat_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `hanghoa` (`MaHH`),
  CONSTRAINT `fk_MaPX_ChiTietPhieuXuat_PhieuXuat` FOREIGN KEY (`MaPX`) REFERENCES `phieuxuat` (`MaPX`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieuxuat`
--

LOCK TABLES `chitietphieuxuat` WRITE;
/*!40000 ALTER TABLE `chitietphieuxuat` DISABLE KEYS */;
/*!40000 ALTER TABLE `chitietphieuxuat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chungtu`
--

DROP TABLE IF EXISTS `chungtu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chungtu` (
  `MaCT` int NOT NULL AUTO_INCREMENT,
  `NgayCT` datetime DEFAULT NULL,
  `SoCT` int DEFAULT NULL,
  `MaLoaiCT` int DEFAULT NULL,
  PRIMARY KEY (`MaCT`),
  KEY `fk_MaLoaiCT_ChungTu_LoaiChungTu` (`MaLoaiCT`),
  CONSTRAINT `fk_MaLoaiCT_ChungTu_LoaiChungTu` FOREIGN KEY (`MaLoaiCT`) REFERENCES `loaichungtu` (`MaLoaiCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chungtu`
--

LOCK TABLES `chungtu` WRITE;
/*!40000 ALTER TABLE `chungtu` DISABLE KEYS */;
/*!40000 ALTER TABLE `chungtu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `MaDH` int NOT NULL AUTO_INCREMENT,
  `MaKH` int DEFAULT NULL,
  `TongTien` decimal(10,2) DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `NgayTao` datetime DEFAULT NULL,
  `NgayGiao` datetime DEFAULT NULL,
  `GhiChu` text,
  PRIMARY KEY (`MaDH`),
  KEY `fk_MaKH_donhang_khachhang` (`MaKH`),
  KEY `fk_MaNV_donhang_nguoidung` (`MaNV`),
  CONSTRAINT `fk_MaKH_donhang_khachhang` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  CONSTRAINT `fk_MaNV_donhang_nguoidung` FOREIGN KEY (`MaNV`) REFERENCES `nguoidung` (`MaND`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (33,1,0.00,8,'2024-06-01 10:00:00','2024-06-05 00:00:00','Giao hàng trong giờ hành chính'),(34,2,0.00,9,'2024-06-02 11:00:00','2024-06-06 11:00:00','Giao hàng trước 12h trưa'),(35,3,0.00,10,'2024-06-03 12:00:00','2024-06-07 12:00:00','Giao hàng trong giờ hành chính'),(36,4,0.00,5,'2024-06-04 13:00:00','2024-06-08 13:00:00','Giao hàng trước 5h chiều'),(38,6,0.00,7,'2024-06-06 15:00:00','2024-06-10 15:00:00','Giao hàng trước 12h trưa'),(39,7,0.00,8,'2024-06-07 16:00:00','2024-06-11 16:00:00','Giao hàng trong giờ hành chính'),(40,8,0.00,9,'2024-06-08 17:00:00','2024-06-12 17:00:00','Giao hàng trước 5h chiều'),(41,9,0.00,10,'2024-06-09 18:00:00','2024-06-13 18:00:00','Giao hàng trong giờ hành chính'),(42,10,0.00,5,'2024-06-10 19:00:00','2024-06-14 19:00:00','Giao hàng trước 12h trưa');
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hanghoa`
--

DROP TABLE IF EXISTS `hanghoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hanghoa` (
  `MaHH` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(255) NOT NULL,
  `GiaBan` decimal(10,2) DEFAULT NULL,
  `Dvt` varchar(20) NOT NULL,
  `KichThuoc` varchar(10) NOT NULL,
  `MaLoaiHH` int NOT NULL,
  `HinhAnh` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MaHH`),
  KEY `fk_MaLoaiHH_HangHoa_LoaiHangHoa` (`MaLoaiHH`),
  CONSTRAINT `fk_MaLoaiHH_HangHoa_LoaiHangHoa` FOREIGN KEY (`MaLoaiHH`) REFERENCES `loaihanghoa` (`MaLoaiHH`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hanghoa`
--

LOCK TABLES `hanghoa` WRITE;
/*!40000 ALTER TABLE `hanghoa` DISABLE KEYS */;
INSERT INTO `hanghoa` VALUES (11,'Áo thun nam',150000.00,'Cái','s',1,'aothun_trang.jpg'),(12,'Quần jean nữ',350000.00,'Cái','s',2,'quanjean_xanh.jpg'),(13,'Giày thể thao',500000.00,'Đôi','s',3,'giaythethao_den.jpg'),(14,'Mũ lưỡi trai',120000.00,'Cái','s',1,'muluoitrai_do.jpg'),(15,'Balo thời trang',450000.00,'Cái','s',1,'balo_xam.jpg'),(16,'Váy đầm',600000.00,'Cái','s',2,'vaydam_hong.jpg'),(17,'Áo khoác',750000.00,'Cái','s',2,'aokhoac_xanh.jpg'),(18,'Túi xách',900000.00,'Cái','m',3,'tuixach_den.jpg'),(19,'Kính mát',200000.00,'Cặp','l',3,'kinhmat_den.jpg'),(20,'Đồng hồ',1200000.00,'Cái','s',1,'dongho_vang.jpg'),(21,'1111',111.00,'111','11111',2,NULL);
/*!40000 ALTER TABLE `hanghoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadondathang`
--

DROP TABLE IF EXISTS `hoadondathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadondathang` (
  `MaHDDH` int NOT NULL AUTO_INCREMENT,
  `GhiChu` text,
  `MaDH` int DEFAULT NULL,
  `NgayLap` datetime DEFAULT NULL,
  PRIMARY KEY (`MaHDDH`),
  KEY `fk_MaDH_HoaDonDatHang_DonHang` (`MaDH`),
  CONSTRAINT `fk_MaDH_HoaDonDatHang_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadondathang`
--

LOCK TABLES `hoadondathang` WRITE;
/*!40000 ALTER TABLE `hoadondathang` DISABLE KEYS */;
/*!40000 ALTER TABLE `hoadondathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MaKH` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(100) NOT NULL,
  `DiaChi` varchar(300) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `MaSoThue` varchar(100) NOT NULL,
  PRIMARY KEY (`MaKH`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Nguyen Van A','123 Le Loi, District 1, Ho Chi Minh City','0901234567','123456789'),(2,'Tran Thi B','456 Tran Hung Dao, District 5, Ho Chi Minh City','0912345678','987654321'),(3,'Le Van C','789 Nguyen Trai, District 3, Ho Chi Minh City','0923456789','456789123'),(4,'Pham Thi D','123 Hai Ba Trung, District 1, Ho Chi Minh City','0934567890','789123456'),(5,'Hoang Van E','456 Vo Van Tan, District 3, Ho Chi Minh City','0945678901','321654987'),(6,'Vu Thi F','789 Cach Mang Thang 8, District 10, Ho Chi Minh City','0956789012','654987321'),(7,'Ngo Van G','123 Nguyen Dinh Chieu, District 3, Ho Chi Minh City','0967890123','147258369'),(8,'Dang Thi H','456 Dien Bien Phu, District 10, Ho Chi Minh City','0978901234','369852147'),(9,'Bui Van I','789 Ly Tu Trong, District 1, Ho Chi Minh City','0989012345','258369147'),(10,'Do Thi J','123 Phan Dinh Phung, Phu Nhuan District, Ho Chi Minh City','0990123456','741852963'),(11,'Nguyen Van K','456 Le Thanh Ton, District 1, Ho Chi Minh City','0909876543','963258741'),(12,'Tran Thi L','789 Ton Duc Thang, District 1, Ho Chi Minh City','0918765432','852147963'),(13,'Le Van M','123 Hoang Sa, District 3, Ho Chi Minh City','0927654321','369741852'),(14,'Pham Thi N','456 Truong Sa, District 3, Ho Chi Minh City','0936543210','147963258'),(15,'Hoang Van O','789 Pham Van Dong, Binh Thanh District, Ho Chi Minh City','0945432109','258741369'),(16,'Vu Thi P','123 Bach Dang, Binh Thanh District, Ho Chi Minh City','0954321098','321987654'),(17,'Ngo Van Q','456 Dinh Tien Hoang, Binh Thanh District, Ho Chi Minh City','0963210987','654123987'),(18,'Dang Thi R','789 Nguyen Van Dau, Binh Thanh District, Ho Chi Minh City','0972109876','789654321'),(21,'aaa','aa','aaa','aaa');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kho`
--

DROP TABLE IF EXISTS `kho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kho` (
  `MaKho` int NOT NULL AUTO_INCREMENT,
  `MaHH` int DEFAULT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`MaKho`),
  KEY `fk_MaHH_Kho_HangHoa` (`MaHH`),
  CONSTRAINT `fk_MaHH_Kho_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `hanghoa` (`MaHH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kho`
--

LOCK TABLES `kho` WRITE;
/*!40000 ALTER TABLE `kho` DISABLE KEYS */;
/*!40000 ALTER TABLE `kho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaichungtu`
--

DROP TABLE IF EXISTS `loaichungtu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaichungtu` (
  `MaLoaiCT` int NOT NULL AUTO_INCREMENT,
  `TenCT` int DEFAULT NULL,
  PRIMARY KEY (`MaLoaiCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaichungtu`
--

LOCK TABLES `loaichungtu` WRITE;
/*!40000 ALTER TABLE `loaichungtu` DISABLE KEYS */;
/*!40000 ALTER TABLE `loaichungtu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaihanghoa`
--

DROP TABLE IF EXISTS `loaihanghoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaihanghoa` (
  `MaLoaiHH` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(200) NOT NULL,
  PRIMARY KEY (`MaLoaiHH`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaihanghoa`
--

LOCK TABLES `loaihanghoa` WRITE;
/*!40000 ALTER TABLE `loaihanghoa` DISABLE KEYS */;
INSERT INTO `loaihanghoa` VALUES (1,'Áo thun'),(2,'Sport Clothing 2'),(3,'Mens Sport Clothing'),(8,'aa');
/*!40000 ALTER TABLE `loaihanghoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nguoidung`
--

DROP TABLE IF EXISTS `nguoidung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nguoidung` (
  `MaND` int NOT NULL AUTO_INCREMENT,
  `TenDN` varchar(100) NOT NULL,
  `MatKhau` varchar(100) NOT NULL,
  `VaiTro` varchar(70) NOT NULL,
  PRIMARY KEY (`MaND`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nguoidung`
--

LOCK TABLES `nguoidung` WRITE;
/*!40000 ALTER TABLE `nguoidung` DISABLE KEYS */;
INSERT INTO `nguoidung` VALUES (5,'admin','admin123','Admin'),(6,'johndoe','password1','User'),(7,'alice','alice123','User'),(8,'bob','bobpass','User'),(9,'charlie','charlie1','User'),(10,'david','david123','User'),(11,'eva','evapass','User'),(12,'frank11','frank1','User'),(15,'aa','aa','Admin');
/*!40000 ALTER TABLE `nguoidung` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhacungcap` (
  `MaNCC` int NOT NULL AUTO_INCREMENT,
  `Ten` varchar(100) NOT NULL,
  `DiaChi` varchar(300) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `MaTietKhoan` int DEFAULT NULL,
  PRIMARY KEY (`MaNCC`),
  KEY `fk_MaTietKhoan_NhaCungCap_TietKhoan` (`MaTietKhoan`),
  CONSTRAINT `fk_MaTietKhoan_NhaCungCap_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `tietkhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhacungcap`
--

LOCK TABLES `nhacungcap` WRITE;
/*!40000 ALTER TABLE `nhacungcap` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhacungcap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieuchi`
--

DROP TABLE IF EXISTS `phieuchi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieuchi` (
  `MaPC` int NOT NULL AUTO_INCREMENT,
  `HoVaTen` varchar(255) DEFAULT NULL,
  `DiaChi` varchar(20) DEFAULT NULL,
  `LydoNop` varchar(255) DEFAULT NULL,
  `NgayTao` datetime DEFAULT NULL,
  `GiaTien` decimal(10,2) DEFAULT NULL,
  `TaiLieuDinhKem` varchar(255) DEFAULT NULL,
  `MaTKCTNo` int DEFAULT NULL,
  `MaTKCTCo` int DEFAULT NULL,
  `QuyenSo` int DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPC`),
  KEY `fk_MaNV_PhieuChi_NguoiDung` (`MaNV`),
  KEY `fk_MaCT_PhieuChi_chungtu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuChi_chungtu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaNV_PhieuChi_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `nguoidung` (`MaND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieuchi`
--

LOCK TABLES `phieuchi` WRITE;
/*!40000 ALTER TABLE `phieuchi` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieuchi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieunhap`
--

DROP TABLE IF EXISTS `phieunhap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieunhap` (
  `MaPN` int NOT NULL AUTO_INCREMENT,
  `MucDich` varchar(255) DEFAULT NULL,
  `NhapTuNguon` varchar(255) DEFAULT NULL,
  `TenNguoiGiao` varchar(255) DEFAULT NULL,
  `TenNguoiKiemHang` varchar(255) DEFAULT NULL,
  `GhiChu` text,
  `TaiLieuDinhKem` varchar(255) DEFAULT NULL,
  `NgayTao` datetime DEFAULT NULL,
  `TongTien` decimal(10,2) DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaNCC` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPN`),
  KEY `fk_MaNV_PhieuNhap_NguoiDung` (`MaNV`),
  KEY `fk_MaNCC_PhieuNhap_NhaCungCap` (`MaNCC`),
  KEY `fk_MaCT_PhieuNhap_ChungTu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuNhap_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaNCC_PhieuNhap_NhaCungCap` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`),
  CONSTRAINT `fk_MaNV_PhieuNhap_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `nguoidung` (`MaND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieunhap`
--

LOCK TABLES `phieunhap` WRITE;
/*!40000 ALTER TABLE `phieunhap` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieunhap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieuthu`
--

DROP TABLE IF EXISTS `phieuthu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieuthu` (
  `MaPT` int NOT NULL AUTO_INCREMENT,
  `HoVaTen` varchar(255) DEFAULT NULL,
  `DiaChi` varchar(20) DEFAULT NULL,
  `LydoNop` varchar(255) DEFAULT NULL,
  `NgayTao` datetime DEFAULT NULL,
  `GiaTien` decimal(10,2) DEFAULT NULL,
  `TaiLieuDinhKem` varchar(255) DEFAULT NULL,
  `MaTKCTNo` int DEFAULT NULL,
  `MaTKCTCo` int DEFAULT NULL,
  `QuyenSo` int DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPT`),
  KEY `fk_MaNV_PhieuThu_NguoiDung` (`MaNV`),
  KEY `fk_MaCT_PhieuThu_ChungTu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuThu_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaNV_PhieuThu_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `nguoidung` (`MaND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieuthu`
--

LOCK TABLES `phieuthu` WRITE;
/*!40000 ALTER TABLE `phieuthu` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieuthu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieuxuat`
--

DROP TABLE IF EXISTS `phieuxuat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieuxuat` (
  `MaPX` int NOT NULL AUTO_INCREMENT,
  `MucDichXuatKho` text,
  `TenNguoiNhan` varchar(255) DEFAULT NULL,
  `TenNguoiXuatHang` varchar(255) DEFAULT NULL,
  `GhiChu` text,
  `TaiLieuDinhKem` text,
  `MaDH` int DEFAULT NULL,
  `NgayTao` datetime DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPX`),
  KEY `fk_MaDHH_PhieuXuat_DonHang` (`MaDH`),
  KEY `fk_MaNV_PhieuXuat_NguoiDung` (`MaNV`),
  KEY `fk_MaCT_PhieuXuat_ChungTu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuXuat_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaDHH_PhieuXuat_DonHang` FOREIGN KEY (`MaDH`) REFERENCES `donhang` (`MaDH`),
  CONSTRAINT `fk_MaNV_PhieuXuat_NguoiDung` FOREIGN KEY (`MaNV`) REFERENCES `nguoidung` (`MaND`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieuxuat`
--

LOCK TABLES `phieuxuat` WRITE;
/*!40000 ALTER TABLE `phieuxuat` DISABLE KEYS */;
/*!40000 ALTER TABLE `phieuxuat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sddk`
--

DROP TABLE IF EXISTS `sddk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sddk` (
  `MaTietKhoan` int NOT NULL,
  `NgayDauKy` datetime NOT NULL,
  `SoTienDK` decimal(10,2) NOT NULL,
  `LoaiTK` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MaTietKhoan`,`NgayDauKy`),
  KEY `fk_MaTietKhoan_SDDK_TietKhoan` (`MaTietKhoan`),
  CONSTRAINT `fk_MaTietKhoan_SDDK_TietKhoan` FOREIGN KEY (`MaTietKhoan`) REFERENCES `tietkhoan` (`MaTietKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sddk`
--

LOCK TABLES `sddk` WRITE;
/*!40000 ALTER TABLE `sddk` DISABLE KEYS */;
/*!40000 ALTER TABLE `sddk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `MaTaiKhoan` int NOT NULL,
  `TenTaiKhoan` varchar(100) NOT NULL,
  PRIMARY KEY (`MaTaiKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tietkhoan`
--

DROP TABLE IF EXISTS `tietkhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tietkhoan` (
  `MaTietKhoan` int NOT NULL,
  `TenTietKhoan` int NOT NULL,
  `MaTieuKhoan` int DEFAULT NULL,
  PRIMARY KEY (`MaTietKhoan`),
  KEY `fk_MaTieuKhoan_TietKhoan_TieuKhoan` (`MaTieuKhoan`),
  CONSTRAINT `fk_MaTieuKhoan_TietKhoan_TieuKhoan` FOREIGN KEY (`MaTieuKhoan`) REFERENCES `tieukhoan` (`MaTieuKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tietkhoan`
--

LOCK TABLES `tietkhoan` WRITE;
/*!40000 ALTER TABLE `tietkhoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tietkhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieukhoan`
--

DROP TABLE IF EXISTS `tieukhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tieukhoan` (
  `MaTieuKhoan` int NOT NULL,
  `TenTieuKhoan` int NOT NULL,
  `MaTaiKhoan` int DEFAULT NULL,
  PRIMARY KEY (`MaTieuKhoan`),
  KEY `fk_MaTaiKhoan_TieuKhoan_TaiKhoan` (`MaTaiKhoan`),
  CONSTRAINT `fk_MaTaiKhoan_TieuKhoan_TaiKhoan` FOREIGN KEY (`MaTaiKhoan`) REFERENCES `taikhoan` (`MaTaiKhoan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieukhoan`
--

LOCK TABLES `tieukhoan` WRITE;
/*!40000 ALTER TABLE `tieukhoan` DISABLE KEYS */;
/*!40000 ALTER TABLE `tieukhoan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-27 13:54:05
