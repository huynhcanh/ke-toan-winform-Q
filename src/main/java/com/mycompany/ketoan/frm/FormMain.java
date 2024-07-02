package com.mycompany.ketoan.frm;

import com.mycompany.ketoan.dto.AccountEntryDTO;
import com.mycompany.ketoan.dto.CategoryDTO;
import com.mycompany.ketoan.dto.CustomerDTO;
import com.mycompany.ketoan.dto.DocumentDTO;
import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.dto.OrderDetailDTO;
import com.mycompany.ketoan.dto.PaymentDTO;
import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.dto.ReceiptDTO;
import com.mycompany.ketoan.repository.AccountEntryRepository;
import com.mycompany.ketoan.repository.AccountRepository;
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
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
        lblMaHoaDon_HoaDon = new javax.swing.JLabel();
        lblTongTien_HoaDon = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtMaHoaDon_HoaDon = new javax.swing.JTextField();
        btnThem_HoaDon = new javax.swing.JButton();
        btnReSet_HoaDon = new javax.swing.JButton();
        txtTongTien_HoaDon = new javax.swing.JTextField();
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
        lblMaHoaDon_HoaDon1 = new javax.swing.JLabel();
        txtMaHoaDonCTHD_HoaDon = new javax.swing.JTextField();
        lblMaHoaDon_HoaDon2 = new javax.swing.JLabel();
        btnXoa_CTHD = new javax.swing.JButton();
        btnResetCTHD_HoaDon = new javax.swing.JButton();
        btnThem_CTHD = new javax.swing.JButton();
        btnSua_CTHD = new javax.swing.JButton();
        lblTongTien_HoaDon2 = new javax.swing.JLabel();
        txtTimKiem_HoaDon = new javax.swing.JTextField();
        jTabbedPaneSanPham = new javax.swing.JTabbedPane();
        jPanelLoaiSanPham = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbLoaiSanPham_LoaiSanPham = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblMaLoaiSanPham_LoaiSanPham = new javax.swing.JLabel();
        lblTenLoaiSanPham_LoaiSanPham = new javax.swing.JLabel();
        txtMaLoaiSanPham_LoaiSanPham = new javax.swing.JTextField();
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
        jPanel_KhachHang = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblKhachHang_KhachHang = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblMaKhachHang_KhachHang = new javax.swing.JLabel();
        lblTenKhachHang_KhachHang = new javax.swing.JLabel();
        lblSoDienThoai_KhachHang = new javax.swing.JLabel();
        lblDiaChi_KhachHang = new javax.swing.JLabel();
        txtMaKhachHang_KhachHang = new javax.swing.JTextField();
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
        jTabbedPaneNhanVien = new javax.swing.JTabbedPane();
        jPanelNhanVien = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblNhanVien_NhanVien = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        lblMaNhanVien_NhanVien = new javax.swing.JLabel();
        lblTenNhanVien_NhanVien = new javax.swing.JLabel();
        lblSDT_NhanVien = new javax.swing.JLabel();
        txtMaNhanVien_NhanVien = new javax.swing.JTextField();
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
        txtMaPhieuThu_PhieuThu = new javax.swing.JTextField();
        txtQuyen_PhieuThu = new javax.swing.JTextField();
        lblMaPhieuNhap_PhieuNhap = new javax.swing.JLabel();
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
        txtMaPhieuChi_PhieuChi = new javax.swing.JTextField();
        txtQuyen_PhieuChi = new javax.swing.JTextField();
        lblMaPhieuNhap_PhieuNhap1 = new javax.swing.JLabel();
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
        jTable1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanelChungTu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChungTu = new javax.swing.JTable();
        lblTongTien_HoaDon7 = new javax.swing.JLabel();
        txtTimKiem_ChungTu = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        lblTSHDBR5 = new javax.swing.JLabel();
        lblTSHDBR6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        lblTSHDBR7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanelButToan = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        lblTSHDBR1 = new javax.swing.JLabel();
        lblTSHDBR2 = new javax.swing.JLabel();
        lblTSHDBR3 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbButToan = new javax.swing.JTable();
        lblTSHDBR4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
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

        lblMaHoaDon_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaHoaDon_HoaDon.setText("Mã Đơn Hàng*");

        lblTongTien_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon.setText("Tổng Tiền*");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Khách Hàng*");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        txtMaHoaDon_HoaDon.setEditable(false);
        txtMaHoaDon_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtMaHoaDon_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoaDon_HoaDonActionPerformed(evt);
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

        txtTongTien_HoaDon.setEditable(false);
        txtTongTien_HoaDon.setBackground(new java.awt.Color(241, 241, 241));

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

        lblTongTien_HoaDon3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon3.setText("Ghi chú");

        btnXuatHoaDon_PhieuBanHang.setBackground(new java.awt.Color(112, 173, 71));
        btnXuatHoaDon_PhieuBanHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatHoaDon_PhieuBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatHoaDon_PhieuBanHang.setText("XUẤT HOÁ ĐƠN");
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
                    .addComponent(cbbKhachHang_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblMaHoaDon_HoaDon)
                            .addGap(27, 27, 27)
                            .addComponent(txtMaHoaDon_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel30)
                            .addGap(174, 174, 174)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTongTien_HoaDon)
                            .addComponent(lblTongTien_HoaDon3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongTien_HoaDon)
                            .addComponent(txtGhiChu_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnSua_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReSet_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnXuatHoaDon_PhieuBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_HoaDon)
                    .addComponent(txtMaHoaDon_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaHoaDon_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_HoaDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGhiChu_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien_HoaDon3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReSet_HoaDon)))
                    .addComponent(btnSua_HoaDon))
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

        lblMaHoaDon_HoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaHoaDon_HoaDon1.setText("Mã Đơn Hàng*");

        txtMaHoaDonCTHD_HoaDon.setEditable(false);
        txtMaHoaDonCTHD_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtMaHoaDonCTHD_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoaDonCTHD_HoaDonActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaHoaDon_HoaDon1)
                    .addComponent(lblMaHoaDon_HoaDon2)
                    .addComponent(lblSoLuongCTHD_HoaDon))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHoaDonCTHD_HoaDon)
                    .addComponent(cbbSanPhamCTHD_HoaDon, 0, 149, Short.MAX_VALUE)
                    .addComponent(txtSoLuongCTHD_HoaDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetCTHD_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btnXoa_CTHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHoaDonCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHoaDon_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHoaDon_HoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbSanPhamCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_CTHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuongCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_CTHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetCTHD_HoaDon))
                    .addComponent(btnThem_CTHD))
                .addGap(0, 70, Short.MAX_VALUE))
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
                        .addGroup(jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                .addContainerGap(57, Short.MAX_VALUE))
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

        jTabbedPaneSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPaneSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPaneSanPhamComponentShown(evt);
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

        lblMaLoaiSanPham_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaLoaiSanPham_LoaiSanPham.setText("Mã Loại");

        lblTenLoaiSanPham_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenLoaiSanPham_LoaiSanPham.setText("Tên Loại");

        txtMaLoaiSanPham_LoaiSanPham.setEditable(false);
        txtMaLoaiSanPham_LoaiSanPham.setBackground(new java.awt.Color(241, 241, 241));

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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblMaLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_LoaiSanPham)
                    .addComponent(lblMaLoaiSanPham_LoaiSanPham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenLoaiSanPham_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTenLoaiSanPham_LoaiSanPham))
                    .addComponent(btnSua_LoaiSanPham))
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

        jTabbedPaneSanPham.addTab("LOẠI HÀNG HOÁ", jPanelLoaiSanPham);

        jPanelSanPham.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelSanPhamComponentShown(evt);
            }
        });

        tblSanPham.setBackground(new java.awt.Color(217, 217, 217));
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hàng Hóa", "Tên Hàng Hóa", "Loại Hàng Hóa", "Giá Bán", "Kích Thước", "Đơn Vị"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        lblTenSanPham_SanPham.setText("Tên Sản Phẩm*");

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
        jLabel7.setText("Loại Sản Phẩm*");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                    .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanelSanPhamLayout.setVerticalGroup(
            jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel35)
                .addGroup(jPanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSanPhamLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPaneSanPham.addTab("HÀNG HOÁ", jPanelSanPham);

        jTabbedPane3.addTab("HÀNG HOÁ", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/SanPham.png")), jTabbedPaneSanPham); // NOI18N

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

        lblMaKhachHang_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaKhachHang_KhachHang.setText("Mã Khách Hàng*");

        lblTenKhachHang_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenKhachHang_KhachHang.setText("Tên Khách Hàng*");

        lblSoDienThoai_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoDienThoai_KhachHang.setText("Số Điện Thoại*");

        lblDiaChi_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiaChi_KhachHang.setText("Địa Chỉ*");

        txtMaKhachHang_KhachHang.setEditable(false);
        txtMaKhachHang_KhachHang.setBackground(new java.awt.Color(241, 241, 241));

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
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMaKhachHang_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTenKhachHang_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSoDienThoai_KhachHang)
                    .addComponent(lblDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSoThue_KhachHang)
                    .addComponent(txtDiaChi_KhachHang)
                    .addComponent(txtSoDienThoai_KhachHang)
                    .addComponent(txtTenKhachHang_KhachHang)
                    .addComponent(txtMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
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
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem_KhachHang))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenKhachHang_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_KhachHang))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoDienThoai_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_KhachHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_KhachHang))
                        .addGap(12, 12, 12)
                        .addComponent(txtMaSoThue_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblMaKhachHang_KhachHang)
                        .addGap(19, 19, 19)
                        .addComponent(lblTenKhachHang_KhachHang)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoDienThoai_KhachHang)
                        .addGap(21, 21, 21)
                        .addComponent(lblDiaChi_KhachHang)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
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
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Kích Thước", "Số Lượng"
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
        jLabel66.setText("Tìm Kiếm Theo Mã");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("TÀI KHOẢN");

        javax.swing.GroupLayout jPanel_TaiKhoanLayout = new javax.swing.GroupLayout(jPanel_TaiKhoan);
        jPanel_TaiKhoan.setLayout(jPanel_TaiKhoanLayout);
        jPanel_TaiKhoanLayout.setHorizontalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem_TaiKhoan))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel_TaiKhoanLayout.setVerticalGroup(
            jPanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
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
                "STT", "Mã NV", "TênDN", "Mật Khẩu", "Vai Trò", "Tên", "SDT", "Địa Chỉ"
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

        lblMaNhanVien_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaNhanVien_NhanVien.setText("Mã Người Dùng");

        lblTenNhanVien_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenNhanVien_NhanVien.setText("Tên Đăng Nhập");

        lblSDT_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSDT_NhanVien.setText("Mật Khẩu");

        txtMaNhanVien_NhanVien.setEditable(false);
        txtMaNhanVien_NhanVien.setBackground(new java.awt.Color(241, 241, 241));

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
        lblTaiKhoan_NhanVien.setText("Vai Trò");

        lblTaiKhoan_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTaiKhoan_NhanVien1.setText("Địa Chỉ");

        lblSDT_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSDT_NhanVien1.setText("Số Điện Thoại");

        lblTenNhanVien_NhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenNhanVien_NhanVien1.setText("Tên Nhân Viên");

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
                        .addComponent(lblTenNhanVien_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSDT_NhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaiKhoan_NhanVien1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblTenNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenDN_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTaiKhoan_NhanVien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMK_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbQuyen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNhanVien_NhanVien)
                            .addComponent(txtMaNhanVien_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNhanVien_NhanVien)
                            .addComponent(txtTenDN_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_NhanVien))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSDT_NhanVien)
                            .addComponent(txtMK_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa_NhanVien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaiKhoan_NhanVien)
                            .addComponent(cbQuyen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset_NhanVien)))
                    .addComponent(btnThem_NhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNhanVien_NhanVien1)
                    .addComponent(txtTen_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSDT_NhanVien1)
                    .addComponent(txtSDT_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaiKhoan_NhanVien1)
                    .addComponent(txtDiaChi_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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
                    .addComponent(txtTimKiem_NhanVien)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                    .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanelNhanVienLayout.setVerticalGroup(
            jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanVienLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel32.setText("Nhân Viên");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Quyển");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        txtMaPhieuThu_PhieuThu.setEditable(false);
        txtMaPhieuThu_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));
        txtMaPhieuThu_PhieuThu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMaPhieuThu_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuThu_PhieuThuActionPerformed(evt);
            }
        });

        txtQuyen_PhieuThu.setBackground(new java.awt.Color(241, 241, 241));

        lblMaPhieuNhap_PhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaPhieuNhap_PhieuNhap.setText("Mã Phiếu Thu");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Khách Hàng");

        cbbKhachHang_PhieuThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbKhachHang_PhieuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbKhachHang_PhieuThuActionPerformed(evt);
            }
        });

        cbbNhanVien_PhieuThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Mã TKC");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Mã TKN");

        lblTongTien_HoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon1.setText("Tổng Tiền");

        txtTongTien_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTien_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_PhieuNhapActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Lý Do");

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

        cbbMaTKN_PhieuThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbMaTKC_PhieuThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaPhieuNhap_PhieuNhap))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbbNhanVien_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtMaPhieuThu_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
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
                            .addComponent(txtMaPhieuThu_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaPhieuNhap_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbbNhanVien_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua_PhieuThu)
                            .addComponent(cbbMaTKC_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnThem_PhieuThu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbKhachHang_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaTKN_PhieuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)
                                .addComponent(txtTongTien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(156, Short.MAX_VALUE))
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
        jLabel34.setText("Nhân Viên");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Quyển");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        txtMaPhieuChi_PhieuChi.setEditable(false);
        txtMaPhieuChi_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        txtMaPhieuChi_PhieuChi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMaPhieuChi_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuChi_PhieuChiActionPerformed(evt);
            }
        });

        txtQuyen_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));

        lblMaPhieuNhap_PhieuNhap1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaPhieuNhap_PhieuNhap1.setText("Mã Phiếu Chi");

        cbbNhanVien_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        cbbNhanVien_PhieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mã TKC");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Mã TKN");

        lblTongTien_HoaDon4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon4.setText("Tổng Tiền");

        txtTongTien_PhieuChi.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTien_PhieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_PhieuChiActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Lý Do");

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

        cbbMaTKC_PhieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbMaTKN_PhieuChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaPhieuNhap_PhieuNhap1))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuChi_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNhanVien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbbMaTKC_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuyen_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cbbMaTKN_PhieuChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
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
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuyen_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaPhieuNhap_PhieuNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaPhieuChi_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem_PhieuChi)
                        .addComponent(btnXuatPhieuChi_PhieuChi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNhanVien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua_PhieuChi)
                    .addComponent(cbbMaTKC_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTongTien_HoaDon4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTongTien_PhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
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

        jTable1.setBackground(new java.awt.Color(217, 217, 217));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SDĐK", "Ngày Tạo", "Số Tài Khoản", "Số Tiền", "Trạng Thái"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Mã SDĐK");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Số Tài Khoản");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Số Tiền");

        jButton1.setBackground(new java.awt.Color(112, 173, 71));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jComboBox1.setBackground(new java.awt.Color(241, 241, 241));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setBackground(new java.awt.Color(241, 241, 241));

        jTextField2.setBackground(new java.awt.Color(241, 241, 241));

        jTextField3.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, 162, Short.MAX_VALUE)
                                .addComponent(jTextField1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(72, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel9.setText("CHỨNG TỪ");

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

        jTextField7.setBackground(new java.awt.Color(241, 241, 241));

        lblTSHDBR7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTSHDBR7.setText("Đến");
        lblTSHDBR7.setName(""); // NOI18N

        jTextField8.setBackground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout jPanelChungTuLayout = new javax.swing.GroupLayout(jPanelChungTu);
        jPanelChungTu.setLayout(jPanelChungTuLayout);
        jPanelChungTuLayout.setHorizontalGroup(
            jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChungTuLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTSHDBR5)
                    .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelChungTuLayout.createSequentialGroup()
                            .addComponent(lblTSHDBR6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblTSHDBR7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanelChungTuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSHDBR6)
                    .addComponent(lblTSHDBR7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(12, 12, 12)
                .addComponent(lblTongTien_HoaDon7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem_ChungTu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("CHỨNG TỪ", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/HoaDon.png")), jPanelChungTu, ""); // NOI18N

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

        lblTSHDBR1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTSHDBR1.setText("THỐNG KÊ");
        lblTSHDBR1.setName(""); // NOI18N

        lblTSHDBR2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTSHDBR2.setText("Từ");
        lblTSHDBR2.setName(""); // NOI18N

        lblTSHDBR3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblTSHDBR3.setText("Đến");
        lblTSHDBR3.setName(""); // NOI18N

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

        jTextField4.setBackground(new java.awt.Color(241, 241, 241));

        jTextField5.setBackground(new java.awt.Color(241, 241, 241));

        jTextField6.setBackground(new java.awt.Color(241, 241, 241));

        jComboBox2.setBackground(new java.awt.Color(241, 241, 241));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Lọc theo");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setText("Mã BT");

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
                .addGap(59, 59, 59)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelButToanLayout.createSequentialGroup()
                                .addComponent(lblTSHDBR4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaButToan_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTSHDBR1)
                            .addGroup(jPanelButToanLayout.createSequentialGroup()
                                .addComponent(lblTSHDBR2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTSHDBR3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
        );
        jPanelButToanLayout.setVerticalGroup(
            jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButToanLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel75)
                .addGap(30, 30, 30)
                .addComponent(lblTSHDBR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSHDBR2)
                    .addComponent(lblTSHDBR3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSHDBR4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMaButToan_ButToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_ButToan))
                .addGap(38, 38, 38))
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
    public void disableTabs() {
//        this.jTabbedPane3.setEnabledAt(3,false);
//        this.jTabbedPane3.setEnabledAt(4,false);
//        this.jTabbedPane3.setEnabledAt(5,false);
    }
    private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPhamActionPerformed
        
        if(ProductService.isValidated(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham)){
            
            Integer id = ProductService.getId(tblSanPham);
            ProductDTO productDTO = ProductRepository.findById(id);
            productDTO.setName(this.txtTenSanPham_SanPham.getText());
            productDTO.setCategoryId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaLoaiSanPham_SanPham).toString()));
            productDTO.setSize(this.txtKichThuoc_SanPham.getText());
            productDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtGiaban_SanPham.getText()));
            productDTO.setUnit(txtDonVi_SanPham.getText());
            
            ProductRepository.update(productDTO);
            
            ProductService.getTables(this.tblSanPham, "");
            this.resetFormProduct();
        }
    }//GEN-LAST:event_bntSua_SanPhamActionPerformed

    private void txtTenKhachHang_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhachHang_KhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhachHang_KhachHangActionPerformed

    private void txtMaPhieuThu_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuThu_PhieuThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuThu_PhieuThuActionPerformed

    private void txtTongTien_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_PhieuNhapActionPerformed

    private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPhamActionPerformed
        
        Integer id = ProductService.getId(this.tblSanPham);
        
        if(ProductRepository.existWarehouseProduct(id)){
            AlertUtils.showAlertWarehouseExsitProduct();
            return;
        }
        
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
        ProductService.resetForm(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham);
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
            
            OrderDTO orderDTO = OrderRepository.findById(orderId);
            orderDTO.setTotalMoney(orderDTO.getTotalMoney().add(orderDetailDTO.getUnitPrice()
								.multiply(BigDecimal.valueOf(quantity))));
            OrderRepository.update(orderDTO);
            
            this.handleOrderItemCurrent();
            
            OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , orderDTO.getTotalMoney());
    }
    
    private void jPanelPhieuChiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelPhieuChiComponentShown
        

        List<Integer> noIds = AccountRepository.findAllIdAccountLevel3();
        if(!(noIds == null || noIds.isEmpty())) {
            List<ComboxModel> noDataComboBox = noIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKN_PhieuChi.setModel(ElementUtils.getDataCbb(noDataComboBox));
        }
                
        List<Integer> coIds = AccountRepository.findAllIdAccountLevel3();
        if(!(coIds == null || coIds.isEmpty())) {
            List<ComboxModel> coDataComboBox = coIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKC_PhieuChi.setModel(ElementUtils.getDataCbb(coDataComboBox));
        }
        
        PaymentService.getTables(this.tblPhieuChi, "");
        
         EmployeeService.setComboBoxList(cbbNhanVien_PhieuChi);

        this.resetFormPayment();
    }//GEN-LAST:event_jPanelPhieuChiComponentShown

    private void resetFormPayment(){
        PaymentService.resetForm(txtMaPhieuChi_PhieuChi,
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

        Integer id = ProductService.getId(tblSanPham);
        
        ProductService.fillDetailToForm(id,
                                        this.txtTenSanPham_SanPham,
                                        this.cbbMaLoaiSanPham_SanPham,
                                        txtGiaban_SanPham,
                                        txtKichThuoc_SanPham,
                                        txtDonVi_SanPham);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPhamActionPerformed
        
        if(ProductService.isValidated(this.txtTenSanPham_SanPham, 
                this.cbbMaLoaiSanPham_SanPham, txtGiaban_SanPham, txtKichThuoc_SanPham, txtDonVi_SanPham)){
            
            ProductDTO productDTO = new ProductDTO();
            productDTO.setName(this.txtTenSanPham_SanPham.getText());
            productDTO.setCategoryId(Integer.valueOf(ElementUtils.getCbbSelected(cbbMaLoaiSanPham_SanPham).toString()));
            productDTO.setPrice(PriceUtils.VNDconvertToPrice(this.txtGiaban_SanPham.getText()));
            productDTO.setSize(this.txtKichThuoc_SanPham.getText());
            productDTO.setUnit(txtDonVi_SanPham.getText());
            
            ProductRepository.insert(productDTO);
            
            ProductService.getTables(this.tblSanPham, "");
            this.resetFormProduct();
        }
    }//GEN-LAST:event_btnThem_SanPhamActionPerformed

    private void btnXoa_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuThuActionPerformed
        
        Integer id = ReceiptService.getId(this.tblPhieuThu);
        
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
        CustomerService.resetForm(txtMaKhachHang_KhachHang, txtTenKhachHang_KhachHang, 
                this.txtSoDienThoai_KhachHang, txtDiaChi_KhachHang, txtMaSoThue_KhachHang);
        
        btnThem_KhachHang.setEnabled(true);
    }
    
    private void jPanelLoaiSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLoaiSanPhamComponentShown
        this.reloadDataCategory();
    }//GEN-LAST:event_jPanelLoaiSanPhamComponentShown

    private void tblKhachHang_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHang_KhachHangMouseClicked
        Integer id = CustomerService.getId(tblKhachHang_KhachHang);
        
        CustomerService.fillDetailToForm(id,
                                        txtMaKhachHang_KhachHang,
                                        txtTenKhachHang_KhachHang,
                                        txtSoDienThoai_KhachHang,
                                        txtDiaChi_KhachHang,
                                        txtMaSoThue_KhachHang);
        
        btnThem_KhachHang.setEnabled(false);
    }//GEN-LAST:event_tblKhachHang_KhachHangMouseClicked

    private void btnThem_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_KhachHangActionPerformed

        if(CustomerService.isValidated(txtMaKhachHang_KhachHang, txtTenKhachHang_KhachHang, 
                txtSoDienThoai_KhachHang, txtDiaChi_KhachHang, true)){
            
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
        
        if(CustomerService.isValidated(txtMaKhachHang_KhachHang, txtTenKhachHang_KhachHang, 
                txtSoDienThoai_KhachHang, txtDiaChi_KhachHang, false)){
            
            Integer id = CustomerService.getId(tblKhachHang_KhachHang);
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
        
        Integer id = CategoryService.getId(tbLoaiSanPham_LoaiSanPham);
        
        CategoryService.fillDetailToForm(id,
                                        this.txtMaLoaiSanPham_LoaiSanPham,
                                        this.txtTenLoaiSanPham_LoaiSanPham);
        
        btnThem_LoaiSanPham.setEnabled(false);
    }
    
    private void btnSua_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_LoaiSanPhamActionPerformed

        if(CategoryService.isValidated(this.txtTenLoaiSanPham_LoaiSanPham)){
            
            CategoryDTO categoryDTO = CategoryRepository.findById(CategoryService.getId(this.tbLoaiSanPham_LoaiSanPham));
            
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
        
        if(CategoryService.isValidated(this.txtTenLoaiSanPham_LoaiSanPham)){
            
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
        
        List<Integer> noIds = AccountRepository.findAllIdAccountLevel3();
        if(!(noIds == null || noIds.isEmpty())) {
            List<ComboxModel> noDataComboBox = noIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKN_PhieuThu.setModel(ElementUtils.getDataCbb(noDataComboBox));
        }
                
        List<Integer> coIds = AccountRepository.findAllIdAccountLevel3();
        if(!(coIds == null || coIds.isEmpty())) {
            List<ComboxModel> coDataComboBox = coIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKC_PhieuThu.setModel(ElementUtils.getDataCbb(coDataComboBox));
        }

        this.resetFormReceipt();
    }//GEN-LAST:event_jPanelPhieuNhapComponentShown

    private void jPanelSDDKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelSDDKComponentShown
        //layDuLieuAboutMe();
    }//GEN-LAST:event_jPanelSDDKComponentShown

    private void tblPhieuThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuThuMouseClicked
        Integer id = ReceiptService.getId(this.tblPhieuThu);
        
       ReceiptService.fillDetailToForm(id,
                                        txtMaPhieuThu_PhieuThu,
                cbbNhanVien_PhieuThu,
                cbbKhachHang_PhieuThu,
                cbbMaTKN_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu,
                txtLyDo_PhieuThu);
       
        this.handleDisableAllBtnIfExportedOfReceipt();
    }//GEN-LAST:event_tblPhieuThuMouseClicked

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
        
        if(ReceiptService.isValidated(this.txtMaPhieuThu_PhieuThu, 
                this.cbbNhanVien_PhieuThu, cbbKhachHang_PhieuThu,
                cbbMaTKN_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu, true)){
            
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

        Integer id = CustomerService.getId(this.tblKhachHang_KhachHang);
        
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
        
        Integer id = CategoryService.getId(this.tbLoaiSanPham_LoaiSanPham);
        
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

    private void jTabbedPaneSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneSanPhamComponentShown
        this.reloadDataCategory();
    }//GEN-LAST:event_jTabbedPaneSanPhamComponentShown

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
        OrderDetailService.resetForm(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon);
    }
    
    private static void confirmAndExecute(Runnable action) {
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            action.run();
        }
    }
    
    private void resetFormOrder(){
        OrderService.resetForm(txtMaHoaDon_HoaDon, cbbKhachHang_HoaDon, txtTongTien_HoaDon, txtGhiChu_HoaDon, btnThem_HoaDon);
        
        btnXuatHoaDon_PhieuBanHang.setEnabled(false);
    }
    
    private boolean isValidatedFormOrder(){
        return OrderService.isValidated(cbbKhachHang_HoaDon);
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
        
        Integer orderId = OrderService.getId(tblOrder);
        
        OrderService.fillDetailToForm(orderId,
                                        txtMaHoaDon_HoaDon,
                                        cbbKhachHang_HoaDon,
                                        txtTongTien_HoaDon,
                                        txtGhiChu_HoaDon);
        
        this.handleListOrderDetailOfOrderItem(orderId);
        
        this.resetFormCTDH();
        
        this.handleDisableAllBtnIfExportedOfOrder();
    }
    
    private void handleListOrderDetailOfOrderItem(Integer orderId){
        
        OrderDetailService.getTable(orderId, tblCTHoaDon_ChiTietHoaDon);
        
        txtMaHoaDonCTHD_HoaDon.setText(orderId.toString());
    }
    
    private void Reset_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_LoaiSanPhamActionPerformed
        this.resetFormCategory();
    }//GEN-LAST:event_Reset_LoaiSanPhamActionPerformed

    private void resetFormCategory(){
        CategoryService.resetForm(this.txtMaLoaiSanPham_LoaiSanPham, 
                this.txtTenLoaiSanPham_LoaiSanPham);
        
        btnThem_LoaiSanPham.setEnabled(true);
    }
    
    private void jTabbedPanelThuChiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPanelThuChiComponentShown
        
        ReceiptService.getTables(this.tblPhieuThu, "");
        
        CustomerService.setComboBoxList(cbbKhachHang_PhieuThu);
        EmployeeService.setComboBoxList(cbbNhanVien_PhieuThu);
        
        List<Integer> noIds = AccountRepository.findAllIdAccountLevel3();
        if(!(noIds == null || noIds.isEmpty())) {
            List<ComboxModel> noDataComboBox = noIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKN_PhieuThu.setModel(ElementUtils.getDataCbb(noDataComboBox));
        }
                
        List<Integer> coIds = AccountRepository.findAllIdAccountLevel3();
        if(!(coIds == null || coIds.isEmpty())) {
            List<ComboxModel> coDataComboBox = coIds.stream().map(id -> new ComboxModel(id, id)).toList();
            cbbMaTKC_PhieuThu.setModel(ElementUtils.getDataCbb(coDataComboBox));
        }

        this.resetFormReceipt();

    }//GEN-LAST:event_jTabbedPanelThuChiComponentShown

    private void resetFormReceipt(){
        ReceiptService.resetForm(txtMaPhieuThu_PhieuThu,
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
    }//GEN-LAST:event_jPanelButToanComponentShown

    private void jDateChooserTuNgay_ThongKePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserTuNgay_ThongKePropertyChange
//        showThongKe();
    }//GEN-LAST:event_jDateChooserTuNgay_ThongKePropertyChange

    private void jDateChooserDen_ThongKePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserDen_ThongKePropertyChange
//        showThongKe();
    }//GEN-LAST:event_jDateChooserDen_ThongKePropertyChange

    private void jTabbedPaneNhanVienComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneNhanVienComponentShown
        EmployeeService.getTables(this.tblNhanVien_NhanVien, "");

        this.resetFormEmployee();

        RoleService.setComboBoxList(cbQuyen_NhanVien);
    }//GEN-LAST:event_jTabbedPaneNhanVienComponentShown

    private void resetFormEmployee(){
        EmployeeService.resetForm(txtMaNhanVien_NhanVien, txtTenDN_NhanVien, txtMK_NhanVien, cbQuyen_NhanVien, txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien);
        
        btnThem_NhanVien.setEnabled(true);
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
        
        if(EmployeeService.isValidated(txtMaNhanVien_NhanVien, txtTenDN_NhanVien, 
                txtMK_NhanVien, cbQuyen_NhanVien,  txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien, false)){
            
            Integer id = EmployeeService.getId(tblNhanVien_NhanVien);
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
        
        Integer id = EmployeeService.getId(this.tblNhanVien_NhanVien);
        
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
        
        if(EmployeeService.isValidated(txtMaNhanVien_NhanVien, txtTenDN_NhanVien, 
                txtMK_NhanVien, cbQuyen_NhanVien,  txtTen_NhanVien, txtSDT_NhanVien, txtDiaChi_NhanVien, true)){
            
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
        Integer id = EmployeeService.getId(tblNhanVien_NhanVien);
        
        EmployeeService.fillDetailToForm(id,
                                        txtMaNhanVien_NhanVien,
                                        txtTenDN_NhanVien,
                                        txtMK_NhanVien,
                                        cbQuyen_NhanVien,
                                        txtTen_NhanVien,
                                        txtSDT_NhanVien,
                                        txtDiaChi_NhanVien);
        
        btnThem_NhanVien.setEnabled(false);
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

        if(OrderDetailService.isValidated(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon)){

            Integer orderId = Integer.valueOf(txtMaHoaDon_HoaDon.getText());
            Integer productId = Integer.valueOf(ElementUtils.getCbbSelected(cbbSanPhamCTHD_HoaDon).toString());
            Integer quantity = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());

            Integer currentProductId = OrderDetailService.getProductId(tblCTHoaDon_ChiTietHoaDon);

            if(productId.equals(currentProductId)){

                OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);

                BigDecimal oldTotalMoneyDetail = orderDetailDTO.getTotalMoney();
                BigDecimal newTotalMoneyDetail = orderDetailDTO.getUnitPrice().multiply(BigDecimal.valueOf(quantity));

                orderDetailDTO.setQuantity(quantity);
                OrderDetailRepository.update(orderDetailDTO);

                OrderDTO orderDTO = OrderRepository.findById(orderId);
                orderDTO.setTotalMoney(orderDTO.getTotalMoney().subtract(oldTotalMoneyDetail).add(newTotalMoneyDetail));
                OrderRepository.update(orderDTO);

                this.handleOrderItemCurrent();

                OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , orderDTO.getTotalMoney());
            } else {

                OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, currentProductId);
                BigDecimal oldTotalMoneyDetail = orderDetailDTO.getTotalMoney();

                OrderDetailRepository.delete(orderId, productId);

                OrderDTO orderDTO = OrderRepository.findById(orderId);
                orderDTO.setTotalMoney(orderDTO.getTotalMoney().subtract(oldTotalMoneyDetail));
                OrderRepository.update(orderDTO);

                this.handleAddOrderDetail(orderId, productId, quantity);
            }

            //                if(!currentProductId.equals(productId) && OrderDetailRepository.existDetail(orderId, productId)){
                //                    AlertUtils.showAlertDuplicateOrderDetail();
                //                    return;
                //                }

        }
    }//GEN-LAST:event_btnSua_CTHDActionPerformed

    private void btnXoa_CTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_CTHDActionPerformed

        Integer orderId = OrderDetailService.getOrderId(tblCTHoaDon_ChiTietHoaDon);
        Integer productId = OrderDetailService.getProductId(tblCTHoaDon_ChiTietHoaDon);

        confirmAndExecute(() -> {
            OrderDetailDTO orderDetailDTO = OrderDetailRepository.findByOrderIdAndProductId(orderId, productId);

            OrderDetailRepository.delete(orderId, productId);

            OrderDTO orderDTO = OrderRepository.findById(orderId);
            orderDTO.setTotalMoney(orderDTO.getTotalMoney().subtract(orderDetailDTO.getTotalMoney()));
            OrderRepository.update(orderDTO);

            this.handleOrderItemCurrent();

            OrderService.updateFieldTotalMoneyOfOrderItemOnTable(tblOrder , orderDTO.getTotalMoney());
        });
    }//GEN-LAST:event_btnXoa_CTHDActionPerformed

    private void btnThem_CTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_CTHDActionPerformed

        if(OrderDetailService.isValidated(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon)){

            Integer orderId = Integer.valueOf(txtMaHoaDon_HoaDon.getText());
            Integer productId = Integer.valueOf(ElementUtils.getCbbSelected(cbbSanPhamCTHD_HoaDon).toString());
            Integer quantity = Integer.valueOf(txtSoLuongCTHD_HoaDon.getText());

            this.handleAddOrderDetail(orderId, productId, quantity);
        }
    }//GEN-LAST:event_btnThem_CTHDActionPerformed

    private void txtMaHoaDonCTHD_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoaDonCTHD_HoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHoaDonCTHD_HoaDonActionPerformed

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

        Integer id = OrderService.getId(tblOrder);

        confirmAndExecute(() -> {

            OrderDetailRepository.delete(id);

            OrderRepository.delete(id);

            this.reloadByActionOrder();

            this.clearTable(tblCTHoaDon_ChiTietHoaDon);
        });
    }//GEN-LAST:event_btnXoa_HoaDonActionPerformed

    private void btnSua_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_HoaDonActionPerformed

        if(this.isValidatedFormOrder()){

            Integer id = OrderService.getId(tblOrder);
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

    private void txtMaHoaDon_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoaDon_HoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHoaDon_HoaDonActionPerformed

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

        FormLogin frmLogin = new FormLogin();
        frmLogin.show();
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelLogoutComponentShown

    private void jPanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseClicked
        
    }//GEN-LAST:event_jPanelLogoutMouseClicked

    private void tblTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaiKhoanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTaiKhoanMouseClicked

    private void txtTimKiem_TaiKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_TaiKhoanKeyReleased
        AccountService.getTables(tblTaiKhoan, txtTimKiem_TaiKhoan.getText());
    }//GEN-LAST:event_txtTimKiem_TaiKhoanKeyReleased

    private void jPanel_TaiKhoanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_TaiKhoanComponentShown
        AccountService.getTables(tblTaiKhoan, "");
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
        Integer id = PaymentService.getId(this.tblPhieuChi);
        
       PaymentService.fillDetailToForm(id,
                                        txtMaPhieuChi_PhieuChi,
                cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi,
                txtLyDo_PhieuChi);
       
       this.handleDisableAllBtnIfExportedOfPayment();
    }//GEN-LAST:event_tblPhieuChiMouseClicked

    private void tblPhieuChiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuChiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPhieuChiMouseEntered

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseClicked

    private void txtMaPhieuChi_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuChi_PhieuChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuChi_PhieuChiActionPerformed

    private void txtTongTien_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_PhieuChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_PhieuChiActionPerformed

    private void btnThem_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuChiActionPerformed
        if(PaymentService.isValidated(this.txtMaPhieuChi_PhieuChi, 
                this.cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi, true)){
            
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
        Integer id = PaymentService.getId(this.tblPhieuChi);
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblChungTuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChungTuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblChungTuMouseClicked

    private void txtTimKiem_ChungTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem_ChungTuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiem_ChungTuActionPerformed

    private void txtTimKiem_ChungTuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_ChungTuKeyReleased
         OrderService.getTableCT(tblChungTu, txtTimKiem_ChungTu.getText());
    }//GEN-LAST:event_txtTimKiem_ChungTuKeyReleased

    private void jPanelChungTuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelChungTuComponentShown
        OrderService.getTableCT(tblChungTu, "");
    }//GEN-LAST:event_jPanelChungTuComponentShown

    private void btnSua_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuThuActionPerformed
        
        if(ReceiptService.isValidated(this.txtMaPhieuThu_PhieuThu, 
                this.cbbNhanVien_PhieuThu, cbbKhachHang_PhieuThu,
                cbbMaTKC_PhieuThu,
                cbbMaTKC_PhieuThu,
                txtTongTien_PhieuNhap, 
                txtQuyen_PhieuThu, false)){
            
            ReceiptDTO receiptDTO = ReceiptRepository.findById(ReceiptService.getId(this.tblPhieuThu));
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
        
        if(PaymentService.isValidated(this.txtMaPhieuChi_PhieuChi, 
                this.cbbNhanVien_PhieuChi,
                cbbMaTKN_PhieuChi,
                cbbMaTKC_PhieuChi,
                txtTongTien_PhieuChi, 
                txtQuyen_PhieuChi, false)){
            
            PaymentDTO paymentDTO = PaymentRepository.findById(PaymentService.getId(this.tblPhieuChi));
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
        
        Integer id = OrderService.getId(tblOrder);

        confirmAndExecute(() -> {
            
            OrderDTO order = OrderRepository.findById(id);
            order.setExported(true);
            
            OrderRepository.update(order);
            
            OrderService.updateFieldExportedOfOrderItemOnTable(tblOrder);
            handleOrderItemCurrent();
        });
    }//GEN-LAST:event_btnXuatHoaDon_PhieuBanHangActionPerformed

    private void createAccountingEntry(Date ctDate,  Integer accountNoId, Integer accountCoId, BigDecimal additionalPrice, Integer documentId){
        AccountEntryDTO accountEntyDTO = new AccountEntryDTO();
        accountEntyDTO.setDocumentDate(ctDate);
        accountEntyDTO.setAccountNoId(accountNoId);
        accountEntyDTO.setAccountCoId(accountCoId);
        accountEntyDTO.setAdditionalPrice(additionalPrice);
        accountEntyDTO.setDocumentId(documentId);
        
        AccountEntryRepository.insert(accountEntyDTO);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Report");

        // Tạo header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("STT");
        headerRow.createCell(1).setCellValue("Số CT");
        headerRow.createCell(2).setCellValue("Khách Hàng");
        headerRow.createCell(3).setCellValue("Nhân Viên Lập");
        headerRow.createCell(4).setCellValue("Ngày Lập");
        headerRow.createCell(5).setCellValue("Tổng Tiền");
        headerRow.createCell(6).setCellValue("Ghi Chú");

        List<OrderDTO> orders = OrderRepository.findAll("", true);
        int rowNum = 1;
        for (OrderDTO data : orders) {
            Row row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(rowNum++);
            row.createCell(1).setCellValue(data.getId());
            row.createCell(2).setCellValue(data.getEmployeeName());
            row.createCell(3).setCellValue(data.getEmployeeName());
            row.createCell(4).setCellValue(data.getCreatedDate());
            row.createCell(5).setCellValue(data.getTotalMoney().doubleValue());
            row.createCell(6).setCellValue(data.getNote());
        }

        try (FileOutputStream fileOut = new FileOutputStream("report.xlsx")) {
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(null, "Xuất thành công!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Xuất thất bại");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnXuatPhieuThu_PhieuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPhieuThu_PhieuThuActionPerformed
        Integer id = ReceiptService.getId(tblPhieuThu);

        confirmAndExecute(() -> {
            
            ReceiptDTO receiptDTO = ReceiptRepository.findById(id);
            receiptDTO.setIsExported(true);
            
            ReceiptRepository.update(receiptDTO);
            
            ReceiptService.updateFieldExportedOfReceiptItemOnTable(tblPhieuThu);
            
            this.createAccountingEntry(receiptDTO.getCreatedDate(),
                    receiptDTO.getAccountNoId(),
                    receiptDTO.getAccountCoId(),
                    receiptDTO.getPrice(),
                    receiptDTO.getDocumentId());
        });
    }//GEN-LAST:event_btnXuatPhieuThu_PhieuThuActionPerformed

    private void btnXuatPhieuChi_PhieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPhieuChi_PhieuChiActionPerformed
        Integer id = PaymentService.getId(tblPhieuChi);

        confirmAndExecute(() -> {
            
            PaymentDTO paymentDTO = PaymentRepository.findById(id);
            paymentDTO.setIsExported(true);
            
            PaymentRepository.update(paymentDTO);
            
            PaymentService.updateFieldExportedOfPaymentItemOnTable(tblPhieuChi);
            
            this.createAccountingEntry(paymentDTO.getCreatedDate(),
                    paymentDTO.getAccountNoId(),
                    paymentDTO.getAccountCoId(),
                    paymentDTO.getPrice(),
                    paymentDTO.getDocumentId());
        });
    }//GEN-LAST:event_btnXuatPhieuChi_PhieuChiActionPerformed

    private void btnXoa_ButToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_ButToanActionPerformed
        Integer id = AccountEntryService.getId(this.tbButToan);
        
        this.confirmAndExecute(() -> {
            
            AccountEntryDTO accountEntryDTO = AccountEntryRepository.findById(id);
            
            Integer documentId = accountEntryDTO.getDocumentId();
            DocumentDTO documentDTO = DocumentRepository.findById(documentId);
            String type = documentDTO.getType();
            
            switch(type){
                case "PT": {
                    ReceiptRepository.delete(id);
                    break;
                }
                case "PC": {
                    break;
                }
                default: throw new RuntimeException("Lỗi");
            }

            DocumentRepository.delete(documentId);

            ReceiptService.getTables(tbButToan, "");
            //this.resetFormReceipt();
        });
    }//GEN-LAST:event_btnXoa_ButToanActionPerformed

    private void tbButToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbButToanMouseClicked
        Integer id = AccountEntryService.getId(this.tbButToan);
        
        txtMaButToan_ButToan.setText(id.toString());
        
    }//GEN-LAST:event_tbButToanMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset_LoaiSanPham;
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnReSet_HoaDon;
    private javax.swing.JButton btnResetCTHD_HoaDon;
    private javax.swing.JButton btnReset_KhachHang;
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
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnXoa_ButToan;
    private javax.swing.JButton btnXoa_CTHD;
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
    private javax.swing.JComboBox<String> cbbNhanVien_PhieuChi;
    private javax.swing.JComboBox<String> cbbNhanVien_PhieuThu;
    private javax.swing.JComboBox<String> cbbSanPhamCTHD_HoaDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JTabbedPane jTabbedPaneSanPham;
    private javax.swing.JTabbedPane jTabbedPanelThuChi;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap_SanPham;
    private javax.swing.JLabel lblMaHoaDon_HoaDon;
    private javax.swing.JLabel lblMaHoaDon_HoaDon1;
    private javax.swing.JLabel lblMaHoaDon_HoaDon2;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblMaLoaiSanPham_LoaiSanPham;
    private javax.swing.JLabel lblMaNhanVien_NhanVien;
    private javax.swing.JLabel lblMaPhieuNhap_PhieuNhap;
    private javax.swing.JLabel lblMaPhieuNhap_PhieuNhap1;
    private javax.swing.JLabel lblNgayHetHan_SanPham;
    private javax.swing.JLabel lblSDT_NhanVien;
    private javax.swing.JLabel lblSDT_NhanVien1;
    private javax.swing.JLabel lblSoDienThoai_KhachHang;
    private javax.swing.JLabel lblSoLuongCTHD_HoaDon;
    private javax.swing.JLabel lblTSHDBR1;
    private javax.swing.JLabel lblTSHDBR2;
    private javax.swing.JLabel lblTSHDBR3;
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
    private javax.swing.JLabel lblTongTien_HoaDon;
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
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTable tblTaiKhoan;
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
    private javax.swing.JTextField txtMaHoaDonCTHD_HoaDon;
    private javax.swing.JTextField txtMaHoaDon_HoaDon;
    private javax.swing.JTextField txtMaKhachHang_KhachHang;
    private javax.swing.JTextField txtMaLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtMaNhanVien_NhanVien;
    private javax.swing.JTextField txtMaPhieuChi_PhieuChi;
    private javax.swing.JTextField txtMaPhieuThu_PhieuThu;
    private javax.swing.JTextField txtMaSoThue_KhachHang;
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
    private javax.swing.JTextField txtTimKiem_ChungTu;
    private javax.swing.JTextField txtTimKiem_HoaDon;
    private javax.swing.JTextField txtTimKiem_KhachHang;
    private javax.swing.JTextField txtTimKiem_NhanVien;
    private javax.swing.JTextField txtTimKiem_PhieuChi;
    private javax.swing.JTextField txtTimKiem_PhieuThu;
    private javax.swing.JTextField txtTimKiem_SanPham;
    private javax.swing.JTextField txtTimKiem_TaiKhoan;
    private javax.swing.JTextField txtTongTien_HoaDon;
    private javax.swing.JTextField txtTongTien_PhieuChi;
    private javax.swing.JTextField txtTongTien_PhieuNhap;
    // End of variables declaration//GEN-END:variables
}
