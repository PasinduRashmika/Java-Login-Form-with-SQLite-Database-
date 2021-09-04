
package loginregisterp;

import java.sql.*;

public class dbConnection {
    Connection con =null;
    
    public static Connection ConnectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LoginAccountsDb.db");
            System.out.println("Connection Succeeded");
            return con;
        }
        catch(Exception e){
            System.out.println("Connection Failed" + e);
            return null;
        }
    }
}
