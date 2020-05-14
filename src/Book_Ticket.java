import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shri
 */
public final class Book_Ticket extends javax.swing.JFrame {
    Mysql_Con c = new Mysql_Con();
    String n1 = "",n2 = "",n3 = "",n4 = "";
    String a1,a2,a3,a4;
    int pass_num;
    double payable_amt_pp;
    double ticket_price;
    String user,today_day,today_month,today_year;
    public Book_Ticket(String uname) {
        initComponents();
        load_cities();
        load_dates();
        user = uname;
    }

    private Book_Ticket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void load_dates(){
        DateFormat day = new SimpleDateFormat("dd");
        DateFormat month = new SimpleDateFormat("MM");
        DateFormat year = new SimpleDateFormat("yyyy");
        Date dateobj = new Date();
        today_day = day.format(dateobj);
        today_month = month.format(dateobj);
        today_year = year.format(dateobj);
        
        for(int i = 1; i <= 31;i++){
            cb_d.addItem(i);
        }
        
        for(int i = 1; i <= 12;i++){
            cb_m.addItem(i);
        }
        
        int next_year = Integer.valueOf(today_year) + 50;
        for(int i = Integer.valueOf(today_year);i <= next_year;i++){
            cb_y.addItem(i);
        }
    }
    
    void clear_train_details(){
        tc_tf.setText("");
        tn_tf.setText("");
        td_ta.setText("");
        s_tf.setText("");
        d_tf.setText("");
        dt_tf.setText("");
        ar_tf.setText("");  
        fca.setSelected(false);
        ac2.setSelected(false);
        ac3.setSelected(false);
        sc.setSelected(false);
    }
    
    void load_cities(){
        String qry = "SELECT City FROM cities ORDER BY City";
        try {
            ResultSet city_data = c.get_data(qry);
            while(city_data.next()){
                city_1.addItem(city_data.getString("City"));
                city_2.addItem(city_data.getString("City"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    double load_amt() throws ClassNotFoundException, SQLException{
        
        String qry_1 = "SELECT Money FROM users WHERE User_Name = '"+user+"'";
        ResultSet amt_data = c.get_data(qry_1);
        double amt = 0;
        if(amt_data.next()){
            amt = amt_data.getDouble("Money");
        }
        return amt;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rates = new javax.swing.ButtonGroup();
        ticket_payment_gateway = new javax.swing.JFrame();
        payment_gateway_panel = new javax.swing.JPanel();
        ticket_amt_label = new javax.swing.JLabel();
        payment_gateway_sub_panel = new javax.swing.JPanel();
        avail_amt_label = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        am_btn = new javax.swing.JButton();
        pm_amt = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        main_panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        from_to_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        city_1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        city_2 = new javax.swing.JComboBox();
        date_panel = new javax.swing.JPanel();
        cb_d = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cb_m = new javax.swing.JComboBox();
        cb_y = new javax.swing.JComboBox();
        train_search = new javax.swing.JButton();
        train_panel = new javax.swing.JPanel();
        train_box = new javax.swing.JComboBox();
        train_select_btn = new javax.swing.JButton();
        train_details_panel_1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tc_tf = new javax.swing.JTextField();
        tn_tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        td_ta = new javax.swing.JTextArea();
        a_tf = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        s_tf = new javax.swing.JTextField();
        d_tf = new javax.swing.JTextField();
        dt_tf = new javax.swing.JTextField();
        ar_tf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        fca = new javax.swing.JRadioButton();
        ac2 = new javax.swing.JRadioButton();
        ac3 = new javax.swing.JRadioButton();
        sc = new javax.swing.JRadioButton();
        a_rb = new javax.swing.JLabel();
        b_rb = new javax.swing.JLabel();
        c_rb = new javax.swing.JLabel();
        d_rb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        n1_f = new javax.swing.JTextField();
        n3_f = new javax.swing.JTextField();
        n2_f = new javax.swing.JTextField();
        n4_f = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        a1_f = new javax.swing.JTextField();
        a3_f = new javax.swing.JTextField();
        a2_f = new javax.swing.JTextField();
        a4_f = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ticket_payment_gateway.setTitle("Payment Gateway");
        ticket_payment_gateway.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ticket_payment_gateway.setMinimumSize(new java.awt.Dimension(450, 180));

        payment_gateway_panel.setBackground(new java.awt.Color(255, 255, 255));
        payment_gateway_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 5));

        ticket_amt_label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        ticket_amt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticket_amt_label.setText("Payable Amount :-");

        payment_gateway_sub_panel.setBackground(new java.awt.Color(204, 255, 255));

        avail_amt_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        avail_amt_label.setText("00");
        avail_amt_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avail_amt_labelMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Available Amount :-");

        am_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        am_btn.setText("Add Money");
        am_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am_btnActionPerformed(evt);
            }
        });

        pm_amt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pm_amt.setText("Pay Amount Now >>");
        pm_amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pm_amtActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payment_gateway_sub_panelLayout = new javax.swing.GroupLayout(payment_gateway_sub_panel);
        payment_gateway_sub_panel.setLayout(payment_gateway_sub_panelLayout);
        payment_gateway_sub_panelLayout.setHorizontalGroup(
            payment_gateway_sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_gateway_sub_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payment_gateway_sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payment_gateway_sub_panelLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avail_amt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(payment_gateway_sub_panelLayout.createSequentialGroup()
                        .addComponent(am_btn)
                        .addGap(18, 18, 18)
                        .addComponent(pm_amt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        payment_gateway_sub_panelLayout.setVerticalGroup(
            payment_gateway_sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_gateway_sub_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payment_gateway_sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avail_amt_label)
                    .addComponent(jLabel19))
                .addGap(10, 10, 10)
                .addGroup(payment_gateway_sub_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am_btn)
                    .addComponent(pm_amt)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout payment_gateway_panelLayout = new javax.swing.GroupLayout(payment_gateway_panel);
        payment_gateway_panel.setLayout(payment_gateway_panelLayout);
        payment_gateway_panelLayout.setHorizontalGroup(
            payment_gateway_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_gateway_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payment_gateway_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ticket_amt_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payment_gateway_sub_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        payment_gateway_panelLayout.setVerticalGroup(
            payment_gateway_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_gateway_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticket_amt_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payment_gateway_sub_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ticket_payment_gatewayLayout = new javax.swing.GroupLayout(ticket_payment_gateway.getContentPane());
        ticket_payment_gateway.getContentPane().setLayout(ticket_payment_gatewayLayout);
        ticket_payment_gatewayLayout.setHorizontalGroup(
            ticket_payment_gatewayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payment_gateway_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ticket_payment_gatewayLayout.setVerticalGroup(
            ticket_payment_gatewayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payment_gateway_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 10, true));
        main_panel.setForeground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(204, 0, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Book Ticket");
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 5));
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
        });

        from_to_panel.setBackground(new java.awt.Color(255, 255, 255));
        from_to_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("From :");

        city_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("To : ");

        city_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout from_to_panelLayout = new javax.swing.GroupLayout(from_to_panel);
        from_to_panel.setLayout(from_to_panelLayout);
        from_to_panelLayout.setHorizontalGroup(
            from_to_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(from_to_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(city_1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(city_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        from_to_panelLayout.setVerticalGroup(
            from_to_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(from_to_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(from_to_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(city_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(city_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        date_panel.setBackground(new java.awt.Color(255, 255, 255));
        date_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        date_panel.setEnabled(false);

        cb_d.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("DATE :");

        cb_m.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        cb_y.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        train_search.setBackground(new java.awt.Color(255, 255, 255));
        train_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        train_search.setText("Search");
        train_search.setOpaque(false);
        train_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                train_searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                train_searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                train_searchMouseExited(evt);
            }
        });
        train_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                train_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout date_panelLayout = new javax.swing.GroupLayout(date_panel);
        date_panel.setLayout(date_panelLayout);
        date_panelLayout.setHorizontalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_d, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_m, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_y, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(train_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        date_panelLayout.setVerticalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cb_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(train_search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        train_panel.setBackground(new java.awt.Color(255, 255, 255));
        train_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        train_box.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        train_box.setOpaque(false);

        train_select_btn.setBackground(new java.awt.Color(255, 255, 255));
        train_select_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        train_select_btn.setText("Select");
        train_select_btn.setOpaque(false);
        train_select_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                train_select_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                train_select_btnMouseExited(evt);
            }
        });
        train_select_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                train_select_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout train_panelLayout = new javax.swing.GroupLayout(train_panel);
        train_panel.setLayout(train_panelLayout);
        train_panelLayout.setHorizontalGroup(
            train_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(train_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(train_box, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(train_select_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        train_panelLayout.setVerticalGroup(
            train_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, train_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(train_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(train_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(train_select_btn))
                .addContainerGap())
        );

        train_details_panel_1.setBackground(new java.awt.Color(255, 255, 255));
        train_details_panel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Train Code");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Train Name");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Train Description");

        tc_tf.setEditable(false);
        tc_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        tn_tf.setEditable(false);
        tn_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        td_ta.setEditable(false);
        td_ta.setColumns(15);
        td_ta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        td_ta.setLineWrap(true);
        td_ta.setRows(5);
        td_ta.setWrapStyleWord(true);
        jScrollPane2.setViewportView(td_ta);

        javax.swing.GroupLayout train_details_panel_1Layout = new javax.swing.GroupLayout(train_details_panel_1);
        train_details_panel_1.setLayout(train_details_panel_1Layout);
        train_details_panel_1Layout.setHorizontalGroup(
            train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(train_details_panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tn_tf)
                    .addComponent(tc_tf)
                    .addComponent(jScrollPane2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        train_details_panel_1Layout.setVerticalGroup(
            train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(train_details_panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(train_details_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(train_details_panel_1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        a_tf.setBackground(new java.awt.Color(255, 255, 255));
        a_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Source");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Destination");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Departure");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Arrival");

        s_tf.setEditable(false);
        s_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        d_tf.setEditable(false);
        d_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        dt_tf.setEditable(false);
        dt_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        ar_tf.setEditable(false);
        ar_tf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout a_tfLayout = new javax.swing.GroupLayout(a_tf);
        a_tf.setLayout(a_tfLayout);
        a_tfLayout.setHorizontalGroup(
            a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a_tfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_tf)
                    .addComponent(d_tf)
                    .addComponent(dt_tf)
                    .addComponent(ar_tf))
                .addContainerGap())
        );
        a_tfLayout.setVerticalGroup(
            a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a_tfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(s_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(d_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dt_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(a_tfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        rates.add(fca);
        fca.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fca.setText("First Class AC");
        fca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fcaMouseClicked(evt);
            }
        });

        rates.add(ac2);
        ac2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ac2.setText("AC 2 Tier");
        ac2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ac2MouseClicked(evt);
            }
        });

        rates.add(ac3);
        ac3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ac3.setText("AC 3 Tier");
        ac3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ac3MouseClicked(evt);
            }
        });

        rates.add(sc);
        sc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sc.setText("Sleeper Class");
        sc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scMouseClicked(evt);
            }
        });

        a_rb.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        a_rb.setText("Rate");

        b_rb.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        b_rb.setText("Rate");

        c_rb.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        c_rb.setText("Rate");

        d_rb.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        d_rb.setText("Rate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fca)
                    .addComponent(a_rb))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ac2)
                    .addComponent(b_rb))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ac3)
                    .addComponent(c_rb))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sc)
                    .addComponent(d_rb))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fca)
                    .addComponent(ac2)
                    .addComponent(ac3)
                    .addComponent(sc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_rb)
                    .addComponent(b_rb)
                    .addComponent(c_rb)
                    .addComponent(d_rb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Name");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setText("Name");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("Name");

        n1_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        n3_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        n2_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        n4_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setText("Age");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Age");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel17.setText("Age");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setText("Age");

        a1_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        a3_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        a2_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        a4_f.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n3_f, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(n1_f, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a1_f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3_f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n4_f))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n2_f)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a2_f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4_f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(n2_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(a2_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(n4_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(a4_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(n1_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(a1_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(n3_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(a3_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("NEXT >>");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(from_to_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(date_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(train_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(train_details_panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(a_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(from_to_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(train_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(train_details_panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void train_searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_train_searchMouseEntered
        train_search.setBackground(Color.BLUE);
        train_search.setForeground(Color.WHITE);
    }//GEN-LAST:event_train_searchMouseEntered

    private void train_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_train_searchMouseClicked
        
    }//GEN-LAST:event_train_searchMouseClicked

    private void train_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_train_searchMouseExited
        train_search.setBackground(Color.WHITE);
        train_search.setForeground(Color.BLACK);
    }//GEN-LAST:event_train_searchMouseExited

    private void train_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_train_searchActionPerformed
        clear_train_details();
        train_box.removeAllItems();
        String city_a = (String) city_1.getSelectedItem();
        String city_b = (String) city_2.getSelectedItem();
        if(city_a.equals(city_b)){
            c.message("Please Select Two Different Cities.");
        }
        else{
            DateFormat now_hour = new SimpleDateFormat("HH");
            DateFormat now_min = new SimpleDateFormat("mm");
            Calendar calobj = Calendar.getInstance();
            String hour = now_hour.format(calobj.getTime());
            String min = now_min.format(calobj.getTime());
            
            String qry = "SELECT * FROM train_details WHERE Source = '"+city_a+"' and Destination = '"+city_b+"' and Departure > '"+hour+":"+min+"' ";
            try {
                ResultSet rs = c.get_data(qry);
                while(rs.next()){
                    String train_name = rs.getString("train_name");
                    train_box.addItem(train_name);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }
            int no_of_trains = 0;
            no_of_trains = train_box.getItemCount();
            if(no_of_trains == 0){
                c.message("No Train Availabe");
            }
            else{
                c.message(no_of_trains+" Trains Available");
            }
        }
    }//GEN-LAST:event_train_searchActionPerformed

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        this.setVisible(false);
        try {
            new Home(user).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_titleMouseClicked

    private void train_select_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_train_select_btnMouseEntered
        train_select_btn.setBackground(Color.GREEN);
    }//GEN-LAST:event_train_select_btnMouseEntered

    private void train_select_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_train_select_btnActionPerformed
        clear_train_details();
        String t_name = (String) train_box.getSelectedItem();
        if(t_name == null){
            c.message("Please Select Train If Available");
        }
        else{
            try {
                String qry = "SELECT * FROM train_details WHERE train_name = '"+t_name+"'";
                ResultSet data = c.get_data(qry);
                if(data.next()){
                    String train_code = data.getString("Train_Code");
                    String train_name = data.getString("Train_Name");
                    String train_desc = data.getString("Description");
                    String train_source = data.getString("Source");
                    String train_dest = data.getString("Destination");
                    String train_arr = data.getString("Arrival");
                    String train_dept = data.getString("Departure");
                    int r1 = data.getInt("RATE_A");
                    int r2 = data.getInt("RATE_B");
                    int r3 = data.getInt("RATE_C");
                    int r4 = data.getInt("RATE_D");
                    tc_tf.setText(train_code);
                    tn_tf.setText(train_name);
                    td_ta.setText(train_desc);
                    s_tf.setText(train_source);
                    d_tf.setText(train_dest);
                    dt_tf.setText(train_dept);
                    ar_tf.setText(train_arr);
                    a_rb.setText(""+r1);
                    b_rb.setText(""+r2);
                    c_rb.setText(""+r3);
                    d_rb.setText(""+r4);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_train_select_btnActionPerformed

    private void train_select_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_train_select_btnMouseExited
        train_select_btn.setBackground(Color.WHITE);
    }//GEN-LAST:event_train_select_btnMouseExited

    private void scMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scMouseClicked
        d_rb.setForeground(Color.red);
        a_rb.setForeground(Color.black);
        b_rb.setForeground(Color.black);
        c_rb.setForeground(Color.black);
    }//GEN-LAST:event_scMouseClicked

    private void ac3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac3MouseClicked
        c_rb.setForeground(Color.red);
        a_rb.setForeground(Color.black);
        b_rb.setForeground(Color.black);
        d_rb.setForeground(Color.black);
    }//GEN-LAST:event_ac3MouseClicked

    private void ac2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac2MouseClicked
        b_rb.setForeground(Color.red);
        a_rb.setForeground(Color.black);
        d_rb.setForeground(Color.black);
        c_rb.setForeground(Color.black);
    }//GEN-LAST:event_ac2MouseClicked

    private void fcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcaMouseClicked
        a_rb.setForeground(Color.red);
        d_rb.setForeground(Color.black);
        b_rb.setForeground(Color.black);
        c_rb.setForeground(Color.black);
    }//GEN-LAST:event_fcaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       StringBuilder errors = new StringBuilder();
       pass_num = 0;
        if(fca.isSelected() == true){
            ticket_price = Double.parseDouble(a_rb.getText());
        }
        if(ac2.isSelected() == true){
            ticket_price = Double.parseDouble(b_rb.getText());
        }
        if(ac3.isSelected() == true){
            ticket_price = Double.parseDouble(c_rb.getText());
        }
        if(sc.isSelected() == true){
            ticket_price = Double.parseDouble(d_rb.getText());
        }
        n1 = n1_f.getText();
        a1 = a1_f.getText();
        n2 = n2_f.getText();
        a2 = a2_f.getText();
        n3 = n3_f.getText();
        a3 = a3_f.getText();
        n4 = n4_f.getText();
        a4 = a4_f.getText();
        if(n1.equals("") && a1.equals("")){}
        else if(n1.equals("") && a1 != null){
            errors.append("Please Fill First Passanger Name.\n");
        }
        else if(a1.equals("") && n1 != null){
            errors.append("Please Fill First Passanger Age.\n");
        }
        else{
            pass_num += 1;
        }
        if(n2.equals("") && a2.equals("")){}
        else if(n2.equals("") && a1 != null){
            errors.append("Please Fill Second Passanger Name.\n");
        }
        else if(a2.equals("") && n1 != null){
            errors.append("Please Fill Second Passanger Age.\n");
        }
        else{
            pass_num += 1;
        }
        if(n3.equals("") && a3.equals("")){}
        else if(n3.equals("") && a1 != null){
            errors.append("Please Fill Third Passanger Name.\n");
        }
        else if(a3.equals("") && n1 != null){
            errors.append("Please Fill Third Passanger Age.\n");
        }
        else{
            pass_num += 1;
        }
        if(n4.equals("") && a4.equals("")){}
        else if(n4.equals("") && a1 != null){
            errors.append("Please Fill Fourth Passanger Name.\n");
        }
        else if(a4.equals("") && n1 != null){
            errors.append("Please Fill Fourth Passanger Age.\n");
        }
        else{
            pass_num += 1;
        }
        
        payable_amt_pp = 0;
        if(fca.isSelected()){
            payable_amt_pp = Double.parseDouble(a_rb.getText());
        }
        else if(ac2.isSelected()){
            payable_amt_pp = Double.parseDouble(b_rb.getText());
        }
        else if(ac3.isSelected()){
            payable_amt_pp = Double.parseDouble(c_rb.getText());
        }
        else if(sc.isSelected()){
            payable_amt_pp = Double.parseDouble(d_rb.getText());
        }
        else{
            errors.append("Please Select Ticket Per Person Fare");
        }
        
        String t_name = (String) tn_tf.getText();
        if( t_name.equals("") ){
            errors.append("Please Select the Train");
        }
        
        if(pass_num > 0 && errors.length() == 0){
           double amount = 0;
            try {
               amount = load_amt();
               avail_amt_label.setText(amount+"");
           } catch (ClassNotFoundException | SQLException ex) {
               Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
           }
            ticket_amt_label.setText("Payable Amount :- "+pass_num * payable_amt_pp);
            if(amount >= pass_num * payable_amt_pp){
                am_btn.setEnabled(false);
            }
            else{
                pm_amt.setEnabled(false);
            }
            this.setVisible(false);
            ticket_payment_gateway.setVisible(true);
        }
        else{
            c.message(""+errors);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void am_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am_btnActionPerformed
        this.setVisible(false);
        try {
            new Add_Money(user).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_am_btnActionPerformed

    private void avail_amt_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avail_amt_labelMouseClicked
        try {
            double new_amt = load_amt();
            avail_amt_label.setText(""+new_amt);
            if(new_amt >= payable_amt_pp * pass_num){
                am_btn.setEnabled(false);
                pm_amt.setEnabled(true);
            }
            else{
                am_btn.setEnabled(false);
                pm_amt.setEnabled(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_avail_amt_labelMouseClicked

    private void pm_amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pm_amtActionPerformed
        String jrny_date = cb_d.getSelectedItem().toString();
        String jrny_month = cb_m.getSelectedItem().toString();
        String jrny_year = cb_y.getSelectedItem().toString();
        String jrny_main = jrny_year+"-"+jrny_month+"-"+jrny_date;
        int t_code = Integer.parseInt(tc_tf.getText());
        String t_name = tn_tf.getText();
        String t_source = s_tf.getText();
        String t_dest = d_tf.getText();
        String t_dept = dt_tf.getText();
        String t_arrival = ar_tf.getText();
        String name1 = n1_f.getText();
        String age1 = a1_f.getText();
        if(age1.length() == 0){
            age1 = "null";
        }
        String name2 = n2_f.getText();
        String age2 = a2_f.getText();
        if(age2.length() == 0){
            age2 = "null";
        }
        String name3 = n3_f.getText();
        String age3 = a3_f.getText();
        if(age3.length() == 0){
            age3 = "null";
        }
        String name4 = n4_f.getText();
        String age4 = a4_f.getText();
        if(age4.length() == 0){
            age4 = "null";
        }
        String ticket_class = "";
        double ticket_fare = 0;
        if(fca.isSelected()){
            ticket_class = "First Class AC";
            ticket_fare = Double.parseDouble(a_rb.getText());
        }
        else if(ac2.isSelected()){
            ticket_class = "AC 2 Tier";
            ticket_fare = Double.parseDouble(b_rb.getText());
        }
        else if(ac3.isSelected()){
            ticket_class = "AC 3 Tier";
            ticket_fare = Double.parseDouble(c_rb.getText());
        }
        else if(sc.isSelected()){
            ticket_class = "Sleeper Class";
            ticket_fare = Double.parseDouble(d_rb.getText());
        }
        double ticket_total_amt = ticket_fare * pass_num;
        
        System.out.print("INSERT INTO tickets (User_Name,B_Date,T_DATE,Train_Code,Train_Name,Source,Destination,Departure,Arrival,ticket_Class,T_Fare,Name1,Age1,Name2,Age2,Name3,Age3,Name4,Age4,Tickets_Total_Amount) VALUES ('"+user+"',now(),'"+jrny_main+"',"+t_code+",'"+t_name+"','"+t_source+"','"+t_dest+"','"+t_dept+"','"+t_arrival+"','"+ticket_class+"',"+ticket_fare+",'"+name1+"',"+age1+",'"+name2+"',"+age2+",'"+name3+"',"+age3+",'"+name4+"',"+age4+","+ticket_total_amt+")");
        String upd_qry = "UPDATE users SET Money = Money - "+ ticket_total_amt +" WHERE User_Name = '"+user+"'";
        String ins_qry = "INSERT INTO tickets (User_Name,B_Date,T_DATE,Train_Code,Train_Name,Source,Destination,Departure,Arrival,ticket_Class,T_Fare,Name1,Age1,Name2,Age2,Name3,Age3,Name4,Age4,Tickets_Total_Amount) VALUES ('"+user+"',now(),'"+jrny_main+"',"+t_code+",'"+t_name+"','"+t_source+"','"+t_dest+"','"+t_dept+"','"+t_arrival+"','"+ticket_class+"',"+ticket_fare+",'"+name1+"',"+age1+",'"+name2+"',"+age2+",'"+name3+"',"+age3+",'"+name4+"',"+age4+","+ticket_total_amt+");";                    
        
        try {
            int ins_res = c.update(ins_qry);
            if(ins_res == 0){
                c.message("Unable to Book Ticket");
            }
            else{
                int upd_res = c.update(upd_qry);
                if(upd_res == 0){
                    c.message("Unable To Deduct Money from Wallet");
                }
                else{
                    c.message("Ticket Booked Successfully");
                    String qry_2 = "INSERT INTO transactions(User_Name,Amount,Info,Date_Time) VALUES ('"+user+"',"+ticket_total_amt+",'Money Deducted to Book Ticket',now())";
                    int res_2 = c.update(qry_2);
                    if(res_2 == 1){
                        c.message("Transaction Saved Successfully.");
                    }
                    else{
                        c.message("Unable to Save Transaction.");
                    }
                    double new_amt = load_amt();
                    avail_amt_label.setText(""+new_amt);
                    ticket_payment_gateway.setVisible(false);
                    new Home(user).setVisible(true);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pm_amtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ticket_payment_gateway.setVisible(false);
        try {
            new Home(user).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Book_Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Book_Ticket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1_f;
    private javax.swing.JTextField a2_f;
    private javax.swing.JTextField a3_f;
    private javax.swing.JTextField a4_f;
    private javax.swing.JLabel a_rb;
    private javax.swing.JPanel a_tf;
    private javax.swing.JRadioButton ac2;
    private javax.swing.JRadioButton ac3;
    private javax.swing.JButton am_btn;
    private javax.swing.JTextField ar_tf;
    private javax.swing.JLabel avail_amt_label;
    private javax.swing.JLabel b_rb;
    private javax.swing.JLabel c_rb;
    private javax.swing.JComboBox cb_d;
    private javax.swing.JComboBox cb_m;
    private javax.swing.JComboBox cb_y;
    private javax.swing.JComboBox city_1;
    private javax.swing.JComboBox city_2;
    private javax.swing.JLabel d_rb;
    private javax.swing.JTextField d_tf;
    private javax.swing.JPanel date_panel;
    private javax.swing.JTextField dt_tf;
    private javax.swing.JRadioButton fca;
    private javax.swing.JPanel from_to_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField n1_f;
    private javax.swing.JTextField n2_f;
    private javax.swing.JTextField n3_f;
    private javax.swing.JTextField n4_f;
    private javax.swing.JPanel payment_gateway_panel;
    private javax.swing.JPanel payment_gateway_sub_panel;
    private javax.swing.JButton pm_amt;
    private javax.swing.ButtonGroup rates;
    private javax.swing.JTextField s_tf;
    private javax.swing.JRadioButton sc;
    private javax.swing.JTextField tc_tf;
    private javax.swing.JTextArea td_ta;
    private javax.swing.JLabel ticket_amt_label;
    private javax.swing.JFrame ticket_payment_gateway;
    private javax.swing.JLabel title;
    private javax.swing.JTextField tn_tf;
    private javax.swing.JComboBox train_box;
    private javax.swing.JPanel train_details_panel_1;
    private javax.swing.JPanel train_panel;
    private javax.swing.JButton train_search;
    private javax.swing.JButton train_select_btn;
    // End of variables declaration//GEN-END:variables
}
