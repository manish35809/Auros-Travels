import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Timer;

public class Train_Panel extends javax.swing.JFrame {

    Mysql_Con c = new Mysql_Con();
    
    public Train_Panel() {
        initComponents();
        design.start();
        load_cities();
    }

    Timer design = new Timer(1000,new ActionListener(){
        String main_bcolor = "red";
        @Override
        public void actionPerformed(ActionEvent e) {
            if(main_bcolor.equals("red")){
                main.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                head.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.red));
                headding.setForeground(Color.blue);
                main_bcolor = "blue";
            }
            else{
                main.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.red));
                head.setBorder(BorderFactory.createMatteBorder(5,5,5,5,Color.blue));
                headding.setForeground(Color.red);
                main_bcolor = "red";
            }
        }
    });
    
    void clear_fiels(){
        train_code_f.setText("");
        train_name_f.setText("");
        train_desc_f.setText("");
        source_cb.setSelectedItem(null);
        dest_cb.setSelectedItem(null);
        train_arrival_f.setText("");
        train_dept_f.setText("");
        farea.setText("");
        fareb.setText("");
        farec.setText("");
        fared.setText("");
        time_taken_f.setText("");
    }
    
    void load_cities(){
        try {
            String qry = "SELECT City FROM Cities ORDER BY City";
            ResultSet data = c.get_data(qry);
            while(data.next()){
                source_cb.addItem(data.getString(1));
                dest_cb.addItem(data.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Train_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        headding = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        train_code_f = new javax.swing.JTextField();
        train_name_f = new javax.swing.JTextField();
        source_cb = new javax.swing.JComboBox();
        dest_cb = new javax.swing.JComboBox();
        train_arrival_f = new javax.swing.JTextField();
        train_dept_f = new javax.swing.JTextField();
        farea = new javax.swing.JTextField();
        fareb = new javax.swing.JTextField();
        farec = new javax.swing.JTextField();
        fared = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        train_desc_f = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        time_taken_f = new javax.swing.JTextField();
        load_train_data_button = new javax.swing.JButton();
        clear_train_data_button = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        headding.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        headding.setForeground(new java.awt.Color(255, 0, 0));
        headding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headding.setText("Train Panel");
        headding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headdingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headding)
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Train Code ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Train Name ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Train Description ");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Source ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Destination");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Arrival");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Departure");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("A.C. First Class Fair");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("A.C. Second Class Fair");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("A.C. Third Class Fair");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Sleeper Class Fair");

        train_code_f.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        train_name_f.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        source_cb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        dest_cb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        train_arrival_f.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        train_dept_f.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        farea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        fareb.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        farec.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        fared.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        train_desc_f.setColumns(20);
        train_desc_f.setLineWrap(true);
        train_desc_f.setRows(5);
        train_desc_f.setWrapStyleWord(true);
        jScrollPane1.setViewportView(train_desc_f);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Time Take");

        time_taken_f.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        load_train_data_button.setBackground(new java.awt.Color(255, 255, 255));
        load_train_data_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        load_train_data_button.setText("Load");
        load_train_data_button.setOpaque(false);
        load_train_data_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                load_train_data_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                load_train_data_buttonMouseExited(evt);
            }
        });
        load_train_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_train_data_buttonActionPerformed(evt);
            }
        });

        clear_train_data_button.setBackground(new java.awt.Color(0, 0, 0));
        clear_train_data_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_train_data_button.setForeground(new java.awt.Color(255, 255, 255));
        clear_train_data_button.setText("Clear");
        clear_train_data_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_train_data_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_train_data_buttonMouseExited(evt);
            }
        });
        clear_train_data_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_train_data_buttonActionPerformed(evt);
            }
        });

        add_btn.setBackground(new java.awt.Color(255, 255, 255));
        add_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_btn.setText("Add Data");
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_btnMouseExited(evt);
            }
        });
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(45, 45, 45)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fared)
                    .addComponent(farec, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fareb, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(farea, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(train_dept_f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(train_arrival_f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dest_cb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(source_cb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(train_name_f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(train_code_f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time_taken_f))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(load_train_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_train_data_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(train_code_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load_train_data_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(train_name_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_train_data_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(source_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dest_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(train_arrival_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(train_dept_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(farea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fareb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(farec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_taken_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(add_btn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void load_train_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_train_data_buttonActionPerformed
        String str_code = train_code_f.getText();
        if(str_code.equals("")){
            c.message("Please Fill Train Code Field");
        }
        else{
            String qry = "SELECT * FROM TRAIN_DETAILS WHERE TRAIN_CODE = "+str_code+"";
            try {
                int row_num = c.row_count(qry);
                if(row_num == 0){
                    c.message("No Data Found to Load");
                }
                else{
                    ResultSet data = c.get_data(qry);
                    while(data.next()){
                        String tname = data.getString("Train_Name");
                        String tdesc = data.getString("Description");
                        String source = data.getString("Source");
                        String dest = data.getString("Destination");
                        String arrival = data.getString("Arrival");
                        String dept = data.getString("Departure");
                        String time = data.getString("Time_Taken");
                        int fare_a = data.getInt("Rate_A");
                        int fare_b = data.getInt("Rate_B");
                        int fare_c = data.getInt("Rate_C");
                        int fare_d = data.getInt("Rate_D");

                        train_name_f.setText(tname);
                        train_desc_f.setText(tdesc);
                        source_cb.setSelectedItem(source);
                        dest_cb.setSelectedItem(dest);
                        train_arrival_f.setText(arrival);
                        train_dept_f.setText(dept);
                        farea.setText(""+fare_a);
                        fareb.setText(""+fare_b);
                        farec.setText(""+fare_c);
                        fared.setText(""+fare_d);
                        time_taken_f.setText(time);
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Train_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_load_train_data_buttonActionPerformed

    private void clear_train_data_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_train_data_buttonActionPerformed
        clear_fiels();
    }//GEN-LAST:event_clear_train_data_buttonActionPerformed

    private void load_train_data_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_load_train_data_buttonMouseEntered
        load_train_data_button.setBackground(Color.BLUE);
        load_train_data_button.setForeground(Color.WHITE);
    }//GEN-LAST:event_load_train_data_buttonMouseEntered

    private void load_train_data_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_load_train_data_buttonMouseExited
        load_train_data_button.setBackground(Color.WHITE);
        load_train_data_button.setForeground(Color.BLACK);
    }//GEN-LAST:event_load_train_data_buttonMouseExited

    private void clear_train_data_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_train_data_buttonMouseEntered
        clear_train_data_button.setBackground(Color.RED);
    }//GEN-LAST:event_clear_train_data_buttonMouseEntered

    private void clear_train_data_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_train_data_buttonMouseExited
        clear_train_data_button.setBackground(Color.BLACK);
    }//GEN-LAST:event_clear_train_data_buttonMouseExited

    private void add_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseEntered
        add_btn.setBackground(Color.GREEN);
    }//GEN-LAST:event_add_btnMouseEntered

    private void add_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseExited
        add_btn.setBackground(Color.WHITE);
    }//GEN-LAST:event_add_btnMouseExited

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        String t_code = train_code_f.getText();
        if(t_code.equals("")){
            c.message("Please Fill All the Fields.");
        }
        else{
            String qry = "SELECT * FROM train_details WHERE Train_Code = "+t_code+"";
            try {
                int res = c.row_count(qry);
                if(res == 0){
                    String t_name = train_name_f.getText();
                    String t_desc = train_desc_f.getText();
                    String t_source = (String) source_cb.getSelectedItem();
                    String t_dest = (String) dest_cb.getSelectedItem();
                    String t_arrival = train_arrival_f.getText();
                    String t_dept = train_dept_f.getText();
                    String t_farea = farea.getText(); 
                    String t_fareb = fareb.getText(); 
                    String t_farec = farec.getText(); 
                    String t_fared = fared.getText(); 
                    String t_time = time_taken_f.getText();
                    if(t_name.equals("") && t_desc.equals("") && t_source.equals("") && t_dest.equals("") && t_arrival.equals("") && t_dept.equals("") && t_farea.equals("") && t_fareb.equals("") && t_farec.equals("") && t_fared.equals("") && t_time.equals("")){
                        c.message("Please Fill All the Fields to Add Train Data.");
                    }
                    else{
                        String qry_2 = "INSERT INTO Train_Details VALUES("+t_code+",'"+t_name+"','"+t_desc+"','"+t_source+"','"+t_dest+"','"+t_arrival+"','"+t_dept+"','"+t_time+"','"+t_farea+"','"+t_fareb+"','"+t_farec+"','"+t_fared+"')";
                        int res_2 = c.update(qry_2);
                        if(res_2 == 0){
                            c.message("Unable to Add Train Data. Plase verify all data and Then try Again.");
                        }
                        else{
                            c.message("Train Data Added Successfully.");
                            clear_fiels();
                        }
                    }
                }
                else{
                    c.message("Train Details Already Available, so you can Update the Data.");
                    clear_fiels();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Train_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void headdingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headdingMouseClicked
        new Admin_Panel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_headdingMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String t_code = train_code_f.getText();
        String t_name = train_name_f.getText();
        String t_desc = train_desc_f.getText();
        String t_source = (String) source_cb.getSelectedItem();
        String t_dest = (String) dest_cb.getSelectedItem();
        String t_arrival = train_arrival_f.getText();
        String t_dept = train_dept_f.getText();
        String t_time = time_taken_f.getText();
        String t_farea = farea.getText(); 
        String t_fareb = fareb.getText(); 
        String t_farec = farec.getText(); 
        String t_fared = fared.getText(); 
        String qry = "UPDATE train_details SET Train_Code = "+t_code+",Train_Name = '"+t_name+"',Description = '"+t_desc+"',Source = '"+t_source+"',Destination = '"+t_dest+"',Arrival = '"+t_arrival+"',Departure = '"+t_dept+"',Time_Taken = '"+t_time+"',RATE_A = "+t_farea+",RATE_B = "+t_fareb+",RATE_C = "+t_farec+",RATE_D = "+t_fared+"";
        System.out.print(qry);
        try {
            int res = c.update(qry);
            if(res == 0){
                c.message("Unable to Update Train Details");
            }
            else{
                clear_fiels();
                c.message("Train Details Updated Successfully");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Train_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Train_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Train_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Train_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Train_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Train_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_train_data_button;
    private javax.swing.JComboBox dest_cb;
    private javax.swing.JTextField farea;
    private javax.swing.JTextField fareb;
    private javax.swing.JTextField farec;
    private javax.swing.JTextField fared;
    private javax.swing.JPanel head;
    private javax.swing.JLabel headding;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton load_train_data_button;
    private javax.swing.JPanel main;
    private javax.swing.JComboBox source_cb;
    private javax.swing.JTextField time_taken_f;
    private javax.swing.JTextField train_arrival_f;
    private javax.swing.JTextField train_code_f;
    private javax.swing.JTextField train_dept_f;
    private javax.swing.JTextArea train_desc_f;
    private javax.swing.JTextField train_name_f;
    // End of variables declaration//GEN-END:variables
}
