/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

/**
 *
 * @author yangshuya
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
     public static Connection getConnection () throws Exception
    {
       // try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/INFO5100?enabledTLSProtocols=TLSv1.2&useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","1234");
            return con;
        
        
    }
    
}
