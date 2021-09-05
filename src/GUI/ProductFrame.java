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
public class ProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductFrame
     */
    public ProductFrame() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        panelQuanLySP = new javax.swing.JPanel();
        labelQLSP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnThoat = new javax.swing.JButton();
        labelHinhAnh = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        labelMaSP = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        labelTenSP = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        labelDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        labelSoLuongTon = new javax.swing.JLabel();
        txtSoLuongTon = new javax.swing.JTextField();
        labelTrangThai = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        labelMaNCC = new javax.swing.JLabel();
        labelTenTG = new javax.swing.JLabel();
        txtTenTG = new javax.swing.JTextField();
        labelSoTrang = new javax.swing.JLabel();
        txtSoTrang = new javax.swing.JTextField();
        labelNXB = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        cbMaNCC = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        txtTenSPTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        labelTenSPTimKiem = new javax.swing.JLabel();
        labelLoaiSP = new javax.swing.JLabel();
        cbLoaiSP = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLySP = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        jLabel5.setText("Mã sản phẩm");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sản Phẩm");

        panelQuanLySP.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelQLSP.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelQLSP.setText("QUẢN LÝ SẢN PHẨM");

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        labelHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHinhAnh.setText("Ảnh");
        labelHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnChonAnh.setText("Chọn ảnh");

        labelMaSP.setText("Mã sản phẩm");

        labelTenSP.setText("Tên sản phẩm");

        labelDonGia.setText("Đơn giá");

        labelSoLuongTon.setText("Sô lượng tồn");

        labelTrangThai.setText("Trạng thái");

        labelMaNCC.setText("Mã nhà cung cấp");

        labelTenTG.setText("Tên tác giả");

        labelSoTrang.setText("Số trang");

        labelNXB.setText("Nhà xuất bản");

        cbMaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fix.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnLuu.setText("Lưiu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btnIn.setText("  In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        labelTenSPTimKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTenSPTimKiem.setText("Tên Sản Phẩm");

        labelLoaiSP.setText("Loại sản phẩm");

        cbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");

        javax.swing.GroupLayout panelQuanLySPLayout = new javax.swing.GroupLayout(panelQuanLySP);
        panelQuanLySP.setLayout(panelQuanLySPLayout);
        panelQuanLySPLayout.setHorizontalGroup(
            panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnThoat)
                        .addGap(310, 310, 310)
                        .addComponent(labelQLSP))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnChonAnh)))
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelLoaiSP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelDonGia)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                        .addComponent(labelMaNCC)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addComponent(labelNXB)
                                .addGap(18, 18, 18)
                                .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelMaSP)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelTenTG)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelSoLuongTon)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelTenSP)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelTrangThai)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                                    .addComponent(labelSoTrang)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenSPTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTenSPTimKiem)
                        .addGap(49, 49, 49))))
        );
        panelQuanLySPLayout.setVerticalGroup(
            panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLySPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThoat)
                    .addComponent(labelQLSP))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(labelMaSP)
                            .addComponent(txtMaSP)
                            .addComponent(labelTenSP)
                            .addComponent(txtTenSP)
                            .addComponent(labelLoaiSP)
                            .addComponent(cbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDonGia)
                            .addComponent(txtDonGia)
                            .addComponent(labelSoLuongTon)
                            .addComponent(txtSoLuongTon)
                            .addComponent(labelTrangThai)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTenTG)
                        .addComponent(txtTenTG)
                        .addComponent(labelSoTrang)
                        .addComponent(txtSoTrang))
                    .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMaNCC)
                        .addComponent(cbMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(btnChonAnh)
                .addGap(12, 12, 12)
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNXB)
                    .addComponent(txtNXB))
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQuanLySPLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelTenSPTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLySPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuayLai)
                        .addGap(20, 20, 20)))
                .addGroup(panelQuanLySPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnIn)
                    .addComponent(btnThem)
                    .addComponent(btnTim)
                    .addComponent(txtTenSPTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        tableQuanLySP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại sản phẩm", "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng tồn", "Trạng thái", "Mã nhà sản xuất", "Tên tác giả", "Số trang", "Nhà xuất bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableQuanLySP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelQuanLySP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelQuanLySP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiSP;
    private javax.swing.JComboBox<String> cbMaNCC;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelDonGia;
    private javax.swing.JLabel labelHinhAnh;
    private javax.swing.JLabel labelLoaiSP;
    private javax.swing.JLabel labelMaNCC;
    private javax.swing.JLabel labelMaSP;
    private javax.swing.JLabel labelNXB;
    private javax.swing.JLabel labelQLSP;
    private javax.swing.JLabel labelSoLuongTon;
    private javax.swing.JLabel labelSoTrang;
    private javax.swing.JLabel labelTenSP;
    private javax.swing.JLabel labelTenSPTimKiem;
    private javax.swing.JLabel labelTenTG;
    private javax.swing.JLabel labelTrangThai;
    private javax.swing.JPanel panelQuanLySP;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tableQuanLySP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtSoLuongTon;
    private javax.swing.JTextField txtSoTrang;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenSPTimKiem;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
