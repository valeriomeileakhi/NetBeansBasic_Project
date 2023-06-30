/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testkasir3;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @Author = Valerio Meileakhi
 * @NIM    = 2007411012
 * @Kelas  = TI-4A
 */
public class Connector_db {
    private static java.sql.Connection connector;
    
    public static java.sql.Connection getKoneksi(){
        if (connector == null){
            try {
                String url;
                url = "jdbc:mysql://localhost:3306/db_kasir";
                String user = "root";
                String password = "";
                connector = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Menghubungkan Ke Database Local");
            } catch (SQLException e) {
                System.out.println("Error : Gagal Menghubungkan Koneksi ke Database");
                System.exit(1);
            }
        }
        return connector;
    }
    public static void main(String args[]){
        getKoneksi();
}
}

