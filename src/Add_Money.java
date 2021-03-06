import java.awt.Color;
import java.sql.*;
import java.util.logging.*;

public final class Add_Money extends javax.swing.JFrame {

    /**
     * Creates new form Add_Money
     * @param uname
     */
    String user;
    double account_no;
    int cv,m,y;
    Mysql_Con c = new Mysql_Con();
    
    public Add_Money(String uname) throws ClassNotFoundException, SQLException {
        initComponents();
        user = uname;
        load_data();
    }
    
    void load_data() throws ClassNotFoundException, SQLException{
        
        String qry_1 = "SELECT Money FROM users WHERE User_Name = '"+user+"'";
        ResultSet amt_data = c.get_data(qry_1);
        if(amt_data.next()){
            double amt = amt_data.getDouble("Money");
            amount.setText(""+amt);
        }
        
        String qry_2 = "SELECT * FROM card_details WHERE User_Name = '"+user+"'";
        ResultSet card_data = c.get_data(qry_2);
        if(card_data.next()){
            int sql_cvv = 0 ,sql_month = 0,sql_year = 0;
            
            long sql_acc_no = card_data.getLong("Account_Number"); 
            sql_cvv = card_data.getInt("CVV");
            sql_month = card_data.getInt("Month");
            sql_year = card_data.getInt("Year");
            
            ac_no.setText(sql_acc_no+"");
            cvv.setText(sql_cvv+"");
            month.setText(sql_month+"");
            year.setText(sql_year+"");
        }
        else{
            c.message("Card Details Not Availabe for Pre-load");
        }
        
    }
    
    void clear_fields(){
        ac_no.setText("");
        cvv.setText("");
        month.setText("");
        year.setText("");
        add_amt.setText("");
    }

    private Add_Money() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        border_screen = new javax.swing.JPanel();
        main_screen = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        amount = new javax.swing.JLabel();
        add_screen = new javax.swing.JPanel();
        add_screen_head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ac_no = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        add_amt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        clr_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        reload_btn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 470));
        setUndecorated(true);
        setResizable(false);

        border_screen.setBackground(new java.awt.Color(51, 0, 255));

        main_screen.setBackground(new java.awt.Color(255, 255, 255));

        back_btn.setBackground(new java.awt.Color(255, 255, 255));
        back_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 0, 51));
        back_btn.setText("Back");
        back_btn.setToolTipText("");
        back_btn.setBorderPainted(false);
        back_btn.setFocusPainted(false);
        back_btn.setOpaque(false);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("SansSerif", 1, 100)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amount.setText("0");

        add_screen.setBackground(new java.awt.Color(255, 255, 255));
        add_screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 10));

        add_screen_head.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_screen_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_screen_head.setText("Add Money");
        add_screen_head.setAutoscrolls(true);
        add_screen_head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Account Number  :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("CVV                       :");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Month                    :");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Year                      :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Enter All Details :--");

        ac_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cvv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        month.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        year.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_add.setBackground(new java.awt.Color(153, 255, 0));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_add.setText("Add Amount");
        btn_add.setBorderPainted(false);
        btn_add.setOpaque(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(204, 255, 255));
        btn_save.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_save.setText("Save Card Details");
        btn_save.setBorderPainted(false);
        btn_save.setOpaque(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        add_amt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Amount                :");

        clr_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clr_btn.setText("Clear");
        clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_btnActionPerformed(evt);
            }
        });

        exit_btn.setBackground(new java.awt.Color(255, 255, 255));
        exit_btn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.setOpaque(false);
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_btnMouseExited(evt);
            }
        });
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_screenLayout = new javax.swing.GroupLayout(add_screen);
        add_screen.setLayout(add_screenLayout);
        add_screenLayout.setHorizontalGroup(
            add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_screen_head, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(add_screenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_screenLayout.createSequentialGroup()
                        .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac_no)
                            .addComponent(cvv)
                            .addComponent(month)
                            .addComponent(year)
                            .addComponent(add_amt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_screenLayout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clr_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add)))
                .addContainerGap())
        );
        add_screenLayout.setVerticalGroup(
            add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_screenLayout.createSequentialGroup()
                .addComponent(add_screen_head, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ac_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(add_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_save)
                    .addComponent(clr_btn)
                    .addComponent(exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        reload_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reload_btn.setForeground(new java.awt.Color(51, 0, 255));
        reload_btn.setText("Reload");
        reload_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reload_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_screenLayout = new javax.swing.GroupLayout(main_screen);
        main_screen.setLayout(main_screenLayout);
        main_screenLayout.setHorizontalGroup(
            main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_screenLayout.createSequentialGroup()
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(reload_btn))
            .addGroup(main_screenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_screen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_screenLayout.setVerticalGroup(
            main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_screenLayout.createSequentialGroup()
                .addGroup(main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_btn)
                    .addComponent(reload_btn))
                .addGap(18, 18, 18)
                .addComponent(amount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout border_screenLayout = new javax.swing.GroupLayout(border_screen);
        border_screen.setLayout(border_screenLayout);
        border_screenLayout.setHorizontalGroup(
            border_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border_screenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        border_screenLayout.setVerticalGroup(
            border_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border_screenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border_screen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            String qry_check = "SELECT * FROM card_details WHERE User_Name = '"+user+"'";
            int count = c.row_count(qry_check);           
            if(count == 0){
                if(account_no != 0 && cv  != 0 && m != 0 && y != 0){
                    String qry = "INSERT INTO card_details (User_Name,Account_Number,CVV,Month,Year,Update_Time) VALUES ('"+user+"',"+account_no+","+cv+","+m+","+y+",now())";
                    int res = c.update(qry);
                    if(res == 1){
                        c.message("Details Saved Successfully.");
                    }
                    else{
                        c.message("Unable to Save Details.");
                    }
                }   
                else{
                    c.message("Unable to Save Details.");
                }
            }
            else{
                if(account_no != 0 && cv  != 0 && m != 0 && y != 0){
                    String qry = "UPDATE card_details SET Account_Number = '"+account_no+"' , CVV = '"+cv+"' , Month = '"+m+"' , Year = '"+y+"' , Update_Time = NOW() WHERE User_Name = '"+user+"' ";
                    int res = c.update(qry);
                    if(res == 0){
                        c.message("Unable to Update Details.");
                    }
                    else{
                        c.message("Details Updated Successfully.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        account_no = Double.parseDouble(ac_no.getText());
        cv = Integer.parseInt(cvv.getText());
        m = Integer.parseInt(month.getText());
        y = Integer.parseInt(year.getText());
        
        double old_amt = Double.parseDouble(amount.getText());
        double new_amt = Double.parseDouble(add_amt.getText());
        
        int acc_len = ac_no.getText().length();
        int cv_len = cvv.getText().length();
        
        if(acc_len <= 16 && cv_len <= 3){
            double sum_amt = old_amt + new_amt;
            String qry_1 = "UPDATE users SET Money = "+sum_amt+" WHERE User_Name = '"+user+"'";
            try {
                int res_1 = c.update(qry_1);
                if(res_1 == 1){
                    c.message("Amount Added Successfully.");
                    clear_fields();
                    String qry_2 = "INSERT INTO transactions(User_Name,Amount,Info,Date_Time) VALUES ('"+user+"',"+new_amt+",'Money Added to Wallet',now())";
                    int res_2 = c.update(qry_2);
                    if(res_2 == 1){
                        c.message("Transaction Saved Successfully.");
                    }
                    else{
                        c.message("Unable to Save Transaction.");
                    }
                }
                else{
                    c.message("Unable to Add Money");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            c.message("Please Check All the Details and Try Again.");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.setVisible(false);
        try {
            new Home(user).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back_btnActionPerformed

    private void reload_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reload_btnActionPerformed
        try {
            load_data();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reload_btnActionPerformed

    private void clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_btnActionPerformed
        clear_fields();
    }//GEN-LAST:event_clr_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void exit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseEntered
        exit_btn.setBackground(Color.red);
        exit_btn.setForeground(Color.black);
    }//GEN-LAST:event_exit_btnMouseEntered

    private void exit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseExited
        exit_btn.setBackground(Color.white);
        exit_btn.setForeground(Color.black);
    }//GEN-LAST:event_exit_btnMouseExited

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
            java.util.logging.Logger.getLogger(Add_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac_no;
    private javax.swing.JTextField add_amt;
    private javax.swing.JPanel add_screen;
    private javax.swing.JLabel add_screen_head;
    private javax.swing.JLabel amount;
    private javax.swing.JButton back_btn;
    private javax.swing.JPanel border_screen;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton clr_btn;
    private javax.swing.JTextField cvv;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main_screen;
    private javax.swing.JTextField month;
    private javax.swing.JButton reload_btn;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
