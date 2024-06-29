-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: accounting_q
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
-- Table structure for table `chitietphieubanhang`
--

DROP TABLE IF EXISTS `chitietphieubanhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietphieubanhang` (
  `MaHH` int NOT NULL,
  `MaPBH` int NOT NULL,
  `SoLuong` int DEFAULT NULL,
  PRIMARY KEY (`MaHH`,`MaPBH`),
  KEY `fk_MaHH_ChiTietPhieuBanHang_HangHoa` (`MaHH`),
  KEY `fk_MaHH_ChiTietPhieuBanHang_PhieuBanHang` (`MaPBH`),
  CONSTRAINT `fk_MaHH_ChiTietPhieuBanHang_HangHoa` FOREIGN KEY (`MaHH`) REFERENCES `hanghoa` (`MaHH`),
  CONSTRAINT `fk_MaHH_ChiTietPhieuBanHang_PhieuBanHang` FOREIGN KEY (`MaPBH`) REFERENCES `phieubanhang` (`MaPBH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieubanhang`
--

LOCK TABLES `chitietphieubanhang` WRITE;
/*!40000 ALTER TABLE `chitietphieubanhang` DISABLE KEYS */;
INSERT INTO `chitietphieubanhang` VALUES (21,51,5),(21,55,1),(22,50,10),(23,49,7),(24,48,3),(25,43,8),(26,43,6),(27,44,2),(28,45,9),(29,46,1),(30,47,4),(30,55,1);
/*!40000 ALTER TABLE `chitietphieubanhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chungtu`
--

DROP TABLE IF EXISTS `chungtu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chungtu` (
  `MaCT` int NOT NULL AUTO_INCREMENT,
  `NgayCT` date DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hanghoa`
--

LOCK TABLES `hanghoa` WRITE;
/*!40000 ALTER TABLE `hanghoa` DISABLE KEYS */;
INSERT INTO `hanghoa` VALUES (21,'Product1',61.40,'pcs','Small',11,'image1.jpg'),(22,'Product2',69.19,'kg','Large',12,'image2.jpg'),(23,'Product3',60.08,'pcs','Small',13,'image3.jpg'),(24,'Product4',58.62,'kg','Large',14,'image4.jpg'),(25,'Product5',90.69,'pcs','Small',15,'image5.jpg'),(26,'Product6',40.08,'kg','Large',16,'image6.jpg'),(27,'Product7',60.62,'pcs','Small',17,'image7.jpg'),(28,'Product8',67.70,'kg','Large',8,'image8.jpg'),(29,'Product9',55.69,'pcs','Small',9,'image9.jpg'),(30,'Product10',82.27,'kg','Large',10,'image10.jpg');
/*!40000 ALTER TABLE `hanghoa` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Customer1','Address 1','0123456789','TaxCode1'),(2,'Customer2','Address 2','0123456790','TaxCode2'),(3,'Customer3','Address 3','0123456791','TaxCode3'),(4,'Customer4','Address 4','0123456792','TaxCode4'),(5,'Customer5','Address 5','0123456793','TaxCode5'),(6,'Customer6','Address 6','0123456794','TaxCode6'),(7,'Customer7','Address 7','0123456795','TaxCode7'),(8,'Customer8','Address 8','0123456796','TaxCode8'),(9,'Customer9','Address 9','0123456797','TaxCode9'),(10,'Customer10','Address 10','0123456798','TaxCode1011111');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaihanghoa`
--

LOCK TABLES `loaihanghoa` WRITE;
/*!40000 ALTER TABLE `loaihanghoa` DISABLE KEYS */;
INSERT INTO `loaihanghoa` VALUES (8,'Category1'),(9,'Category2'),(10,'Category3'),(11,'Category4'),(12,'Category5'),(13,'Category6'),(14,'Category7'),(15,'Category8'),(16,'Category9'),(17,'Category10');
/*!40000 ALTER TABLE `loaihanghoa` ENABLE KEYS */;
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
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MaNV` int NOT NULL AUTO_INCREMENT,
  `TenDN` varchar(100) NOT NULL,
  `MatKhau` varchar(100) NOT NULL,
  `VaiTro` varchar(70) NOT NULL,
  `Ten` varchar(70) NOT NULL,
  `Sdt` varchar(70) NOT NULL,
  `DiaChi` varchar(70) NOT NULL,
  PRIMARY KEY (`MaNV`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (5,'admin','admin123','User','Name1','0123456781','Address 1'),(6,'user2','password2','Admin','Name2','0123456782','Address 2'),(7,'user3','password3','User','Name3','0123456783','Address 3'),(8,'user4','password4','Admin','Name4','0123456784','Address 4'),(9,'user5','password5','User','Name5','0123456785','Address 5'),(10,'user6','password6','Admin','Name6','0123456786','Address 6'),(11,'user7','password7','User','Name7','0123456787','Address 7'),(12,'user8','password8','Admin','Name8','0123456788','Address 8'),(13,'user9','password9','User','Name9','0123456789','Address 9'),(14,'user10','password10','Admin','Name10','01234567810','Address 10');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieubanhang`
--

DROP TABLE IF EXISTS `phieubanhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieubanhang` (
  `MaPBH` int NOT NULL AUTO_INCREMENT,
  `MaKH` int DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `NgayTao` date DEFAULT NULL,
  `GhiChu` text,
  PRIMARY KEY (`MaPBH`),
  KEY `fk_MaKH_PhieuBanHang_KhachHang` (`MaKH`),
  KEY `fk_MaNV_PhieuBanHang_NhanVien` (`MaNV`),
  CONSTRAINT `fk_MaKH_PhieuBanHang_KhachHang` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  CONSTRAINT `fk_MaNV_PhieuBanHang_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieubanhang`
--

LOCK TABLES `phieubanhang` WRITE;
/*!40000 ALTER TABLE `phieubanhang` DISABLE KEYS */;
INSERT INTO `phieubanhang` VALUES (43,1,11,'2023-06-01','Note 1'),(44,2,12,'2023-06-02','Note 2'),(45,3,13,'2023-06-03','Note 3'),(46,4,14,'2023-06-04','Note 4'),(47,5,5,'2023-06-05','Note 5'),(48,6,6,'2023-06-06','Note 6'),(49,7,7,'2023-06-07','Note 7'),(50,8,8,'2023-06-08','Note 8'),(51,9,9,'2023-06-09','Note 9'),(53,4,5,'2024-06-28','111'),(54,1,5,'2024-06-28','canh'),(55,7,5,'2024-06-28','ttt'),(56,4,5,'2024-06-28','333');
/*!40000 ALTER TABLE `phieubanhang` ENABLE KEYS */;
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
  `NgayTao` date DEFAULT NULL,
  `GiaTien` decimal(10,2) DEFAULT NULL,
  `TaiLieuDinhKem` varchar(255) DEFAULT NULL,
  `MaTKCTNo` int DEFAULT NULL,
  `MaTKCTCo` int DEFAULT NULL,
  `QuyenSo` int DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPC`),
  KEY `fk_MaNV_PhieuChi_NhanVien` (`MaNV`),
  KEY `fk_MaCT_PhieuChi_chungtu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuChi_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaNV_PhieuChi_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`)
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
  `NgayTao` date DEFAULT NULL,
  `GiaTien` decimal(10,2) DEFAULT NULL,
  `TaiLieuDinhKem` varchar(255) DEFAULT NULL,
  `MaTKCTNo` int DEFAULT NULL,
  `MaTKCTCo` int DEFAULT NULL,
  `QuyenSo` int DEFAULT NULL,
  `MaNV` int DEFAULT NULL,
  `MaCT` int DEFAULT NULL,
  PRIMARY KEY (`MaPT`),
  KEY `fk_MaNV_PhieuThu_NhanVien` (`MaNV`),
  KEY `fk_MaCT_PhieuThu_ChungTu` (`MaCT`),
  CONSTRAINT `fk_MaCT_PhieuThu_ChungTu` FOREIGN KEY (`MaCT`) REFERENCES `chungtu` (`MaCT`),
  CONSTRAINT `fk_MaNV_PhieuThu_NhanVien` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`)
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
-- Table structure for table `sddk`
--

DROP TABLE IF EXISTS `sddk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sddk` (
  `MaTietKhoan` int NOT NULL,
  `NgayDauKy` date NOT NULL,
  `SoTienDK` decimal(10,2) NOT NULL,
  `LoaiTK` varchar(255) DEFAULT NULL,
  `DuNo` decimal(10,2) DEFAULT NULL,
  `DuCo` decimal(10,2) DEFAULT NULL,
  `MaBT` int DEFAULT NULL,
  PRIMARY KEY (`MaTietKhoan`,`NgayDauKy`),
  KEY `fk_MaTietKhoan_SDDK_TietKhoan` (`MaTietKhoan`),
  KEY `fk_MaBT_SDDK_ButToan` (`MaBT`),
  CONSTRAINT `fk_MaBT_SDDK_ButToan` FOREIGN KEY (`MaBT`) REFERENCES `buttoan` (`MaBT`),
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

-- Dump completed on 2024-06-28 12:01:19
