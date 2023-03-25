package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class databaseConnection {
    public static Connection db_connection(){
    Connection con=null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/PharmacyDb?allowPublicKeyRetrieval useSSL=FALSE;","root","root");
        System.out.println("Connected successfully to the database");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "not connnected with database");
        System.out.println(e);
    }
    return con;
}  //end of function
} // end of method
