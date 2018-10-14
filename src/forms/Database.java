package forms;
import java.sql.*;

public class Database {
    // Oracle DataBase
    public static String urld = "jdbc:oracle:thin:@localhost:1521:admin"; 
    public static String user = "sys as sysdba";
    public static String pass = "root";
    public static Connection con = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    public Connection connect(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            con = DriverManager.getConnection(urld,user,pass);
            System.out.println("Connection Successful");
	}catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
	}
        return con;
    }
    
    public static void main(String [] args){
        Database db = new Database();
        Connection con = db.connect();
    }
/*  Mysql DataBase
    public static String urld = "jdbc:mysql://localhost:3306/mjadmin"; 
    public static String user = "root";
    public static String pass = "root";
    public static Connection con = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    public Connection connect(){
	try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(urld,user,pass);
            System.out.println("Connection Successful");
            
	}catch(Exception e) {
            e.printStackTrace();
	}
        return con;
    }*/
}