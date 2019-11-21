/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Student
 */
public class DB {
    
    
    public static Connection getConnection() throws Exception{
        
        //static danne eka object ekk witharak tiyaganna
        Class.forName("com.mysql.jdbc.Driver"); //loading without calling driver class
        Connection c;
 
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","");
        return c;
    }
    
   
}
