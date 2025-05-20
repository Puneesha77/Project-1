/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cw_system;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class CW_SYSTEM {
    
    public static Connection conn(){
        try{
            String url ="jdbc:mysql://localhost:3306/bookshop";
            String user="Admin";
            String password="12345";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        
        }catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
    return null;
    }

    public static void main(String[] args) {
        
    }
}
