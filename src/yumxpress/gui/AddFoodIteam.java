/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDao;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.OwnerProfile;
import yumxpress.util.SpoonacularAPI;
import yumxpress.util.UserProfile;

/**
 *
 * @author HP
 */
public class AddFoodIteam extends javax.swing.JFrame {

    private List<ProductPojo> foodList;
    private int index=0;
    ProductPojo product;
    public AddFoodIteam() {
        initComponents();
        super.setLocationRelativeTo(null);
        this.lblGreet.setText("Hello "+OwnerProfile.getOwnerName());
         ImageIcon icon=new ImageIcon(getClass().getResource("/yumxpress/icons/Foodie.png"));
        Image image=icon.getImage();
        super.setIconImage(image);
        super.setResizable(false);
        
        
       
        clearAll();
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
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        btnAddStaff = new javax.swing.JButton();
        btnViewFood = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblGreet = new javax.swing.JLabel();
        btnViewStaff = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnOrderList = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSerchFood = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        btnSearchFood = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(51, 51, 255));

        jPanel24.setBackground(new java.awt.Color(51, 51, 255));

        btnAddStaff.setBackground(new java.awt.Color(255, 153, 51));
        btnAddStaff.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnAddStaff.setText("Add Staff");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        btnViewFood.setBackground(new java.awt.Color(255, 153, 51));
        btnViewFood.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnViewFood.setText("View Food");
        btnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblGreet.setBackground(new java.awt.Color(255, 51, 255));
        lblGreet.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblGreet.setForeground(new java.awt.Color(255, 255, 255));
        lblGreet.setText("       Hello Punit");

        btnViewStaff.setBackground(new java.awt.Color(255, 153, 51));
        btnViewStaff.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnViewStaff.setText("View Staff");
        btnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblGreet, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGreet, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddStaff)
                .addGap(36, 36, 36)
                .addComponent(btnViewFood)
                .addGap(51, 51, 51)
                .addComponent(btnViewStaff))
        );

        btnOrderList.setBackground(new java.awt.Color(255, 153, 51));
        btnOrderList.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnOrderList.setText("Order List");
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnOrderList)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 640));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Search Food");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 133, 139, 34));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Food Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 208, 145, 38));

        txtSerchFood.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSerchFood.setForeground(new java.awt.Color(102, 0, 255));
        txtSerchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerchFoodActionPerformed(evt);
            }
        });
        jPanel1.add(txtSerchFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 133, 245, -1));

        txtFoodName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtFoodName.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(txtFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 245, -1));

        btnSearchFood.setBackground(new java.awt.Color(255, 153, 51));
        btnSearchFood.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSearchFood.setText("Search");
        btnSearchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFoodActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 135, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Food Image");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 288, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Enter Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 555, 121, 38));

        btnAddItem.setBackground(new java.awt.Color(255, 153, 51));
        btnAddItem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnAddItem.setText("Add Iteam");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 557, 131, 37));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 245, -1));

        lblBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Project Icons\\icons8-left-arrow-64 (1).png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 354, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 644, -1, -1));

        lblNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Project Icons\\icons8-right-arrow-64.png")); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });
        jPanel1.add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("   Add Food Item");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 29, -1, -1));

        lblImage.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 332, 259, 196));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerchFoodActionPerformed
       
    }//GEN-LAST:event_txtSerchFoodActionPerformed

    private void btnSearchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFoodActionPerformed
       String foodName=txtSerchFood.getText().trim();
       if(foodName.isEmpty()){
           JOptionPane.showMessageDialog(null,"Please Type Food Name !");
           return;
       }
       
           
           
       
       try{
           foodName=foodName.replaceAll(" ","-");
           foodList=SpoonacularAPI.getAllIteamDetailsByName(foodName);
           
           if(foodList.isEmpty()){
               JOptionPane.showMessageDialog(null,"No Food Iteam Detail Found For "+foodName);
               return;
           }
           showFoodDetailByIndex(index);
     
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Please check your data connecion!");
           return;
          
       }
    }//GEN-LAST:event_btnSearchFoodActionPerformed

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
      index++;
      if(index>foodList.size()-1){
          index=0;
      }
        showFoodDetailByIndex(index);
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        index--;
        if(index<0){
            index=foodList.size()-1;
        }
        showFoodDetailByIndex(index);
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
      if(validateInputs()==false){
          JOptionPane.showMessageDialog(null,"Please fill all the details");
          return;
      }
      try{
          String name=txtFoodName.getText().trim();
          if(name.length()>30){
              name=name.substring(0,30);
          }
          product.setProductName(name);
          Double price=Double.parseDouble(txtPrice.getText().trim());
          
          product.setProductPrice(price);
          
          product.setCompanyId(OwnerProfile.getCompanyId());
          
          if(! ProductDao.addProduct(product)){
              JOptionPane.showMessageDialog(null,"Item does not added in database");
              return;
          }
          JOptionPane.showMessageDialog(null,"Item  added in database");
          foodList.remove(index);
          
          if(foodList.isEmpty()){
              JOptionPane.showMessageDialog(null,"All varaiteys for "+txtFoodName.getText().trim()+" added");
              clearAll();
              return;
          }
          index=0;
          showFoodDetailByIndex(index);
          
      }
      catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"please fill numeric price");
          ex.printStackTrace();
          return;
      }
      
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB problem in adding the food"+ex);
          return;
      }
      
      catch(Exception ex){
          JOptionPane.showMessageDialog(null,"IO exception  in adding the food"+ex);
          ex.printStackTrace();
          return;
      }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStaffActionPerformed
        ViewStaff staff=new ViewStaff();
        staff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewStaffActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        OrderList list=new OrderList();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodActionPerformed
        ViewFood view=new ViewFood();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewFoodActionPerformed

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        AddStaff staff=new AddStaff();
        staff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStaffActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddFoodIteam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodIteam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodIteam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodIteam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodIteam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnSearchFood;
    private javax.swing.JButton btnViewFood;
    private javax.swing.JButton btnViewStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNext;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSerchFood;
    // End of variables declaration//GEN-END:variables

    private void showFoodDetailByIndex(int index) {
        product=foodList.get(index);
        String foodName=product.getProductName();
        if(foodName.length()>30){
            foodName=foodName.substring(0,30)+"....";
        }
        txtFoodName.setText(foodName);
        Image img=product.getProductimage();
        img=img.getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon icon=new ImageIcon(img);
        lblImage.setIcon(icon);
        lblNext.setEnabled(true);
        lblBack.setEnabled(true);
    }
   private boolean validateInputs(){
        if(this.txtPrice.getText().trim().isEmpty()||this.txtFoodName.getText().trim().isEmpty()||lblImage.getIcon()==null)
            return false;
        return true;
    }
   private void clearAll(){
        txtFoodName.setText("");
        txtPrice.setText("");
        txtSerchFood.setText("");
        lblImage.setIcon(null);
        lblNext.setEnabled(false);
        lblBack.setEnabled(false);
   }
}