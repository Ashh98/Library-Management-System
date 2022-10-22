/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author DOTT
 */
public class connector {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7340139","sql7340139","35un46fkdz");
            return con;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
}
