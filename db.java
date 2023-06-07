package Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Data base connection 


public class db {
    
    public static Connection mycon() throws SQLException{
    
    Connection con = null ;
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empprofile", "root" ,"jamesJhon2806");
        
    } catch (ClassNotFoundException | SQLException e) {
        
        System.out.println(e);
        
    }
    
       return con; 
    }
    
}
