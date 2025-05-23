/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLNV_MVC;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IT
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        initRowSelectionListener();
    }
    // Add action listeners for new buttons

    public void btnThemActionListener(ActionListener al) {
        btnThem.addActionListener(al);
    }

    public void btnCapNhatActionListener(ActionListener al) {
        btnCapNhat.addActionListener(al);
    }

    public void btnXoaActionListener(ActionListener al) {
        btnXoa.addActionListener(al);
    }

    public void btnXemActionListener(ActionListener al) {
        btnXem.addActionListener(al);
    }

    public void btnTinhLuongActionListener(ActionListener al) {
        btnTinhLuong.addActionListener(al);
    }

    public void setTableNV(ArrayList<Object[]> data) {
        String[] columnName = {"Mã nhân viên", "Họ và Tên", "Loại nhân viên", "Lương cơ bản","Lương hàng tháng", "Số Ngày Làm", "Số Sản Phẩm"};

        DefaultTableModel dtmSV = new DefaultTableModel(columnName, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép cập nhật trong cell của table
            }
        };
        for (Object[] row : data) {
            dtmSV.addRow(row);
        }
        tableSV.setModel(dtmSV);
    }

    public void initRowSelectionListener() {
        tableSV.getSelectionModel().addListSelectionListener(event -> {
            if (tableSV.getSelectedRow() >= 0) {
                int selectedRow = tableSV.getSelectedRow();
                textMSNV.setText(tableSV.getValueAt(selectedRow, 0).toString());
                textHoTen.setText(tableSV.getValueAt(selectedRow, 1).toString());
                textLoaiNV.setText(tableSV.getValueAt(selectedRow, 2).toString());
                textLuongCB.setText(tableSV.getValueAt(selectedRow, 3).toString());
                textLuongHT.setText(tableSV.getValueAt(selectedRow, 4).toString());
            }
        });
    }

    public void setTextLuongHT(JTextField textLuongHT) {
        this.textLuongHT = textLuongHT;
    }
    
    // Getter cho dữ liệu từ các textField
    public int getTextMSNV() {
        return Integer.parseInt(textMSNV.getText());
    }


    public String getTextHoTen() {
        return textHoTen.getText().trim();
    }

    public String getTextLoaiNV() {
        return textLoaiNV.getText().trim();
    }

    public Double getTextLuongCB() {
        return Double.valueOf(textLuongCB.getText());
    }

    public Double getTextLuongHT() {
        return Double.valueOf(textLuongHT.getText());
    }

    public int getSelectedTableRow() {
        return tableSV.getSelectedRow();
    }

    public void updateTableRow(int row, Object[] data) {
        DefaultTableModel model = (DefaultTableModel) tableSV.getModel();
        for (int i = 0; i < data.length; i++) {
            model.setValueAt(data[i], row, i);
        }
    }

    public void addTableRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) tableSV.getModel();
        model.addRow(row);
    }

    public void removeTableRow(int row) {
        DefaultTableModel model = (DefaultTableModel) tableSV.getModel();
        model.removeRow(row);
    }

    public void showMessage(String msg) {
        javax.swing.JOptionPane.showMessageDialog(this, msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnXem = new javax.swing.JButton();
        btnTinhLuong = new javax.swing.JButton();
        textMSNV = new javax.swing.JTextField();
        textHoTen = new javax.swing.JTextField();
        textLoaiNV = new javax.swing.JTextField();
        textLuongHT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textLuongCB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Loại nhân viên");

        jLabel4.setText("Lương hàng tháng");

        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnTinhLuong.setText("Tính lương");
        btnTinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhLuongActionPerformed(evt);
            }
        });

        textMSNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMSNVActionPerformed(evt);
            }
        });

        textLuongHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLuongHTActionPerformed(evt);
            }
        });

        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ và tên", "Loại nhân viên", "Lương cơ bản", "Lương hàng tháng", "Số ngày làm", "Số sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSV);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Lương cơ bản");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("TÍNH TIỀN LƯƠNG");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thông tin nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(textLoaiNV, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textLuongCB, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textLuongHT, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textMSNV)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnXem)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCapNhat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnTinhLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textMSNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(textLuongHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXem)
                            .addComponent(btnThem)
                            .addComponent(btnCapNhat)
                            .addComponent(btnXoa))
                        .addGap(42, 42, 42)
                        .addComponent(btnTinhLuong)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMSNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMSNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMSNVActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed

    }//GEN-LAST:event_btnXemActionPerformed

    private void textLuongHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLuongHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLuongHTActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTinhLuongActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTinhLuong;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSV;
    private javax.swing.JTextField textHoTen;
    private javax.swing.JTextField textLoaiNV;
    private javax.swing.JTextField textLuongCB;
    private javax.swing.JTextField textLuongHT;
    private javax.swing.JTextField textMSNV;
    // End of variables declaration//GEN-END:variables
}

