/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuota.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author warna computer
 */
public class Lconnection {

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String User1 ="root";
    String Password1 ="";
    String Host1 ="localhost";
    String Databases1 ="kuota";
    String Url1 ="";
    
    private Connection Lconnection=null;
    
    public Lconnection() {
        initComponents();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Url1="jdbc:mysql://"+ Host1 +"/"+ Databases1 + "?user=" + User1 + "&password="+ Password1;
            Lconnection=DriverManager.getConnection(Url1);
        }
        catch(ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan");
        }
        catch (SQLException e){
               System.out.println("koneksi gagal:" +
                e.toString());
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
