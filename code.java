=> Add_Money Frame Code :--

Imported Libraries :-
import java.sql.*;
import java.util.logging.*;

Global Variables :-
String user;
double account_no;
int cv,m,y;
Mysql_Con c = new Mysql_Con();

On Load Code :-
user = uname;
load_data();

Self Defined Methods :-
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

Controls Codes :-

1) Back Button Code (back_btn) :-
[ Events -> Action -> actionPerformed ]

this.setVisible(false);
try {
    new Home(user).setVisible(true);
} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
}

2) Reload Button Code (reload_btn) :-
[ Events -> Action -> actionPerformed ]

try {
    load_data();
} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(Add_Money.class.getName()).log(Level.SEVERE, null, ex);
}

3) Save Card Details Button Code (btn_save) :-
[ Events -> Action -> actionPerformed ]

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

4) Exit Button Code (exit_btn) :-
[ Events -> Action -> actionPerformed ]

this.setVisible(false);

5) Clear Button Code (clr_btn) :-
[ Events -> Action -> actionPerformed ]

clear_fields();

6) Add Amount Button Code (btn_add):-
[ Events -> Action -> actionPerformed ]

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

=> Admin_Panel Frame Code :--

Imported Libraries :-
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

Global Variables :-
Mysql_Con c = new Mysql_Con();

On Load Code :-
load_quote();

Self Defined Methods :-
void load_quote(){
    try {
        String qry = "SELECT * FROM quote ORDER BY RAND() LIMIT 1;", q = "";
        ResultSet sent = c.get_data(qry);
        if(sent.next()){
            q = sent.getString(1);
            quote.setText(q);
        }
        else{
            c.message("Unable to Load Quote.");
        }
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Admin_Panel.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Controls Codes :-

1) Logo Button Code (head_img_label) :-
[ Events -> Mouse -> mouseClicked ]

this.setVisible(false);
new Sign_Up().setVisible(true);

2) Transactions Button Code (Transactions_btn) :-
[ Events -> Action -> actionPerformed ]

this.setVisible(false);
new User_Transactions("admin").setVisible(true);

3) Train Panel Button Code (Add_Train_Panel_btn) :-
[ Events -> Action -> actionPerformed ]

new Train_Panel().setVisible(true);
this.setVisible(false);

4) Trains_Available Button Code (Show_Train_Panel_btn) :-
[ Events -> Action -> actionPerformed ]

this.setVisible(false);
new Show_Train().setVisible(true);

=> Admin_Panel Frame Code :--

Imported Libraries :-
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

Global Variables :-
Mysql_Con c = new Mysql_Con();
String n1 = "",n2 = "",n3 = "",n4 = "";
String a1,a2,a3,a4;
int pass_num;
double payable_amt_pp;
double ticket_price;
String user,today_day,today_month,today_year;

On Load Code :-
load_cities();
load_dates();
user = uname;

Self Defined Methods :-
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

Controls Codes :-

1) Upper Image Label Code (head_img_label):
[ Events -> Mouse -> mouseClicked ]

this.setVisible(false);
new Sign_Up().setVisible(true);

