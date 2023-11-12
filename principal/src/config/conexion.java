/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class conexion {
    Connection con;
    
    public conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/general","root","admin");
            JOptionPane.showMessageDialog(null, "se conecto a la bd");
        } catch (Exception e) {
            System.out.println("error de conexion " + e.toString() );
        }
    }
    public Connection getConnection(){
        return con;
    }
}
