package com.mycompany.ketoan.frm;

import com.mycompany.ketoan.constants.ApplicationConstants;
import static com.mycompany.ketoan.constants.ApplicationConstants.Application.Role.ACCOUNTANT;
import static com.mycompany.ketoan.constants.ApplicationConstants.Application.Role.SALER;
import com.mycompany.ketoan.dto.AccountEntryDTO;
import com.mycompany.ketoan.dto.AccountLv1DTO;
import com.mycompany.ketoan.dto.AccountLv2DTO;
import com.mycompany.ketoan.dto.AccountLv3DTO;
import com.mycompany.ketoan.dto.BalanceDTO;
import com.mycompany.ketoan.dto.CategoryDTO;
import com.mycompany.ketoan.dto.CustomerDTO;
import com.mycompany.ketoan.dto.DocumentDTO;
import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.dto.OrderDetailDTO;
import com.mycompany.ketoan.dto.PaymentDTO;
import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.helper.HelperObject;
import com.mycompany.ketoan.helper.ImageUploader;
import com.mycompany.ketoan.repository.AccountEntryRepository;
import com.mycompany.ketoan.repository.AccountRepository;
import com.mycompany.ketoan.repository.BalanceRepository;
import com.mycompany.ketoan.repository.CategoryRepository;
import com.mycompany.ketoan.repository.CustomerRepository;
import com.mycompany.ketoan.repository.DocumentRepository;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.repository.OrderDetailRepository;
import com.mycompany.ketoan.repository.OrderRepository;
import com.mycompany.ketoan.repository.PaymentRepository;
import com.mycompany.ketoan.repository.ProductRepository;
import com.mycompany.ketoan.repository.ReceiptRepository;
import com.mycompany.ketoan.service.AccountEntryService;
import com.mycompany.ketoan.service.AccountService;
import com.mycompany.ketoan.service.BalanceService;
import com.mycompany.ketoan.service.CategoryService;
import com.mycompany.ketoan.service.CustomerService;
import com.mycompany.ketoan.service.EmployeeService;
import com.mycompany.ketoan.service.OrderDetailService;
import com.mycompany.ketoan.service.OrderService;
import com.mycompany.ketoan.service.PaymentService;
import com.mycompany.ketoan.service.ProductService;
import com.mycompany.ketoan.service.ReceiptService;
import com.mycompany.ketoan.service.RoleService;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;
import com.mycompany.ketoan.utils.PriceUtils;
import com.mycompany.ketoan.utils.SecurityUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormMain extends javax.swing.JFrame {

    public FormMain() {
        this.setTitle("Quản Lý Bán Hàng Quần Áo YODY");
        initComponents();
        this.setVisible(true);
        this.show();
    }
    
    public JTabbedPane getTabOrder(){
        return this.jTabbedPane3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelDangXuat = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanelHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTHoaDon_ChiTietHoaDon = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnThem_HoaDon = new javax.swing.JButton();
        btnReSet_HoaDon = new javax.swing.JButton();
        btnSua_HoaDon = new javax.swing.JButton();
        btnXoa_HoaDon = new javax.swing.JButton();
        cbbKhachHang_HoaDon = new javax.swing.JComboBox<>();
        txtGhiChu_HoaDon = new javax.swing.JTextField();
        lblTongTien_HoaDon3 = new javax.swing.JLabel();
        btnXuatHoaDon_PhieuBanHang = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSoLuongCTHD_HoaDon = new javax.swing.JTextField();
        lblSoLuongCTHD_HoaDon = new javax.swing.JLabel();
        cbbSanPhamCTHD_HoaDon = new javax.swing.JComboBox<>();
        lblMaHoaDon_HoaDon2 = new javax.swing.JLabel();
        btnXoa_CTHD = new javax.swing.JButton();
        btnResetCTHD_HoaDon = new javax.swing.JButton();
        btnThem_CTHD = new javax.swing.JButton();
        btnSua_CTHD = new javax.swing.JButton();
        lblTongTien_HoaDon2 = new javax.swing.JLabel();
        txtTimKiem_HoaDon = new javax.swing.JTextField();
        jPaneSanPham = new javax.swing.JTabbedPane();
        jPanelLoaiSanPham = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbLoaiSanPham_LoaiSanPham = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTenLoaiSanPham_LoaiSanPham = new javax.swing.JLabel();
        txtTenLoaiSanPham_LoaiSanPham = new javax.swing.JTextField();
        btnThem_LoaiSanPham = new javax.swing.JButton();
        btnXoa_LoaiSanPham = new javax.swing.JButton();
        btnSua_LoaiSanPham = new javax.swing.JButton();
        Reset_LoaiSanPham = new javax.swing.JButton();
        jPanelSanPham = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtTimKiem_SanPham = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTenSanPham_SanPham = new javax.swing.JLabel();
        txtTenSanPham_SanPham = new javax.swing.JTextField();
        btnThem_SanPham = new javax.swing.JButton();
        bntSua_SanPham = new javax.swing.JButton();
        cbbMaLoaiSanPham_SanPham = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblGiaNhap_SanPham = new javax.swing.JLabel();
        txtGiaban_SanPham = new javax.swing.JTextField();
        btnXoa_SanPham = new javax.swing.JButton();
        btnReset_SanPham = new javax.swing.JButton();
        txtKichThuoc_SanPham = new javax.swing.JTextField();
        lblGiaBan = new javax.swing.JLabel();
        lblNgayHetHan_SanPham = new javax.swing.JLabel();
        txtDonVi_SanPham = new javax.swing.JTextField();
        lblNgayHetHan_SanPham1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lab_HinhAnh_HangHoa = new javax.swing.JLabel();
        jPanel_KhachHang = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblKhachHang_KhachHang = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        lblSoDienThoai_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtTenKhachHang_KhachHang = new javax.swing.JTextField();
        txtSoDienThoai_KhachHang = new javax.swing.JTextField();
        txtDiaChi_KhachHang = new javax.swing.JTextField();
        btnThem_KhachHang = new javax.swing.JButton();
        btnXoa_KhachHang = new javax.swing.JButton();
        btnSua_KhachHang = new javax.swing.JButton();
        btnReset_KhachHang = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMaSoThue_KhachHang = new javax.swing.JTextField();
        txtTimKiem_KhachHang = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jPanel_TaiKhoan = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblTaiKhoan = new javax.swing.JTable();
        txtTimKiem_TaiKhoan = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNumberAccountLv2_Lv2_Account = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNameAccountLv2_Lv2_Account = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbbNumberAccountLv1_Lv2_Account = new javax.swing.JComboBox<>();
        btnAdd_Lv2_Account = new javax.swing.JButton();
        btnEdit_Lv2_Account = new javax.swing.JButton();
        btnDelete_Lv2_Account = new javax.swing.JButton();
        btnReset_Lv2_Account = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumberAccountLv1_Lv1_Account = new javax.swing.JTextField();
        txtNameAccountLv1_Lv1_Account = new javax.swing.JTextField();
        btnAdd_Lv1_Account = new javax.swing.JButton();
        btnEdit_Lv1_Account = new javax.swing.JButton();
        btnDelete_Lv1_Account = new javax.swing.JButton();
        btnReset_Lv1_Account = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtNameAccountLv3_Lv3_Account = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cbbNumberAccountLv2_Lv3_Account = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtNumberAccountLv3_Lv3_Account = new javax.swing.JTextField();
        btnAdd_Lv3_Account = new javax.swing.JButton();
        btnEdit_Lv3_Account = new javax.swing.JButton();
        btnDelete_Lv3_Account = new javax.swing.JButton();
        btnReset_Lv3_Account = new javax.swing.JButton();
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelNhanVien = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblNhanVien_NhanVien = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        lblTenNhanVien_NhanVien = new javax.swing.JLabel();
        lblSDT_NhanVien = new javax.swing.JLabel();
        txtTenDN_NhanVien = new javax.swing.JTextField();
        txtMK_NhanVien = new javax.swing.JTextField();
        btnThem_NhanVien = new javax.swing.JButton();
        btnXoa_NhanVien = new javax.swing.JButton();
        btnSua_NhanVien = new javax.swing.JButton();
        btnReset_NhanVien = new javax.swing.JButton();
        cbQuyen_NhanVien = new javax.swing.JComboBox<>();
        lblTaiKhoan_NhanVien = new javax.swing.JLabel();
        lblTaiKhoan_NhanVien1 = new javax.swing.JLabel();
        lblSDT_NhanVien1 = new javax.swing.JLabel();
        lblTenNhanVien_NhanVien1 = new javax.swing.JLabel();
        txtTen_NhanVien = new javax.swing.JTextField();
        txtSDT_NhanVien = new javax.swing.JTextField();
        txtDiaChi_NhanVien = new javax.swing.JTextField();
        txtTimKiem_NhanVien = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTabbedPanelThuChi = new javax.swing.JTabbedPane();
        jPanelPhieuNhap = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblPhieuThu = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtQuyen_PhieuThu = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cbbKhachHang_PhieuThu = new javax.swing.JComboBox<>();
        cbbNhanVien_PhieuThu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTongTien_HoaDon1 = new javax.swing.JLabel();
        txtTongTien_PhieuNhap = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtLyDo_PhieuThu = new javax.swing.JTextArea();
        btnThem_PhieuThu = new javax.swing.JButton();
        btnXoa_PhieuThu = new javax.swing.JButton();
        btnReset_PhieuThu = new javax.swing.JButton();
        btnSua_PhieuThu = new javax.swing.JButton();
        cbbMaTKN_PhieuThu = new javax.swing.JComboBox<>();
        cbbMaTKC_PhieuThu = new javax.swing.JComboBox<>();
        txtTimKiem_PhieuThu = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        btnXuatPhieuThu_PhieuThu = new javax.swing.JButton();
        jPanelPhieuChi = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblPhieuChi = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtQuyen_PhieuChi = new javax.swing.JTextField();
        cbbNhanVien_PhieuChi = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTongTien_HoaDon4 = new javax.swing.JLabel();
        txtTongTien_PhieuChi = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtLyDo_PhieuChi = new javax.swing.JTextArea();
        btnThem_PhieuChi = new javax.swing.JButton();
        btnXoa_PhieuChi = new javax.swing.JButton();
        btnReset_PhieuChi = new javax.swing.JButton();
        btnSua_PhieuChi = new javax.swing.JButton();
        cbbMaTKC_PhieuChi = new javax.swing.JComboBox<>();
        cbbMaTKN_PhieuChi = new javax.swing.JComboBox<>();
        btnXuatPhieuChi_PhieuChi = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        txtTimKiem_PhieuChi = new javax.swing.JTextField();
        jPanelSDDK = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSDDK = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnThem_SDDK = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbbStatus_SDDK = new javax.swing.JComboBox<>();
        txtPrice_SDDK = new javax.swing.JTextField();
        cbbMaTietKhoan_SDDK = new javax.swing.JComboBox<>();
        txtfirstDateOfPeriod_SDDK = new com.toedter.calendar.JDateChooser();
        jPanelChungTu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChungTu = new javax.swing.JTable();
        lblTongTien_HoaDon7 = new javax.swing.JLabel();
        txtTimKiem_ChungTu = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        lblTSHDBR5 = new javax.swing.JLabel();
        lblTSHDBR6 = new javax.swing.JLabel();
        lblTSHDBR7 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtMaCT_CT = new javax.swing.JTextField();
        btnXoa_DoanhThu = new javax.swing.JButton();
        fromDateFilter_Document = new com.toedter.calendar.JDateChooser();
        toDateFilter_Document = new com.toedter.calendar.JDateChooser();
        jPanelButToan = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbButToan = new javax.swing.JTable();
        lblTSHDBR4 = new javax.swing.JLabel();
        txtTimKiem_ButToan = new javax.swing.JTextField();
        cbbTypeFilter_ButToan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMaButToan_ButToan = new javax.swing.JTextField();
        btnXoa_ButToan = new javax.swing.JButton();
        jPanelLogout = new javax.swing.JPanel();

        jPanelDangXuat.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelDangXuatComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelDangXuatLayout = new javax.swing.GroupLayout(jPanelDangXuat);
        jPanelDangXuat.setLayout(jPanelDangXuatLayout);
        jPanelDangXuatLayout.setHorizontalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );
        jPanelDangXuatLayout.setVerticalGroup(
            jPanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.setBackground(new java.awt.Color(190, 190, 190));
        jTabbedPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane3.setToolTipText("");
        jTabbedPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane3.setMinimumSize(new java.awt.Dimension(1240, 70));
        jTabbedPane3.setPreferredSize(new java.awt.Dimension(1332, 627));
        jTabbedPane3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane3ComponentShown(evt);
            }
        });

        jPanelHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHoaDon.setToolTipText("");
        jPanelHoaDon.setEnabled(false);
        jPanelHoaDon.setFocusCycleRoot(true);
        jPanelHoaDon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanelHoaDon.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelHoaDonComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU BÁN HÀNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHI TIẾT PHIẾU BÁN HÀNG");

        tblOrder.setBackground(new java.awt.Color(217, 217, 217));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Đơn Hàng", "Khách Hàng", "Nhân Viên Lập", "Ngày Lập", "Tổng Tiền", "Trạng Thái", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.getTableHeader().setReorderingAllowed(false);
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(0).setResizable(false);
            tblOrder.getColumnModel().getColumn(1).setResizable(false);
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
            tblOrder.getColumnModel().getColumn(3).setResizable(false);
            tblOrder.getColumnModel().getColumn(4).setResizable(false);
            tblOrder.getColumnModel().getColumn(5).setResizable(false);
            tblOrder.getColumnModel().getColumn(7).setResizable(false);
        }

        tblCTHoaDon_ChiTietHoaDon.setBackground(new java.awt.Color(217, 217, 217));
        tblCTHoaDon_ChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Đơn Hàng", "Mã Hàng Hóa", "Tên Hàng Hóa", "Số Lượng", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCTHoaDon_ChiTietHoaDon.getTableHeader().setReorderingAllowed(false);
        tblCTHoaDon_ChiTietHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHoaDon_ChiTietHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCTHoaDon_ChiTietHoaDon);
        if (tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumnCount() > 0) {
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(0).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(2).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(3).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(4).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(5).setResizable(false);
            tblCTHoaDon_ChiTietHoaDon.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Khách Hàng*");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        btnThem_HoaDon.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_HoaDon.setText("Tạo Đơn Hàng");
        btnThem_HoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_HoaDonActionPerformed(evt);
            }
        });

        btnReSet_HoaDon.setBackground(new java.awt.Color(204, 204, 204));
        btnReSet_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReSet_HoaDon.setText("Làm mới");
        btnReSet_HoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReSet_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReSet_HoaDonActionPerformed(evt);
            }
        });

        btnSua_HoaDon.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_HoaDon.setText("Sửa");
        btnSua_HoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_HoaDonActionPerformed(evt);
            }
        });

        btnXoa_HoaDon.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_HoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_HoaDon.setText("Xóa");
        btnXoa_HoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_HoaDonActionPerformed(evt);
            }
        });

        cbbKhachHang_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        cbbKhachHang_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhachHang_HoaDonActionPerformed(evt);
            }
        });

        txtGhiChu_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtGhiChu_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhiChu_HoaDonActionPerformed(evt);
            }
        });

        lblTongTien_HoaDon3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon3.setText("Ghi chú");

        btnXuatHoaDon_PhieuBanHang.setBackground(new java.awt.Color(112, 173, 71));
        btnXuatHoaDon_PhieuBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatHoaDon_PhieuBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatHoaDon_PhieuBanHang.setText("XUẤT PHIẾU BH");
        btnXuatHoaDon_PhieuBanHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatHoaDon_PhieuBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDon_PhieuBanHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongTien_HoaDon3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel30)))
                .addGap(10, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbKhachHang_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGhiChu_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSua_HoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa_HoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReSet_HoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuatHoaDon_PhieuBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnThem_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnThem_HoaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua_HoaDon))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGhiChu_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien_HoaDon3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addComponent(btnXoa_HoaDon)
                .addGap(9, 9, 9)
                .addComponent(btnReSet_HoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatHoaDon_PhieuBanHang)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtSoLuongCTHD_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtSoLuongCTHD_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongCTHD_HoaDonActionPerformed(evt);
            }
        });
        txtSoLuongCTHD_HoaDon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuongCTHD_HoaDonKeyReleased(evt);
            }
        });

        lblSoLuongCTHD_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoLuongCTHD_HoaDon.setText("Số Lượng*");

        cbbSanPhamCTHD_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        cbbSanPhamCTHD_HoaDon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSanPhamCTHD_HoaDonItemStateChanged(evt);
            }
        });

        lblMaHoaDon_HoaDon2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaHoaDon_HoaDon2.setText("Sản Phẩm*");

        btnXoa_CTHD.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_CTHD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_CTHD.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_CTHD.setText("Xóa");
        btnXoa_CTHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_CTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_CTHDActionPerformed(evt);
            }
        });

        btnResetCTHD_HoaDon.setBackground(new java.awt.Color(204, 204, 204));
        btnResetCTHD_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnResetCTHD_HoaDon.setText("Làm mới");
        btnResetCTHD_HoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResetCTHD_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCTHD_HoaDonActionPerformed(evt);
            }
        });

        btnThem_CTHD.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_CTHD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_CTHD.setText("Thêm");
        btnThem_CTHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_CTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_CTHDActionPerformed(evt);
            }
        });

        btnSua_CTHD.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_CTHD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_CTHD.setText("Sửa");
        btnSua_CTHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_CTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_CTHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaHoaDon_HoaDon2)
                    .addComponent(lblSoLuongCTHD_HoaDon))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbSanPhamCTHD_HoaDon, 0, 171, Short.MAX_VALUE)
                    .addComponent(txtSoLuongCTHD_HoaDon))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetCTHD_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHoaDon_HoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSanPhamCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuongCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_CTHD)))
                    .addComponent(btnThem_CTHD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa_CTHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetCTHD_HoaDon)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        lblTongTien_HoaDon2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTongTien_HoaDon2.setText("Tìm Kiếm Theo Mã");

        txtTimKiem_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem_HoaDonActionPerformed(evt);
            }
        });
        txtTimKiem_HoaDon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_HoaDonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelHoaDonLayout = new javax.swing.GroupLayout(jPanelHoaDon);
        jPanelHoaDon.setLayout(jPanelHoaDonLayout);
        jPanelHoaDonLayout.setHorizontalGroup(
            jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoaDonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHoaDonLayout.createSequentialGroup()
                        .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHoaDonLayout.createSequentialGroup()
                        .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTongTien_HoaDon2)
                            .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                                .addComponent(txtTimKiem_HoaDon, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelHoaDonLayout.setVerticalGroup(
            jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDonLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongTien_HoaDon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHoaDonLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDonLayout.createSequentialGroup()
                        .addComponent(txtTimKiem_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jTabbedPane3.addTab("PHIẾU BÁN HÀNG", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/HoaDon.png")), jPanelHoaDon, ""); // NOI18N

        jPaneSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPaneSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPaneSanPhamComponentShown(evt);
            }
        });

        jPanelLoaiSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLoaiSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelLoaiSanPhamComponentShown(evt);
            }
        });

        tbLoaiSanPham_LoaiSanPham.setBackground(new java.awt.Color(217, 217, 217));
        tbLoaiSanPham_LoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Mã Loại", "Tên Loại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoaiSanPham_LoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiSanPham_LoaiSanPhamMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbLoaiSanPham_LoaiSanPham);
        if (tbLoaiSanPham_LoaiSanPham.getColumnModel().getColumnCount() > 0) {
            tbLoaiSanPham_LoaiSanPham.getColumnModel().getColumn(0).setResizable(false);
            tbLoaiSanPham_LoaiSanPham.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("LOẠI HÀNG HOÁ");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblTenLoaiSanPham_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenLoaiSanPham_LoaiSanPham.setText("Tên Loại*");

        txtTenLoaiSanPham_LoaiSanPham.setBackground(new java.awt.Color(241, 241, 241));

        btnThem_LoaiSanPham.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_LoaiSanPham.setText("Thêm");
        btnThem_LoaiSanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_LoaiSanPhamActionPerformed(evt);
            }
        });

        btnXoa_LoaiSanPham.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_LoaiSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_LoaiSanPham.setText("Xóa");
        btnXoa_LoaiSanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_LoaiSanPhamActionPerformed(evt);
            }
        });

        btnSua_LoaiSanPham.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_LoaiSanPham.setText("Sửa");
        btnSua_LoaiSanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_LoaiSanPhamActionPerformed(evt);
            }
        });

        Reset_LoaiSanPham.setBackground(new java.awt.Color(204, 204, 204));
        Reset_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Reset_LoaiSanPham.setText("Làm mới");
        Reset_LoaiSanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset_LoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_LoaiSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_LoaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_LoaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnXoa_LoaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset_LoaiSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTenLoaiSanPham_LoaiSanPham))
                    .addComponent(btnThem_LoaiSanPham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua_LoaiSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa_LoaiSanPham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reset_LoaiSanPham)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLoaiSanPhamLayout = new javax.swing.GroupLayout(jPanelLoaiSanPham);
        jPanelLoaiSanPham.setLayout(jPanelLoaiSanPhamLayout);
        jPanelLoaiSanPhamLayout.setHorizontalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanelLoaiSanPhamLayout.setVerticalGroup(
            jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                .addGroup(jPanelLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel73)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoaiSanPhamLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jPaneSanPham.addTab("LOẠI HÀNG HOÁ", jPanelLoaiSanPham);

        jPanelSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSanPhamComponentShown(evt);
            }
        });

        tblSanPham.setBackground(new java.awt.Color(217, 217, 217));
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hàng Hóa", "Tên Hàng Hóa", "Loại Hàng Hóa", "Giá Bán", "Kích Thước", "Đơn Vị", "SL Tồn Kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.getTableHeader().setReorderingAllowed(false);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(0).setResizable(false);
            tblSanPham.getColumnModel().getColumn(1).setResizable(false);
            tblSanPham.getColumnModel().getColumn(2).setResizable(false);
            tblSanPham.getColumnModel().getColumn(3).setResizable(false);
            tblSanPham.getColumnModel().getColumn(4).setResizable(false);
            tblSanPham.getColumnModel().getColumn(5).setResizable(false);
            tblSanPham.getColumnModel().getColumn(6).setResizable(false);
            tblSanPham.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("HÀNG HÓA");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("Tìm Kiếm Theo Mã");

        txtTimKiem_SanPham.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_SanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_SanPhamKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTenSanPham_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenSanPham_SanPham.setText("Tên Hàng Hoá*");

        txtTenSanPham_SanPham.setBackground(new java.awt.Color(241, 241, 241));

        btnThem_SanPham.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_SanPham.setText("Thêm");
        btnThem_SanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SanPhamActionPerformed(evt);
            }
        });

        bntSua_SanPham.setBackground(new java.awt.Color(255, 217, 102));
        bntSua_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bntSua_SanPham.setText("Sửa");
        bntSua_SanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntSua_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_SanPhamActionPerformed(evt);
            }
        });

        cbbMaLoaiSanPham_SanPham.setBackground(new java.awt.Color(241, 241, 241));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Loại Hàng Hoá*");

        lblGiaNhap_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGiaNhap_SanPham.setText("Giá Bán*");

        txtGiaban_SanPham.setBackground(new java.awt.Color(241, 241, 241));

        btnXoa_SanPham.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_SanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_SanPham.setText("Xóa");
        btnXoa_SanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_SanPhamActionPerformed(evt);
            }
        });

        btnReset_SanPham.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_SanPham.setText("Làm mới");
        btnReset_SanPham.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_SanPhamActionPerformed(evt);
            }
        });

        txtKichThuoc_SanPham.setBackground(new java.awt.Color(241, 241, 241));

        lblGiaBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGiaBan.setText("Kích Thước*");

        lblNgayHetHan_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayHetHan_SanPham.setText("Đơn Vị*");

        txtDonVi_SanPham.setBackground(new java.awt.Color(241, 241, 241));

        lblNgayHetHan_SanPham1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayHetHan_SanPham1.setText("Ảnh*");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Tải lên");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNgayHetHan_SanPham1)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGiaBan)
                                    .addComponent(lblNgayHetHan_SanPham))
                                .addGap(31, 31, 31))
                            .addComponent(lblTenSanPham_SanPham)
                            .addComponent(lblGiaNhap_SanPham)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGiaban_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbMaLoaiSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtKichThuoc_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDonVi_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntSua_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTenSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbbMaLoaiSanPham_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(bntSua_SanPham))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGiaban_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGiaNhap_SanPham)
                                    .addComponent(btnXoa_SanPham))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKichThuoc_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGiaBan)
                                    .addComponent(btnReset_SanPham))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonVi_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayHetHan_SanPham)))
                    .addComponent(lblTenSanPham_SanPham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayHetHan_SanPham1)
                    .addComponent(jButton1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        lab_HinhAnh_HangHoa.setMaximumSize(new java.awt.Dimension(300, 300));
        lab_HinhAnh_HangHoa.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jPanelSanPhamLayout = new javax.swing.GroupLayout(jPanelSanPham);
        jPanelSanPham.setLayout(jPanelSanPhamLayout);
        jPanelSanPhamLayout.setHorizontalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiem_SanPham)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lab_HinhAnh_HangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelSanPhamLayout.setVerticalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel35)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab_HinhAnh_HangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPaneSanPham.addTab("HÀNG HOÁ", jPanelSanPham);

        jTabbedPane3.addTab("HÀNG HOÁ", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/SanPham.png")), jPaneSanPham); // NOI18N

        jPanel_KhachHang.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_KhachHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_KhachHangComponentShown(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("KHÁCH HÀNG");

        tblKhachHang_KhachHang.setBackground(new java.awt.Color(217, 217, 217));
        tblKhachHang_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Khách Hàng", "Tên Khách Hàng", "Số Điện Thoại", "Địa Chỉ", "Mã Số Thuế"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang_KhachHang.getTableHeader().setReorderingAllowed(false);
        tblKhachHang_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHang_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblKhachHang_KhachHang);
        if (tblKhachHang_KhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang_KhachHang.getColumnModel().getColumn(0).setResizable(false);
            tblKhachHang_KhachHang.getColumnModel().getColumn(1).setResizable(false);
            tblKhachHang_KhachHang.getColumnModel().getColumn(2).setResizable(false);
            tblKhachHang_KhachHang.getColumnModel().getColumn(3).setResizable(false);
            tblKhachHang_KhachHang.getColumnModel().getColumn(4).setResizable(false);
            tblKhachHang_KhachHang.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblTenKhachHang_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenKhachHang_KhachHang.setText("Tên Khách Hàng*");

        lblSoDienThoai_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoDienThoai_KhachHang.setText("Số Điện Thoại*");

        lblDiaChi_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi_KhachHang.setText("Địa Chỉ*");

        txtTenKhachHang_KhachHang.setBackground(new java.awt.Color(241, 241, 241));
        txtTenKhachHang_KhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKhachHang_KhachHangFocusLost(evt);
            }
        });
        txtTenKhachHang_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhachHang_KhachHangActionPerformed(evt);
            }
        });

        txtSoDienThoai_KhachHang.setBackground(new java.awt.Color(241, 241, 241));

        txtDiaChi_KhachHang.setBackground(new java.awt.Color(241, 241, 241));

        btnThem_KhachHang.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_KhachHang.setText("Thêm");
        btnThem_KhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_KhachHangActionPerformed(evt);
            }
        });

        btnXoa_KhachHang.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_KhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_KhachHang.setText("Xóa");
        btnXoa_KhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_KhachHangActionPerformed(evt);
            }
        });

        btnSua_KhachHang.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_KhachHang.setText("Sửa");
        btnSua_KhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_KhachHangActionPerformed(evt);
            }
        });

        btnReset_KhachHang.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_KhachHang.setText("Làm mới");
        btnReset_KhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_KhachHangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mã Số Thuế");

        txtMaSoThue_KhachHang.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenKhachHang_KhachHang)
                    .addComponent(lblSoDienThoai_KhachHang)
                    .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSoThue_KhachHang)
                    .addComponent(txtDiaChi_KhachHang)
                    .addComponent(txtSoDienThoai_KhachHang)
                    .addComponent(txtTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnXoa_KhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua_KhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem_KhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(txtTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtSoDienThoai_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtMaSoThue_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblTenKhachHang_KhachHang)
                            .addGap(18, 18, 18)
                            .addComponent(lblSoDienThoai_KhachHang)
                            .addGap(21, 21, 21)
                            .addComponent(lblDiaChi_KhachHang)
                            .addGap(15, 15, 15)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnThem_KhachHang)
                        .addGap(13, 13, 13)
                        .addComponent(btnSua_KhachHang)
                        .addGap(12, 12, 12)
                        .addComponent(btnXoa_KhachHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_KhachHang)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        txtTimKiem_KhachHang.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_KhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_KhachHangKeyReleased(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setText("Tìm Kiếm Theo Mã");

        javax.swing.GroupLayout jPanel_KhachHangLayout = new javax.swing.GroupLayout(jPanel_KhachHang);
        jPanel_KhachHang.setLayout(jPanel_KhachHangLayout);
        jPanel_KhachHangLayout.setHorizontalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1252, 1252, Short.MAX_VALUE))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiem_KhachHang)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel_KhachHangLayout.setVerticalGroup(
            jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addGroup(jPanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_KhachHangLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("KHÁCH HÀNG", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/KhachHang.png")), jPanel_KhachHang); // NOI18N

        jPanel_TaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_TaiKhoan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel_TaiKhoanComponentShown(evt);
            }
        });

        tblTaiKhoan.setBackground(new java.awt.Color(217, 217, 217));
        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Số TK Cấp 1", "Số TK Cấp 2", "Số TK Cấp 3", "Tên TK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTaiKhoan.getTableHeader().setReorderingAllowed(false);
        tblTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(tblTaiKhoan);

        txtTimKiem_TaiKhoan.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_TaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_TaiKhoanKeyReleased(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Tìm Kiếm");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("TÀI KHOẢN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtNumberAccountLv2_Lv2_Account.setBackground(new java.awt.Color(241, 241, 241));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Tên TK Cấp 2");

        txtNameAccountLv2_Lv2_Account.setBackground(new java.awt.Color(241, 241, 241));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Số TK Cấp 2");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Số TK Cấp 1");

        cbbNumberAccountLv1_Lv2_Account.setBackground(new java.awt.Color(241, 241, 241));

        btnAdd_Lv2_Account.setBackground(new java.awt.Color(112, 173, 71));
        btnAdd_Lv2_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAdd_Lv2_Account.setText("Thêm");
        btnAdd_Lv2_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd_Lv2_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Lv2_AccountActionPerformed(evt);
            }
        });

        btnEdit_Lv2_Account.setBackground(new java.awt.Color(255, 217, 102));
        btnEdit_Lv2_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit_Lv2_Account.setText("Sửa");
        btnEdit_Lv2_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit_Lv2_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_Lv2_AccountActionPerformed(evt);
            }
        });

        btnDelete_Lv2_Account.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete_Lv2_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDelete_Lv2_Account.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_Lv2_Account.setText("Xóa");
        btnDelete_Lv2_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete_Lv2_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Lv2_AccountActionPerformed(evt);
            }
        });

        btnReset_Lv2_Account.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_Lv2_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_Lv2_Account.setText("Làm mới");
        btnReset_Lv2_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_Lv2_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_Lv2_AccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumberAccountLv2_Lv2_Account)
                    .addComponent(txtNameAccountLv2_Lv2_Account)
                    .addComponent(cbbNumberAccountLv1_Lv2_Account, 0, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit_Lv2_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete_Lv2_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset_Lv2_Account, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnAdd_Lv2_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit_Lv2_Account))
                    .addComponent(btnAdd_Lv2_Account)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(cbbNumberAccountLv1_Lv2_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtNumberAccountLv2_Lv2_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtNameAccountLv2_Lv2_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete_Lv2_Account))))
                .addGap(18, 18, 18)
                .addComponent(btnReset_Lv2_Account)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Số TK Cấp 1");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Tên TK Cấp 1");

        txtNumberAccountLv1_Lv1_Account.setBackground(new java.awt.Color(241, 241, 241));
        txtNumberAccountLv1_Lv1_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberAccountLv1_Lv1_AccountActionPerformed(evt);
            }
        });

        txtNameAccountLv1_Lv1_Account.setBackground(new java.awt.Color(241, 241, 241));

        btnAdd_Lv1_Account.setBackground(new java.awt.Color(112, 173, 71));
        btnAdd_Lv1_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAdd_Lv1_Account.setText("Thêm");
        btnAdd_Lv1_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd_Lv1_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Lv1_AccountActionPerformed(evt);
            }
        });

        btnEdit_Lv1_Account.setBackground(new java.awt.Color(255, 217, 102));
        btnEdit_Lv1_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit_Lv1_Account.setText("Sửa");
        btnEdit_Lv1_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit_Lv1_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_Lv1_AccountActionPerformed(evt);
            }
        });

        btnDelete_Lv1_Account.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete_Lv1_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDelete_Lv1_Account.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_Lv1_Account.setText("Xóa");
        btnDelete_Lv1_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete_Lv1_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Lv1_AccountActionPerformed(evt);
            }
        });

        btnReset_Lv1_Account.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_Lv1_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_Lv1_Account.setText("Làm mới");
        btnReset_Lv1_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_Lv1_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_Lv1_AccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumberAccountLv1_Lv1_Account)
                    .addComponent(txtNameAccountLv1_Lv1_Account, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit_Lv1_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete_Lv1_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset_Lv1_Account, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnAdd_Lv1_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit_Lv1_Account))
                    .addComponent(btnAdd_Lv1_Account)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtNumberAccountLv1_Lv1_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtNameAccountLv1_Lv1_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnDelete_Lv1_Account)
                .addGap(18, 18, 18)
                .addComponent(btnReset_Lv1_Account)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Số TK Cấp 2");

        txtNameAccountLv3_Lv3_Account.setBackground(new java.awt.Color(241, 241, 241));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Số TK Cấp 3");

        cbbNumberAccountLv2_Lv3_Account.setBackground(new java.awt.Color(241, 241, 241));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Tên TK Cấp 3");

        txtNumberAccountLv3_Lv3_Account.setBackground(new java.awt.Color(241, 241, 241));

        btnAdd_Lv3_Account.setBackground(new java.awt.Color(112, 173, 71));
        btnAdd_Lv3_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAdd_Lv3_Account.setText("Thêm");
        btnAdd_Lv3_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd_Lv3_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Lv3_AccountActionPerformed(evt);
            }
        });

        btnEdit_Lv3_Account.setBackground(new java.awt.Color(255, 217, 102));
        btnEdit_Lv3_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit_Lv3_Account.setText("Sửa");
        btnEdit_Lv3_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit_Lv3_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_Lv3_AccountActionPerformed(evt);
            }
        });

        btnDelete_Lv3_Account.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete_Lv3_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDelete_Lv3_Account.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_Lv3_Account.setText("Xóa");
        btnDelete_Lv3_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete_Lv3_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Lv3_AccountActionPerformed(evt);
            }
        });

        btnReset_Lv3_Account.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_Lv3_Account.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_Lv3_Account.setText("Làm mới");
        btnReset_Lv3_Account.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_Lv3_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_Lv3_AccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(jLabel22))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumberAccountLv3_Lv3_Account)
                    .addComponent(txtNameAccountLv3_Lv3_Account)
                    .addComponent(cbbNumberAccountLv2_Lv3_Account, 0, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit_Lv3_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete_Lv3_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset_Lv3_Account, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(btnAdd_Lv3_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnEdit_Lv3_Account))
                    .addComponent(btnAdd_Lv3_Account)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnDelete_Lv3_Account))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cbbNumberAccountLv2_Lv3_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtNumberAccountLv3_Lv3_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtNameAccountLv3_Lv3_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnReset_Lv3_Account)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_TaiKhoanLayout = new javax.swing.GroupLayout(jPanel_TaiKhoan);
        jPanel_TaiKhoan.setLayout(jPanel_TaiKhoanLayout);
        jPanel_TaiKhoanLayout.setHorizontalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane20)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem_TaiKhoan))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel_TaiKhoanLayout.setVerticalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("TÀI KHOẢN", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/user.png")), jPanel_TaiKhoan); // NOI18N

        jTabbedPaneNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPaneNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPaneNhanVienComponentShown(evt);
            }
        });

        jPanelNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNhanVien.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelNhanVienComponentShown(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("NHÂN VIÊN");

        tblNhanVien_NhanVien.setBackground(new java.awt.Color(217, 217, 217));
        tblNhanVien_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Tên ĐN", "Mật Khẩu", "Vai Trò", "Tên", "SĐT", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien_NhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVien_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblNhanVien_NhanVien);
        if (tblNhanVien_NhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien_NhanVien.getColumnModel().getColumn(0).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(1).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(2).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(3).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(4).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(5).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(6).setResizable(false);
            tblNhanVien_NhanVien.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lblTenNhanVien_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenNhanVien_NhanVien.setText("Tên Đăng Nhập*");

        lblSDT_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSDT_NhanVien.setText("Mật Khẩu*");

        txtTenDN_NhanVien.setBackground(new java.awt.Color(241, 241, 241));
        txtTenDN_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDN_NhanVienActionPerformed(evt);
            }
        });

        txtMK_NhanVien.setBackground(new java.awt.Color(241, 241, 241));

        btnThem_NhanVien.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_NhanVien.setText("Thêm");
        btnThem_NhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_NhanVienActionPerformed(evt);
            }
        });

        btnXoa_NhanVien.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_NhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_NhanVien.setText("Xóa");
        btnXoa_NhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_NhanVienActionPerformed(evt);
            }
        });

        btnSua_NhanVien.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_NhanVien.setText("Sửa");
        btnSua_NhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_NhanVienActionPerformed(evt);
            }
        });

        btnReset_NhanVien.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_NhanVien.setText("Làm mới");
        btnReset_NhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_NhanVienActionPerformed(evt);
            }
        });

        cbQuyen_NhanVien.setBackground(new java.awt.Color(241, 241, 241));
        cbQuyen_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQuyen_NhanVienActionPerformed(evt);
            }
        });

        lblTaiKhoan_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTaiKhoan_NhanVien.setText("Vai Trò*");

        lblTaiKhoan_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTaiKhoan_NhanVien1.setText("Địa Chỉ*");

        lblSDT_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSDT_NhanVien1.setText("Số Điện Thoại*");

        lblTenNhanVien_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenNhanVien_NhanVien1.setText("Tên Nhân Viên*");

        txtTen_NhanVien.setBackground(new java.awt.Color(241, 241, 241));
        txtTen_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTen_NhanVienActionPerformed(evt);
            }
        });

        txtSDT_NhanVien.setBackground(new java.awt.Color(241, 241, 241));

        txtDiaChi_NhanVien.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSDT_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaiKhoan_NhanVien1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtDiaChi_NhanVien)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblTenNhanVien_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTaiKhoan_NhanVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMK_NhanVien)
                                    .addComponent(cbQuyen_NhanVien, 0, 172, Short.MAX_VALUE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblTenNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenDN_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNhanVien_NhanVien)
                            .addComponent(txtTenDN_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT_NhanVien)
                            .addComponent(txtMK_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaiKhoan_NhanVien)
                            .addComponent(cbQuyen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNhanVien_NhanVien1)
                            .addComponent(txtTen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnSua_NhanVien)
                        .addGap(13, 13, 13)
                        .addComponent(btnXoa_NhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_NhanVien))
                    .addComponent(btnThem_NhanVien))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT_NhanVien1)
                    .addComponent(txtSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaiKhoan_NhanVien1)
                    .addComponent(txtDiaChi_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        txtTimKiem_NhanVien.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_NhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_NhanVienKeyReleased(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setText("Tìm Kiếm Theo Mã");

        javax.swing.GroupLayout jPanelNhanVienLayout = new javax.swing.GroupLayout(jPanelNhanVien);
        jPanelNhanVien.setLayout(jPanelNhanVienLayout);
        jPanelNhanVienLayout.setHorizontalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTimKiem_NhanVien)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelNhanVienLayout.setVerticalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPaneNhanVien.addTab("NHÂN VIÊN", jPanelNhanVien);

        jTabbedPane3.addTab("NHÂN VIÊN", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/employee.png")), jTabbedPaneNhanVien); // NOI18N

        jTabbedPanelThuChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPanelThuChi.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPanelThuChiComponentShown(evt);
            }
        });

        jPanelPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhieuNhap.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelPhieuNhapComponentShown(evt);
            }
        });

        tblPhieuThu.setBackground(new java.awt.Color(217, 217, 217));
        tblPhieuThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PT", "Nhân Viên", "Khách Hàng", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Trạng Thái", "Lý Do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuThu.getTableHeader().setReorderingAllowed(false);
        tblPhieuThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuThuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPhieuThuMouseEntered(evt);
            }
        });
        jScrollPane10.setViewportView(tblPhieuThu);
        if (tblPhieuThu.getColumnModel().getColumnCount() > 0) {
            tblPhieuThu.getColumnModel().getColumn(0).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(1).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(2).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(3).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(4).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(5).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(6).setResizable(false);
            tblPhieuThu.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PHIẾU THU");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Nhân Viên*");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Quyển*");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        txtQuyen_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Khách Hàng*");

        cbbKhachHang_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));
        cbbKhachHang_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhachHang_PhieuThuActionPerformed(evt);
            }
        });

        cbbNhanVien_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Mã TKC*");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Mã TKN*");

        lblTongTien_HoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon1.setText("Tổng Tiền*");

        txtTongTien_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTien_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_PhieuNhapActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Lý Do*");

        txtLyDo_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));
        txtLyDo_PhieuThu.setColumns(20);
        txtLyDo_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLyDo_PhieuThu.setRows(5);
        jScrollPane12.setViewportView(txtLyDo_PhieuThu);

        btnThem_PhieuThu.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_PhieuThu.setText("Tạo mới");
        btnThem_PhieuThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhieuThuActionPerformed(evt);
            }
        });

        btnXoa_PhieuThu.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_PhieuThu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_PhieuThu.setText("Xóa");
        btnXoa_PhieuThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhieuThuActionPerformed(evt);
            }
        });

        btnReset_PhieuThu.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_PhieuThu.setText("Làm mới");
        btnReset_PhieuThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_PhieuThuActionPerformed(evt);
            }
        });

        btnSua_PhieuThu.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_PhieuThu.setText("Sửa");
        btnSua_PhieuThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhieuThuActionPerformed(evt);
            }
        });

        cbbMaTKN_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));

        cbbMaTKC_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cbbNhanVien_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTongTien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtQuyen_PhieuThu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cbbMaTKN_PhieuThu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbMaTKC_PhieuThu, javax.swing.GroupLayout.Alignment.LEADING, 0, 185, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa_PhieuThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem_PhieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset_PhieuThu, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnSua_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuyen_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNhanVien_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btnSua_PhieuThu)
                            .addComponent(cbbMaTKC_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnThem_PhieuThu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbbMaTKN_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnXoa_PhieuThu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_PhieuThu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTimKiem_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_PhieuThu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_PhieuThuKeyReleased(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Tìm Kiếm Theo Mã");

        btnXuatPhieuThu_PhieuThu.setBackground(new java.awt.Color(112, 173, 71));
        btnXuatPhieuThu_PhieuThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatPhieuThu_PhieuThu.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatPhieuThu_PhieuThu.setText("XUẤT PHIẾU");
        btnXuatPhieuThu_PhieuThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatPhieuThu_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPhieuThu_PhieuThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPhieuNhapLayout = new javax.swing.GroupLayout(jPanelPhieuNhap);
        jPanelPhieuNhap.setLayout(jPanelPhieuNhapLayout);
        jPanelPhieuNhapLayout.setHorizontalGroup(
            jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatPhieuThu_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
                    .addComponent(txtTimKiem_PhieuThu))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelPhieuNhapLayout.setVerticalGroup(
            jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatPhieuThu_PhieuThu)))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPanelThuChi.addTab("PHIẾU THU", jPanelPhieuNhap);

        jPanelPhieuChi.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhieuChi.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelPhieuChiComponentShown(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PHIẾU CHI");

        tblPhieuChi.setBackground(new java.awt.Color(217, 217, 217));
        tblPhieuChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã PC", "Nhân Viên", "Mã TKN", "Mã TKC", "Tổng Tiền", "Ngày Tạo", "Quyển", "Trạng Thái", "Lý Do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuChi.getTableHeader().setReorderingAllowed(false);
        tblPhieuChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuChiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblPhieuChiMouseEntered(evt);
            }
        });
        jScrollPane11.setViewportView(tblPhieuChi);
        if (tblPhieuChi.getColumnModel().getColumnCount() > 0) {
            tblPhieuChi.getColumnModel().getColumn(0).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(1).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(2).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(3).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(4).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(5).setResizable(false);
            tblPhieuChi.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Nhân Viên*");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Quyển*");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        txtQuyen_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));

        cbbNhanVien_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mã TKC*");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Mã TKN*");

        lblTongTien_HoaDon4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon4.setText("Tổng Tiền*");

        txtTongTien_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTien_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_PhieuChiActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Lý Do*");

        txtLyDo_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        txtLyDo_PhieuChi.setColumns(20);
        txtLyDo_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLyDo_PhieuChi.setRows(5);
        jScrollPane13.setViewportView(txtLyDo_PhieuChi);

        btnThem_PhieuChi.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_PhieuChi.setText("Tạo mới");
        btnThem_PhieuChi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhieuChiActionPerformed(evt);
            }
        });

        btnXoa_PhieuChi.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_PhieuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_PhieuChi.setText("Xóa");
        btnXoa_PhieuChi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhieuChiActionPerformed(evt);
            }
        });

        btnReset_PhieuChi.setBackground(new java.awt.Color(204, 204, 204));
        btnReset_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset_PhieuChi.setText("Làm mới");
        btnReset_PhieuChi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_PhieuChiActionPerformed(evt);
            }
        });

        btnSua_PhieuChi.setBackground(new java.awt.Color(255, 217, 102));
        btnSua_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua_PhieuChi.setText("Sửa");
        btnSua_PhieuChi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhieuChiActionPerformed(evt);
            }
        });

        cbbMaTKC_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));

        cbbMaTKN_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));

        btnXuatPhieuChi_PhieuChi.setBackground(new java.awt.Color(112, 173, 71));
        btnXuatPhieuChi_PhieuChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatPhieuChi_PhieuChi.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatPhieuChi_PhieuChi.setText("XUẤT PHIẾU");
        btnXuatPhieuChi_PhieuChi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatPhieuChi_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPhieuChi_PhieuChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongTien_HoaDon4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNhanVien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel27))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaTKN_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuyen_PhieuChi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbMaTKC_PhieuChi, javax.swing.GroupLayout.Alignment.TRAILING, 0, 181, Short.MAX_VALUE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua_PhieuChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_PhieuChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_PhieuChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXuatPhieuChi_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuyen_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNhanVien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem_PhieuChi)
                        .addComponent(btnXuatPhieuChi_PhieuChi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(btnSua_PhieuChi)
                    .addComponent(cbbMaTKC_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongTien_HoaDon4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnXoa_PhieuChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_PhieuChi))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbbMaTKN_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Tìm Kiếm Theo Mã");

        txtTimKiem_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_PhieuChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_PhieuChiKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelPhieuChiLayout = new javax.swing.GroupLayout(jPanelPhieuChi);
        jPanelPhieuChi.setLayout(jPanelPhieuChiLayout);
        jPanelPhieuChiLayout.setHorizontalGroup(
            jPanelPhieuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuChiLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelPhieuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
                    .addComponent(txtTimKiem_PhieuChi))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelPhieuChiLayout.setVerticalGroup(
            jPanelPhieuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuChiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPanelThuChi.addTab("PHIẾU CHI", jPanelPhieuChi);

        jTabbedPane3.addTab("THU/CHI", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/NhaCungCap.png")), jTabbedPanelThuChi); // NOI18N

        jPanelSDDK.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSDDK.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSDDKComponentShown(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SỐ DƯ ĐẦU KỲ");

        tblSDDK.setBackground(new java.awt.Color(217, 217, 217));
        tblSDDK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày Đầu Kỳ", "Mã Tiết Khoản", "Số Tiền", "Trạng Thái"
            }
        ));
        tblSDDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSDDKMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSDDK);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Ngày Đầu Kỳ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Mã Tiết Khoản");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Số Tiền");

        btnThem_SDDK.setBackground(new java.awt.Color(112, 173, 71));
        btnThem_SDDK.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem_SDDK.setText("Thêm");
        btnThem_SDDK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem_SDDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SDDKActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 217, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Xoá");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton4.setText("Làm mới");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Trạng Thái");

        cbbStatus_SDDK.setBackground(new java.awt.Color(241, 241, 241));

        txtPrice_SDDK.setBackground(new java.awt.Color(241, 241, 241));

        cbbMaTietKhoan_SDDK.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbMaTietKhoan_SDDK, 0, 171, Short.MAX_VALUE)
                            .addComponent(txtfirstDateOfPeriod_SDDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice_SDDK)
                            .addComponent(cbbStatus_SDDK, 0, 171, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem_SDDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnThem_SDDK))
                    .addComponent(txtfirstDateOfPeriod_SDDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton2)
                    .addComponent(cbbMaTietKhoan_SDDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPrice_SDDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbbStatus_SDDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSDDKLayout = new javax.swing.GroupLayout(jPanelSDDK);
        jPanelSDDK.setLayout(jPanelSDDKLayout);
        jPanelSDDKLayout.setHorizontalGroup(
            jPanelSDDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSDDKLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelSDDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanelSDDKLayout.setVerticalGroup(
            jPanelSDDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSDDKLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSDDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSDDKLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanelSDDKLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("SỐ DƯ ĐẦU KỲ", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/DoanhThu.png")), jPanelSDDK); // NOI18N

        jPanelChungTu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelChungTu.setToolTipText("");
        jPanelChungTu.setEnabled(false);
        jPanelChungTu.setFocusCycleRoot(true);
        jPanelChungTu.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanelChungTu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelChungTuComponentShown(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BÁO CÁO DOANH THU");

        tblChungTu.setBackground(new java.awt.Color(217, 217, 217));
        tblChungTu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Số CT", "Khách Hàng", "Nhân Viên Lập", "Ngày Lập", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChungTu.getTableHeader().setReorderingAllowed(false);
        tblChungTu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChungTuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblChungTu);
        if (tblChungTu.getColumnModel().getColumnCount() > 0) {
            tblChungTu.getColumnModel().getColumn(0).setResizable(false);
            tblChungTu.getColumnModel().getColumn(1).setResizable(false);
            tblChungTu.getColumnModel().getColumn(2).setResizable(false);
            tblChungTu.getColumnModel().getColumn(3).setResizable(false);
            tblChungTu.getColumnModel().getColumn(4).setResizable(false);
            tblChungTu.getColumnModel().getColumn(5).setResizable(false);
            tblChungTu.getColumnModel().getColumn(6).setResizable(false);
        }

        lblTongTien_HoaDon7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTongTien_HoaDon7.setText("Tìm Kiếm Theo Mã");

        txtTimKiem_ChungTu.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_ChungTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem_ChungTuActionPerformed(evt);
            }
        });
        txtTimKiem_ChungTu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_ChungTuKeyReleased(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(112, 173, 71));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("XUẤT BÁO CÁO");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        lblTSHDBR5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTSHDBR5.setText("THỐNG KÊ");
        lblTSHDBR5.setName(""); // NOI18N

        lblTSHDBR6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTSHDBR6.setText("Từ");
        lblTSHDBR6.setName(""); // NOI18N

        lblTSHDBR7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTSHDBR7.setText("Đến");
        lblTSHDBR7.setName(""); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel31.setText("Số CT");

        txtMaCT_CT.setEditable(false);
        txtMaCT_CT.setBackground(new java.awt.Color(241, 241, 241));

        btnXoa_DoanhThu.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_DoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_DoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_DoanhThu.setText("Xoá");
        btnXoa_DoanhThu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_DoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoa_DoanhThuMouseClicked(evt);
            }
        });
        btnXoa_DoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_DoanhThuActionPerformed(evt);
            }
        });

        fromDateFilter_Document.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fromDateFilter_DocumentInputMethodTextChanged(evt);
            }
        });
        fromDateFilter_Document.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fromDateFilter_DocumentPropertyChange(evt);
            }
        });

        toDateFilter_Document.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                toDateFilter_DocumentPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanelChungTuLayout = new javax.swing.GroupLayout(jPanelChungTu);
        jPanelChungTu.setLayout(jPanelChungTuLayout);
        jPanelChungTuLayout.setHorizontalGroup(
            jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChungTuLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChungTuLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaCT_CT, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_DoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTSHDBR5)
                    .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelChungTuLayout.createSequentialGroup()
                            .addComponent(lblTSHDBR6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(fromDateFilter_Document, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(lblTSHDBR7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toDateFilter_Document, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTongTien_HoaDon7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
                        .addComponent(txtTimKiem_ChungTu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        jPanelChungTuLayout.setVerticalGroup(
            jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChungTuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(lblTSHDBR5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTSHDBR6)
                        .addComponent(lblTSHDBR7)
                        .addComponent(jButton7))
                    .addComponent(fromDateFilter_Document, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateFilter_Document, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(lblTongTien_HoaDon7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_ChungTu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtMaCT_CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_DoanhThu))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("BÁO CÁO", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/HoaDon.png")), jPanelChungTu, ""); // NOI18N

        jPanelButToan.setBackground(new java.awt.Color(255, 255, 255));
        jPanelButToan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelButToanComponentShown(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("BÚT TOÁN");

        tbButToan.setBackground(new java.awt.Color(217, 217, 217));
        tbButToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã BT", "Ngày CT", "Số CT", "Diễn Giải", "TK Nợ", "TK Có", "Số Tiền"
            }
        ));
        tbButToan.getTableHeader().setReorderingAllowed(false);
        tbButToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbButToanMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(tbButToan);

        lblTSHDBR4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTSHDBR4.setText("Tìm kiếm theo Mã");
        lblTSHDBR4.setName(""); // NOI18N

        txtTimKiem_ButToan.setBackground(new java.awt.Color(241, 241, 241));
        txtTimKiem_ButToan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiem_ButToanKeyReleased(evt);
            }
        });

        cbbTypeFilter_ButToan.setBackground(new java.awt.Color(241, 241, 241));
        cbbTypeFilter_ButToan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTypeFilter_ButToanItemStateChanged(evt);
            }
        });
        cbbTypeFilter_ButToan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbbTypeFilter_ButToanPropertyChange(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Lọc theo");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setText("Mã BT");

        txtMaButToan_ButToan.setEditable(false);
        txtMaButToan_ButToan.setBackground(new java.awt.Color(241, 241, 241));

        btnXoa_ButToan.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa_ButToan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa_ButToan.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa_ButToan.setText("Xoá");
        btnXoa_ButToan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa_ButToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_ButToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButToanLayout = new javax.swing.GroupLayout(jPanelButToan);
        jPanelButToan.setLayout(jPanelButToanLayout);
        jPanelButToanLayout.setHorizontalGroup(
            jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButToanLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelButToanLayout.createSequentialGroup()
                                .addComponent(lblTSHDBR4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTimKiem_ButToan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbTypeFilter_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaButToan_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
        );
        jPanelButToanLayout.setVerticalGroup(
            jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButToanLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel75)
                .addGap(86, 86, 86)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSHDBR4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTypeFilter_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMaButToan_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_ButToan))
                .addGap(62, 62, 62))
        );

        jTabbedPane3.addTab("BÚT TOÁN", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/user.png")), jPanelButToan); // NOI18N

        jPanelLogout.setBackground(new java.awt.Color(204, 204, 204));
        jPanelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLogoutMouseClicked(evt);
            }
        });
        jPanelLogout.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelLogoutComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogoutLayout = new javax.swing.GroupLayout(jPanelLogout);
        jPanelLogout.setLayout(jPanelLogoutLayout);
        jPanelLogoutLayout.setHorizontalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1399, Short.MAX_VALUE)
        );
        jPanelLogoutLayout.setVerticalGroup(
            jPanelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("ĐĂNG XUẤT", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/DangXuat.png")), jPanelLogout); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.getAccessibleContext().setAccessibleName("Hóa Đơn");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void disableTabs(String role) {
        
        if(role.equals(ACCOUNTANT)){
            
            for(int i = 0; i<= 8; i++){
                if(i == 3 || i == 5 || i == 6 || i == 7 || i == 8){
                    this.jTabbedPane3.setEnabledAt(i,true);
                } else {
                    ElementUtils.disableAllButtons(jPanelHoaDon);
                    ElementUtils.disableAllButtons(jPaneSanPham);
                    ElementUtils.disableAllButtons(jPanel_KhachHang);
                    ElementUtils.disableAllButtons(jPanelNhanVien);
                }
            }
        } else if (role.equals(SALER)){
            for(int i = 0; i<= 8; i++){
                if(i == 0 || i == 1 || i == 2){
                    this.jTabbedPane3.setEnabledAt(i,true);
                } else {
                    this.jTabbedPane3.setEnabledAt(i,false);
                }
            }
        }
    }
    private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPhamActionPerformed
        
        if(ElementUtils.isValidated(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham)){
            
            Integer id = ElementUtils.getId(tblSanPham);
            ProductDTO productDTO = ProductRepository.findById(id);
            productDTO.setName(this.txtTenSanPham_SanPham.getText());
            productDTO.setCategoryId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaLoaiSanPham_SanPham).toString()));
            productDTO.setSize(this.txtKichThuoc_SanPham.getText());
            productDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtGiaban_SanPham.getText()));
            productDTO.setUnit(txtDonVi_SanPham.getText());
            if(HelperObject.getPathImageUploader() != null){
                productDTO.setImage(HelperObject.getPathImageUploader());
            }
            
            ProductRepository.update(productDTO);
            
            HelperObject.resetImageUploader();
            
            ProductService.getTables(this.tblSanPham, "");
            this.resetFormProduct();
        }
    }//GEN-LAST:event_bntSua_SanPhamActionPerformed

    private void txtTenKhachHang_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHang_KhachHangActionPerformed

    private void txtTongTien_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_PhieuNhapActionPerformed

    private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPhamActionPerformed
        
        Integer id = ElementUtils.getId(this.tblSanPham);
        
        this.confirmAndExecute(() -> {
            
            ProductRepository.delete(id);

            ProductService.getTables(this.tblSanPham, "");
            this.resetFormProduct();
        });
    }//GEN-LAST:event_btnXoa_SanPhamActionPerformed

    private void btnReset_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SanPhamActionPerformed
        this.resetFormProduct();
    }//GEN-LAST:event_btnReset_SanPhamActionPerformed

    private void resetFormProduct(){
        ElementUtils.resetForm(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham, lab_HinhAnh_HangHoa);
    }
    
    private void handleAddOrderDetail(Integer orderId, Integer productId, Integer quantity){
        OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);
            if(orderDetailDTO == null){
                orderDetailDTO = new OrderDetailDTO();
                orderDetailDTO.setOrderId(orderId);
                orderDetailDTO.setProductId(productId);
                orderDetailDTO.setQuantity(quantity);
                OrderDetailRepository.insert(orderDetailDTO);
                
                orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);
            } else {
                orderDetailDTO.setQuantity(orderDetailDTO.getQuantity() + quantity);
                OrderDetailRepository.update(orderDetailDTO);
            }
            
            this.handleOrderItemCurrent();
            
            OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , PriceUtils.convertToVND(OrderRepository.findById(orderId).getTotalMoney()));
    }
    
    private void jPanelPhieuChiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelPhieuChiComponentShown

        AccountService.setComboBoxListLevel3(cbbMaTKN_PhieuChi);
                
        AccountService.setComboBoxListLevel3(cbbMaTKC_PhieuChi);
        
        PaymentService.getTables(this.tblPhieuChi, "");
        
         EmployeeService.setComboBoxList(cbbNhanVien_PhieuChi);

        this.resetFormPayment();
    }//GEN-LAST:event_jPanelPhieuChiComponentShown

    private void resetFormPayment(){
        ElementUtils.resetForm(
                cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi,
                txtLyDo_PhieuChi);
        
        btnThem_PhieuChi.setEnabled(true);
        btnXuatPhieuChi_PhieuChi.setEnabled(false);
    }
    
    private void jPanelDangXuatComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelDangXuatComponentShown

    }//GEN-LAST:event_jPanelDangXuatComponentShown

    private void jPanelSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSanPhamComponentShown
        ProductService.getTables(tblSanPham, "");

        CategoryService.setComboBoxList(cbbMaLoaiSanPham_SanPham);
        
        this.resetFormProduct();
    }//GEN-LAST:event_jPanelSanPhamComponentShown

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

        Integer id = ElementUtils.getId(tblSanPham);
        
        ProductService.fillDetailToForm(id,
                                        this.txtTenSanPham_SanPham,
                                        this.cbbMaLoaiSanPham_SanPham,
                                        txtGiaban_SanPham,
                                        txtKichThuoc_SanPham,
                                        txtDonVi_SanPham,
                                        lab_HinhAnh_HangHoa);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPhamActionPerformed
        
        if(ElementUtils.isValidated(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham)){
            
            ProductDTO productDTO = new ProductDTO();
            productDTO.setName(this.txtTenSanPham_SanPham.getText());
            productDTO.setCategoryId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaLoaiSanPham_SanPham).toString()));
            productDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtGiaban_SanPham.getText()));
            productDTO.setSize(this.txtKichThuoc_SanPham.getText());
            productDTO.setUnit(txtDonVi_SanPham.getText());
            productDTO.setImage(HelperObject.getPathImageUploader());
            
            ProductRepository.insert(productDTO);
            
            HelperObject.resetImageUploader();
            
            ProductService.getTables(this.tblSanPham, "");
            this.resetFormProduct();
        }
    }//GEN-LAST:event_btnThem_SanPhamActionPerformed

    private void btnXoa_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuThuActionPerformed
        
        Integer id = ElementUtils.getId(this.tblPhieuThu);
        
        this.confirmAndExecute(() -> {
            
                ReceiptDTO receiptDTO = ReceiptRepository.findById(id);
                
                Integer documentId = receiptDTO.getDocumentId();
                
                ReceiptRepository.delete(id);
                
                DocumentRepository.delete(documentId);

                ReceiptService.getTables(tblPhieuThu, "");
                this.resetFormReceipt();
            });
    }//GEN-LAST:event_btnXoa_PhieuThuActionPerformed

    private void jPanel_KhachHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_KhachHangComponentShown
        CustomerService.getTables(tblKhachHang_KhachHang, "");

        this.resetFormCustomer();
    }//GEN-LAST:event_jPanel_KhachHangComponentShown

    private void resetFormCustomer(){
        ElementUtils.resetForm(txtTenKhachHang_KhachHang, 
                this.txtSoDienThoai_KhachHang, txtDiaChi_KhachHang, txtMaSoThue_KhachHang);
        
        if(SecurityUtils.isAdmin() || SecurityUtils.isSaler()){
            btnThem_KhachHang.setEnabled(true);
        }
    }
    
    private void jPanelLoaiSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentShown
        this.reloadDataCategory();
    }//GEN-LAST:event_jPanelLoaiSanPhamComponentShown

    private void tblKhachHang_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_KhachHangMouseClicked
        Integer id = ElementUtils.getId(tblKhachHang_KhachHang);
        
        CustomerService.fillDetailToForm(id,
                                        txtTenKhachHang_KhachHang,
                                        txtSoDienThoai_KhachHang,
                                        txtDiaChi_KhachHang,
                                        txtMaSoThue_KhachHang);
        
        btnThem_KhachHang.setEnabled(false);
    }//GEN-LAST:event_tblKhachHang_KhachHangMouseClicked

    private void btnThem_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KhachHangActionPerformed

        if(ElementUtils.isValidated(txtTenKhachHang_KhachHang, 
                txtSoDienThoai_KhachHang, txtDiaChi_KhachHang)){
            
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setName(txtTenKhachHang_KhachHang.getText());
            customerDTO.setPhone(txtSoDienThoai_KhachHang.getText());
            customerDTO.setAddress(txtDiaChi_KhachHang.getText());
            customerDTO.setTaxCode(txtMaSoThue_KhachHang.getText());
            
            CustomerRepository.insert(customerDTO);
            
            CustomerService.getTables(this.tblKhachHang_KhachHang, "");
            this.resetFormCustomer();
        }        
    }//GEN-LAST:event_btnThem_KhachHangActionPerformed

    private void btnSua_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_KhachHangActionPerformed
        
        if(ElementUtils.isValidated(txtTenKhachHang_KhachHang, 
                txtSoDienThoai_KhachHang, txtDiaChi_KhachHang)){
            
            Integer id = ElementUtils.getId(tblKhachHang_KhachHang);
            CustomerDTO customerDTO = CustomerRepository.findById(id);
            customerDTO.setName(this.txtTenKhachHang_KhachHang.getText());
            customerDTO.setPhone(this.txtSoDienThoai_KhachHang.getText());
            customerDTO.setAddress(txtDiaChi_KhachHang.getText());
            customerDTO.setTaxCode(this.txtMaSoThue_KhachHang.getText());
            
            CustomerRepository.update(customerDTO);
            
            CustomerService.getTables(this.tblKhachHang_KhachHang, "");
            this.resetFormCustomer();
        }
    }//GEN-LAST:event_btnSua_KhachHangActionPerformed

    private void btnReset_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_KhachHangActionPerformed
        this.resetFormCustomer();
    }//GEN-LAST:event_btnReset_KhachHangActionPerformed

    private void tbLoaiSanPham_LoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiSanPham_LoaiSanPhamMouseClicked
        this.handleCategoryItemCurrent();
    }//GEN-LAST:event_tbLoaiSanPham_LoaiSanPhamMouseClicked

    private void handleCategoryItemCurrent(){
        
        Integer id = ElementUtils.getId(tbLoaiSanPham_LoaiSanPham);
        
        CategoryService.fillDetailToForm(id,
                                        this.txtTenLoaiSanPham_LoaiSanPham);
        
        btnThem_LoaiSanPham.setEnabled(false);
    }
    
    private void btnSua_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_LoaiSanPhamActionPerformed

        if(ElementUtils.isValidated(this.txtTenLoaiSanPham_LoaiSanPham)){
            
            CategoryDTO categoryDTO = CategoryRepository.findById(ElementUtils.getId(this.tbLoaiSanPham_LoaiSanPham));
            
            if(!categoryDTO.getName().equals(txtTenLoaiSanPham_LoaiSanPham.getText()) 
                    && CategoryRepository.existCategoryName(txtTenLoaiSanPham_LoaiSanPham.getText())){
                AlertUtils.showAlertCategoryNameExsit();
                return;
            }
            
            categoryDTO.setName(this.txtTenLoaiSanPham_LoaiSanPham.getText());
            
            CategoryRepository.update(categoryDTO);
            
            CategoryService.getTables(this.tbLoaiSanPham_LoaiSanPham);
            this.resetFormCategory();
        }
    }//GEN-LAST:event_btnSua_LoaiSanPhamActionPerformed

    private void btnThem_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_LoaiSanPhamActionPerformed
        
        if(ElementUtils.isValidated(this.txtTenLoaiSanPham_LoaiSanPham)){
            
            if(CategoryRepository.existCategoryName(txtTenLoaiSanPham_LoaiSanPham.getText())){
                AlertUtils.showAlertCategoryNameExsit();
                return;
            }
            
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setName(this.txtTenLoaiSanPham_LoaiSanPham.getText());
            
            CategoryRepository.insert(categoryDTO);
            
            CategoryService.getTables(this.tbLoaiSanPham_LoaiSanPham);
            this.resetFormCategory();
        }
    }//GEN-LAST:event_btnThem_LoaiSanPhamActionPerformed

    private void jPanelPhieuNhapComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelPhieuNhapComponentShown
        
        ReceiptService.getTables(this.tblPhieuThu, "");
        
        CustomerService.setComboBoxList(cbbKhachHang_PhieuThu);
        EmployeeService.setComboBoxList(cbbNhanVien_PhieuThu);
        
        AccountService.setComboBoxListLevel3(cbbMaTKN_PhieuThu);
        AccountService.setComboBoxListLevel3(cbbMaTKC_PhieuThu);

        this.resetFormReceipt();
    }//GEN-LAST:event_jPanelPhieuNhapComponentShown

    private void jPanelSDDKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSDDKComponentShown

        
        BalanceService.getTables(this.tblSDDK);

         AccountService.setComboBoxListLevel3(cbbMaTietKhoan_SDDK);
        
        cbbStatus_SDDK.setModel(ElementUtils.getDataCbb(List.of(new ComboxModel("DU_NO", "Dư Nợ"),
                                                   new ComboxModel("DU_CO", "Dư Có"))));
        
        this.resetFormBalance();
        
       
        
        
    }//GEN-LAST:event_jPanelSDDKComponentShown

    private void resetFormBalance(){
        ElementUtils.resetForm(txtfirstDateOfPeriod_SDDK, cbbMaTietKhoan_SDDK, txtPrice_SDDK, cbbStatus_SDDK);
        
        btnThem_SDDK.setEnabled(true);
        cbbMaTietKhoan_SDDK.setEnabled(true);
        txtfirstDateOfPeriod_SDDK.setEnabled(true);
    }
    
    private void tblPhieuThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuThuMouseClicked

        this.handleReceiptItemCurrent();
    }//GEN-LAST:event_tblPhieuThuMouseClicked

    
    private void handleReceiptItemCurrent(){
        Integer id = ElementUtils.getId(this.tblPhieuThu);
        
       ReceiptService.fillDetailToForm(id,
                cbbNhanVien_PhieuThu,
                cbbKhachHang_PhieuThu,
                cbbMaTKN_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu,
                txtLyDo_PhieuThu);
       
        this.handleDisableAllBtnIfExportedOfReceipt();
    }
    
    private void handleDisableAllBtnIfExportedOfReceipt(){
        if(ReceiptService.getStatus(this.tblPhieuThu).equals("Đã Xuất")){
            btnThem_PhieuThu.setEnabled(true);
            btnSua_PhieuThu.setEnabled(false);
            btnXoa_PhieuThu.setEnabled(false);
            btnReset_PhieuThu.setEnabled(true);
            btnXuatPhieuThu_PhieuThu.setEnabled(false);
        } else {
            btnThem_PhieuThu.setEnabled(false);
            btnSua_PhieuThu.setEnabled(true);
            btnXoa_PhieuThu.setEnabled(true);
            btnReset_PhieuThu.setEnabled(true);
            btnXuatPhieuThu_PhieuThu.setEnabled(true);
        }
    }
    
    private void handleDisableAllBtnIfExportedOfPayment(){
        if(PaymentService.getStatus(this.tblPhieuChi).equals("Đã Xuất")){
            btnThem_PhieuChi.setEnabled(true);
            btnSua_PhieuChi.setEnabled(false);
            btnXoa_PhieuChi.setEnabled(false);
            btnReset_PhieuChi.setEnabled(true);
            btnXuatPhieuChi_PhieuChi.setEnabled(false);
        } else {
            btnThem_PhieuChi.setEnabled(false);
            btnSua_PhieuChi.setEnabled(true);
            btnXoa_PhieuChi.setEnabled(true);
            btnReset_PhieuChi.setEnabled(true);
            btnXuatPhieuChi_PhieuChi.setEnabled(true);
        }
    }
    
    private void btnThem_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuThuActionPerformed
        
        if(ElementUtils.isValidated(
                this.cbbNhanVien_PhieuThu, cbbKhachHang_PhieuThu,
                cbbMaTKN_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu)){
            
            ReceiptDTO receiptDTO = new ReceiptDTO();
            receiptDTO.setEmployeeId(Integer.valueOf(ElementUtils.getCbbSelected(cbbNhanVien_PhieuThu).toString()));
            receiptDTO.setCustomerId(Integer.valueOf(ElementUtils.getCbbSelected(cbbKhachHang_PhieuThu).toString()));
            receiptDTO.setAccountNoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKN_PhieuThu).toString()));
            receiptDTO.setAccountCoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKC_PhieuThu).toString()));
            receiptDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtTongTien_PhieuNhap.getText()));
            receiptDTO.setBookNumber(Integer.valueOf(this.txtQuyen_PhieuThu.getText()));
            receiptDTO.setReason(this.txtLyDo_PhieuThu.getText());
            
            Integer documentId = createDocument(receiptDTO.getBookNumber(), "PT");
            
            receiptDTO.setDocumentId(documentId);
            
            ReceiptRepository.insert(receiptDTO);
            
            ReceiptService.getTables(this.tblPhieuThu, "");
            this.resetFormReceipt();
        }
    }//GEN-LAST:event_btnThem_PhieuThuActionPerformed
    
    private Integer createDocument(Integer bookNumber, String type){
        
        DocumentDTO documentDTO = new DocumentDTO();
        documentDTO.setType(type);
        documentDTO.setDocumentNumber(bookNumber + (type.equals("PT")? "/PT": "/PC"));
        
        return DocumentRepository.insert(documentDTO);
    }
    
    private void btnXoa_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_KhachHangActionPerformed

        Integer id = ElementUtils.getId(this.tblKhachHang_KhachHang);
        
        if(CustomerRepository.existInOrder(id)){
            AlertUtils.showAlertOrderExsitCustomer();
            return;
        }
        
        this.confirmAndExecute(() -> {
            
            CustomerRepository.delete(id);
                
            CustomerService.getTables(this.tblKhachHang_KhachHang, "");
            this.resetFormCustomer();
        });
    }//GEN-LAST:event_btnXoa_KhachHangActionPerformed

    private void btnXoa_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_LoaiSanPhamActionPerformed
        
        Integer id = ElementUtils.getId(this.tbLoaiSanPham_LoaiSanPham);
        
        if(CategoryRepository.existProductCategory(id)){
            AlertUtils.showAlertCategoryExsitProduct();
        } else {
            this.confirmAndExecute(() -> {
            
                CategoryRepository.delete(id);

                CategoryService.getTables(this.tbLoaiSanPham_LoaiSanPham);
                this.resetFormCategory();
            });
        }
    }//GEN-LAST:event_btnXoa_LoaiSanPhamActionPerformed

    private void btnReset_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_PhieuThuActionPerformed
        this.resetFormReceipt();
    }//GEN-LAST:event_btnReset_PhieuThuActionPerformed

    private void txtTimKiem_SanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_SanPhamKeyReleased
        ProductService.getTables(this.tblSanPham, txtTimKiem_SanPham.getText());
    }//GEN-LAST:event_txtTimKiem_SanPhamKeyReleased

    private void jPaneSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPaneSanPhamComponentShown
        this.reloadDataCategory();
    }//GEN-LAST:event_jPaneSanPhamComponentShown

    private void reloadDataCategory(){
        CategoryService.getTables(tbLoaiSanPham_LoaiSanPham);

        this.resetFormCategory();
    }
    
    private void txtTimKiem_KhachHangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_KhachHangKeyReleased
        CustomerService.getTables(this.tblKhachHang_KhachHang, txtTimKiem_KhachHang.getText());
    }//GEN-LAST:event_txtTimKiem_KhachHangKeyReleased

    private void txtTenKhachHang_KhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangFocusLost

    }//GEN-LAST:event_txtTenKhachHang_KhachHangFocusLost

    private void loadAllComboBoxOfOrderPanel(){
        CustomerService.setComboBoxList(cbbKhachHang_HoaDon);
        ProductService.setComboBoxList(cbbSanPhamCTHD_HoaDon);
    }
    
    private void resetFormCTDH(){
        ElementUtils.resetForm(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon);
    }
    
    private static void confirmAndExecute(Runnable action) {
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            action.run();
        }
    }
    
    private void resetFormOrder(){
        ElementUtils.resetForm(cbbKhachHang_HoaDon, txtGhiChu_HoaDon, btnThem_HoaDon);
        
        if(SecurityUtils.isAdmin() || SecurityUtils.isSaler()){
            btnThem_HoaDon.setEnabled(true);
            btnXuatHoaDon_PhieuBanHang.setEnabled(false);
        }
    }
    
    private boolean isValidatedFormOrder(){
        return ElementUtils.isValidated(cbbKhachHang_HoaDon);
    }
    
    private void reloadByActionOrder(){
        
        OrderService.getTable(tblOrder, "");
        
        this.resetFormOrder();
        
        this.resetFormCTDH();
    }
    
    private void clearTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
    }
    
    private void handleOrderItemCurrent(){
        
        Integer orderId = ElementUtils.getId(tblOrder);
        
        OrderService.fillDetailToForm(orderId,
                                        cbbKhachHang_HoaDon,
                                        txtGhiChu_HoaDon);
        
       this.handleOrderDetailOfOrderItem(orderId);
        
        this.handleDisableAllBtnIfExportedOfOrder();
    }
    
    private void handleOrderDetailOfOrderItem(Integer orderId){
         OrderDetailService.getTable(orderId, tblCTHoaDon_ChiTietHoaDon);
        
        this.resetFormCTDH();
    }
    
    private void Reset_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_LoaiSanPhamActionPerformed
        this.resetFormCategory();
    }//GEN-LAST:event_Reset_LoaiSanPhamActionPerformed

    private void resetFormCategory(){
        ElementUtils.resetForm(
                this.txtTenLoaiSanPham_LoaiSanPham);
        
        if(SecurityUtils.isAdmin() || SecurityUtils.isSaler()){
            btnThem_LoaiSanPham.setEnabled(true);
        }
    }
    
    private void jTabbedPanelThuChiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPanelThuChiComponentShown
        
        ReceiptService.getTables(this.tblPhieuThu, "");
        
        CustomerService.setComboBoxList(cbbKhachHang_PhieuThu);
        EmployeeService.setComboBoxList(cbbNhanVien_PhieuThu);
        
        AccountService.setComboBoxListLevel3(cbbMaTKN_PhieuThu);
      
        AccountService.setComboBoxListLevel3(cbbMaTKC_PhieuThu);

        this.resetFormReceipt();

    }//GEN-LAST:event_jTabbedPanelThuChiComponentShown

    private void resetFormReceipt(){
        ElementUtils.resetForm(
                cbbNhanVien_PhieuThu,
                cbbKhachHang_PhieuThu,
                cbbMaTKN_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu,
                txtLyDo_PhieuThu);
        
        btnThem_PhieuThu.setEnabled(true);
        btnXuatPhieuThu_PhieuThu.setEnabled(false);
    }
    
    private void jPanelButToanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelButToanComponentShown
        AccountEntryService.getTables(this.tbButToan, "", null);
        
		List<ComboxModel> dataComboBox = List.of(new ComboxModel("PT", "Phiếu Thu"),
                                                        new ComboxModel("PC", "Phiếu Chi"));
		cbbTypeFilter_ButToan.setModel(ElementUtils.getDataCbb(dataComboBox));
    }//GEN-LAST:event_jPanelButToanComponentShown

    private void jDateChooserTuNgay_ThongKePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserTuNgay_ThongKePropertyChange
//        showThongKe();
    }//GEN-LAST:event_jDateChooserTuNgay_ThongKePropertyChange

    private void jDateChooserDen_ThongKePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserDen_ThongKePropertyChange
//        showThongKe();
    }//GEN-LAST:event_jDateChooserDen_ThongKePropertyChange

    private void jTabbedPaneNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneNhanVienComponentShown
        EmployeeService.getTables(this.tblNhanVien_NhanVien, "");

        RoleService.setComboBoxList(cbQuyen_NhanVien);
        
        this.resetFormEmployee();
    }//GEN-LAST:event_jTabbedPaneNhanVienComponentShown

    private void resetFormEmployee(){
        ElementUtils.resetForm(txtTenDN_NhanVien, txtMK_NhanVien, cbQuyen_NhanVien, txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien);
        
        if(SecurityUtils.isAdmin() || SecurityUtils.isSaler()){
            btnThem_NhanVien.setEnabled(true);
        }
    }
    
    private void jPanelNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelNhanVienComponentShown
        //       layDuLieuNhanVien();
        //        rbtnNam_NhanVien.setSelected(true);
        //        for (int i = 1; i < 32; i++) {
            //            cbbNgaySinh_NhanVien.addItem(String.valueOf(i));
            //        }
        //        for (int i = 1; i < 13; i++) {
            //            cbbThangSinh_NhanVien.addItem(String.valueOf(i));
            //        }
        //        for (int i = 2005; i > 1950; i--) {
            //            cbbNamSinh_NhanVien.addItem(String.valueOf(i));
            //        }
        //        cbQuyen_NhanVien.setModel(LayDuLieucbb("PhanQuyen","TenPhanQuyen","MaPhanQuyen"));
        //        cbbTaiKhoan_NhanVien.setModel(LayDuLieucbb("DangNhap", "TaiKhoan", "MaDangNhap"));
        //        rbtnTimKiemTheoMa_NhanVien.setSelected(true);
    }//GEN-LAST:event_jPanelNhanVienComponentShown

    private void btnReset_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_NhanVienActionPerformed
        this.resetFormEmployee();
    }//GEN-LAST:event_btnReset_NhanVienActionPerformed

    private void btnSua_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_NhanVienActionPerformed
        
        if(ElementUtils.isValidated(txtTenDN_NhanVien, 
                txtMK_NhanVien, cbQuyen_NhanVien,  txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien)){
            
            Integer id = ElementUtils.getId(tblNhanVien_NhanVien);
            EmployeeDTO employeeDTO = EmployeeRepository.findById(id);
            
             if(!employeeDTO.getUsername().equals(txtTenDN_NhanVien.getText()) && EmployeeRepository.existUsername(txtTenDN_NhanVien.getText())){
                AlertUtils.showAlertEmployeeUsernameExsit();
                return;
            }
            
            
            employeeDTO.setUsername(this.txtTenDN_NhanVien.getText());
            employeeDTO.setPassword(this.txtMK_NhanVien.getText());
            employeeDTO.setRole(ElementUtils.getCbbSelected(cbQuyen_NhanVien).toString());
            employeeDTO.setName(txtTen_NhanVien.getText());
            employeeDTO.setPhone(txtSDT_NhanVien.getText());
            employeeDTO.setAddress(txtDiaChi_NhanVien.getText());
            
            EmployeeRepository.update(employeeDTO);
            
            EmployeeService.getTables(this.tblNhanVien_NhanVien, "");
            this.resetFormEmployee();
        }
    }//GEN-LAST:event_btnSua_NhanVienActionPerformed

    private void btnXoa_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_NhanVienActionPerformed
        
        Integer id = ElementUtils.getId(this.tblNhanVien_NhanVien);
        
        this.confirmAndExecute(() -> {
            
            try {
                EmployeeRepository.delete(id);
            } catch (SQLException ex) {
                AlertUtils.showAlertSomeTableExsitEmployee();
            }
                
            EmployeeService.getTables(this.tblNhanVien_NhanVien, "");
            this.resetFormEmployee();
        });
    }//GEN-LAST:event_btnXoa_NhanVienActionPerformed

    private void btnThem_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_NhanVienActionPerformed
        
        if(ElementUtils.isValidated(txtTenDN_NhanVien, 
                txtMK_NhanVien, cbQuyen_NhanVien,  txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien)){
            
            if(EmployeeRepository.existUsername(txtTenDN_NhanVien.getText())){
                AlertUtils.showAlertEmployeeUsernameExsit();
                return;
            }
            
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setUsername(this.txtTenDN_NhanVien.getText());
            employeeDTO.setPassword(this.txtMK_NhanVien.getText());
            employeeDTO.setRole(ElementUtils.getCbbSelected(cbQuyen_NhanVien).toString());
            employeeDTO.setName(txtTen_NhanVien.getText());
            employeeDTO.setPhone(txtSDT_NhanVien.getText());
            employeeDTO.setAddress(txtDiaChi_NhanVien.getText());
            
            EmployeeRepository.insert(employeeDTO);
            
            EmployeeService.getTables(this.tblNhanVien_NhanVien, "");
            this.resetFormEmployee();
        }  
    }//GEN-LAST:event_btnThem_NhanVienActionPerformed

    private void txtTenDN_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDN_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDN_NhanVienActionPerformed

    private void tblNhanVien_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVien_NhanVienMouseClicked
        Integer id = ElementUtils.getId(tblNhanVien_NhanVien);
        
        EmployeeService.fillDetailToForm(id,
                                        txtTenDN_NhanVien,
                                        txtMK_NhanVien,
                                        cbQuyen_NhanVien,
                                        txtTen_NhanVien,
                                        txtSDT_NhanVien,
                                        txtDiaChi_NhanVien);
        
        txtNumberAccountLv1_Lv1_Account.setEnabled(false);
        txtNumberAccountLv2_Lv2_Account.setEnabled(false);
        txtNumberAccountLv3_Lv3_Account.setEnabled(false);
    }//GEN-LAST:event_tblNhanVien_NhanVienMouseClicked

    private void cbQuyen_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQuyen_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQuyen_NhanVienActionPerformed

    private void txtTen_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTen_NhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTen_NhanVienActionPerformed

    private void jPanelHoaDonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelHoaDonComponentShown

        OrderService.getTable(tblOrder, "");

        this.loadAllComboBoxOfOrderPanel();
        
        this.resetFormOrder();
        
        ((DefaultTableModel)tblCTHoaDon_ChiTietHoaDon.getModel()).setRowCount(0);
        
        this.resetFormCTDH();
    }//GEN-LAST:event_jPanelHoaDonComponentShown

    private void txtTimKiem_HoaDonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_HoaDonKeyReleased
        OrderService.getTable(tblOrder, txtTimKiem_HoaDon.getText());
    }//GEN-LAST:event_txtTimKiem_HoaDonKeyReleased

    private void txtTimKiem_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem_HoaDonActionPerformed

    }//GEN-LAST:event_txtTimKiem_HoaDonActionPerformed

    private void btnResetCTHD_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCTHD_HoaDonActionPerformed
        resetFormCTDH();
    }//GEN-LAST:event_btnResetCTHD_HoaDonActionPerformed

    private void btnSua_CTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_CTHDActionPerformed

        if(ElementUtils.isValidated(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon)){

            Integer orderId = ElementUtils.getId(tblCTHoaDon_ChiTietHoaDon);
            Integer productId = Integer.valueOf(ElementUtils.getCbbSelected(cbbSanPhamCTHD_HoaDon).toString());
            Integer quantity = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());

            Integer currentProductId = OrderDetailService.getProductId(tblCTHoaDon_ChiTietHoaDon);

            if(productId.equals(currentProductId)){

                OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);
                
                ProductDTO productDTO = ProductRepository.findById(productId);
                
                Integer inventoryNumber = productDTO.getInventoryNumber() + orderDetailDTO.getQuantity() - quantity;
                
                if(inventoryNumber < 0){
                    AlertUtils.showAlertEditCTPHD();
                    return;
                }
                
                productDTO.setInventoryNumber(inventoryNumber);
                ProductRepository.update(productDTO);
                
                orderDetailDTO.setQuantity(quantity);
                OrderDetailRepository.update(orderDetailDTO);

                this.handleOrderItemCurrent();

                OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , PriceUtils.convertToVND(OrderRepository.findById(orderId).getTotalMoney()));
            } else {

                OrderDetailRepository.delete(orderId, productId);

                this.handleAddOrderDetail(orderId, productId, quantity);
            }
        }
    }//GEN-LAST:event_btnSua_CTHDActionPerformed

    private void btnXoa_CTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_CTHDActionPerformed

        Integer orderId = OrderDetailService.getOrderId(tblCTHoaDon_ChiTietHoaDon);
        Integer productId = OrderDetailService.getProductId(tblCTHoaDon_ChiTietHoaDon);

        confirmAndExecute(() -> {
            OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);
            
            ProductDTO productDTO = ProductRepository.findById(productId);
            productDTO.setInventoryNumber(productDTO.getInventoryNumber() + orderDetailDTO.getQuantity());
            ProductRepository.update(productDTO);
            
            OrderDetailRepository.delete(orderId, productId);

            OrderDTO orderDTO = OrderRepository.findById(orderId);
            orderDTO.setTotalMoney(orderDTO.getTotalMoney().subtract(orderDetailDTO.getTotalMoney()));
            OrderRepository.update(orderDTO);

            this.handleOrderItemCurrent();

            OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , PriceUtils.convertToVND(orderDTO.getTotalMoney()));
        });
    }//GEN-LAST:event_btnXoa_CTHDActionPerformed

    private void btnThem_CTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_CTHDActionPerformed

        if(ElementUtils.isValidated(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon)){

            Integer orderId = ElementUtils.getId(tblOrder);
            Integer productId = Integer.valueOf(ElementUtils.getCbbSelected(cbbSanPhamCTHD_HoaDon).toString());
            Integer quantity = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());
            
            ProductDTO productDTO = ProductRepository.findById(productId);
            
            if(productDTO.getInventoryNumber() < quantity){
                AlertUtils.showAlertAddCTPHD();
                return;
            }

            this.handleAddOrderDetail(orderId, productId, quantity);
            
            productDTO.setInventoryNumber(productDTO.getInventoryNumber() - quantity);
            ProductRepository.update(productDTO);
        }
    }//GEN-LAST:event_btnThem_CTHDActionPerformed

    private void cbbSanPhamCTHD_HoaDonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSanPhamCTHD_HoaDonItemStateChanged
        //        int SoLuong = 0;
        //        double Tien = 0;
        //        try {
            //            SoLuong = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());
            //        } catch (Exception e) {
            //        }
        //        int Gia = GetGiaSanPham(GetCbbSelected(cbbSanPhamCTHD_HoaDon));
        //        Tien = (double) Gia * SoLuong;
        //        txtTongTienCTHD_HoaDon.setText(String.valueOf(Tien));
    }//GEN-LAST:event_cbbSanPhamCTHD_HoaDonItemStateChanged

    private void txtSoLuongCTHD_HoaDonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongCTHD_HoaDonKeyReleased
        //        int SoLuong = 0;
        //        double Tien = 0;
        //        try {
            //            SoLuong = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());
            //        } catch (Exception e) {
            //        }
        //        int Gia = GetGiaSanPham(GetCbbSelected(cbbSanPhamCTHD_HoaDon));
        //        Tien = (double) Gia * SoLuong;
        //        txtTongTienCTHD_HoaDon.setText(String.valueOf(Tien));
    }//GEN-LAST:event_txtSoLuongCTHD_HoaDonKeyReleased

    private void txtSoLuongCTHD_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongCTHD_HoaDonActionPerformed

    }//GEN-LAST:event_txtSoLuongCTHD_HoaDonActionPerformed

    private void cbbKhachHang_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhachHang_HoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbKhachHang_HoaDonActionPerformed

    private void btnXoa_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_HoaDonActionPerformed

        Integer id = ElementUtils.getId(tblOrder);

        confirmAndExecute(() -> {

            OrderDetailRepository.delete(id);

            OrderRepository.delete(id);

            this.reloadByActionOrder();

            this.clearTable(tblCTHoaDon_ChiTietHoaDon);
        });
    }//GEN-LAST:event_btnXoa_HoaDonActionPerformed

    private void btnSua_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_HoaDonActionPerformed

        if(this.isValidatedFormOrder()){

            Integer id = ElementUtils.getId(tblOrder);
            Integer customerId = Integer.valueOf(ElementUtils.getCbbSelected(cbbKhachHang_HoaDon).toString());
            String note = txtGhiChu_HoaDon.getText();

            OrderDTO orderDTO = OrderRepository.findById(id);
            orderDTO.setId(id);
            orderDTO.setCustomerId(customerId);
            orderDTO.setNote(note);

            OrderRepository.update(orderDTO);

            OrderService.getTable(tblOrder, "");

            this.resetFormOrder();
        }

    }//GEN-LAST:event_btnSua_HoaDonActionPerformed

    private void btnReSet_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReSet_HoaDonActionPerformed

        this.resetFormOrder();
    }//GEN-LAST:event_btnReSet_HoaDonActionPerformed

    private void btnThem_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_HoaDonActionPerformed

        if(this.isValidatedFormOrder()){

            Integer employeeId = SecurityUtils.getUserCurrent().getId();
            Integer customerId = Integer.valueOf(ElementUtils.getCbbSelected(cbbKhachHang_HoaDon).toString());
            String note = txtGhiChu_HoaDon.getText();

            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setCustomerId(customerId);
            orderDTO.setEmployeeId(employeeId);
            orderDTO.setNote(note);

            OrderRepository.insert(orderDTO);

            OrderService.getTable(tblOrder, "");

            this.resetFormOrder();
        }
    }//GEN-LAST:event_btnThem_HoaDonActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked

    }//GEN-LAST:event_jLabel30MouseClicked

    private void tblCTHoaDon_ChiTietHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHoaDon_ChiTietHoaDonMouseClicked

        Integer orderId = OrderDetailService.getOrderId(tblCTHoaDon_ChiTietHoaDon);
        Integer productId = OrderDetailService.getProductId(tblCTHoaDon_ChiTietHoaDon);

        OrderDetailService.fillDetailToForm(orderId, productId,
            cbbSanPhamCTHD_HoaDon,
            txtSoLuongCTHD_HoaDon);
    }//GEN-LAST:event_tblCTHoaDon_ChiTietHoaDonMouseClicked

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked

        this.handleOrderItemCurrent();
    }//GEN-LAST:event_tblOrderMouseClicked

    private void handleDisableAllBtnIfExportedOfOrder(){
        if(OrderService.getStatus(this.tblOrder).equals("Đã Xuất")){
            btnThem_HoaDon.setEnabled(true);
            btnSua_HoaDon.setEnabled(false);
            btnXoa_HoaDon.setEnabled(false);
            btnReSet_HoaDon.setEnabled(true);
            btnXuatHoaDon_PhieuBanHang.setEnabled(false);
            btnThem_CTHD.setEnabled(false);
            btnSua_CTHD.setEnabled(false);
            btnXoa_CTHD.setEnabled(false);
            btnResetCTHD_HoaDon.setEnabled(false);
        } else {
            btnThem_HoaDon.setEnabled(false);
            btnSua_HoaDon.setEnabled(true);
            btnXoa_HoaDon.setEnabled(true);
            btnReSet_HoaDon.setEnabled(true);
            btnXuatHoaDon_PhieuBanHang.setEnabled(true);
            btnThem_CTHD.setEnabled(true);
            btnSua_CTHD.setEnabled(true);
            btnXoa_CTHD.setEnabled(true);
            btnResetCTHD_HoaDon.setEnabled(true);
        }
    }
    
    private void txtTimKiem_NhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_NhanVienKeyReleased
        EmployeeService.getTables(this.tblNhanVien_NhanVien, this.txtTimKiem_NhanVien.getText());
    }//GEN-LAST:event_txtTimKiem_NhanVienKeyReleased

    private void jTabbedPane3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane3ComponentShown
              
    }//GEN-LAST:event_jTabbedPane3ComponentShown

    private void jPanelLogoutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLogoutComponentShown

        this.confirmAndExecute(() -> {
            FormLogin frmLogin = new FormLogin();
            frmLogin.show();
            frmLogin.setVisible(true);
            this.dispose();
        });
    }//GEN-LAST:event_jPanelLogoutComponentShown

    private void jPanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseClicked
        
    }//GEN-LAST:event_jPanelLogoutMouseClicked

    private void tblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoanMouseClicked
        
        resetFormAccount();
        
        Integer id = AccountService.getId(tblTaiKhoan);
        String level = AccountService.getLevel(tblTaiKhoan);
        
        AccountService.fillDetailToForm(id, level,
                                        txtNumberAccountLv1_Lv1_Account,
                                        txtNameAccountLv1_Lv1_Account,
                                        cbbNumberAccountLv1_Lv2_Account,
                                        txtNumberAccountLv2_Lv2_Account,
                                        txtNameAccountLv2_Lv2_Account,
                                        cbbNumberAccountLv2_Lv3_Account,
                                        txtNumberAccountLv3_Lv3_Account,
                                        txtNameAccountLv3_Lv3_Account,
                                        btnAdd_Lv1_Account, 
                                        btnAdd_Lv2_Account,
                                        btnAdd_Lv3_Account
                                        );
        
        txtNumberAccountLv1_Lv1_Account.setEnabled(true);
        txtNumberAccountLv2_Lv2_Account.setEnabled(true);
        txtNumberAccountLv3_Lv3_Account.setEnabled(true);
        
        if(AccountService.getLevel(tblTaiKhoan).equals("LEVEL1")){
            txtNumberAccountLv1_Lv1_Account.setEnabled(false);
        } else if (AccountService.getLevel(tblTaiKhoan).equals("LEVEL2")){
            txtNumberAccountLv2_Lv2_Account.setEnabled(false);
        } else {
            txtNumberAccountLv3_Lv3_Account.setEnabled(false);
        }
    }//GEN-LAST:event_tblTaiKhoanMouseClicked

    private void txtTimKiem_TaiKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_TaiKhoanKeyReleased
        AccountService.getTables(tblTaiKhoan, txtTimKiem_TaiKhoan.getText());
    }//GEN-LAST:event_txtTimKiem_TaiKhoanKeyReleased

    private void jPanel_TaiKhoanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_TaiKhoanComponentShown
        
        AccountService.getTables(tblTaiKhoan, "");
        
        AccountService.setComboBoxListLevel1(cbbNumberAccountLv1_Lv2_Account);
        AccountService.setComboBoxListLevel2(cbbNumberAccountLv2_Lv3_Account);
        
        resetFormAccount();
    }//GEN-LAST:event_jPanel_TaiKhoanComponentShown

    
    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void tblPhieuThuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuThuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhieuThuMouseEntered

    private void cbbKhachHang_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbKhachHang_PhieuThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbKhachHang_PhieuThuActionPerformed

    private void tblPhieuChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuChiMouseClicked
        handlePaymentItemCurrent();
    }//GEN-LAST:event_tblPhieuChiMouseClicked

    private void handlePaymentItemCurrent(){
        Integer id = ElementUtils.getId(this.tblPhieuChi);
        
       PaymentService.fillDetailToForm(id,
                cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi,
                txtLyDo_PhieuChi);
       
       this.handleDisableAllBtnIfExportedOfPayment();
    }
    
    private void tblPhieuChiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuChiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhieuChiMouseEntered

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void txtTongTien_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_PhieuChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_PhieuChiActionPerformed

    private void btnThem_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuChiActionPerformed
        if(ElementUtils.isValidated(
                this.cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi)){
            
            PaymentDTO paymentDTO = new PaymentDTO();
            paymentDTO.setEmployeeId(Integer.valueOf(ElementUtils.getCbbSelected(cbbNhanVien_PhieuChi).toString()));
            paymentDTO.setAccountNoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKN_PhieuChi).toString()));
            paymentDTO.setAccountCoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKC_PhieuChi).toString()));
            paymentDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtTongTien_PhieuChi.getText()));
            paymentDTO.setBookNumber(Integer.valueOf(this.txtQuyen_PhieuChi.getText()));
            paymentDTO.setReason(this.txtLyDo_PhieuChi.getText());
            
            Integer documentId = createDocument(paymentDTO.getBookNumber(), "PC");
            
            paymentDTO.setDocumentId(documentId);
            
            PaymentRepository.insert(paymentDTO);
            
            PaymentService.getTables(this.tblPhieuChi, "");
            this.resetFormPayment();
        }
    }//GEN-LAST:event_btnThem_PhieuChiActionPerformed

    private void btnXoa_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuChiActionPerformed
        Integer id = ElementUtils.getId(this.tblPhieuChi);
        
        this.confirmAndExecute(() -> {
            
                PaymentDTO paymentDTO = PaymentRepository.findById(id);
                
                Integer documentId = paymentDTO.getDocumentId();
                
                PaymentRepository.delete(id);
                
                DocumentRepository.delete(documentId);

                PaymentService.getTables(tblPhieuChi, "");
                this.resetFormPayment();
            });
    }//GEN-LAST:event_btnXoa_PhieuChiActionPerformed

    private void btnReset_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_PhieuChiActionPerformed
        this.resetFormPayment();
    }//GEN-LAST:event_btnReset_PhieuChiActionPerformed

    private void btnThem_SDDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SDDKActionPerformed
         
        if(ElementUtils.isValidated(txtfirstDateOfPeriod_SDDK, cbbMaTietKhoan_SDDK, txtPrice_SDDK, cbbStatus_SDDK)){
            
            if(BalanceRepository.existBalance(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTietKhoan_SDDK).toString()), txtfirstDateOfPeriod_SDDK.getDate())){
                AlertUtils.showAlertBalanceKeyExsit();
                return;
            }
            
            BalanceDTO balanceDTO = new BalanceDTO();
            balanceDTO.setAccountIdLv3(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTietKhoan_SDDK).toString()));
            balanceDTO.setFirstDateOfPeriod(txtfirstDateOfPeriod_SDDK.getDate());
            balanceDTO.setPrice(PriceUtils.VNDconvertToPrice(txtPrice_SDDK.getText()));
            balanceDTO.setStatus(ElementUtils.getCbbSelected(cbbStatus_SDDK).toString());
           
            BalanceRepository.insert(balanceDTO);
            
            BalanceService.getTables(tblSDDK);
            this.resetFormBalance();
        }  
    }//GEN-LAST:event_btnThem_SDDKActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(ElementUtils.isValidated(txtfirstDateOfPeriod_SDDK, cbbMaTietKhoan_SDDK, txtPrice_SDDK, cbbStatus_SDDK)){
            
            Date date = BalanceService.getDate(tblSDDK);
            Integer maTK = BalanceService.getMTK(tblSDDK);
            
            BalanceDTO balanceDTO = BalanceRepository.findById(maTK, date);

            balanceDTO.setPrice(PriceUtils.VNDconvertToPrice(txtPrice_SDDK.getText()));
            balanceDTO.setStatus(ElementUtils.getCbbSelected(cbbStatus_SDDK).toString());
           
            BalanceRepository.update(balanceDTO);
            
            BalanceService.getTables(tblSDDK);
            this.resetFormBalance();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date date = BalanceService.getDate(tblSDDK);
        Integer maTK = BalanceService.getMTK(tblSDDK);
        
        this.confirmAndExecute(() -> {
            
            BalanceRepository.delete(maTK, date);
                
            BalanceService.getTables(tblSDDK);
            this.resetFormBalance();
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.resetFormBalance();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblChungTuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChungTuMouseClicked
        Integer id = ElementUtils.getId(tblChungTu);
        
        txtMaCT_CT.setText(id.toString());
    }//GEN-LAST:event_tblChungTuMouseClicked

    private void txtTimKiem_ChungTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem_ChungTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiem_ChungTuActionPerformed

    private void txtTimKiem_ChungTuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_ChungTuKeyReleased
         OrderService.getTableCT(tblChungTu, txtTimKiem_ChungTu.getText(), fromDateFilter_Document.getDate(), toDateFilter_Document.getDate());
    }//GEN-LAST:event_txtTimKiem_ChungTuKeyReleased

    private void jPanelChungTuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelChungTuComponentShown
        OrderService.getTableCT(tblChungTu, "", null, null);
    }//GEN-LAST:event_jPanelChungTuComponentShown

    private void btnSua_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuThuActionPerformed
        
        if(ElementUtils.isValidated(
                this.cbbNhanVien_PhieuThu, cbbKhachHang_PhieuThu,
                cbbMaTKC_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu)){
            
            ReceiptDTO receiptDTO = ReceiptRepository.findById(ElementUtils.getId(this.tblPhieuThu));
            receiptDTO.setEmployeeId(Integer.valueOf(ElementUtils.getCbbSelected(cbbNhanVien_PhieuThu).toString()));
            receiptDTO.setCustomerId(Integer.valueOf(ElementUtils.getCbbSelected(cbbKhachHang_PhieuThu).toString()));
            receiptDTO.setAccountNoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKN_PhieuThu).toString()));
            receiptDTO.setAccountCoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKC_PhieuThu).toString()));
            receiptDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtTongTien_PhieuNhap.getText()));
            receiptDTO.setBookNumber(Integer.valueOf(this.txtQuyen_PhieuThu.getText()));
            receiptDTO.setReason(this.txtLyDo_PhieuThu.getText());
            
            ReceiptRepository.update(receiptDTO);
            
             ReceiptService.getTables(this.tblPhieuThu, "");
            this.resetFormReceipt();
        }
    }//GEN-LAST:event_btnSua_PhieuThuActionPerformed

    private void btnSua_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuChiActionPerformed
        
        if(ElementUtils.isValidated(
                this.cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi)){
            
            PaymentDTO paymentDTO = PaymentRepository.findById(ElementUtils.getId(this.tblPhieuChi));
            paymentDTO.setEmployeeId(Integer.valueOf(ElementUtils.getCbbSelected(cbbNhanVien_PhieuChi).toString()));
            paymentDTO.setAccountNoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKN_PhieuChi).toString()));
            paymentDTO.setAccountCoId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaTKC_PhieuChi).toString()));
            paymentDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtTongTien_PhieuChi.getText()));
            paymentDTO.setBookNumber(Integer.valueOf(this.txtQuyen_PhieuChi.getText()));
            paymentDTO.setReason(this.txtLyDo_PhieuChi.getText());
            
            PaymentRepository.update(paymentDTO);
            
            PaymentService.getTables(this.tblPhieuChi, "");
            this.resetFormPayment();
        }
    }//GEN-LAST:event_btnSua_PhieuChiActionPerformed

    private void txtTimKiem_PhieuThuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_PhieuThuKeyReleased
         ReceiptService.getTables(tblPhieuThu, txtTimKiem_PhieuThu.getText());
    }//GEN-LAST:event_txtTimKiem_PhieuThuKeyReleased

    private void txtTimKiem_PhieuChiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_PhieuChiKeyReleased
        PaymentService.getTables(tblPhieuChi, txtTimKiem_PhieuChi.getText());
    }//GEN-LAST:event_txtTimKiem_PhieuChiKeyReleased

    private void btnXuatHoaDon_PhieuBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDon_PhieuBanHangActionPerformed
        
        Integer id = ElementUtils.getId(tblOrder);

        confirmAndExecute(() -> {
            
            OrderDTO order = OrderRepository.findById(id);
            order.setExported(true);
            order.setExportedDate(new Date());
            
            OrderRepository.update(order);
            
            OrderService.updateFieldExportedOfOrderItemOnTable(tblOrder);
            handleOrderItemCurrent();
        });
    }//GEN-LAST:event_btnXuatHoaDon_PhieuBanHangActionPerformed

    private void createAccountingEntry(Date ctDate,  Integer accountNoId, Integer accountCoId, BigDecimal additionalPrice, Integer documentId, String documentNote){
        AccountEntryDTO accountEntyDTO = new AccountEntryDTO();
        accountEntyDTO.setDocumentDate(ctDate);
        accountEntyDTO.setAccountNoId(accountNoId);
        accountEntyDTO.setAccountCoId(accountCoId);
        accountEntyDTO.setAdditionalPrice(additionalPrice);
        accountEntyDTO.setDocumentId(documentId);
        accountEntyDTO.setDescription(documentNote);
        
        AccountEntryRepository.insert(accountEntyDTO);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        Date startDate = fromDateFilter_Document.getDate() != null? fromDateFilter_Document.getDate(): null ;
        Date endDate = toDateFilter_Document.getDate() != null? toDateFilter_Document.getDate(): null ;
        
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Report");

        // Thêm thông tin ngày bắt đầu và ngày kết thúc
        Row fromDateRow = sheet.createRow(0);
        Cell fromDateCell = fromDateRow.createCell(0);
        fromDateCell.setCellValue("Từ ngày: " + DateTimeUtils.toString(startDate));
        CellStyle dateStyle = workbook.createCellStyle();
        Font dateFont = workbook.createFont();
        dateFont.setBold(true);
        dateStyle.setFont(dateFont);
        fromDateCell.setCellStyle(dateStyle);

        Row toDateRow = sheet.createRow(1);
        Cell toDateCell = toDateRow.createCell(0);
        toDateCell.setCellValue("Đến ngày: " + DateTimeUtils.toString(endDate));
        toDateCell.setCellStyle(dateStyle);

        // Thêm tiêu đề cho file export
        Row titleRow = sheet.createRow(2);
        Cell titleCell = titleRow.createCell(0);
        titleCell.setCellValue("BÁO CÁO DOANH THU");
        CellStyle titleStyle = workbook.createCellStyle();
        Font titleFont = workbook.createFont();
        titleFont.setBold(true);
        titleFont.setFontHeightInPoints((short) 16);
        titleStyle.setFont(titleFont);
        titleStyle.setAlignment(HorizontalAlignment.CENTER);
        titleCell.setCellStyle(titleStyle);

        // Merge các ô để tiêu đề nằm giữa
        sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 6));

        // Tạo kiểu cho header
        CellStyle headerStyle = workbook.createCellStyle();
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);
        headerStyle.setAlignment(HorizontalAlignment.CENTER);
        headerStyle.setBorderBottom(BorderStyle.THIN);
        headerStyle.setBorderTop(BorderStyle.THIN);
        headerStyle.setBorderRight(BorderStyle.THIN);
        headerStyle.setBorderLeft(BorderStyle.THIN);

        // Tạo header row
        Row headerRow = sheet.createRow(3);
        String[] headers = {"STT", "Số CT", "Khách Hàng", "Nhân Viên Lập", "Ngày Lập", "Tổng Tiền", "Ghi Chú"};
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }

        // Giả định OrderRepository là lớp bạn đã định nghĩa và có phương thức findAll
        List<OrderDTO> orders = OrderRepository.findAll("", true, false, startDate, endDate);

        // Tạo kiểu cho dữ liệu
        CellStyle dataStyle = workbook.createCellStyle();
        dataStyle.setBorderBottom(BorderStyle.THIN);
        dataStyle.setBorderTop(BorderStyle.THIN);
        dataStyle.setBorderRight(BorderStyle.THIN);
        dataStyle.setBorderLeft(BorderStyle.THIN);

        int rowNum = 4; // Bắt đầu từ hàng thứ 4
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (OrderDTO data : orders) {
            Row row = sheet.createRow(rowNum);
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(rowNum - 3);
            cell0.setCellStyle(dataStyle);

            Cell cell1 = row.createCell(1);
            cell1.setCellValue(data.getId() + "/CT");
            cell1.setCellStyle(dataStyle);

            Cell cell2 = row.createCell(2);
            cell2.setCellValue(data.getCustomerName());
            cell2.setCellStyle(dataStyle);

            Cell cell3 = row.createCell(3);
            cell3.setCellValue(data.getEmployeeName());
            cell3.setCellStyle(dataStyle);

            Cell cell4 = row.createCell(4);
            cell4.setCellValue(data.getExportedDate().toString());
            cell4.setCellStyle(dataStyle);

            Cell cell5 = row.createCell(5);
            cell5.setCellValue(PriceUtils.convertToVND(data.getTotalMoney()));
            cell5.setCellStyle(dataStyle);

            Cell cell6 = row.createCell(6);
            cell6.setCellValue(data.getNote());
            cell6.setCellStyle(dataStyle);

            totalAmount = totalAmount.add(data.getTotalMoney());
            rowNum++;
        }

        // Thêm hàng tổng tiền ở cuối
        Row totalRow = sheet.createRow(rowNum);
        Cell totalLabelCell = totalRow.createCell(5);
        totalLabelCell.setCellValue("Tổng Tiền:");
        totalLabelCell.setCellStyle(headerStyle); // Sử dụng style của header để in đậm và căn giữa

        Cell totalAmountCell = totalRow.createCell(6);
        totalAmountCell.setCellValue(PriceUtils.convertToVND(totalAmount));
        totalAmountCell.setCellStyle(headerStyle); // Sử dụng style của header để in đậm và căn giữa

        // Tự động điều chỉnh chiều rộng các cột và thêm chiều rộng bổ sung
        for (int i = 0; i <= 6; i++) {
            sheet.autoSizeColumn(i);
            int currentWidth = sheet.getColumnWidth(i);
            sheet.setColumnWidth(i, currentWidth + 1000); // Thêm chiều rộng bổ sung (đơn vị là 1/256 của ký tự)
        }

        // Ghi workbook vào file
        try (FileOutputStream fileOut = new FileOutputStream("report.xlsx")) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất thành công!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Xuất thất bại");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnXuatPhieuThu_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPhieuThu_PhieuThuActionPerformed
        Integer id = ElementUtils.getId(tblPhieuThu);

        confirmAndExecute(() -> {
            
            ReceiptDTO receiptDTO = ReceiptRepository.findById(id);
            receiptDTO.setIsExported(true);
            
            ReceiptRepository.update(receiptDTO);
            
            ReceiptService.updateFieldExportedOfReceiptItemOnTable(tblPhieuThu);
            
            this.createAccountingEntry(receiptDTO.getCreatedDate(),
                    receiptDTO.getAccountNoId(),
                    receiptDTO.getAccountCoId(),
                    receiptDTO.getPrice(),
                    receiptDTO.getDocumentId(),
                    receiptDTO.getReason());
            
            this.handleReceiptItemCurrent();
        });
    }//GEN-LAST:event_btnXuatPhieuThu_PhieuThuActionPerformed

    private void btnXuatPhieuChi_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPhieuChi_PhieuChiActionPerformed
        Integer id = ElementUtils.getId(tblPhieuChi);

        confirmAndExecute(() -> {
            
            PaymentDTO paymentDTO = PaymentRepository.findById(id);
            paymentDTO.setIsExported(true);
            
            PaymentRepository.update(paymentDTO);
            
            PaymentService.updateFieldExportedOfPaymentItemOnTable(tblPhieuChi);
            
            this.createAccountingEntry(paymentDTO.getCreatedDate(),
                    paymentDTO.getAccountNoId(),
                    paymentDTO.getAccountCoId(),
                    paymentDTO.getPrice(),
                    paymentDTO.getDocumentId(),
                    paymentDTO.getReason());
        });
    }//GEN-LAST:event_btnXuatPhieuChi_PhieuChiActionPerformed

    private void btnXoa_ButToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_ButToanActionPerformed
        Integer id = ElementUtils.getId(this.tbButToan);
        
        this.confirmAndExecute(() -> {
            
            AccountEntryDTO accountEntryDTO = AccountEntryRepository.findById(id);
            
            Integer documentId = accountEntryDTO.getDocumentId();
            DocumentDTO documentDTO = DocumentRepository.findById(documentId);
            String type = documentDTO.getType();
            
            AccountEntryRepository.delete(id);
            
            switch(type){
                case "PT": {
                    ReceiptRepository.deleteByDocumentId(documentId);
                    break;
                }
                case "PC": {
                    PaymentRepository.deleteByDocumentId(documentId);
                    break;
                }
                default: throw new RuntimeException("Lỗi");
            }

            DocumentRepository.delete(documentId);

            AccountEntryService.getTables(tbButToan, "", null);
            txtMaButToan_ButToan.setText("");
        });
    }//GEN-LAST:event_btnXoa_ButToanActionPerformed

    private void tbButToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbButToanMouseClicked
        Integer id = ElementUtils.getId(this.tbButToan);
        
        txtMaButToan_ButToan.setText(id.toString());
        
    }//GEN-LAST:event_tbButToanMouseClicked

    private void btnAdd_Lv1_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Lv1_AccountActionPerformed
        
        if(ElementUtils.isValidated(txtNumberAccountLv1_Lv1_Account, txtNameAccountLv1_Lv1_Account)){
            
            AccountLv1DTO accountLv1DTO = new AccountLv1DTO();
            accountLv1DTO.setId(Integer.valueOf(txtNumberAccountLv1_Lv1_Account.getText()));
            accountLv1DTO.setName(txtNameAccountLv1_Lv1_Account.getText());
            
            try {
                AccountRepository.insertAccountLv1(accountLv1DTO);
            } catch (SQLException ex) {
                AlertUtils.showAlertAccountExist();
            }
            
            AccountService.setComboBoxListLevel1(cbbNumberAccountLv1_Lv2_Account);
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }    
    }//GEN-LAST:event_btnAdd_Lv1_AccountActionPerformed

    private void btnEdit_Lv1_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_Lv1_AccountActionPerformed
        if(ElementUtils.isValidated(txtNumberAccountLv1_Lv1_Account, txtNameAccountLv1_Lv1_Account)){
            
            Integer id = AccountService.getId(tblTaiKhoan);
            AccountLv1DTO accountLv1DTO = AccountRepository.findByAccountLv1Id(id);
            accountLv1DTO.setName(txtNameAccountLv1_Lv1_Account.getText());
            
            AccountRepository.updateAccountLv1(accountLv1DTO);
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }    
    }//GEN-LAST:event_btnEdit_Lv1_AccountActionPerformed

    private void btnDelete_Lv1_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Lv1_AccountActionPerformed
        Integer id = AccountService.getId(this.tblTaiKhoan);
        
        this.confirmAndExecute(() -> {
            
            try {
                AccountRepository.deleteAccountLv1(id);
            } catch (SQLException ex) {
                AlertUtils.showAlertSomeTableExsitAccount();
            }
                
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        });
    }//GEN-LAST:event_btnDelete_Lv1_AccountActionPerformed

    private void btnReset_Lv1_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_Lv1_AccountActionPerformed
        this.resetFormLv1Account();
    }//GEN-LAST:event_btnReset_Lv1_AccountActionPerformed

    private void resetFormLv1Account(){
        ElementUtils.resetForm(
                txtNumberAccountLv1_Lv1_Account,
                txtNameAccountLv1_Lv1_Account);
        
        btnAdd_Lv1_Account.setEnabled(true);
        txtNumberAccountLv1_Lv1_Account.setEnabled(true);
    }
    
    private void resetFormLv2Account(){
        ElementUtils.resetForm(
                cbbNumberAccountLv1_Lv2_Account,
                txtNumberAccountLv2_Lv2_Account,
                txtNameAccountLv2_Lv2_Account);
        
        btnAdd_Lv2_Account.setEnabled(true);
        txtNumberAccountLv2_Lv2_Account.setEnabled(true);
    }
    
    private void resetFormLv3Account(){
        ElementUtils.resetForm(
                cbbNumberAccountLv2_Lv3_Account,
                txtNumberAccountLv3_Lv3_Account,
                txtNameAccountLv3_Lv3_Account);
        
        btnAdd_Lv3_Account.setEnabled(true);
        txtNumberAccountLv3_Lv3_Account.setEnabled(true);
    }
    
    private void btnAdd_Lv2_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Lv2_AccountActionPerformed
        if(ElementUtils.isValidated(cbbNumberAccountLv1_Lv2_Account, txtNumberAccountLv2_Lv2_Account, txtNameAccountLv2_Lv2_Account)){
            
            AccountLv2DTO accountLv2DTO = new AccountLv2DTO();
            accountLv2DTO.setAccountLv1Id(Integer.valueOf(ElementUtils.getCbbSelected(cbbNumberAccountLv1_Lv2_Account).toString()));
            accountLv2DTO.setId(Integer.valueOf(txtNumberAccountLv2_Lv2_Account.getText()));
            accountLv2DTO.setName(txtNameAccountLv2_Lv2_Account.getText());
            
            try {
                AccountRepository.insertAccountLv2(accountLv2DTO);
            } catch (SQLException ex) {
                AlertUtils.showAlertAccountExist();
            }
            
            AccountService.setComboBoxListLevel2(cbbNumberAccountLv2_Lv3_Account);
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }
    }//GEN-LAST:event_btnAdd_Lv2_AccountActionPerformed

    private void btnEdit_Lv2_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_Lv2_AccountActionPerformed
        if(ElementUtils.isValidated(cbbNumberAccountLv1_Lv2_Account, txtNumberAccountLv2_Lv2_Account, txtNameAccountLv2_Lv2_Account)){
            
            Integer id = AccountService.getId(tblTaiKhoan);
            AccountLv2DTO accountLv2DTO = AccountRepository.findByAccountLv2Id(id);
            accountLv2DTO.setName(txtNameAccountLv2_Lv2_Account.getText());
            accountLv2DTO.setAccountLv1Id(Integer.valueOf(ElementUtils.getCbbSelected(cbbNumberAccountLv1_Lv2_Account).toString()));
            
            AccountRepository.updateAccountLv2(accountLv2DTO);
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }    
    }//GEN-LAST:event_btnEdit_Lv2_AccountActionPerformed

    private void btnDelete_Lv2_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Lv2_AccountActionPerformed
        Integer id = AccountService.getId(this.tblTaiKhoan);
        
        this.confirmAndExecute(() -> {
            
            try {
                AccountRepository.deleteAccountLv2(id);
            } catch (SQLException ex) {
                AlertUtils.showAlertSomeTableExsitAccount();
            }
                
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        });
    }//GEN-LAST:event_btnDelete_Lv2_AccountActionPerformed

    private void btnReset_Lv2_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_Lv2_AccountActionPerformed
       this.resetFormLv2Account();
    }//GEN-LAST:event_btnReset_Lv2_AccountActionPerformed

    private void btnAdd_Lv3_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Lv3_AccountActionPerformed
        if(ElementUtils.isValidated(cbbNumberAccountLv2_Lv3_Account, txtNumberAccountLv3_Lv3_Account, txtNameAccountLv3_Lv3_Account)){
            
            AccountLv3DTO accountLv3DTO = new AccountLv3DTO();
            accountLv3DTO.setAccountLv2Id(Integer.valueOf(ElementUtils.getCbbSelected(cbbNumberAccountLv2_Lv3_Account).toString()));
            accountLv3DTO.setId(Integer.valueOf(txtNumberAccountLv3_Lv3_Account.getText()));
            accountLv3DTO.setName(txtNameAccountLv3_Lv3_Account.getText());
            
            try {
                AccountRepository.insertAccountLv3(accountLv3DTO);
            } catch (SQLException ex) {
                AlertUtils.showAlertAccountExist();
            }
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }
    }//GEN-LAST:event_btnAdd_Lv3_AccountActionPerformed

    private void btnEdit_Lv3_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_Lv3_AccountActionPerformed
        if(ElementUtils.isValidated(cbbNumberAccountLv2_Lv3_Account, txtNumberAccountLv3_Lv3_Account, txtNameAccountLv3_Lv3_Account)){
            
            Integer id = AccountService.getId(tblTaiKhoan);
            AccountLv3DTO accountLv3DTO = AccountRepository.findByAccountLv3Id(id);
            accountLv3DTO.setName(txtNameAccountLv3_Lv3_Account.getText());
            accountLv3DTO.setAccountLv2Id(Integer.valueOf(ElementUtils.getCbbSelected(cbbNumberAccountLv2_Lv3_Account).toString()));
            
            AccountRepository.updateAccountLv3(accountLv3DTO);
            
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        }
    }//GEN-LAST:event_btnEdit_Lv3_AccountActionPerformed

    private void btnDelete_Lv3_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Lv3_AccountActionPerformed
        
        Integer id = AccountService.getId(this.tblTaiKhoan);
        
        this.confirmAndExecute(() -> {
            
            try {
                AccountRepository.deleteAccountLv3(id);
            } catch (SQLException ex) {
                AlertUtils.showAlertSomeTableExsitAccount();
            }
                
            AccountService.getTables(this.tblTaiKhoan, "");
            this.resetFormAccount();
        });
    }//GEN-LAST:event_btnDelete_Lv3_AccountActionPerformed

    private void resetFormAccount(){
        this.resetFormLv1Account();
        this.resetFormLv2Account();
        this.resetFormLv3Account();
        
        txtNumberAccountLv1_Lv1_Account.setEnabled(true);
        txtNumberAccountLv2_Lv2_Account.setEnabled(true);
        txtNumberAccountLv3_Lv3_Account.setEnabled(true);
    }
    
    private void btnReset_Lv3_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_Lv3_AccountActionPerformed
        this.resetFormLv3Account();
    }//GEN-LAST:event_btnReset_Lv3_AccountActionPerformed

    private void btnXoa_DoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_DoanhThuActionPerformed
         Integer id = ElementUtils.getId(tblChungTu);
        
        this.confirmAndExecute(() -> {
            
            OrderDTO orderDTO = OrderRepository.findById(id);
            orderDTO.setIsDeleted(true);

            OrderRepository.update(orderDTO);
            
            OrderService.getTableCT(tblChungTu, "", null, null);
        });
    }//GEN-LAST:event_btnXoa_DoanhThuActionPerformed

    private void txtTimKiem_ButToanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_ButToanKeyReleased
        AccountEntryService.getTables(tbButToan, txtTimKiem_ButToan.getText(), ElementUtils.getCbbSelected(cbbTypeFilter_ButToan) != null ?
                ElementUtils.getCbbSelected(cbbTypeFilter_ButToan).toString(): null);
    }//GEN-LAST:event_txtTimKiem_ButToanKeyReleased

    private void cbbTypeFilter_ButToanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbbTypeFilter_ButToanPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTypeFilter_ButToanPropertyChange

    private void cbbTypeFilter_ButToanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTypeFilter_ButToanItemStateChanged
        AccountEntryService.getTables(tbButToan, txtTimKiem_ButToan.getText(), ElementUtils.getCbbSelected(cbbTypeFilter_ButToan) != null ?
                ElementUtils.getCbbSelected(cbbTypeFilter_ButToan).toString(): null);
    }//GEN-LAST:event_cbbTypeFilter_ButToanItemStateChanged

    private void txtGhiChu_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhiChu_HoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChu_HoaDonActionPerformed

    private void tblSDDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSDDKMouseClicked
        Date date = BalanceService.getDate(tblSDDK);
        Integer maTK = BalanceService.getMTK(tblSDDK);
        
        BalanceService.fillDetailToForm(maTK, date,
                                        txtfirstDateOfPeriod_SDDK, cbbMaTietKhoan_SDDK, txtPrice_SDDK, cbbStatus_SDDK);
        
        btnThem_SDDK.setEnabled(false);
        
        cbbMaTietKhoan_SDDK.setEnabled(false);
        txtfirstDateOfPeriod_SDDK.setEnabled(false);
    }//GEN-LAST:event_tblSDDKMouseClicked

    private void fromDateFilter_DocumentInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fromDateFilter_DocumentInputMethodTextChanged
        
    }//GEN-LAST:event_fromDateFilter_DocumentInputMethodTextChanged

    private void fromDateFilter_DocumentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fromDateFilter_DocumentPropertyChange

       OrderService.getTableCT(tblChungTu, txtTimKiem_ChungTu.getText(), fromDateFilter_Document.getDate(), toDateFilter_Document.getDate());
    }//GEN-LAST:event_fromDateFilter_DocumentPropertyChange

    private void toDateFilter_DocumentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_toDateFilter_DocumentPropertyChange
        OrderService.getTableCT(tblChungTu, txtTimKiem_ChungTu.getText(), fromDateFilter_Document.getDate(), toDateFilter_Document.getDate());
    }//GEN-LAST:event_toDateFilter_DocumentPropertyChange

    private void btnXoa_DoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoa_DoanhThuMouseClicked

    }//GEN-LAST:event_btnXoa_DoanhThuMouseClicked

    private void txtNumberAccountLv1_Lv1_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberAccountLv1_Lv1_AccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberAccountLv1_Lv1_AccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ImageUploader imageUploader = HelperObject.getInstance(lab_HinhAnh_HangHoa);
        imageUploader.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset_LoaiSanPham;
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnAdd_Lv1_Account;
    private javax.swing.JButton btnAdd_Lv2_Account;
    private javax.swing.JButton btnAdd_Lv3_Account;
    private javax.swing.JButton btnDelete_Lv1_Account;
    private javax.swing.JButton btnDelete_Lv2_Account;
    private javax.swing.JButton btnDelete_Lv3_Account;
    private javax.swing.JButton btnEdit_Lv1_Account;
    private javax.swing.JButton btnEdit_Lv2_Account;
    private javax.swing.JButton btnEdit_Lv3_Account;
    private javax.swing.JButton btnReSet_HoaDon;
    private javax.swing.JButton btnResetCTHD_HoaDon;
    private javax.swing.JButton btnReset_KhachHang;
    private javax.swing.JButton btnReset_Lv1_Account;
    private javax.swing.JButton btnReset_Lv2_Account;
    private javax.swing.JButton btnReset_Lv3_Account;
    private javax.swing.JButton btnReset_NhanVien;
    private javax.swing.JButton btnReset_PhieuChi;
    private javax.swing.JButton btnReset_PhieuThu;
    private javax.swing.JButton btnReset_SanPham;
    private javax.swing.JButton btnSua_CTHD;
    private javax.swing.JButton btnSua_HoaDon;
    private javax.swing.JButton btnSua_KhachHang;
    private javax.swing.JButton btnSua_LoaiSanPham;
    private javax.swing.JButton btnSua_NhanVien;
    private javax.swing.JButton btnSua_PhieuChi;
    private javax.swing.JButton btnSua_PhieuThu;
    private javax.swing.JButton btnThem_CTHD;
    private javax.swing.JButton btnThem_HoaDon;
    private javax.swing.JButton btnThem_KhachHang;
    private javax.swing.JButton btnThem_LoaiSanPham;
    private javax.swing.JButton btnThem_NhanVien;
    private javax.swing.JButton btnThem_PhieuChi;
    private javax.swing.JButton btnThem_PhieuThu;
    private javax.swing.JButton btnThem_SDDK;
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnXoa_ButToan;
    private javax.swing.JButton btnXoa_CTHD;
    private javax.swing.JButton btnXoa_DoanhThu;
    private javax.swing.JButton btnXoa_HoaDon;
    private javax.swing.JButton btnXoa_KhachHang;
    private javax.swing.JButton btnXoa_LoaiSanPham;
    private javax.swing.JButton btnXoa_NhanVien;
    private javax.swing.JButton btnXoa_PhieuChi;
    private javax.swing.JButton btnXoa_PhieuThu;
    private javax.swing.JButton btnXoa_SanPham;
    private javax.swing.JButton btnXuatHoaDon_PhieuBanHang;
    private javax.swing.JButton btnXuatPhieuChi_PhieuChi;
    private javax.swing.JButton btnXuatPhieuThu_PhieuThu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbQuyen_NhanVien;
    private javax.swing.JComboBox<String> cbbKhachHang_HoaDon;
    private javax.swing.JComboBox<String> cbbKhachHang_PhieuThu;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPham;
    private javax.swing.JComboBox<String> cbbMaTKC_PhieuChi;
    private javax.swing.JComboBox<String> cbbMaTKC_PhieuThu;
    private javax.swing.JComboBox<String> cbbMaTKN_PhieuChi;
    private javax.swing.JComboBox<String> cbbMaTKN_PhieuThu;
    private javax.swing.JComboBox<String> cbbMaTietKhoan_SDDK;
    private javax.swing.JComboBox<String> cbbNhanVien_PhieuChi;
    private javax.swing.JComboBox<String> cbbNhanVien_PhieuThu;
    private javax.swing.JComboBox<String> cbbNumberAccountLv1_Lv2_Account;
    private javax.swing.JComboBox<String> cbbNumberAccountLv2_Lv3_Account;
    private javax.swing.JComboBox<String> cbbSanPhamCTHD_HoaDon;
    private javax.swing.JComboBox<String> cbbStatus_SDDK;
    private javax.swing.JComboBox<String> cbbTypeFilter_ButToan;
    private com.toedter.calendar.JDateChooser fromDateFilter_Document;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jPaneSanPham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelButToan;
    private javax.swing.JPanel jPanelChungTu;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelHoaDon;
    private javax.swing.JPanel jPanelLoaiSanPham;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelNhanVien;
    private javax.swing.JPanel jPanelPhieuChi;
    private javax.swing.JPanel jPanelPhieuNhap;
    private javax.swing.JPanel jPanelSDDK;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JPanel jPanel_TaiKhoan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPanelThuChi;
    private javax.swing.JLabel lab_HinhAnh_HangHoa;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap_SanPham;
    private javax.swing.JLabel lblMaHoaDon_HoaDon2;
    private javax.swing.JLabel lblNgayHetHan_SanPham;
    private javax.swing.JLabel lblNgayHetHan_SanPham1;
    private javax.swing.JLabel lblSDT_NhanVien;
    private javax.swing.JLabel lblSDT_NhanVien1;
    private javax.swing.JLabel lblSoDienThoai_KhachHang;
    private javax.swing.JLabel lblSoLuongCTHD_HoaDon;
    private javax.swing.JLabel lblTSHDBR4;
    private javax.swing.JLabel lblTSHDBR5;
    private javax.swing.JLabel lblTSHDBR6;
    private javax.swing.JLabel lblTSHDBR7;
    private javax.swing.JLabel lblTaiKhoan_NhanVien;
    private javax.swing.JLabel lblTaiKhoan_NhanVien1;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JLabel lblTenLoaiSanPham_LoaiSanPham;
    private javax.swing.JLabel lblTenNhanVien_NhanVien;
    private javax.swing.JLabel lblTenNhanVien_NhanVien1;
    private javax.swing.JLabel lblTenSanPham_SanPham;
    private javax.swing.JLabel lblTongTien_HoaDon1;
    private javax.swing.JLabel lblTongTien_HoaDon2;
    private javax.swing.JLabel lblTongTien_HoaDon3;
    private javax.swing.JLabel lblTongTien_HoaDon4;
    private javax.swing.JLabel lblTongTien_HoaDon7;
    private javax.swing.JTable tbButToan;
    private javax.swing.JTable tbLoaiSanPham_LoaiSanPham;
    private javax.swing.JTable tblCTHoaDon_ChiTietHoaDon;
    private javax.swing.JTable tblChungTu;
    private javax.swing.JTable tblKhachHang_KhachHang;
    private javax.swing.JTable tblNhanVien_NhanVien;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblPhieuChi;
    private javax.swing.JTable tblPhieuThu;
    private javax.swing.JTable tblSDDK;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblTaiKhoan;
    private com.toedter.calendar.JDateChooser toDateFilter_Document;
    private javax.swing.JTextField txtDiaChi_KhachHang;
    private javax.swing.JTextField txtDiaChi_NhanVien;
    private javax.swing.JTextField txtDonVi_SanPham;
    private javax.swing.JTextField txtGhiChu_HoaDon;
    private javax.swing.JTextField txtGiaban_SanPham;
    private javax.swing.JTextField txtKichThuoc_SanPham;
    private javax.swing.JTextArea txtLyDo_PhieuChi;
    private javax.swing.JTextArea txtLyDo_PhieuThu;
    private javax.swing.JTextField txtMK_NhanVien;
    private javax.swing.JTextField txtMaButToan_ButToan;
    private javax.swing.JTextField txtMaCT_CT;
    private javax.swing.JTextField txtMaSoThue_KhachHang;
    private javax.swing.JTextField txtNameAccountLv1_Lv1_Account;
    private javax.swing.JTextField txtNameAccountLv2_Lv2_Account;
    private javax.swing.JTextField txtNameAccountLv3_Lv3_Account;
    private javax.swing.JTextField txtNumberAccountLv1_Lv1_Account;
    private javax.swing.JTextField txtNumberAccountLv2_Lv2_Account;
    private javax.swing.JTextField txtNumberAccountLv3_Lv3_Account;
    private javax.swing.JTextField txtPrice_SDDK;
    private javax.swing.JTextField txtQuyen_PhieuChi;
    private javax.swing.JTextField txtQuyen_PhieuThu;
    private javax.swing.JTextField txtSDT_NhanVien;
    private javax.swing.JTextField txtSoDienThoai_KhachHang;
    private javax.swing.JTextField txtSoLuongCTHD_HoaDon;
    private javax.swing.JTextField txtTenDN_NhanVien;
    private javax.swing.JTextField txtTenKhachHang_KhachHang;
    private javax.swing.JTextField txtTenLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtTenSanPham_SanPham;
    private javax.swing.JTextField txtTen_NhanVien;
    private javax.swing.JTextField txtTimKiem_ButToan;
    private javax.swing.JTextField txtTimKiem_ChungTu;
    private javax.swing.JTextField txtTimKiem_HoaDon;
    private javax.swing.JTextField txtTimKiem_KhachHang;
    private javax.swing.JTextField txtTimKiem_NhanVien;
    private javax.swing.JTextField txtTimKiem_PhieuChi;
    private javax.swing.JTextField txtTimKiem_PhieuThu;
    private javax.swing.JTextField txtTimKiem_SanPham;
    private javax.swing.JTextField txtTimKiem_TaiKhoan;
    private javax.swing.JTextField txtTongTien_PhieuChi;
    private javax.swing.JTextField txtTongTien_PhieuNhap;
    private com.toedter.calendar.JDateChooser txtfirstDateOfPeriod_SDDK;
    // End of variables declaration//GEN-END:variables
}
