/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jackson
 */
public class Conexion{
    public Connection connection;

    public Conexion() {
            
    }
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_contactos", "root", "passwd here");
            System.out.println("Conexion exitosa");
            return connection;
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error: " + e.getMessage());
            return connection;
        }   
    }
}
