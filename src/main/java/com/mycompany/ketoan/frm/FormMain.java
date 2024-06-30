package com.mycompany.ketoan.frm;

import com.mycompany.ketoan.dto.CategoryDTO;
import com.mycompany.ketoan.dto.CustomerDTO;
import com.mycompany.ketoan.dto.EmployeeDTO;
import com.mycompany.ketoan.dto.OrderDTO;
import com.mycompany.ketoan.dto.OrderDetailDTO;
import com.mycompany.ketoan.dto.ProductDTO;
import com.mycompany.ketoan.repository.CategoryRepository;
import com.mycompany.ketoan.repository.CustomerRepository;
import com.mycompany.ketoan.repository.EmployeeRepository;
import com.mycompany.ketoan.repository.OrderDetailRepository;
import com.mycompany.ketoan.repository.OrderRepository;
import com.mycompany.ketoan.repository.ProductRepository;
import com.mycompany.ketoan.service.CategoryService;
import com.mycompany.ketoan.service.CustomerService;
import com.mycompany.ketoan.service.EmployeeService;
import com.mycompany.ketoan.service.OrderDetailService;
import com.mycompany.ketoan.service.OrderService;
import com.mycompany.ketoan.service.ProductService;
import com.mycompany.ketoan.service.RoleService;
import com.mycompany.ketoan.utils.AlertUtils;
import com.mycompany.ketoan.utils.DateTimeUtils;
import com.mycompany.ketoan.utils.ElementUtils;
import com.mycompany.ketoan.utils.ElementUtils.ComboxModel;
import com.mycompany.ketoan.utils.PriceUtils;
import com.mycompany.ketoan.utils.SecurityUtils;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
        jPanel3 = new javax.swing.JPanel();
        txtSoLuongCTHD_HoaDon = new javax.swing.JTextField();
        lblMaHoaDon_HoaDon3 = new javax.swing.JLabel();
        lblSoLuongCTHD_HoaDon = new javax.swing.JLabel();
        cbbSanPhamCTHD_HoaDon = new javax.swing.JComboBox<>();
        lblMaHoaDon_HoaDon1 = new javax.swing.JLabel();
        txtMaHoaDonCTHD_HoaDon = new javax.swing.JTextField();
        lblMaHoaDon_HoaDon2 = new javax.swing.JLabel();
        txtTongTienCTHD_HoaDon = new javax.swing.JTextField();
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
        jTabbedPaneNhapHang = new javax.swing.JTabbedPane();
        jPanelPhieuNhap = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblPhieuNhap_PhieuNhap = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblChiTietPhieuNhap_PhieuNhap = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        lblTongTien_HoaDon1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtMaPhieuNhap_PhieuNhap = new javax.swing.JTextField();
        txtTongTien_PhieuNhap = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtGhiChu_PhieuNhap = new javax.swing.JTextArea();
        btnThem_PhieuNhap = new javax.swing.JButton();
        btnXoa_PhieuNhap = new javax.swing.JButton();
        btnSua_PhieuNhap = new javax.swing.JButton();
        btnReSet_PhieuNhap = new javax.swing.JButton();
        cbbNhaPhanPhoi_PhieuNhap = new javax.swing.JComboBox<>();
        txtTenNhanVien_PhieuNhap = new javax.swing.JTextField();
        txtNgayNhap_PhieuNhap = new javax.swing.JTextField();
        txtMaNhanVien_PhieuNhap = new javax.swing.JTextField();
        Luu_PhieuNhap = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblMaPhieuNhap_PhieuNhap = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtSoLuongCTPN_PhieuNhap = new javax.swing.JTextField();
        lblMaHoaDon_HoaDon6 = new javax.swing.JLabel();
        lblSoLuongCTPN_PhieuNhap = new javax.swing.JLabel();
        cbbTenSanPhamCTPN_PhieuNhap = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtGhiChuCTPN_PhieuNhap = new javax.swing.JTextArea();
        lblMaHoaDon_HoaDon8 = new javax.swing.JLabel();
        txtMaPhieuNhapCTPN_PhieuNhap = new javax.swing.JTextField();
        lblMaHoaDon_HoaDon9 = new javax.swing.JLabel();
        txtTongTienCTPN_PhieuNhap = new javax.swing.JTextField();
        btnThem_CTPN = new javax.swing.JButton();
        btnXoa_CTPN = new javax.swing.JButton();
        btnSua_CTPN = new javax.swing.JButton();
        btnReset_CTPN = new javax.swing.JButton();
        jPanelNhaPhanPhoi = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblNhaPhanPhoi_NhaPhanPhoi = new javax.swing.JTable();
        lblMaNhaPhanPhoi_NhaPhanPhoi = new javax.swing.JLabel();
        lblTenNhaPhanPhoi_NhaPhanPhoi = new javax.swing.JLabel();
        lblSoDienThoai_NhaPhanPhoi = new javax.swing.JLabel();
        lblEmail_NhaPhanPhoi = new javax.swing.JLabel();
        lblDiaChi_NhaPhanPhoi = new javax.swing.JLabel();
        txtMaNhaPhanPhoi_NhaPhanPhoi = new javax.swing.JTextField();
        txtTenNhaPhanPhoi_NhaPhanPhoi = new javax.swing.JTextField();
        txtSoDienThoai_NhaPhanPhoi = new javax.swing.JTextField();
        txtEmail_NhaPhanPhoi = new javax.swing.JTextField();
        txtDiaChi_NhaPhanPhoi = new javax.swing.JTextField();
        btnThem_PhanPhoi = new javax.swing.JButton();
        btnXoa_PhanPhoi = new javax.swing.JButton();
        btnSua_PhanPhoi = new javax.swing.JButton();
        btnReset_PhanPhoi = new javax.swing.JButton();
        jPanelButToan = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tbDoanhThu_DoanhThu = new javax.swing.JTable();
        jLabel75 = new javax.swing.JLabel();
        lblTSHDBR = new javax.swing.JLabel();
        txtKQTSHDBR_ThongKe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKQTSTB_ThongKe = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelThuChi = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
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
                "STT", "Mã Đơn Hàng", "Khách Hàng", "Nhân Viên Lập", "Ngày Lập", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tblOrder.getColumnModel().getColumn(6).setResizable(false);
        }

        tblCTHoaDon_ChiTietHoaDon.setBackground(new java.awt.Color(217, 217, 217));
        tblCTHoaDon_ChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "STT", "Mã Đơn Hàng", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Tổng Tiền", "Ghi Chú"
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
                    .addComponent(btnXoa_HoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(14, Short.MAX_VALUE))
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

        lblMaHoaDon_HoaDon3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaHoaDon_HoaDon3.setText("Thành Tiền*");

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

        txtTongTienCTHD_HoaDon.setEditable(false);
        txtTongTienCTHD_HoaDon.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTienCTHD_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienCTHD_HoaDonActionPerformed(evt);
            }
        });

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
                    .addComponent(lblMaHoaDon_HoaDon3)
                    .addComponent(lblSoLuongCTHD_HoaDon))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHoaDonCTHD_HoaDon)
                    .addComponent(cbbSanPhamCTHD_HoaDon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuongCTHD_HoaDon)
                    .addComponent(txtTongTienCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHoaDon_HoaDon3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTienCTHD_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetCTHD_HoaDon)))
                    .addComponent(btnThem_CTHD))
                .addGap(0, 67, Short.MAX_VALUE))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDonLayout.createSequentialGroup()
                        .addComponent(txtTimKiem_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanelHoaDonLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        jTabbedPaneNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPaneNhapHang.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPaneNhapHangComponentShown(evt);
            }
        });

        jPanelPhieuNhap.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhieuNhap.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelPhieuNhapComponentShown(evt);
            }
        });

        tblPhieuNhap_PhieuNhap.setBackground(new java.awt.Color(217, 217, 217));
        tblPhieuNhap_PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "STT", "Mã Phiếu Thu", "Mã Nhân Viên", "Nhân Viên Thu", "Ngày Thu", "Nhà Phân Phối", "Tổng Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuNhap_PhieuNhap.getTableHeader().setReorderingAllowed(false);
        tblPhieuNhap_PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuNhap_PhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblPhieuNhap_PhieuNhap);
        if (tblPhieuNhap_PhieuNhap.getColumnModel().getColumnCount() > 0) {
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(0).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(1).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(2).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(3).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(4).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(5).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(6).setResizable(false);
            tblPhieuNhap_PhieuNhap.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CHI TIẾT PHIẾU THU");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PHIẾU THU");

        tblChiTietPhieuNhap_PhieuNhap.setBackground(new java.awt.Color(217, 217, 217));
        tblChiTietPhieuNhap_PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "STT", "Mã Phiếu Thu", "Sản Phẩm", "Số Lượng", "Thành Tiền", "Ghi Chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietPhieuNhap_PhieuNhap.getTableHeader().setReorderingAllowed(false);
        tblChiTietPhieuNhap_PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietPhieuNhap_PhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblChiTietPhieuNhap_PhieuNhap);
        if (tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumnCount() > 0) {
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(0).setResizable(false);
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(1).setResizable(false);
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(2).setResizable(false);
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(3).setResizable(false);
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(4).setResizable(false);
            tblChiTietPhieuNhap_PhieuNhap.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Nhà Phân Phối");

        lblTongTien_HoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTongTien_HoaDon1.setText("Tổng Tiền");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Nhân Viên");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("Ngày Thu");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        txtMaPhieuNhap_PhieuNhap.setEditable(false);
        txtMaPhieuNhap_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        txtMaPhieuNhap_PhieuNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMaPhieuNhap_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuNhap_PhieuNhapActionPerformed(evt);
            }
        });

        txtTongTien_PhieuNhap.setEditable(false);
        txtTongTien_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        txtTongTien_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTien_PhieuNhapActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Ghi Chú");

        txtGhiChu_PhieuNhap.setColumns(20);
        txtGhiChu_PhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGhiChu_PhieuNhap.setRows(5);
        jScrollPane12.setViewportView(txtGhiChu_PhieuNhap);

        btnThem_PhieuNhap.setText("Tạo mới");
        btnThem_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhieuNhapActionPerformed(evt);
            }
        });

        btnXoa_PhieuNhap.setText("Xóa");
        btnXoa_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhieuNhapActionPerformed(evt);
            }
        });

        btnSua_PhieuNhap.setText("Sửa");
        btnSua_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhieuNhapActionPerformed(evt);
            }
        });

        btnReSet_PhieuNhap.setText("Reset");
        btnReSet_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReSet_PhieuNhapActionPerformed(evt);
            }
        });

        cbbNhaPhanPhoi_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        cbbNhaPhanPhoi_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhaPhanPhoi_PhieuNhapActionPerformed(evt);
            }
        });

        txtTenNhanVien_PhieuNhap.setEditable(false);
        txtTenNhanVien_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));

        txtNgayNhap_PhieuNhap.setEditable(false);
        txtNgayNhap_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));

        txtMaNhanVien_PhieuNhap.setEditable(false);
        txtMaNhanVien_PhieuNhap.setBackground(new java.awt.Color(241, 241, 241));
        txtMaNhanVien_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVien_PhieuNhapActionPerformed(evt);
            }
        });

        Luu_PhieuNhap.setText("Lưu");
        Luu_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Luu_PhieuNhapActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Mã Nhân Viên");

        lblMaPhieuNhap_PhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaPhieuNhap_PhieuNhap.setText("Mã Phiếu Thu");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(lblMaPhieuNhap_PhieuNhap))
                            .addGap(20, 20, 20)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaPhieuNhap_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(txtMaNhanVien_PhieuNhap))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(btnSua_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Luu_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReSet_PhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(74, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenNhanVien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgayNhap_PhieuNhap)
                                    .addComponent(cbbNhaPhanPhoi_PhieuNhap, 0, 174, Short.MAX_VALUE)
                                    .addComponent(txtTongTien_PhieuNhap))))
                        .addContainerGap(198, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhieuNhap_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuNhap_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem_PhieuNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNhanVien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnSua_PhieuNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNhanVien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_PhieuNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayNhap_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Luu_PhieuNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbNhaPhanPhoi_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReSet_PhieuNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongTien_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTongTien_HoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        txtSoLuongCTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongCTPN_PhieuNhapActionPerformed(evt);
            }
        });
        txtSoLuongCTPN_PhieuNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuongCTPN_PhieuNhapKeyReleased(evt);
            }
        });

        lblMaHoaDon_HoaDon6.setText("Tổng Tiền");

        lblSoLuongCTPN_PhieuNhap.setText("Số Lượng");

        cbbTenSanPhamCTPN_PhieuNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTenSanPhamCTPN_PhieuNhapItemStateChanged(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Ghi Chú");

        txtGhiChuCTPN_PhieuNhap.setColumns(20);
        txtGhiChuCTPN_PhieuNhap.setRows(5);
        jScrollPane13.setViewportView(txtGhiChuCTPN_PhieuNhap);

        lblMaHoaDon_HoaDon8.setText("Mã Phiếu Nhập");

        txtMaPhieuNhapCTPN_PhieuNhap.setEditable(false);
        txtMaPhieuNhapCTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhieuNhapCTPN_PhieuNhapActionPerformed(evt);
            }
        });

        lblMaHoaDon_HoaDon9.setText("Sản Phẩm");

        txtTongTienCTPN_PhieuNhap.setEditable(false);
        txtTongTienCTPN_PhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienCTPN_PhieuNhapActionPerformed(evt);
            }
        });

        btnThem_CTPN.setText("Thêm");
        btnThem_CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_CTPNActionPerformed(evt);
            }
        });

        btnXoa_CTPN.setText("Xóa");
        btnXoa_CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_CTPNActionPerformed(evt);
            }
        });

        btnSua_CTPN.setText("Sửa");
        btnSua_CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_CTPNActionPerformed(evt);
            }
        });

        btnReset_CTPN.setText("Reset");
        btnReset_CTPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_CTPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaHoaDon_HoaDon9)
                            .addComponent(lblMaHoaDon_HoaDon6)
                            .addComponent(lblSoLuongCTPN_PhieuNhap))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lblMaHoaDon_HoaDon8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSoLuongCTPN_PhieuNhap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbTenSanPhamCTPN_PhieuNhap, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                    .addComponent(txtMaPhieuNhapCTPN_PhieuNhap, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongTienCTPN_PhieuNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel25))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnThem_CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa_CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSua_CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset_CTPN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaPhieuNhapCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaHoaDon_HoaDon8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHoaDon_HoaDon9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTenSanPhamCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuongCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaHoaDon_HoaDon6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTienCTPN_PhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem_CTPN)
                    .addComponent(btnXoa_CTPN)
                    .addComponent(btnSua_CTPN)
                    .addComponent(btnReset_CTPN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPhieuNhapLayout = new javax.swing.GroupLayout(jPanelPhieuNhap);
        jPanelPhieuNhap.setLayout(jPanelPhieuNhapLayout);
        jPanelPhieuNhapLayout.setHorizontalGroup(
            jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPhieuNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanelPhieuNhapLayout.setVerticalGroup(
            jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPhieuNhapLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        jTabbedPaneNhapHang.addTab("PHIẾU THU", jPanelPhieuNhap);

        jPanelNhaPhanPhoi.setBackground(new java.awt.Color(180, 228, 214));
        jPanelNhaPhanPhoi.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelNhaPhanPhoiComponentShown(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("NHÀ PHÂN PHỐI");

        tblNhaPhanPhoi_NhaPhanPhoi.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhà Phân Phối", "Tên Nhà Phân Phối", "Số Điện Thoại", "Email", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhaPhanPhoi_NhaPhanPhoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaPhanPhoi_NhaPhanPhoiMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblNhaPhanPhoi_NhaPhanPhoi);
        if (tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumnCount() > 0) {
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(0).setResizable(false);
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(1).setResizable(false);
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(2).setResizable(false);
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(3).setResizable(false);
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(4).setResizable(false);
            tblNhaPhanPhoi_NhaPhanPhoi.getColumnModel().getColumn(5).setResizable(false);
        }

        lblMaNhaPhanPhoi_NhaPhanPhoi.setText("Mã Nhà Phân Phối");

        lblTenNhaPhanPhoi_NhaPhanPhoi.setText("Tên Nhà Phân Phối");

        lblSoDienThoai_NhaPhanPhoi.setText("Số Điện Thoại");

        lblEmail_NhaPhanPhoi.setText("Email");

        lblDiaChi_NhaPhanPhoi.setText("Địa Chỉ");

        txtMaNhaPhanPhoi_NhaPhanPhoi.setEditable(false);

        txtSoDienThoai_NhaPhanPhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoai_NhaPhanPhoiActionPerformed(evt);
            }
        });

        btnThem_PhanPhoi.setText("Thêm");
        btnThem_PhanPhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_PhanPhoiActionPerformed(evt);
            }
        });

        btnXoa_PhanPhoi.setText("Xóa");
        btnXoa_PhanPhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_PhanPhoiActionPerformed(evt);
            }
        });

        btnSua_PhanPhoi.setText("Sửa");
        btnSua_PhanPhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_PhanPhoiActionPerformed(evt);
            }
        });

        btnReset_PhanPhoi.setText("Reset");
        btnReset_PhanPhoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_PhanPhoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNhaPhanPhoiLayout = new javax.swing.GroupLayout(jPanelNhaPhanPhoi);
        jPanelNhaPhanPhoi.setLayout(jPanelNhaPhanPhoiLayout);
        jPanelNhaPhanPhoiLayout.setHorizontalGroup(
            jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblSoDienThoai_NhaPhanPhoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEmail_NhaPhanPhoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTenNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblDiaChi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDienThoai_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnThem_PhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa_PhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua_PhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset_PhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNhaPhanPhoiLayout.setVerticalGroup(
            jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel26)
                .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNhaPhanPhoiLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNhaPhanPhoi_NhaPhanPhoi)
                            .addComponent(txtMaNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNhaPhanPhoi_NhaPhanPhoi)
                            .addComponent(txtTenNhaPhanPhoi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDienThoai_NhaPhanPhoi)
                            .addComponent(txtSoDienThoai_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail_NhaPhanPhoi)
                            .addComponent(txtEmail_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi_NhaPhanPhoi)
                            .addComponent(txtDiaChi_NhaPhanPhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelNhaPhanPhoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem_PhanPhoi)
                            .addComponent(btnXoa_PhanPhoi)
                            .addComponent(btnSua_PhanPhoi)
                            .addComponent(btnReset_PhanPhoi))))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        jTabbedPaneNhapHang.addTab("PHIẾU CHI", jPanelNhaPhanPhoi);

        jTabbedPane3.addTab("THU/CHI", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/NhaCungCap.png")), jTabbedPaneNhapHang); // NOI18N

        jPanelButToan.setBackground(new java.awt.Color(204, 204, 204));
        jPanelButToan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelButToanComponentShown(evt);
            }
        });

        tbDoanhThu_DoanhThu.setModel(new javax.swing.table.DefaultTableModel(
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
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tbDoanhThu_DoanhThu.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(tbDoanhThu_DoanhThu);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("BUT TOAN");

        lblTSHDBR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTSHDBR.setText("Tổng Số Hóa Đơn Bán Ra:");
        lblTSHDBR.setName(""); // NOI18N

        txtKQTSHDBR_ThongKe.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtKQTSHDBR_ThongKe.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tổng Số Tiền Bán:");

        txtKQTSTB_ThongKe.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtKQTSTB_ThongKe.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("THỐNG KÊ TỪ NGÀY:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ĐẾN:");

        javax.swing.GroupLayout jPanelButToanLayout = new javax.swing.GroupLayout(jPanelButToan);
        jPanelButToan.setLayout(jPanelButToanLayout);
        jPanelButToanLayout.setHorizontalGroup(
            jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButToanLayout.createSequentialGroup()
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelButToanLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel14))
                            .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelButToanLayout.createSequentialGroup()
                                    .addComponent(lblTSHDBR)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtKQTSHDBR_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtKQTSTB_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelButToanLayout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jLabel75)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButToanLayout.setVerticalGroup(
            jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButToanLayout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(jLabel75)
                .addGap(36, 36, 36)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelButToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSHDBR)
                    .addComponent(txtKQTSHDBR_ThongKe)
                    .addComponent(jLabel9)
                    .addComponent(txtKQTSTB_ThongKe))
                .addGap(70, 70, 70))
        );

        jTabbedPane3.addTab("BÚT TOÁN", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/user.png")), jPanelButToan); // NOI18N

        jPanelThuChi.setBackground(new java.awt.Color(204, 204, 204));
        jPanelThuChi.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanelThuChiComponentShown(evt);
            }
        });

        jLabel48.setText("Mã Nhân Viên");

        jLabel50.setText("Tên Nhân Viên");

        jLabel51.setText("Giới Tính");

        jLabel52.setText("Số Điện Thoại");

        jLabel53.setText("Địa Chỉ");

        jLabel57.setText("Quyền");

        jLabel58.setText("Ngày Sinh");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setText("THU CHI");

        javax.swing.GroupLayout jPanelThuChiLayout = new javax.swing.GroupLayout(jPanelThuChi);
        jPanelThuChi.setLayout(jPanelThuChiLayout);
        jPanelThuChiLayout.setHorizontalGroup(
            jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThuChiLayout.createSequentialGroup()
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThuChiLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelThuChiLayout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(840, Short.MAX_VALUE))
        );
        jPanelThuChiLayout.setVerticalGroup(
            jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThuChiLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel59)
                .addGap(31, 31, 31)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelThuChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(460, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("THU/CHI", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/DoanhThu.png")), jPanelThuChi); // NOI18N

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

        jTabbedPane3.addTab("Đăng Xuất", new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/ketoan/img/DangXuat.png")), jPanelLogout); // NOI18N

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

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void txtMaPhieuNhap_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuNhap_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuNhap_PhieuNhapActionPerformed

    private void txtTongTien_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTien_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTien_PhieuNhapActionPerformed

    private void txtSoLuongCTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongCTPN_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongCTPN_PhieuNhapActionPerformed

    private void txtMaPhieuNhapCTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhieuNhapCTPN_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhieuNhapCTPN_PhieuNhapActionPerformed

    private void txtTongTienCTPN_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienCTPN_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienCTPN_PhieuNhapActionPerformed

    private void txtSoDienThoai_NhaPhanPhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoai_NhaPhanPhoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoai_NhaPhanPhoiActionPerformed

    private void btnReset_PhanPhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_PhanPhoiActionPerformed
        //ResNhaPhanPhoi();
    }//GEN-LAST:event_btnReset_PhanPhoiActionPerformed

    private void cbbNhaPhanPhoi_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhaPhanPhoi_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNhaPhanPhoi_PhieuNhapActionPerformed

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
    
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
    
    private void jPanelNhaPhanPhoiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelNhaPhanPhoiComponentShown
//        layDuLieuNhaPhanPhoi();
    }//GEN-LAST:event_jPanelNhaPhanPhoiComponentShown

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

    private void btnXoa_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhieuNhapActionPerformed
//        String MaPhieuNhap = txtMaPhieuNhap_PhieuNhap.getText();
//        if (!MaPhieuNhap.equalsIgnoreCase("")) {
//            if(JOptionPane.showConfirmDialog(rootPane, "Ban Có Chắc Chắn Muốn Xóa Không?") == JOptionPane.YES_OPTION)
//            {
//                String cautruyvan = "delete PhieuNhap where MaPhieuNhap=" + MaPhieuNhap;
//                String ctvKiemThu = "select count(ChiTietPhieuNhap.MaPhieuNhap) as SoChiTietPhieuMua"
//                    + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and "
//                    + "PhieuNhap.MaPhieuNhap= " + MaPhieuNhap;
//                ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctvKiemThu);
//                System.out.println(ctvKiemThu);
//                int so1 = 0;
//                try {
//                    if (rs1.next()) {
//                        so1 = rs1.getInt("SoChiTietPhieuMua");
//                        if (so1 == 0) {
//                            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                            System.out.println("đã xóa");
//                            LayDuLieuPhieuNhap();
//                        } else {
//                            ThongBao("Không Thể Xóa Bởi Đã Tồn Tại Trong Phiếu Nhập!", "báo lỗi", 2);
//                        }
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            } else {
//                ThongBao("Bạn Chưa Chọn Phiếu Nhập Để Xóa", "Báo Lỗi", 2);  
//            }
    }//GEN-LAST:event_btnXoa_PhieuNhapActionPerformed

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

    private void tblNhaPhanPhoi_NhaPhanPhoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaPhanPhoi_NhaPhanPhoiMouseClicked
//        int viTriDongVuaBam = tblNhaPhanPhoi_NhaPhanPhoi.getSelectedRow();
//        txtMaNhaPhanPhoi_NhaPhanPhoi.setText(tblNhaPhanPhoi_NhaPhanPhoi.getValueAt(viTriDongVuaBam, 1).toString());
//        txtTenNhaPhanPhoi_NhaPhanPhoi.setText(tblNhaPhanPhoi_NhaPhanPhoi.getValueAt(viTriDongVuaBam, 2).toString());
//        txtSoDienThoai_NhaPhanPhoi.setText(tblNhaPhanPhoi_NhaPhanPhoi.getValueAt(viTriDongVuaBam, 3).toString());
//        txtEmail_NhaPhanPhoi.setText(tblNhaPhanPhoi_NhaPhanPhoi.getValueAt(viTriDongVuaBam, 4).toString());
//        txtDiaChi_NhaPhanPhoi.setText(tblNhaPhanPhoi_NhaPhanPhoi.getValueAt(viTriDongVuaBam, 5).toString());
    }//GEN-LAST:event_tblNhaPhanPhoi_NhaPhanPhoiMouseClicked

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

    private void btnThem_PhanPhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhanPhoiActionPerformed
//        String MaDoiTac, TenDoiTac, DiaChi, SDT, Email, ChuThich;
//        MaDoiTac = txtMaNhaPhanPhoi_NhaPhanPhoi.getText();
//        TenDoiTac = txtTenNhaPhanPhoi_NhaPhanPhoi.getText();
//        SDT = txtSoDienThoai_NhaPhanPhoi.getText();
//        Email = txtEmail_NhaPhanPhoi.getText();
//        DiaChi = txtDiaChi_NhaPhanPhoi.getText();
//        
//        String cautruyvan = "insert into NhaPhanPhoi values("
//                + "N'" + TenDoiTac + "',N'" + DiaChi + "' ,'" + SDT
//                + "','" + Email + "')";
//        System.out.println(cautruyvan);
//        boolean kiemtra = KiemTraNhapNhaPhanPhoi(true);
//        if (kiemtra) {
//            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//            System.out.println("Đã Thêm Thành Công");
//        } else {
//              System.out.println("Thất bại");;
//        }
//        layDuLieuNhaPhanPhoi();
    }//GEN-LAST:event_btnThem_PhanPhoiActionPerformed

    private void btnSua_PhanPhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhanPhoiActionPerformed
//        String MaDoiTac, TenDoiTac, DiaChi, SDT, Email;
//        MaDoiTac = txtMaNhaPhanPhoi_NhaPhanPhoi.getText();
//        TenDoiTac = txtTenNhaPhanPhoi_NhaPhanPhoi.getText();
//        SDT = txtSoDienThoai_NhaPhanPhoi.getText();
//        Email = txtEmail_NhaPhanPhoi.getText();
//        DiaChi = txtDiaChi_NhaPhanPhoi.getText();
//        
//        String cautruyvan = "update  NhaPhanPhoi set "
//                + " TenNhaPhanPhoi=N'" + TenDoiTac + "',DiaChi=N'" + DiaChi + "' ,SoDienThoai='" + SDT
//                + "',Email='" + Email + "'" + " Where MaNhaPhanPhoi=" + MaDoiTac;
//        System.out.println(cautruyvan);
//        boolean kiemtra = KiemTraNhapNhaPhanPhoi(false);
//        if (kiemtra) {
//            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//            System.out.println("Đã Thêm Thành Công");
//        } else {
//            System.out.println("Sửa thất bại");
//        }
//        layDuLieuNhaPhanPhoi();
    }//GEN-LAST:event_btnSua_PhanPhoiActionPerformed

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
//        LayDuLieuPhieuNhap();
//        cbbNhaPhanPhoi_PhieuNhap.setModel(LayDuLieucbb("NhaPhanPhoi", "TenNhaPhanPhoi", "MaNhaPhanPhoi"));
//        cbbTenSanPhamCTPN_PhieuNhap.setModel(LayDuLieucbb("SanPham","TenSanPham","MaSanPham"));
//        
//        String maNhanVien = getMaNhanVienHienTai();
//        String cautruyvan = "";
//        cautruyvan = "select MaNhanVien,TenNhanVien from NhanVien where NhanVien.MaNhanVien = '" + maNhanVien + "'";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if (rs.next()) {
//                txtMaNhanVien_PhieuNhap.setText(rs.getString("MaNhanVien"));
//                txtTenNhanVien_PhieuNhap.setText(rs.getString("TenNhanVien"));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        txtNgayNhap_PhieuNhap.setText(chuyenDateVeString(date));
//        txtTongTien_PhieuNhap.setText("0");
//        
//        String cautruyvan1 = "delete SaoLuuChiTietPhieuNhap";
//        FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan1);
    }//GEN-LAST:event_jPanelPhieuNhapComponentShown

    private void jPanelThuChiComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelThuChiComponentShown
        //layDuLieuAboutMe();
    }//GEN-LAST:event_jPanelThuChiComponentShown

    private void tblPhieuNhap_PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuNhap_PhieuNhapMouseClicked
//        txtGhiChu_PhieuNhap.setText("");
//        int viTriDongVuaBam = tblPhieuNhap_PhieuNhap.getSelectedRow();
//        txtMaPhieuNhap_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 1).toString());
//        txtMaNhanVien_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 2).toString());
//        txtTenNhanVien_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 3).toString());
//        txtNgayNhap_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 4).toString());
//        setSelectedCombobox(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 5).toString(), cbbNhaPhanPhoi_PhieuNhap);
//        txtTongTien_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 6).toString());
//        if(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 7) != null) txtGhiChu_PhieuNhap.setText(tblPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 7).toString());
//        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_PhieuNhap.getText());
    }//GEN-LAST:event_tblPhieuNhap_PhieuNhapMouseClicked

    private void btnThem_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_PhieuNhapActionPerformed
//        String MaNhanVien,TenNhanVien,NgayNhap;
//        
//        String maNhanVien = getMaNhanVienHienTai();
//        String cautruyvan = "";
//        cautruyvan = "select MaNhanVien,TenNhanVien from NhanVien where NhanVien.MaNhanVien = '" + maNhanVien + "'";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if (rs.next()) {
//                txtMaNhanVien_PhieuNhap.setText(rs.getString("MaNhanVien"));
//                txtTenNhanVien_PhieuNhap.setText(rs.getString("TenNhanVien"));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        
//        MaNhanVien = txtMaNhanVien_PhieuNhap.getText();
//        TenNhanVien = txtTenNhanVien_PhieuNhap.getText();
//        NgayNhap =chuyenDateVeString(date);
//        
//        
//        String MaNhaPhanPhoi, TongTien,GhiChu;
//        MaNhaPhanPhoi = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap);
//        TongTien = "0.0000";
//        
//        GhiChu= txtGhiChu_PhieuNhap.getText();
//        String xuluGhiChu = "NULL";// vẫn để GhiChu trong db là NULL
//        if(!GhiChu.equalsIgnoreCase(""))xuluGhiChu = "N'" + GhiChu +"'";
//        
//        String cautruyvan1 = "insert into PhieuNhap values(" + MaNhanVien + ","+ MaNhaPhanPhoi+ ",'" + NgayNhap + "'," + TongTien + "," + xuluGhiChu + ")";
//        System.out.println(cautruyvan1);
//
//        
//        FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan1);
//        System.out.println("Đã Thêm Thành Công");
//        LayDuLieuPhieuNhap();
    }//GEN-LAST:event_btnThem_PhieuNhapActionPerformed

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

    private void btnXoa_PhanPhoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_PhanPhoiActionPerformed
//        String MaDNhaPhanPhoi = txtMaNhaPhanPhoi_NhaPhanPhoi.getText();
//        if (!MaDNhaPhanPhoi.equalsIgnoreCase("")) {
//            if(JOptionPane.showConfirmDialog(rootPane, "Ban Có Chắc Chắn Muốn Xóa Không?") == JOptionPane.YES_OPTION){
//                String cautruyvan = "delete NhaPhanPhoi where MaNhaPhanPhoi=" + MaDNhaPhanPhoi;
//                String ctvKiemThu = "select count(MaPhieuNhap) as SoPhieuNhap"
//                        + " from NhaPhanPhoi,PhieuNhap where NhaPhanPhoi.MaNhaPhanPhoi=PhieuNhap.MaNhaPhanPhoi"
//                        + " and  NhaPhanPhoi.MaNhaPhanPhoi=" + MaDNhaPhanPhoi;
//                ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctvKiemThu);
//                System.out.println(ctvKiemThu);
//                int so1 = 0;
//                try {
//                    if (rs1.next()) {
//                        so1 = rs1.getInt("SoPhieuNhap");
//                        if (so1 == 0) {
//                            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                            System.out.println("đã xóa");
//                            layDuLieuNhaPhanPhoi();
//                            ResNhaPhanPhoi();
//                        } else {
//                            ThongBao("Không Thể Xóa Bởi Đã Tồn Tại Nhà Phân Phối Trong Phiếu Nhập!", "Báo Lỗi", 2);
//                        }
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        } else {
//            ThongBao("Bạn Chưa Chọn Nhà Phân Phối Để Xóa", "Báo Lỗi", 2); 
//        }
    }//GEN-LAST:event_btnXoa_PhanPhoiActionPerformed

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

    private void btnReSet_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReSet_PhieuNhapActionPerformed
//        txtMaPhieuNhap_PhieuNhap.setText("");
//        String maNhanVien = getMaNhanVienHienTai();
//        String cautruyvan = "";
//        cautruyvan = "select MaNhanVien,TenNhanVien from NhanVien where NhanVien.MaNhanVien = '" + maNhanVien + "'";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if (rs.next()) {
//                txtMaNhanVien_PhieuNhap.setText(rs.getString("MaNhanVien"));
//                txtTenNhanVien_PhieuNhap.setText(rs.getString("TenNhanVien"));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        txtNgayNhap_PhieuNhap.setText(chuyenDateVeString(date));
//        cbbNhaPhanPhoi_PhieuNhap.setSelectedIndex(0);
//        txtTongTien_PhieuNhap.setText("0.0000");
//        txtGhiChu_PhieuNhap.setText("");
    }//GEN-LAST:event_btnReSet_PhieuNhapActionPerformed

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

    private void tblChiTietPhieuNhap_PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietPhieuNhap_PhieuNhapMouseClicked
//        txtGhiChuCTPN_PhieuNhap.setText("");
//        int viTriDongVuaBam = tblChiTietPhieuNhap_PhieuNhap.getSelectedRow();
//        txtMaPhieuNhapCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 1).toString());
//        setSelectedCombobox(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 2).toString(), cbbTenSanPhamCTPN_PhieuNhap);
//        txtSoLuongCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 3).toString());
//        txtTongTienCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 4).toString());
//        if(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 5) != null) txtGhiChuCTPN_PhieuNhap.setText(tblChiTietPhieuNhap_PhieuNhap.getValueAt(viTriDongVuaBam, 5).toString());
    }//GEN-LAST:event_tblChiTietPhieuNhap_PhieuNhapMouseClicked

    private void btnSua_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_PhieuNhapActionPerformed
//        String MaNhaPhanPhoi = GetCbbSelected(cbbNhaPhanPhoi_PhieuNhap);
//        
//        String GhiChu= txtGhiChu_PhieuNhap.getText();
//        String xuluGhiChu = "NULL";// vẫn để GhiChu trong db là NULL
//        if(!GhiChu.equalsIgnoreCase(""))xuluGhiChu = "N'" + GhiChu +"'";
//        
//        String cautruyvan =  "update PhieuNhap set MaNhaPhanPhoi = " + MaNhaPhanPhoi + ","
//                + " GhiChu=" + xuluGhiChu + " where MaPhieuNhap=" + txtMaPhieuNhap_PhieuNhap.getText();
//        
//        
//        
//                String ctvKiemThu = "select count(ChiTietPhieuNhap.MaPhieuNhap) as SoChiTietPhieuMua"
//                    + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and "
//                    + "PhieuNhap.MaPhieuNhap= " + txtMaPhieuNhap_PhieuNhap.getText();
//                ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctvKiemThu);
//                System.out.println(ctvKiemThu);
//                int so1 = 0;
//                try {
//                    if (rs1.next()) {
//                        so1 = rs1.getInt("SoChiTietPhieuMua");
//                        if (so1 == 0) {
//                            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                            System.out.println("Đã Sửa Thành Công");
//                            LayDuLieuPhieuNhap();
//                        } else {
//                            ThongBao("Không Thể Sửa Vì Đã Lưu(Xuất) Phiếu Nhập", "báo lỗi", 2);
//                        }
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//                }
    }//GEN-LAST:event_btnSua_PhieuNhapActionPerformed

    private void btnThem_CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_CTPNActionPerformed
//        String MaPhieuNhap,MaSanPham,SoLuong,TongTien,GhiChu;
//        MaPhieuNhap=txtMaPhieuNhap_PhieuNhap.getText();
//        MaSanPham=GetCbbSelected(cbbTenSanPhamCTPN_PhieuNhap);
//        SoLuong=txtSoLuongCTPN_PhieuNhap.getText();
//        TongTien=txtTongTienCTPN_PhieuNhap.getText();
//        
//        GhiChu=txtGhiChuCTPN_PhieuNhap.getText();
//        String xuluGhiChu = "NULL";// vẫn để GhiChu trong db là NULL
//        if(!GhiChu.equalsIgnoreCase(""))xuluGhiChu = "N'" + GhiChu +"'";
//        
//        
//        String cautruyvan = "insert into SaoLuuChiTietPhieuNhap values("
//                + MaPhieuNhap + " , " + MaSanPham + " ," + SoLuong
//                + "," + TongTien + "," + xuluGhiChu + ")";
//        System.out.println(cautruyvan);
//        
//        boolean kiemtra = KiemTraNhapCTPN(true);
//        if (kiemtra) {
//            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//            LayDuLieuSaoLuuChiTietPhieuNhap(MaPhieuNhap);
//            SetTongTienPhieuNhap(MaPhieuNhap);
//            System.out.println("Đã Thêm Thành Công");
//            txtMaPhieuNhapCTPN_PhieuNhap.setText("");
//        cbbTenSanPhamCTPN_PhieuNhap.setSelectedIndex(0);
//        txtSoLuongCTPN_PhieuNhap.setText("");
//        txtTongTienCTPN_PhieuNhap.setText("");
//        txtGhiChuCTPN_PhieuNhap.setText("");
//            
//        } else {
//            System.out.println("Thất Bại");
//        }
    }//GEN-LAST:event_btnThem_CTPNActionPerformed

    private void btnSua_CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_CTPNActionPerformed
//        String MaPhieuNhap = txtMaPhieuNhapCTPN_PhieuNhap.getText();
//        String MaSanPham = GetCbbSelected(cbbTenSanPhamCTPN_PhieuNhap);
//        String SoLuong = txtSoLuongCTPN_PhieuNhap.getText();
//        String TongTien = txtTongTienCTPN_PhieuNhap.getText();
//        
//        String GhiChu=txtGhiChuCTPN_PhieuNhap.getText();
//        String xuluGhiChu = "NULL";// vẫn để GhiChu trong db là NULL
//        if(!GhiChu.equalsIgnoreCase(""))xuluGhiChu = "N'" + GhiChu +"'";
//        
//        String cautruyvan = "update SaoLuuChiTietPhieuNhap set"
//                                    + " MaSanPham= " + MaSanPham + ",SoLuong=" + SoLuong
//                                    + ",TongTienSanPham=" + TongTien + ",GhiChu = " + xuluGhiChu + " where MaPhieuNhap="+MaPhieuNhap + " and MaSanPham=" +MaSanPham;
//        
//        boolean kiemtra = KiemTraNhapCTPN(false);
//        if (kiemtra) {
//            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//            SetTongTienPhieuNhap(MaPhieuNhap);
//            System.out.println("Đã sửa Thành Công");
//            txtMaPhieuNhapCTPN_PhieuNhap.setText("");
//        cbbTenSanPhamCTPN_PhieuNhap.setSelectedIndex(0);
//        txtSoLuongCTPN_PhieuNhap.setText("");
//        txtTongTienCTPN_PhieuNhap.setText("");
//        txtGhiChuCTPN_PhieuNhap.setText("");
//            LayDuLieuSaoLuuChiTietPhieuNhap(MaPhieuNhap);
//            
//        } else {
//            System.out.println("Thất Bại");
//        }
    }//GEN-LAST:event_btnSua_CTPNActionPerformed

    private void txtSoLuongCTPN_PhieuNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongCTPN_PhieuNhapKeyReleased
//        int SoLuong = 0;
//        double Tien = 0;
//        try {
//            SoLuong = Integer.valueOf(txtSoLuongCTPN_PhieuNhap.getText());
//        } catch (Exception e) {
//        }
//        int Gia = GetGiaSanPham(GetCbbSelected(cbbTenSanPhamCTPN_PhieuNhap));
//        Tien = (double) Gia * SoLuong;
//        txtTongTienCTPN_PhieuNhap.setText(String.valueOf(Tien));
    }//GEN-LAST:event_txtSoLuongCTPN_PhieuNhapKeyReleased

    private void btnReset_CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_CTPNActionPerformed
//        txtMaPhieuNhapCTPN_PhieuNhap.setText("");
//        cbbTenSanPhamCTPN_PhieuNhap.setSelectedIndex(0);
//        txtSoLuongCTPN_PhieuNhap.setText("");
//        txtTongTienCTPN_PhieuNhap.setText("");
//        txtGhiChuCTPN_PhieuNhap.setText("");
    }//GEN-LAST:event_btnReset_CTPNActionPerformed

    private void loadAllComboBoxOfOrderPanel(){
        CustomerService.setComboBoxList(cbbKhachHang_HoaDon);
        ProductService.setComboBoxList(cbbSanPhamCTHD_HoaDon);
    }
    
    private void resetFormCTDH(){
        OrderDetailService.resetForm(cbbSanPhamCTHD_HoaDon, txtSoLuongCTHD_HoaDon, txtTongTienCTHD_HoaDon);
    }
    
    private static void confirmAndExecute(Runnable action) {
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn?", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            action.run();
        }
    }
    
    private void resetFormOrder(){
        OrderService.resetForm(txtMaHoaDon_HoaDon, cbbKhachHang_HoaDon, txtTongTien_HoaDon, txtGhiChu_HoaDon, btnThem_HoaDon);
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
        
        btnThem_HoaDon.setEnabled(false);
        
        this.handleListOrderDetailOfOrderItem(orderId);
        
        this.resetFormCTDH();
    }
    
    private void handleListOrderDetailOfOrderItem(Integer orderId){
        
        OrderDetailService.getTable(orderId, tblCTHoaDon_ChiTietHoaDon);
        
        txtMaHoaDonCTHD_HoaDon.setText(orderId.toString());
    }
    
    private void cbbTenSanPhamCTPN_PhieuNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTenSanPhamCTPN_PhieuNhapItemStateChanged
//           int SoLuong = 0;
//        double Tien = 0;
//        try {
//            SoLuong = Integer.valueOf(txtSoLuongCTPN_PhieuNhap.getText());
//        } catch (Exception e) {
//        }
//        int Gia = GetGiaSanPham(GetCbbSelected(cbbTenSanPhamCTPN_PhieuNhap));
//        Tien = (double) Gia * SoLuong;
//        txtTongTienCTPN_PhieuNhap.setText(String.valueOf(Tien));
    }//GEN-LAST:event_cbbTenSanPhamCTPN_PhieuNhapItemStateChanged

    private void Reset_LoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_LoaiSanPhamActionPerformed
        this.resetFormCategory();
    }//GEN-LAST:event_Reset_LoaiSanPhamActionPerformed

    private void resetFormCategory(){
        CategoryService.resetForm(this.txtMaLoaiSanPham_LoaiSanPham, 
                this.txtTenLoaiSanPham_LoaiSanPham);
        
        btnThem_LoaiSanPham.setEnabled(true);
    }
    
    private void Luu_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Luu_PhieuNhapActionPerformed
//        ThongBao("Bạn Hãy Xem Lại Thật Kĩ Vì Xuất Phiếu Thì Không Thể Thực Hiện Các Thao Tác Chỉnh Sữa\n", "Nhắc Nhở", 2);
//        if(JOptionPane.showConfirmDialog(rootPane, "Ban Có Chắc Chắn Muốn Lưu Phiếu Nhập Này Không?") == JOptionPane.YES_OPTION){
//            try {
//                String chuyenSaoLuuSangChiTietPhieuNhap = "select * from SaoLuuChiTietPhieuNhap where MaPhieuNhap = " + txtMaPhieuNhap_PhieuNhap.getText();
//                ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(chuyenSaoLuuSangChiTietPhieuNhap);
//                while(rs.next()){
//                    String x = rs.getString("GhiChu");
//                    if(x != null) x = "N'" + x + "'";
//                    else x = "NULL";
//                    
//                    String cautruyvan = "insert into ChiTietPhieuNhap values("
//                            + rs.getString("MaPhieuNhap") + " , " + rs.getString("MaSanPham") + " ," + rs.getString("SoLuong")
//                            + "," + rs.getString("TongTienSanPham") + "," + x + ")";
//                    System.out.println(cautruyvan);
//                    FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                    
//                    int slnhap = Integer.parseInt(rs.getString("SoLuong"));
//                    int maSanPham = rs.getInt("MaSanPham");
//                    String cautruyvan2 = "select SoLuongTrongKho from SoLuongSanPhamTrongKho where MaSanPham = " + maSanPham;
//                    ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(cautruyvan2);
//                    if(rs1.next()){
//                        int sl = rs1.getInt("SoLuongTrongKho");
//                        cautruyvan2 = "update SoLuongSanPhamTrongKho set SoLuongTrongKho = " + (sl+ slnhap)+" where MaSanPham = " + maSanPham;
//                        FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan2);
//                    }
//                }
//                
//              
//                String cautruyvan = "delete SaoLuuChiTietPhieuNhap";
//                FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                
//                
//                String ctv = "update PhieuNhap set TongTienCaPhieuNhap= " + txtTongTien_PhieuNhap.getText() + " where MaPhieuNhap=" + txtMaPhieuNhap_PhieuNhap.getText();
//                System.out.println(ctv);
//                FormLogin.connection.ExcuteQueryUpdateDB(ctv);
//                LayDuLieuPhieuNhap();
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        else{
//            String cautruyvan = "delete SaoLuuChiTietPhieuNhap";
//            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//        }
//        LayDuLieuChiTietPhieuNhap(txtMaPhieuNhap_PhieuNhap.getText());
//        
//        txtNgayNhap_PhieuNhap.setText(chuyenDateVeString(date));
//        cbbNhaPhanPhoi_PhieuNhap.setSelectedIndex(0);
//        txtTongTien_PhieuNhap.setText("0.0000");
//        txtGhiChu_PhieuNhap.setText("");
//        txtMaPhieuNhap_PhieuNhap.setText("");
//        
//
    }//GEN-LAST:event_Luu_PhieuNhapActionPerformed

    private void btnXoa_CTPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_CTPNActionPerformed
//        String MaPhieuNhap = txtMaPhieuNhapCTPN_PhieuNhap.getText();
//        String MaSanPham = GetCbbSelected(cbbTenSanPhamCTPN_PhieuNhap);
//        if (!MaPhieuNhap.equalsIgnoreCase("")) {
//            if(JOptionPane.showConfirmDialog(rootPane, "Ban Có Chắc Chắn Muốn Loại Bỏ Đi Không?") == JOptionPane.YES_OPTION)
//            {
//                String cautruyvan = "delete SaoLuuChiTietPhieuNhap where MaPhieuNhap =" + MaPhieuNhap + " and MaSanPham=" + MaSanPham;
//                String ctvKiemThu = "select count(ChiTietPhieuNhap.MaPhieuNhap) as SoChiTietPhieuMua"
//                    + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and "
//                    + "PhieuNhap.MaPhieuNhap= " + MaPhieuNhap;
//                ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctvKiemThu);
//                System.out.println(ctvKiemThu);
//                int so1 = 0;
//                try {
//                    if (rs1.next()) {
//                        so1 = rs1.getInt("SoChiTietPhieuMua");
//                        if (so1 == 0) {
//                            FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
//                            SetTongTienPhieuNhap(MaPhieuNhap);
//                            txtMaPhieuNhapCTPN_PhieuNhap.setText("");
//        cbbTenSanPhamCTPN_PhieuNhap.setSelectedIndex(0);
//        txtSoLuongCTPN_PhieuNhap.setText("");
//        txtTongTienCTPN_PhieuNhap.setText("");
//        txtGhiChuCTPN_PhieuNhap.setText("");
//                            System.out.println("đã xóa");
//                            LayDuLieuSaoLuuChiTietPhieuNhap(MaPhieuNhap);
//                        } else {
//                            ThongBao("Không Thể Loại Bỏ Vì Phiếu Nhập Này Đã Được Lưu!", "báo lỗi", 2);
//                        }
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            } else {
//                ThongBao("Bạn Chưa Chọn Sản Phẩm Để Xóa", "Báo Lỗi", 2);  
//            }
    }//GEN-LAST:event_btnXoa_CTPNActionPerformed

    private void jTabbedPaneNhapHangComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPaneNhapHangComponentShown
//        cbbTenSanPhamCTPN_PhieuNhap.setModel(LayDuLieucbb("SanPham","TenSanPham","MaSanPham"));
//        
//        String cautruyvan = "delete SaoLuuChiTietPhieuNhap";
//        FormLogin.connection.ExcuteQueryUpdateDB(cautruyvan);
    }//GEN-LAST:event_jTabbedPaneNhapHangComponentShown

    private void jPanelButToanComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelButToanComponentShown
//        jDateChooserTuNgay_ThongKe.setDate(chuyenStringVeDate("2021-01-01")); 
//        showThongKe();
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

    private void txtTongTienCTHD_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienCTHD_HoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienCTHD_HoaDonActionPerformed

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
            txtSoLuongCTHD_HoaDon,
            txtTongTienCTHD_HoaDon);
    }//GEN-LAST:event_tblCTHoaDon_ChiTietHoaDonMouseClicked

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked

        this.handleOrderItemCurrent();
    }//GEN-LAST:event_tblOrderMouseClicked

    private void txtTimKiem_NhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiem_NhanVienKeyReleased
        EmployeeService.getTables(this.tblNhanVien_NhanVien, this.txtTimKiem_NhanVien.getText());
    }//GEN-LAST:event_txtTimKiem_NhanVienKeyReleased

    private void jTabbedPane3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane3ComponentShown
        
    }//GEN-LAST:event_jTabbedPane3ComponentShown

    private void jPanelLogoutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanelLogoutComponentShown

        FormUtils.frmLogin = new FormLogin();
        FormUtils.frmLogin.show();
        FormUtils.frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelLogoutComponentShown

    private void jPanelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLogoutMouseClicked
        
    }//GEN-LAST:event_jPanelLogoutMouseClicked

    private void txtMaNhanVien_PhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVien_PhieuNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVien_PhieuNhapActionPerformed

//    public void layDuLieuTaiKhoan() {
//        String cautruyvan = "";
//        cautruyvan = "select * from DangNhap";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Đăng Nhập", "Tên Đăng Nhập", "Mật Khẩu", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblTaiKhoan_TaiKhoan.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[5];
//                item[0] = c;
//                item[1] = rs.getString("MaDangNhap");
//                item[2] = rs.getString("TaiKhoan");
//                item[3] = rs.getString("MatKhau");
//                item[4] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }

//    public void LayDuLieuSanPham() {
//        String cautruyvan = "";
//        cautruyvan = "select * from SanPham,LoaiSanPham,NhaSanXuat,SoLuongSanPhamTrongKho where "
//                + "SanPham.MaLoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.MaNhaSanXuat=NhaSanXuat.MaNhaSanXuat and SanPham.MaSanPham=SoLuongSanPhamTrongKho.MaSanPham";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Loại Sản Phẩm", "Giá Nhập", "Giá Bán", "Nhà Sản Xuất", "Số Lượng", "Ngày Sản Xuất", "Ngày Hết Hạn","Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblSanPham.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[11];
//                item[0] = c;
//                item[1] = rs.getInt("MaSanPham");
//                item[2] = rs.getString("TenSanPham");
//                item[3] = rs.getString("TenLoaiSanPham");
//                
//                String tien = rs.getString("GiaNhap").substring(0,rs.getString("GiaNhap").indexOf("."));
//                Long tien1 = Long.valueOf(tien);
//                String tien2 = currencyVN.format(tien1);
//                item[4] = tien2;
//                
//                tien = rs.getString("GiaBan").substring(0,rs.getString("GiaBan").indexOf("."));
//                tien1 = Long.valueOf(tien);
//                tien2 = currencyVN.format(tien1);
//                item[5] = tien2;
//                item[6] = rs.getString("TenNhaSanXuat");
//                item[7] = rs.getInt("SoLuongTrongKho");
//                item[8] = rs.getDate("NgaySanXuat");
//                item[9] = rs.getDate("NgayHetHan");
//                item[10] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }

//    public void layDuLieuKhachHang() {
//        String cautruyvan = "";
//        cautruyvan = "select * from KhachHang";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblKhachHang_KhachHang.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[9];
//                item[0] = c;
//                item[1] = rs.getInt("MaKhachHang");
//                item[2] = rs.getString("TenKhachHang");
//                if (rs.getBoolean("GioiTinh") == true) {
//                    item[3] = "Nam";
//                } else {
//                    item[3] = "Nữ";
//                }
//                item[4] = rs.getString("SoDienThoai");
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void layDuLieuNhanVien() {
//        String cautruyvan = "";
//        cautruyvan = "select * from NhanVien,PhanQuyen,DangNhap where NhanVien.MaPhanQuyen=PhanQuyen.MaPhanQuyen and NhanVien.MaDangNhap = DangNhap.MaDangNhap";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên",  "Giới Tính","Số Điện Thoại","Địa Chỉ","Ngày Sinh", "Quyền","Tài Khoản","Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblNhanVien_NhanVien.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[10];
//                item[0] = c;
//                item[1] = rs.getInt("MaNhanVien");
//                item[2] = rs.getString("TenNhanVien");
//                if (rs.getBoolean("GioiTinh") == true) {
//                    item[3] = "Nam";
//                } else {
//                    item[3] = "Nữ";
//                }
//                item[4] = rs.getString("SoDienThoai");
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("NgaySinh");
//                item[7] = rs.getString("TenPhanQuyen");
//                item[8] = rs.getString("TaiKhoan");
//                item[9] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void LayDuLieuPhieuNhap() {
//        String cautruyvan = "";
//        cautruyvan = "select * from PhieuNhap,NhanVien,NhaPhanPhoi where PhieuNhap.MaNhanVien =NhanVien.MaNhanVien and PhieuNhap.MaNhaPhanPhoi=NhaPhanPhoi.MaNhaPhanPhoi";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Phiếu Nhập", "Mã Nhân Viên", "Nhân Viên", "Ngày Nhập","Nhà Phân phối", "Tổng Tiền", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblPhieuNhap_PhieuNhap.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                Object[] item = new Object[8];
//                c++;
//                item[0] = c;
//                item[1] = rs.getInt("MaPhieuNhap");
//                item[2] = rs.getString("MaNhanVien");
//                item[3] = rs.getString("TenNhanVien");
//                item[4] = rs.getString("NgayNhap");
//                item[5] = rs.getString("TenNhaPhanPhoi");
//                
//                String tien = rs.getString("TongTienCaPhieuNhap").substring(0,rs.getString("TongTienCaPhieuNhap").indexOf("."));
//                Long tien1 = Long.valueOf(tien);
//                String tien2 = currencyVN.format(tien1);
//                item[6] = tien2;
//                item[7] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void LayDuLieuChiTietPhieuNhap(String MaPhieuNhap) {
//        String cautruyvan = "";
//        cautruyvan = "select * from ChiTietPhieuNhap,SanPham where ChiTietPhieuNhap.MaSanPham=SanPham.MaSanPham and ChiTietPhieuNhap.MaPhieuNhap=" + MaPhieuNhap;
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Phiếu Nhập", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblChiTietPhieuNhap_PhieuNhap.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                Object[] item = new Object[6];
//                c++;
//                item[0] = c;
//                item[1] = rs.getInt("MaPhieuNhap");
//                item[2] = rs.getString("TenSanPham");
//                item[3] = rs.getInt("SoLuong");
//                
//                String tien = rs.getString("TongTienSanPham").substring(0,rs.getString("TongTienSanPham").indexOf("."));
//                Long tien1 = Long.valueOf(tien);
//                String tien2 = currencyVN.format(tien1);
//                item[4] = tien2;
//                item[5] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void layDuLieuNhaPhanPhoi() {
//        String cautruyvan = "";
//        cautruyvan = "select * from NhaPhanPhoi";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Nhà Phân Phối", "Tên Nhà Phân Phối", "Số Điện Thoại", "Email","Địa chỉ"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblNhaPhanPhoi_NhaPhanPhoi.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[7];
//                item[0] = c;
//                item[1] = rs.getInt("MaNhaPhanPhoi");
//                item[2] = rs.getString("TenNhaPhanPhoi");
//                item[3] = rs.getString("SoDienThoai");
//                item[4] = rs.getString("Email");
//                item[5] = rs.getString("DiaChi");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    String getMaNhanVienHienTai(){
//        String cautruyvan = "";
//        cautruyvan = "select * from NhanVien where NhanVien.MaDangNhap = '" + FormLogin.maDangNhap +"'";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if(rs.next()) return rs.getString("MaNhanVien");
//        } catch (SQLException ex) {
//            Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return "";
//    }
//    public void layDuLieuAboutMe() {
//        String maNhanVien = getMaNhanVienHienTai();
//        String cautruyvan = "";
//        cautruyvan = "select * from NhanVien,PhanQuyen where NhanVien.MaNhanVien = '" + maNhanVien + "' and PhanQuyen.MaPhanQuyen = NhanVien.MaPhanQuyen";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if (rs.next()) {
//                jTextField1.setText(String.valueOf(rs.getInt("MaNhanVien")));
//                jTextField2.setText(rs.getString("TenNhanVien"));
//                if(rs.getBoolean("GioiTinh") == true){
//                    jTextField3.setText("Nam");
//                }else{
//                    jTextField3.setText("Nữ");
//                }
//                jTextField4.setText(rs.getString("SoDienThoai"));
//                jTextField5.setText(rs.getString("DiaChi"));
//                jTextField7.setText(rs.getString("NgaySinh"));
//                jTextField6.setText(rs.getString("TenPhanQuyen"));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void LayDuLieuSaoLuuChiTietPhieuNhap(String MaPhieuNhap) {
//        String cautruyvan = "";
//        cautruyvan = "select * from SaoLuuChiTietPhieuNhap,SanPham where SaoLuuChiTietPhieuNhap.MaSanPham=SanPham.MaSanPham and SaoLuuChiTietPhieuNhap.MaPhieuNhap=" + MaPhieuNhap;
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Phiếu Nhập", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblChiTietPhieuNhap_PhieuNhap.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                Object[] item = new Object[6];
//                c++;
//                item[0] = c;
//                item[1] = rs.getInt("MaPhieuNhap");
//                item[2] = rs.getString("TenSanPham");
//                item[3] = rs.getInt("SoLuong");
//                
//                String tien = rs.getString("TongTienSanPham").substring(0,rs.getString("TongTienSanPham").indexOf("."));
//                Long tien1 = Long.valueOf(tien);
//                String tien2 = currencyVN.format(tien1);
//                item[4] = tien2;
//                
//                item[5] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void LayDuLieuSaoLuuChiTietHoaDon(String MaHoaDon) {
//        String cautruyvan = "";
//        cautruyvan = "select * from SaoLuuChiTietHoaDon,SanPham where SaoLuuChiTietHoaDon.MaSanPham=SanPham.MaSanPham and SaoLuuChiTietHoaDon.MaHoaDon=" + MaHoaDon;
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Hóa Đơn", "Sản Phẩm", "Số Lượng", "Tổng Tiền", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblCTHoaDon_ChiTietHoaDon.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[6];
//                item[0] = c;
//                item[1] = rs.getString("MaHoaDon");
//                item[2] = rs.getString("TenSanPham");
//                item[3] = rs.getString("SoLuong");
//                
//                String tien = rs.getString("TongTienSanPham").substring(0,rs.getString("TongTienSanPham").indexOf("."));
//                Long tien1 = Long.valueOf(tien);
//                String tien2 = currencyVN.format(tien1);
//                item[4] = tien2;
//                item[5] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void LayDuLieuThongKe() {
//        String cautruyvan = "";
//        cautruyvan = "select * from HoaDon,KhachHang,NhanVien where "
//                + "HoaDon.MaKhachHang =KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien ";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Hóa Đơn", "Khách Hàng ", "Nhân Viên", "Ngày Lập HĐ", "Tổng Tiền", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tbDoanhThu_DoanhThu.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                String x = chuyenDateVeString(jDateChooserTuNgay_ThongKe.getDate());
//                String y = chuyenDateVeString(jDateChooserDen_ThongKe.getDate());
//                String z = rs.getString("ThoiGianLapHoaDon");
//                if(x.compareTo(z)<=0 && z.compareTo(y)<=0){
//                    Object[] item = new Object[7];
//                    c++;
//                    item[0] = c;
//                    item[1] = rs.getInt("MaHoaDon");
//                    item[2] = rs.getString("TenKhachHang");
//                    item[3] = rs.getString("TenNhanVien");
//                    item[4] = rs.getString("ThoiGianLapHoaDon");
//                    
//                    String tien = rs.getString("TongTienCaHoaDon").substring(0,rs.getString("TongTienCaHoaDon").indexOf("."));
//                    Long tien1 = Long.valueOf(tien);
//                    String tien2 = currencyVN.format(tien1);
//                    item[5] = tien2;
//                    item[6] = rs.getString("GhiChu");
//                    tableModel.addRow(item);
//                }
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void showThongKe()
//    {
//        String cautruyvan = "";
//        cautruyvan = "select * from HoaDon,KhachHang,NhanVien where "
//                + "HoaDon.MaKhachHang =KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien ";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        
//        ArrayList list = new ArrayList();
//        try {
//            while (rs.next()) {
//                String x = chuyenDateVeString(jDateChooserTuNgay_ThongKe.getDate());
//                String y = chuyenDateVeString(jDateChooserDen_ThongKe.getDate());
//                String z = rs.getString("ThoiGianLapHoaDon");
//                if(x.compareTo(z)<=0 && z.compareTo(y)<=0){
//                    list.add(rs.getString("TongTienCaHoaDon"));
//                }
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        
//        
//        String kqtshdbr = String. valueOf(list.size());
//        txtKQTSHDBR_ThongKe.setText(kqtshdbr);
//        
//        String x,y,z;
//        long tongTien=0;
//        for(int i =0;i<list.size();i++){
//            x = (String) list.get(i);
//            y = x.substring(0, x.indexOf('.'));
//            tongTien+=Integer.valueOf(y);
//        }
//        Long tien1 = Long.valueOf(tongTien);
//        String tien2 = currencyVN.format(tien1);
//        txtKQTSTB_ThongKe.setText(String.valueOf(tien2));
//        
//        LayDuLieuThongKe();
//    }
    
//    Date chuyenStringVeDate(String s)
//    {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            return formatter.parse(s);
//        } catch (ParseException ex) {
//            Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//    String chuyenDateVeString(Date d)
//    {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        return formatter.format(d);
//    }
//    public String GetCbbSelected(JComboBox cbb) {
//        Object[] obj = cbb.getSelectedObjects();
//        displayvalueModel item = (displayvalueModel) obj[0];
//        return item.displayvalue.toString();
//    }
//    public boolean KiemTraNhanSanPham(boolean them) {
//        String TenSanPham, GiaNhap,GiaBan;
//        Date NgaySanXuat,NgayHetHan;
//        boolean kiemtra = false;
//        
//        String MaSanPham = txtMaSanPham_SanPham.getText();
//        TenSanPham = txtTenSanPham_SanPham.getText();
//        GiaNhap = txtGiaNhap_SanPham.getText();
//        GiaBan = txtGiaBan_SanPham.getText();
//        NgaySanXuat = jDateChooserNgaySanXuat.getDate();
//        NgayHetHan = jDateChooserNgayHetHan.getDate();
//        
//        String  ThongBao = "";
//        if(them == true){
//            String ctv1 = "select MaSanPham from SanPham where MaSanPham='" + MaSanPham + "'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblMaNhanVien_NhanVien.setForeground(Color.red);
//                    ThongBao += "Sản Phẩm Đã Tồn Tại! Bạn Hãy Reset Để Thêm Sản Phẩm\n";
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        if (TenSanPham.equalsIgnoreCase("")) {
//            ThongBao += "Bạn Chưa Nhập Tên Sản Phẩm\n";
//            lblTenSanPham_SanPham.setForeground(Color.red);
//        }
//        else if (GiaNhap.equalsIgnoreCase("")) {
//            lblGiaNhap_SanPham.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Giá Nhập\n";
//        }
//        else if (GiaBan.equalsIgnoreCase("")) {
//            lblGiaBan.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Giá Bán\n";
//        }
//        else if(chuyenDateVeString(jDateChooserNgaySanXuat.getDate()).compareToIgnoreCase(chuyenDateVeString(date))> 0){
//            ThongBao += "Ngày Sản Xuất Không Thể Lớn Hơn Ngày Hiện Tại\n";
//            lblNgaySanXuat_SanPham.setForeground(Color.red);
//        }
//        else if(NgaySanXuat.compareTo(NgayHetHan) > 0)
//        {
//            ThongBao += "Ngày Sản Xuất Không Thể Lớn Hơn Ngày Hết Hạn";
//            lblNgaySanXuat_SanPham.setForeground(Color.red);
//            lblNgayHetHan_SanPham.setForeground(Color.red);
//        }
//        
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblTenSanPham_SanPham.setForeground(Color.black);
//            lblMaSanPham_SanPham.setForeground(Color.black);
//            lblGiaBan.setForeground(Color.black);
//             lblSoLuong_SanPham.setForeground(Color.black);
//            lblGiaNhap_SanPham.setForeground(Color.black);
//            lblNgaySanXuat_SanPham.setForeground(Color.black);
//            lblNgayHetHan_SanPham.setForeground(Color.black);
//            
//        } else {
//            kiemtra = false;
//            ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//        }
//        return kiemtra;
//    }
//    public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
//        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
//                tieuDeThongBao, icon);
//    }
//    public void ResSanPham() {
//        txtMaSanPham_SanPham.setText("");
//        txtTenSanPham_SanPham.setText("");
//        cbbMaLoaiSanPham_SanPham.setSelectedIndex(0);
//        txtGiaNhap_SanPham.setText("");
//        txtGiaBan_SanPham.setText("");
//        cbbNhaSanXuat_SanPham.setSelectedIndex(0);
//        txtSoLuong_SanPham.setText("");
//        txtChuThich_SanPham.setText("");
//        jDateChooserNgaySanXuat.setDate(date);
//        jDateChooserNgayHetHan.setDate(date);
//    }
//    public boolean KiemTraNhapNhanVien(boolean them) {
//        String MaNhanVien, TenNhanVien, DiaChi, SDT;
//        boolean kiemtra = false;
//        MaNhanVien = txtMaNhanVien_NhanVien.getText();
//        TenNhanVien = txtTenNhanVien_NhanVien.getText();
//        SDT = txtSoDT_NhanVien.getText();
//        DiaChi = txtDiaChi_NhanVien.getText();
//        String MaDangNhap = GetCbbSelected(cbbTaiKhoan_NhanVien);
//        System.out.println(MaDangNhap);
//        String  ThongBao = "";
//        if(them == true){
//            String ctv1 = "select MaNhanVien from NhanVien where MaNhanVien='" + MaNhanVien + "'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblMaNhanVien_NhanVien.setForeground(Color.red);
//                    ThongBao += "Mã Nhân Viên Đã Tồn Tại! Bạn Hãy Reset Để Thêm Nhân Viên\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return kiemtra;
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        if (TenNhanVien.equalsIgnoreCase("")) {
//            ThongBao += "Bạn Chưa Nhập Tên Nhân Viên\n";
//            lblTenNhanVien_NhanVien.setForeground(Color.red);
//        }
//        else if (SDT.equalsIgnoreCase("")) {
//            lblSDT_NhanVien.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập SĐT \n";
//        }
//        else if (DiaChi.equalsIgnoreCase("")) {
//            lblDiaChi_NhanVien.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Địa Chỉ\n";
//        }
//        else if (MaDangNhap.equalsIgnoreCase("")) {
//            lblTaiKhoan_NhanVien.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Mã Đăng Nhập\n";
//        }
//        else{
//            String TaiKhoan = "";
//            String ctv1 = "select TaiKhoan from DangNhap where MaDangNhap=" + MaDangNhap;
//            ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs1.next()){
//                    TaiKhoan = rs1.getString("TaiKhoan");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            if(them == true || (them == false && !TaiKhoan.equalsIgnoreCase( saveTenTaiKhoanDeSuaGhiChu)))
//            {
//                String ctv = "select MaNhanVien from NhanVien where MaDangNhap='"+ MaDangNhap + "'";
//                ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv);
//
//                try {
//                    if(rs.next()){
//                        lblTaiKhoan_NhanVien.setForeground(Color.red);
//                        ThongBao += "Mã Đăng Nhập Đã Có Người Sử Dụng\n";
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        
//            
//        
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblMaNhanVien_NhanVien.setForeground(Color.black);
//            lblSDT_NhanVien.setForeground(Color.black);
//            lblTenNhanVien_NhanVien.setForeground(Color.black);
//            lblDiaChi_NhanVien.setForeground(Color.black);
//            lblTaiKhoan_NhanVien.setForeground(Color.black);
//        } else {
//            kiemtra = false;
//            ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//        }
//        return kiemtra;
//    }
//    public boolean KiemTraTaiKhoan(boolean them){
//        String ID, TenDangNhap, Password,ChuThich;
//        ID = txtID_TaiKhoan.getText();
//        TenDangNhap = txtUser_TaiKhoan.getText();
//        Password = String.valueOf(txtPassword_TaiKhoan.getPassword()).trim();
//        ChuThich = txtGhiChu_TaiKhoan.getText();
//        
//        String  ThongBao = "";
//        if(them == true){  
//            String ctv1 = "select MaDangNhap from DangNhap where TaiKhoan='" + TenDangNhap+"'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblTaiKhoan_TaiKhoan.setForeground(Color.red);
//                    ThongBao += "Tài Khoản Này Đã Tồn Tại! Bạn Hãy Reset Để Thêm Tài Khoản\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return false;
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }else{
//            String ctv1 = "select TaiKhoan from DangNhap where MaDangNhap='" + ID +"'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    String tkcu = rs.getString("TaiKhoan");
//                    String x = "select MaDangNhap from DangNhap where TaiKhoan='" + TenDangNhap + "' and TaiKhoan != '"+ tkcu + "'";
//                    System.out.println(x);
//                    ResultSet rsx = FormLogin.connection.ExcuteQueryGetTable(x);
//                    if(rsx.next()){
//                        lblTaiKhoan_TaiKhoan.setForeground(Color.red);
//                        ThongBao += "Tài Khoản Này Đã Tồn Tại!\n";
//                        ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                        return false;
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        if (TenDangNhap.equalsIgnoreCase("")) {
//            ThongBao += "Bạn Chưa Nhập Tên Tài Khoản\n";
//            lblTaiKhoan_TaiKhoan.setForeground(Color.red);
//        }
//        else if (Password.equalsIgnoreCase("")) {
//            lblMatKhau_TaiKhoan.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Mật Khẩu\n";
//        }
//        
//        boolean kiemtra=false;
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblTaiKhoan_TaiKhoan.setForeground(Color.black);
//            lblMatKhau_TaiKhoan.setForeground(Color.black);
//            lblMaDangNhap_TaiKhoan.setForeground(Color.black);
//        } else {
//            kiemtra = false;
//            ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//        }
//        return kiemtra;
//    }
//    public void ResNhanVien() {
//        txtMaNhanVien_NhanVien.setText("");
//        txtTenNhanVien_NhanVien.setText("");
//        rbtnNam_NhanVien.setSelected(true);
//        rbtnNu_NhanVien.setSelected(false);
//        txtSoDT_NhanVien.setText("");
//        txtDiaChi_NhanVien.setText("");
//        cbbNgaySinh_NhanVien.setSelectedItem("1");
//        cbbThangSinh_NhanVien.setSelectedItem("1");
//        cbbNamSinh_NhanVien.setSelectedItem("2005");
//        cbQuyen_NhanVien.setSelectedIndex(0);
//        cbbTaiKhoan_NhanVien.setSelectedItem("1");
//        txtChuThich_NhanVien.setText("");
//    }
//    public boolean KiemTraNhapKhachHang(boolean them) {
//        String MaKhachHang, TenKhachHang, Ngaysinh, DiaChi, SDT;
//        boolean kiemtra = false;
//        MaKhachHang = txtMaKhachHang_KhachHang.getText();
//        TenKhachHang = txtTenKhachHang_KhachHang.getText();
//        DiaChi = txtDiaChi_KhachHang.getText();
//        SDT = txtSoDienThoai_KhachHang.getText();
//        
//        String  ThongBao = "";
//        
//        if(them == true){  
//            String ctv1 = "select MaKhachHang from KhachHang where MaKhachHang='" + MaKhachHang +  "'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblMaKhachHang_KhachHang.setForeground(Color.red);
//                    ThongBao += "Mã Khách Hàng Đã Tồn Tại! Bạn Hãy Reset Để Thêm Khách Hàng\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return false;
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        if (TenKhachHang.equalsIgnoreCase("")) {
//            ThongBao += "Bạn Chưa Nhập Tên Khách Hàng\n";
//            lblTenKhachHang_KhachHang.setForeground(Color.red);
//        }
//        else if (SDT.equalsIgnoreCase("")) {
//            lblSoDienThoai_KhachHang.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Số Điện Thoại \n";
//        }
//        else if (DiaChi.equalsIgnoreCase("")) {
//            lblDiaChi_KhachHang.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Địa Chỉ\n";
//        }
//       
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblDiaChi_KhachHang.setForeground(Color.black);
//            lblSoDienThoai_KhachHang.setForeground(Color.black);
//            lblMaKhachHang_KhachHang.setForeground(Color.black);
//            lblTenKhachHang_KhachHang.setForeground(Color.black);
//        } else {
//            kiemtra = false;
//            ThongBao(ThongBao, "lỗi nhập liệu", 2);
//        }
//        return kiemtra;
//    }
//    public void ResKhachHang() {
//        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
//        txtMaKhachHang_KhachHang.setText("");
//        txtTenKhachHang_KhachHang.setText("");
//        txtDiaChi_KhachHang.setText("");
//        txtSoDienThoai_KhachHang.setText("");
//        txtGhiChu_KhachHang.setText("");
//        rbtnNam_KhachHang.setSelected(true);
//        
//    }
//    public boolean KiemTraNhapNhaPhanPhoi(boolean them) {
//        String MaDoiTac, TenDoiTac, DiaChi, SDT, Email, ThongBao="";
//        MaDoiTac = txtMaNhaPhanPhoi_NhaPhanPhoi.getText();
//        TenDoiTac = txtTenNhaPhanPhoi_NhaPhanPhoi.getText();
//        SDT = txtSoDienThoai_NhaPhanPhoi.getText();
//        Email = txtEmail_NhaPhanPhoi.getText();
//        DiaChi = txtDiaChi_NhaPhanPhoi.getText();
//        
//        if(them == true){
//            String ctv1 = "select MaNhaPhanPhoi from NhaPhanPhoi where MaNhaPhanPhoi='" + MaDoiTac +  "'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblMaNhaPhanPhoi_NhaPhanPhoi.setForeground(Color.red);
//                    ThongBao += "Nhà Phân Phối Đã Tồn Tại! Bạn Hãy Reset Để Thêm Nhà Phân Phối\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return false;
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        if (TenDoiTac.equalsIgnoreCase("")) {
//            ThongBao += "Bạn Chưa Nhập Tên Nhà Phân Phối\n";
//            lblTenNhaPhanPhoi_NhaPhanPhoi.setForeground(Color.red);
//        }
//        else if (SDT.equalsIgnoreCase("")) {
//            lblSoDienThoai_NhaPhanPhoi.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập SDT\n";
//        }
//        else if (!KiemTraEmail(Email)) {
//            lblEmail_NhaPhanPhoi.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Đúng Email\n";
//        }
//        else if (DiaChi.equalsIgnoreCase("")) {
//            lblDiaChi_NhaPhanPhoi.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Địa Chỉ\n";
//        }
//         
//        boolean kiemtra=false;
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblMaNhaPhanPhoi_NhaPhanPhoi.setForeground(Color.black);
//            lblTenNhaPhanPhoi_NhaPhanPhoi.setForeground(Color.black);
//            lblSoDienThoai_NhaPhanPhoi.setForeground(Color.black);
//            lblEmail_NhaPhanPhoi.setForeground(Color.black);
//            lblDiaChi_NhaPhanPhoi.setForeground(Color.black);
//        } else {
//            ThongBao(ThongBao, "lỗi nhập liệu", 2);
//        }
//        return kiemtra;
//    }
//    public boolean KiemTraEmail(String email){
//        boolean kq=false;
//       String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//        Pattern v = Pattern.compile(EMAIL_PATTERN);
//        Matcher m= v.matcher(email);
//        kq=m.matches();
//        return kq;
//   }
//    public void ResNhaPhanPhoi() {
//        txtMaNhaPhanPhoi_NhaPhanPhoi.setText("");
//        txtTenNhaPhanPhoi_NhaPhanPhoi.setText("");
//        txtSoDienThoai_NhaPhanPhoi.setText("");
//        txtEmail_NhaPhanPhoi.setText("");
//        txtDiaChi_NhaPhanPhoi.setText("");
//    }
//    public boolean KiemTraNhapLoaiSanPham(boolean them) {
//        
//        String ThongBao = "";
//        
//        if(them == true){  
//            String ctv1 = "select MaLoaiSanPham from LoaiSanPham where MaLoaiSanPham='" + txtMaLoaiSanPham_LoaiSanPham.getText() +  "'";
//            ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(ctv1);
//            try {
//                if(rs.next()){
//                    lblMaKhachHang_KhachHang.setForeground(Color.red);
//                    ThongBao += "Loại Sản Phẩm Đã Tồn Tại! Bạn Hãy Reset Để Thêm Loại Sản Phẩm\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return false;
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//        
//        String cautruyvan1 = "select TenLoaiSanPham from LoaiSanPham where TenLoaiSanPham = '" + txtTenLoaiSanPham_LoaiSanPham.getText() + "'";
//        ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(cautruyvan1);
//        try {
//                if(rs1.next()){
//                    lblTenLoaiSanPham_LoaiSanPham.setForeground(Color.red);
//                    ThongBao += "Tên Loại Sản Phẩm Đã Tồn Tại\n";
//                    ThongBao(ThongBao, "Lỗi Nhập Liệu", 2);
//                    return false; 
//                }
//        } catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//        if(txtTenLoaiSanPham_LoaiSanPham.getText().equalsIgnoreCase("")){
//            lblTenLoaiSanPham_LoaiSanPham.setForeground(Color.red);
//            ThongBao += "Bạn Chưa Nhập Tên Loại Sản Phẩm\n";
//        }
//        
//        boolean kiemtra = false;
//        if (ThongBao.equalsIgnoreCase("")) {
//            kiemtra = true;
//            lblTenLoaiSanPham_LoaiSanPham.setForeground(Color.black);
//            lblMaLoaiSanPham_LoaiSanPham.setForeground(Color.black);
//        } else {
//            kiemtra = false;
//            ThongBao(ThongBao, "lỗi nhập liệu", 2);
//        }
//        return kiemtra;
//    }
//    public void TimKiemSanPham() {
//        String wheretk = "";
//        if (rbtnTimKiemMaSanPham_SanPham.isSelected()) {
//            wheretk = "SanPham.MaSanPham= " + txtTimKiem_SanPham.getText();
//        } else if (rbtnTimKiemTenSanPham_SanPham.isSelected()) {
//            wheretk = "TenSanPham like N'%" + txtTimKiem_SanPham.getText() + "%'";
//        }
//        String cautruyvan = "";
//        cautruyvan = "select * from SanPham,LoaiSanPham,NhaSanXuat, SoLuongSanPhamTrongKho where "
//                + "SanPham.MaLoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.MaNhaSanXuat=NhaSanXuat.MaNhaSanXuat and SanPham.MaSanPham=SoLuongSanPhamTrongKho.MaSanPham and " + wheretk;
//
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Sản Phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá nhập", "Giá Bán", "Nhà Sản Xuất", "Số Lượng", "Ngày Sản Xuất","Ngày Hết Hạn", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblSanPham.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[11];
//                item[0] = c;
//                item[1] = rs.getInt("MaSanPham");
//                item[2] = rs.getString("TenSanPham");
//                item[3] = rs.getString("TenLoaiSanPham");
//                item[4] = rs.getInt("GiaNhap");
//                item[5] = rs.getInt("GiaBan");
//                item[6] = rs.getString("TenNhaSanXuat");
//                item[7] = rs.getInt("SoLuongTrongKho");
//                item[8] = rs.getDate("NgaySanXuat");
//                item[9] = rs.getDate("NgayHetHan");
//                item[10] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void TimKiemKhachHang() {
//        String wheretk = "";
//        if (rbtnTimKiemTheoMa_KhachHang.isSelected()) {
//            wheretk = "MaKhachHang= " + txtTimKiem_KhachHang.getText();
//        } else if (rbtnTimKiemTheoTen_KhachHang.isSelected()) {
//            wheretk = "TenKhachHang like N'%" + txtTimKiem_KhachHang.getText() + "%'";
//        }
//        String cautruyvan  = "select * from KhachHang where " + wheretk;
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblKhachHang_KhachHang.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[9];
//                item[0] = c;
//                item[1] = rs.getInt("MaKhachHang");
//                item[2] = rs.getString("TenKhachHang");
//                if (rs.getBoolean("GioiTinh") == true) {
//                    item[3] = "Nam";
//                } else {
//                    item[3] = "Nữ";
//                }
//                item[4] = rs.getString("SoDienThoai");
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public void TimKiemNhanVien() {
//        String wheretk = "";
//        if (rbtnTimKiemTheoMa_NhanVien.isSelected()) {
//            wheretk = "NhanVien.MaNhanVien= " + txtTimKiem_NhanVien.getText();
//        } else if (rbtnTimKiemTheoTen_NhanVien.isSelected()) {
//            wheretk = "TenNhanVien like N'%" + txtTimKiem_NhanVien.getText() + "%'";
//        }
//        String cautruyvan = "";
//        cautruyvan = "select * from NhanVien,DangNhap,PhanQuyen where NhanVien.MaPhanQuyen=PhanQuyen.MaPhanQuyen and "
//                + "NhanVien.MaDangNhap=DangNhap.MaDangNhap and " + wheretk;
//
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Nhân Viên", "Tên Nhân Viên",  "Giới Tính","Số Điện Thoại","Địa Chỉ","Ngày Sinh", "Quyền","Tài Khoản","Ghi Chú"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tblNhanVien_NhanVien.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[10];
//                item[0] = c;
//                item[1] = rs.getInt("MaNhanVien");
//                item[2] = rs.getString("TenNhanVien");
//                if (rs.getBoolean("GioiTinh") == true) {
//                    item[3] = "Nam";
//                } else {
//                    item[3] = "Nữ";
//                }
//                item[4] = rs.getString("SoDienThoai");
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("NgaySinh");
//                item[7] = rs.getString("TenPhanQuyen");
//                item[8] = rs.getString("TaiKhoan");
//                item[9] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//    }
//    public boolean KiemTraNhapCTPN(boolean them) {
//        
//        String MaPhieuNhap = txtMaPhieuNhap_PhieuNhap.getText();
//        boolean kiemtra = false;
//        String tb="";
//        
//        if(MaPhieuNhap.equalsIgnoreCase("")){
//            tb +="Bạn Hãy Chọn Phiếu Nhập Mới Để Thao Tác Các Sản Phẩm\n";
//            lblMaPhieuNhap_PhieuNhap.setForeground(Color.red);
//            kiemtra = false;
//            ThongBao(tb,"Lỗi",2);
//        }
//        else{
//            String ctvKiemThu = "select count(ChiTietPhieuNhap.MaPhieuNhap) as SoChiTietPhieuMua"
//                    + " from PhieuNhap,ChiTietPhieuNhap where PhieuNhap.MaPhieuNhap=ChiTietPhieuNhap.MaPhieuNhap and PhieuNhap.MaPhieuNhap=" + MaPhieuNhap;
//            ResultSet rs1 = FormLogin.connection.ExcuteQueryGetTable(ctvKiemThu);
//            System.out.println(ctvKiemThu);
//            int so1 = 0;
//            try {
//                if (rs1.next()) {
//                    so1 = rs1.getInt("SoChiTietPhieuMua");
//                    if (so1 != 0) {
//                        tb +="Không Thể Thao Tác Vì Phiếu Nhập Này Đã Được Lưu\n";
//                        ThongBao(tb,"Lỗi",2);
//                        return false;
//                    }
//                }
//            }catch (SQLException ex) {
//                Logger.getLogger(frmTrangChu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            if(them == false && txtMaPhieuNhapCTPN_PhieuNhap.getText().equalsIgnoreCase("")){
//                ThongBao("Bạn Chưa Chọn Sản Phẩm Để Thao Tác", "Lỗi", 2);
//                return false;
//            }
//            
//            if(txtSoLuongCTPN_PhieuNhap.getText().equalsIgnoreCase("")){
//                tb+="Chưa Nhập Số Lượng\n";
//                lblSoLuongCTPN_PhieuNhap.setForeground(Color.red);
//            }
//            else{
//                    try {
//                            int bien= Integer.valueOf(txtSoLuongCTPN_PhieuNhap.getText());
//                        } catch (Exception e) {
//                                tb+="Số Lượng Phải Nhập Bằng Số\n";
//                                lblSoLuongCTPN_PhieuNhap.setForeground(Color.red);
//                                ThongBao(tb,"Lỗi",2);
//                                return false;
//                        }
//                        if(Integer.parseInt(txtSoLuongCTPN_PhieuNhap.getText())<=0){
//                                tb+="Số Lượng Phải Là Số Dương\n";
//                                lblSoLuongCTPN_PhieuNhap.setForeground(Color.red);
//                        }
//                }
//                        
//                        
//                        
//                if(tb.equalsIgnoreCase("")){
//                            kiemtra = true;
//                            lblMaPhieuNhap_PhieuNhap.setForeground(Color.black);
//                            lblSoLuongCTPN_PhieuNhap.setForeground(Color.black);
//                }
//                else{
//                            kiemtra = false;
//                            ThongBao(tb,"Lỗi",2);
//                }
//        }
//        return kiemtra;
//    }
//    public int GetGiaSanPham(String MaSP) {
//        int Gia = 0;
//        String cautruyvan = "select * from SanPham where MaSanPham=" + MaSP;
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        try {
//            if (rs.next()) {
//                Gia = rs.getInt("Giaban");
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        return Gia;
//    }

//    public void SetTongTienPhieuNhap(String MaPhieuNhap) {
//        String cautruyvan = "select sum(SaoLuuChiTietPhieuNhap.TongTienSanPham) as TongTienHienTai,PhieuNhap.MaPhieuNhap from PhieuNhap,SaoLuuChiTietPhieuNhap "
//                + "where PhieuNhap.MaPhieuNhap=SaoLuuChiTietPhieuNhap.MaPhieuNhap"
//                + " and PhieuNhap.MaPhieuNhap=" + MaPhieuNhap + "group by PhieuNhap.MaPhieuNhap";
//        ResultSet rs = FormLogin.connection.ExcuteQueryGetTable(cautruyvan);
//        String ttht = "";
//
//        try {
//            if (rs.next()) {
//                ttht = rs.getString("TongTienHienTai");
//                txtTongTien_PhieuNhap.setText(ttht);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Luu_PhieuNhap;
    private javax.swing.JButton Reset_LoaiSanPham;
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnReSet_HoaDon;
    private javax.swing.JButton btnReSet_PhieuNhap;
    private javax.swing.JButton btnResetCTHD_HoaDon;
    private javax.swing.JButton btnReset_CTPN;
    private javax.swing.JButton btnReset_KhachHang;
    private javax.swing.JButton btnReset_NhanVien;
    private javax.swing.JButton btnReset_PhanPhoi;
    private javax.swing.JButton btnReset_SanPham;
    private javax.swing.JButton btnSua_CTHD;
    private javax.swing.JButton btnSua_CTPN;
    private javax.swing.JButton btnSua_HoaDon;
    private javax.swing.JButton btnSua_KhachHang;
    private javax.swing.JButton btnSua_LoaiSanPham;
    private javax.swing.JButton btnSua_NhanVien;
    private javax.swing.JButton btnSua_PhanPhoi;
    private javax.swing.JButton btnSua_PhieuNhap;
    private javax.swing.JButton btnThem_CTHD;
    private javax.swing.JButton btnThem_CTPN;
    private javax.swing.JButton btnThem_HoaDon;
    private javax.swing.JButton btnThem_KhachHang;
    private javax.swing.JButton btnThem_LoaiSanPham;
    private javax.swing.JButton btnThem_NhanVien;
    private javax.swing.JButton btnThem_PhanPhoi;
    private javax.swing.JButton btnThem_PhieuNhap;
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnXoa_CTHD;
    private javax.swing.JButton btnXoa_CTPN;
    private javax.swing.JButton btnXoa_HoaDon;
    private javax.swing.JButton btnXoa_KhachHang;
    private javax.swing.JButton btnXoa_LoaiSanPham;
    private javax.swing.JButton btnXoa_NhanVien;
    private javax.swing.JButton btnXoa_PhanPhoi;
    private javax.swing.JButton btnXoa_PhieuNhap;
    private javax.swing.JButton btnXoa_SanPham;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbQuyen_NhanVien;
    private javax.swing.JComboBox<String> cbbKhachHang_HoaDon;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPham;
    private javax.swing.JComboBox<String> cbbNhaPhanPhoi_PhieuNhap;
    private javax.swing.JComboBox<String> cbbSanPhamCTHD_HoaDon;
    private javax.swing.JComboBox<String> cbbTenSanPhamCTPN_PhieuNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelButToan;
    private javax.swing.JPanel jPanelDangXuat;
    private javax.swing.JPanel jPanelHoaDon;
    private javax.swing.JPanel jPanelLoaiSanPham;
    private javax.swing.JPanel jPanelLogout;
    private javax.swing.JPanel jPanelNhaPhanPhoi;
    private javax.swing.JPanel jPanelNhanVien;
    private javax.swing.JPanel jPanelPhieuNhap;
    private javax.swing.JPanel jPanelSanPham;
    private javax.swing.JPanel jPanelThuChi;
    private javax.swing.JPanel jPanel_KhachHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPaneNhanVien;
    private javax.swing.JTabbedPane jTabbedPaneNhapHang;
    private javax.swing.JTabbedPane jTabbedPaneSanPham;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblDiaChi_KhachHang;
    private javax.swing.JLabel lblDiaChi_NhaPhanPhoi;
    private javax.swing.JLabel lblEmail_NhaPhanPhoi;
    private javax.swing.JLabel lblGiaBan;
    private javax.swing.JLabel lblGiaNhap_SanPham;
    private javax.swing.JLabel lblMaHoaDon_HoaDon;
    private javax.swing.JLabel lblMaHoaDon_HoaDon1;
    private javax.swing.JLabel lblMaHoaDon_HoaDon2;
    private javax.swing.JLabel lblMaHoaDon_HoaDon3;
    private javax.swing.JLabel lblMaHoaDon_HoaDon6;
    private javax.swing.JLabel lblMaHoaDon_HoaDon8;
    private javax.swing.JLabel lblMaHoaDon_HoaDon9;
    private javax.swing.JLabel lblMaKhachHang_KhachHang;
    private javax.swing.JLabel lblMaLoaiSanPham_LoaiSanPham;
    private javax.swing.JLabel lblMaNhaPhanPhoi_NhaPhanPhoi;
    private javax.swing.JLabel lblMaNhanVien_NhanVien;
    private javax.swing.JLabel lblMaPhieuNhap_PhieuNhap;
    private javax.swing.JLabel lblNgayHetHan_SanPham;
    private javax.swing.JLabel lblSDT_NhanVien;
    private javax.swing.JLabel lblSDT_NhanVien1;
    private javax.swing.JLabel lblSoDienThoai_KhachHang;
    private javax.swing.JLabel lblSoDienThoai_NhaPhanPhoi;
    private javax.swing.JLabel lblSoLuongCTHD_HoaDon;
    private javax.swing.JLabel lblSoLuongCTPN_PhieuNhap;
    private javax.swing.JLabel lblTSHDBR;
    private javax.swing.JLabel lblTaiKhoan_NhanVien;
    private javax.swing.JLabel lblTaiKhoan_NhanVien1;
    private javax.swing.JLabel lblTenKhachHang_KhachHang;
    private javax.swing.JLabel lblTenLoaiSanPham_LoaiSanPham;
    private javax.swing.JLabel lblTenNhaPhanPhoi_NhaPhanPhoi;
    private javax.swing.JLabel lblTenNhanVien_NhanVien;
    private javax.swing.JLabel lblTenNhanVien_NhanVien1;
    private javax.swing.JLabel lblTenSanPham_SanPham;
    private javax.swing.JLabel lblTongTien_HoaDon;
    private javax.swing.JLabel lblTongTien_HoaDon1;
    private javax.swing.JLabel lblTongTien_HoaDon2;
    private javax.swing.JLabel lblTongTien_HoaDon3;
    private javax.swing.JTable tbDoanhThu_DoanhThu;
    private javax.swing.JTable tbLoaiSanPham_LoaiSanPham;
    private javax.swing.JTable tblCTHoaDon_ChiTietHoaDon;
    private javax.swing.JTable tblChiTietPhieuNhap_PhieuNhap;
    private javax.swing.JTable tblKhachHang_KhachHang;
    private javax.swing.JTable tblNhaPhanPhoi_NhaPhanPhoi;
    private javax.swing.JTable tblNhanVien_NhanVien;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblPhieuNhap_PhieuNhap;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDiaChi_KhachHang;
    private javax.swing.JTextField txtDiaChi_NhaPhanPhoi;
    private javax.swing.JTextField txtDiaChi_NhanVien;
    private javax.swing.JTextField txtDonVi_SanPham;
    private javax.swing.JTextField txtEmail_NhaPhanPhoi;
    private javax.swing.JTextArea txtGhiChuCTPN_PhieuNhap;
    private javax.swing.JTextField txtGhiChu_HoaDon;
    private javax.swing.JTextArea txtGhiChu_PhieuNhap;
    private javax.swing.JTextField txtGiaban_SanPham;
    private javax.swing.JLabel txtKQTSHDBR_ThongKe;
    private javax.swing.JLabel txtKQTSTB_ThongKe;
    private javax.swing.JTextField txtKichThuoc_SanPham;
    private javax.swing.JTextField txtMK_NhanVien;
    private javax.swing.JTextField txtMaHoaDonCTHD_HoaDon;
    private javax.swing.JTextField txtMaHoaDon_HoaDon;
    private javax.swing.JTextField txtMaKhachHang_KhachHang;
    private javax.swing.JTextField txtMaLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtMaNhaPhanPhoi_NhaPhanPhoi;
    private javax.swing.JTextField txtMaNhanVien_NhanVien;
    private javax.swing.JTextField txtMaNhanVien_PhieuNhap;
    private javax.swing.JTextField txtMaPhieuNhapCTPN_PhieuNhap;
    private javax.swing.JTextField txtMaPhieuNhap_PhieuNhap;
    private javax.swing.JTextField txtMaSoThue_KhachHang;
    private javax.swing.JTextField txtNgayNhap_PhieuNhap;
    private javax.swing.JTextField txtSDT_NhanVien;
    private javax.swing.JTextField txtSoDienThoai_KhachHang;
    private javax.swing.JTextField txtSoDienThoai_NhaPhanPhoi;
    private javax.swing.JTextField txtSoLuongCTHD_HoaDon;
    private javax.swing.JTextField txtSoLuongCTPN_PhieuNhap;
    private javax.swing.JTextField txtTenDN_NhanVien;
    private javax.swing.JTextField txtTenKhachHang_KhachHang;
    private javax.swing.JTextField txtTenLoaiSanPham_LoaiSanPham;
    private javax.swing.JTextField txtTenNhaPhanPhoi_NhaPhanPhoi;
    private javax.swing.JTextField txtTenNhanVien_PhieuNhap;
    private javax.swing.JTextField txtTenSanPham_SanPham;
    private javax.swing.JTextField txtTen_NhanVien;
    private javax.swing.JTextField txtTimKiem_HoaDon;
    private javax.swing.JTextField txtTimKiem_KhachHang;
    private javax.swing.JTextField txtTimKiem_NhanVien;
    private javax.swing.JTextField txtTimKiem_SanPham;
    private javax.swing.JTextField txtTongTienCTHD_HoaDon;
    private javax.swing.JTextField txtTongTienCTPN_PhieuNhap;
    private javax.swing.JTextField txtTongTien_HoaDon;
    private javax.swing.JTextField txtTongTien_PhieuNhap;
    // End of variables declaration//GEN-END:variables
}
