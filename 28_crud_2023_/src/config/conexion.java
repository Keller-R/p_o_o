/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class conexion {

    Connection con;

    public conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/S17?characterEncoding=UTF-8", "root", "admin");
            System.out.println("ya esta conectado");
        } catch (Exception e) {
            System.out.println("Error conexion " + e.toString());
        }
    }

    public Connection getConnection() {
        return con;
    }

}
