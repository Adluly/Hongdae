/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KONEKSI;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class koneksi {
    Connection connect;
    Statement sttmnt;
    ResultSet rslt;
    public String sql;
    private static Connection koneksi;  
    public static Connection getKoneksi(){
        try{
            String url = "jdbc:mysql://localhost:3306/pbo_akhir";
            String user = "root";
            String password = "";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("Koneksi berhasil");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Koneksi Gagal");
        }return koneksi;
    
    }
}
