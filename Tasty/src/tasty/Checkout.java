/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasty;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Russell Sean H. Gonzalve
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    
    DBHelper dbh = new DBHelper();
    Cart cart = new Cart();
    Menu m = new Menu();
    public Checkout() {
        initComponents();
        try {
            dbh.connectDB();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtFullName = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHome2 = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JButton();
        btnMyBag2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblmenu = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        lblcart1 = new javax.swing.JLabel();
        lblexit1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        lblRegister.setFont(new java.awt.Font("Cormorant SemiBold", 1, 48)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Tasty");
        jPanel1.add(lblRegister);
        lblRegister.setBounds(370, 10, 119, 59);

        dot.setFont(new java.awt.Font("Cormorant Garamond SemiBold", 0, 48)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 0, 0));
        dot.setText(".");
        jPanel1.add(dot);
        dot.setBounds(480, 10, 10, 59);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        txtFullName.setBackground(new java.awt.Color(51, 51, 51));
        txtFullName.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(204, 204, 204));
        txtFullName.setText("Full name");
        txtFullName.setBorder(null);
        txtFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFullNameMouseClicked(evt);
            }
        });
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtContactNumber.setBackground(new java.awt.Color(51, 51, 51));
        txtContactNumber.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txtContactNumber.setForeground(new java.awt.Color(204, 204, 204));
        txtContactNumber.setText("Contact number");
        txtContactNumber.setBorder(null);
        txtContactNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContactNumberMouseClicked(evt);
            }
        });
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(51, 51, 51));
        txtAddress.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setText("Delivery Address");
        txtAddress.setBorder(null);
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressMouseClicked(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Satisfy", 0, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Enter your details");

        btnSubmit.setBackground(new java.awt.Color(204, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSubmit.setText("CONFIRM");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.black, java.awt.Color.black));
        btnSubmit.setBorderPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContactNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSeparator1, jSeparator2, jSeparator3, txtAddress, txtContactNumber, txtFullName});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSeparator1, jSeparator2, jSeparator3, txtAddress, txtContactNumber, txtFullName});

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 360, 900, 370);

        jPanel3.setBackground(new java.awt.Color(53, 59, 57));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELIVERY HOTLINE: 2444-5678");

        btnHome2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setText("HOME");
        btnHome2.setBorderPainted(false);
        btnHome2.setContentAreaFilled(false);
        btnHome2.setFocusPainted(false);
        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });

        btnMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenu2.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu2.setText("MENU");
        btnMenu2.setBorderPainted(false);
        btnMenu2.setContentAreaFilled(false);
        btnMenu2.setFocusPainted(false);
        btnMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu2ActionPerformed(evt);
            }
        });

        btnMyBag2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMyBag2.setForeground(new java.awt.Color(255, 255, 255));
        btnMyBag2.setText("MY BAG");
        btnMyBag2.setBorderPainted(false);
        btnMyBag2.setContentAreaFilled(false);
        btnMyBag2.setFocusPainted(false);
        btnMyBag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyBag2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOSSING'S RESTAURANT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BUSINESS ADDRESS: N.Bacalso Ave., Cebu City");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(196, 196, 196)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(btnHome2)
                .addGap(18, 18, 18)
                .addComponent(btnMenu2)
                .addGap(18, 18, 18)
                .addComponent(btnMyBag2)
                .addGap(190, 190, 190)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome2)
                    .addComponent(btnMenu2)
                    .addComponent(btnMyBag2)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 850, 1500, 50);

        jLabel36.setFont(new java.awt.Font("Cormorant Garamond", 1, 50)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Customer's Information");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(190, 180, 480, 80);

        lblmenu.setBackground(new java.awt.Color(204, 204, 204));
        lblmenu.setFont(new java.awt.Font("Crimson Text", 1, 18)); // NOI18N
        lblmenu.setForeground(new java.awt.Color(204, 204, 204));
        lblmenu.setText("MENU");
        jPanel1.add(lblmenu);
        lblmenu.setBounds(400, 90, 70, 35);

        lblhome.setBackground(new java.awt.Color(204, 204, 204));
        lblhome.setFont(new java.awt.Font("Crimson Text", 1, 18)); // NOI18N
        lblhome.setForeground(new java.awt.Color(204, 204, 204));
        lblhome.setText("HOME");
        lblhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhomeMouseClicked(evt);
            }
        });
        jPanel1.add(lblhome);
        lblhome.setBounds(280, 90, 52, 35);

        lblcart1.setBackground(new java.awt.Color(204, 204, 204));
        lblcart1.setFont(new java.awt.Font("Crimson Text", 1, 18)); // NOI18N
        lblcart1.setForeground(new java.awt.Color(204, 204, 204));
        lblcart1.setText("CART");
        lblcart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcart1MouseClicked(evt);
            }
        });
        jPanel1.add(lblcart1);
        lblcart1.setBounds(520, 90, 50, 35);

        lblexit1.setBackground(new java.awt.Color(204, 204, 204));
        lblexit1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblexit1.setForeground(new java.awt.Color(255, 255, 255));
        lblexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tasty/Foods/ada.png"))); // NOI18N
        lblexit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexit1MouseClicked(evt);
            }
        });
        jPanel1.add(lblexit1);
        lblexit1.setBounds(870, 0, 30, 35);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tasty/Foods/dsa.png"))); // NOI18N
        jPanel1.add(image);
        image.setBounds(0, 0, 900, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btnMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenu2ActionPerformed

    private void btnMyBag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyBag2ActionPerformed
        new Cart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyBag2ActionPerformed

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseClicked
        // TODO add your handling code here:
        Home hm = new Home();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblhomeMouseClicked

    private void lblcart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcart1MouseClicked
        // TODO add your handling code here:
        Cart crt = new Cart();
        crt.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblcart1MouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        String full_name = txtFullName.getText();
        String mobile_number = txtContactNumber.getText();
        String delivery_address = txtAddress.getText();
        double grand_total = cart.grand_total;
        System.out.println(grand_total);

        boolean success = dbh.insertOrder(m.order_id, full_name, mobile_number, delivery_address, grand_total);
        
        if(success) { 
            JOptionPane.showMessageDialog(this, "Submitted Successfully");
            new ThankYou().setVisible(true);
            this.dispose();
            m.order_id++;
        }    
        else
            JOptionPane.showMessageDialog(this, "Failed to Submit");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFullNameMouseClicked
        // TODO add your handling code here:
        txtFullName.setText("");
    }//GEN-LAST:event_txtFullNameMouseClicked

    private void txtContactNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactNumberMouseClicked
        // TODO add your handling code here:
        txtContactNumber.setText("");
    }//GEN-LAST:event_txtContactNumberMouseClicked

    private void txtAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseClicked
        // TODO add your handling code here:
        txtAddress.setText("");
    }//GEN-LAST:event_txtAddressMouseClicked

    private void lblexit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexit1MouseClicked
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this,"Confirm if you want to log out","Tasty.",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            Login li = new Login();
            li.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblexit1MouseClicked

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome2;
    private javax.swing.JButton btnMenu2;
    private javax.swing.JButton btnMyBag2;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblcart1;
    private javax.swing.JLabel lblexit1;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lblmenu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}
