import java.sql.*;
import javax.swing.JOptionPane;

public class Mysql_Con{
    
    ResultSet get_data(String qry) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/auros","root","manish");  
        Statement stmt = con.createStatement();  
        ResultSet rs = stmt.executeQuery(qry);
        return rs;
    
    }
    
    int update(String qry) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/auros","root","manish");  
        Statement stmt = con.createStatement();  
        int rs = stmt.executeUpdate(qry);
        return rs;
        
    }
    
    int row_count(String qry) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/auros","root","manish");  
        Statement stmt = con.createStatement();  
        ResultSet rs = stmt.executeQuery(qry);
        int row = 0;
        while(rs.next()){
            row = row + 1;
        }
        return row;
    }
    
    void message(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
