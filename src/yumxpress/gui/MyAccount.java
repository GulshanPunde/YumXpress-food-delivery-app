/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import yumxpress.dao.CustomerDao;
import yumxpress.pojo.CustomerPojo;
import yumxpress.util.UserProfile;
import yumxpress.util.PasswordEncryption;
import yumxpress.util.Validator;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class MyAccount extends javax.swing.JFrame {

    /**
     * Creates new form MyAccount
     */
    public MyAccount() {
        initComponents();
        super.setLocationRelativeTo(null);
        ImageIcon icon=new ImageIcon(getClass().getResource("/yumxpress/icons/Foodie.png"));
        Image image=icon.getImage();
        super.setIconImage(image);
        super.setResizable(false);
        lblGreet.setText("Hello "+UserProfile.getName());
        initData();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnMyCart = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        lblGreet = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        txtMobile = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        btnMyCart.setBackground(new java.awt.Color(255, 153, 0));
        btnMyCart.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnMyCart.setForeground(new java.awt.Color(51, 51, 0));
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });

        btnOrderFood.setBackground(new java.awt.Color(255, 153, 0));
        btnOrderFood.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnOrderFood.setForeground(new java.awt.Color(51, 51, 0));
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        btnCancelOrder.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelOrder.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnCancelOrder.setForeground(new java.awt.Color(51, 51, 0));
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });

        btnOrderHistory.setBackground(new java.awt.Color(255, 153, 0));
        btnOrderHistory.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnOrderHistory.setForeground(new java.awt.Color(51, 51, 0));
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderHistory))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnMyCart)
                .addGap(37, 37, 37)
                .addComponent(btnOrderFood)
                .addGap(42, 42, 42)
                .addComponent(btnCancelOrder)
                .addGap(48, 48, 48)
                .addComponent(btnOrderHistory)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        lblGreet.setBackground(new java.awt.Color(255, 51, 255));
        lblGreet.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblGreet.setForeground(new java.awt.Color(255, 255, 255));
        lblGreet.setText("       Hello Punit");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblGreet, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblGreet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Enter Name :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 219, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 255));
        jLabel13.setText("Enter Mobile No :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 255));
        jLabel14.setText("Enter Password :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(0, 51, 255));
        id.setText("Customer Id :");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 153, -1, -1));

        txtAddress1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtAddress1.setForeground(new java.awt.Color(0, 51, 255));
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 428, 232, -1));

        pwd.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        pwd.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 361, 232, -1));

        txtMobile.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtMobile.setForeground(new java.awt.Color(0, 51, 255));
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 291, 232, -1));

        txtName1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 51, 255));
        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 216, 232, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 51, 255));
        jLabel16.setText("My Account");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 39, 300, 50));

        btnUpdate.setBackground(new java.awt.Color(51, 51, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 210, 40));

        txtId.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 51, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 150, 232, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("Enter Address :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 431, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
       MyCart myCart=new MyCart();
       myCart.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        OrderFood orderFood=new OrderFood();
        orderFood.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        CancelOrder cancelOrder=new CancelOrder();
        cancelOrder.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        OrderHistory orderHistory=new OrderHistory();
        orderHistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(! validateInputs()){
            return;
        }
        CustomerPojo customer=new CustomerPojo();
        customer.setAddress(txtAddress1.getText().trim());
        customer.setCustomerName(txtName1.getText().trim());
        customer.setCustomerId(UserProfile.getId());
        String pass=String.valueOf(pwd.getPassword());
        String epass=PasswordEncryption.getEncryptedPassword(pass);
        customer.setPassword(epass);
        System.out.println("MyAccount"+pass+" encrypted "+epass);
        try{
            if(CustomerDao.updateCustomer(customer)){
                JOptionPane.showMessageDialog(null,"Updation Successfully done");
                return;
            }
            else{
                JOptionPane.showMessageDialog(null,"Updation Failed");
                return;
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB problem in Updaton"+ex);
            return;
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName1;
    // End of variables declaration//GEN-END:variables
    private boolean validateInputs(){
        if(txtAddress1.getText().trim().isEmpty()||txtMobile.getText().trim().isEmpty()||txtName1.getText().trim().isEmpty()||pwd.getPassword().length==0){
            return false;
        }
    return true;
    }

    private void initData() {
        try{
            CustomerPojo pojo=CustomerDao.getCustmoerDetailById(UserProfile.getId());
         
            this.txtName1.setText(pojo.getCustomerName());
            this.txtAddress1.setText(pojo.getAddress());
            this.txtMobile.setText(pojo.getMobileNo());
            this.pwd.setText(PasswordEncryption.getDecryptedPassword(pojo.getPassword()));
            txtId.setText(pojo.getCustomerId());
            txtId.setEditable(false);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
    }
}
