/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Lenovo
 */
public class OrderFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OrderFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelQuanLyDH = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelQuanLyDH = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        panelNhapKH = new javax.swing.JPanel();
        labelTenKH = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        labelDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        labelSDT = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelNgayDat = new javax.swing.JLabel();
        labelNgayGui = new javax.swing.JLabel();
        dateNgayGui = new com.toedter.calendar.JDateChooser();
        dateNgayDat = new com.toedter.calendar.JDateChooser();
        panelNhapSP = new javax.swing.JPanel();
        labelLoaiSP = new javax.swing.JLabel();
        cbLoaiSP = new javax.swing.JComboBox<>();
        labelTenSP = new javax.swing.JLabel();
        cbTenSP = new javax.swing.JComboBox<>();
        labelDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        labelSoLuong = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        labelThanhTien = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnThemDH = new javax.swing.JButton();
        btnXoaDH = new javax.swing.JButton();
        btnSuaDH = new javax.swing.JButton();
        btnThemSP = new javax.swing.JButton();
        btnXoaSP = new javax.swing.JButton();
        btnInDH = new javax.swing.JButton();
        btnSuaSP = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        labelMaDH = new javax.swing.JLabel();
        cbMaDH = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQLDH = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Đơn Hàng");

        panelQuanLyDH.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelQuanLyDH.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelQuanLyDH.setText("Quản Lý Đơn Hàng");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");

        panelNhapKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenKH.setText("Tên khách hàng");

        labelDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDiaChi.setText("Địa chỉ");

        labelSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSDT.setText("Số điện thoại");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("Email");

        labelNgayDat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayDat.setText("Ngày đặt");

        labelNgayGui.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNgayGui.setText("Ngày gửi");

        javax.swing.GroupLayout panelNhapKHLayout = new javax.swing.GroupLayout(panelNhapKH);
        panelNhapKH.setLayout(panelNhapKHLayout);
        panelNhapKHLayout.setHorizontalGroup(
            panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNhapKHLayout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDiaChi)
                            .addComponent(labelNgayDat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhapKHLayout.createSequentialGroup()
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(dateNgayDat, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNgayGui, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateNgayGui, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelNhapKHLayout.createSequentialGroup()
                        .addComponent(labelTenKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenKH)
                        .addGap(20, 20, 20)
                        .addComponent(labelSDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelNhapKHLayout.setVerticalGroup(
            panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapKHLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenKH)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSDT)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhapKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNgayDat, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelNgayGui))
                    .addComponent(dateNgayGui, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateNgayDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        panelNhapSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLoaiSP.setText("Loại sản phẩm");

        cbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTenSP.setText("Tên sản phẩm");

        cbTenSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenSPActionPerformed(evt);
            }
        });

        labelDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDonGia.setText("Đơn giá");

        labelSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSoLuong.setText("Số lượng");

        labelThanhTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelThanhTien.setText("Thành tiền");

        javax.swing.GroupLayout panelNhapSPLayout = new javax.swing.GroupLayout(panelNhapSP);
        panelNhapSP.setLayout(panelNhapSPLayout);
        panelNhapSPLayout.setHorizontalGroup(
            panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapSPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelDonGia)
                    .addComponent(labelLoaiSP)
                    .addComponent(labelThanhTien))
                .addGap(18, 18, 18)
                .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhapSPLayout.createSequentialGroup()
                        .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSoLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTenSP, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(panelNhapSPLayout.createSequentialGroup()
                        .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelNhapSPLayout.setVerticalGroup(
            panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhapSPLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLoaiSP)
                    .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTenSP)
                    .addComponent(cbTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhapSPLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSoLuong)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelNhapSPLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDonGia)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(panelNhapSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelThanhTien)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnThemDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemDH.setText("Đơn hàng");

        btnXoaDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoaDH.setText("Đơn hàng");

        btnSuaDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSuaDH.setText("Đơn hàng");

        btnThemSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThemSP.setText("Sản phẩm");

        btnXoaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoaSP.setText("Sản phẩm");

        btnInDH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btnInDH.setText("In đơn hàng");

        btnSuaSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSuaSP.setText("Sản phẩm");

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        labelMaDH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMaDH.setText("Mã đơn hàng");

        cbMaDH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelQuanLyDHLayout = new javax.swing.GroupLayout(panelQuanLyDH);
        panelQuanLyDH.setLayout(panelQuanLyDHLayout);
        panelQuanLyDHLayout.setHorizontalGroup(
            panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                                .addComponent(labelMaDH)
                                .addGap(18, 18, 18)
                                .addComponent(cbMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                                .addComponent(btnThemDH)
                                .addGap(32, 32, 32)
                                .addComponent(btnXoaDH)
                                .addGap(26, 26, 26)
                                .addComponent(btnSuaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnXoaSP)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnInDH)))
                        .addGap(80, 80, 80)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                        .addComponent(btnThoat)
                        .addGap(489, 489, 489)
                        .addComponent(labelQuanLyDH))
                    .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                        .addComponent(panelNhapKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelQuanLyDHLayout.setVerticalGroup(
            panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuanLyDH)
                    .addComponent(btnThoat))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelNhapKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNhapSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelQuanLyDHLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMaDH)
                            .addComponent(cbMaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(panelQuanLyDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSP)
                            .addComponent(btnSuaDH)
                            .addComponent(btnXoaDH)
                            .addComponent(btnThemDH)
                            .addComponent(btnXoaSP)
                            .addComponent(btnSuaSP)
                            .addComponent(btnLuu)
                            .addComponent(btnInDH))
                        .addGap(31, 31, 31))))
        );

        tableQLDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableQLDH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelQuanLyDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelQuanLyDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTenSPActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInDH;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSuaDH;
    private javax.swing.JButton btnSuaSP;
    private javax.swing.JButton btnThemDH;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaDH;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JComboBox<String> cbLoaiSP;
    private javax.swing.JComboBox<String> cbMaDH;
    private javax.swing.JComboBox<String> cbTenSP;
    private com.toedter.calendar.JDateChooser dateNgayDat;
    private com.toedter.calendar.JDateChooser dateNgayGui;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelDonGia;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLoaiSP;
    private javax.swing.JLabel labelMaDH;
    private javax.swing.JLabel labelNgayDat;
    private javax.swing.JLabel labelNgayGui;
    private javax.swing.JLabel labelQuanLyDH;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelSoLuong;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTenSP;
    private javax.swing.JLabel labelThanhTien;
    private javax.swing.JPanel panelNhapKH;
    private javax.swing.JPanel panelNhapSP;
    private javax.swing.JPanel panelQuanLyDH;
    private javax.swing.JTable tableQLDH;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
