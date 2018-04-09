package com.app.jadwal.entities2;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class KoneksiDB {
    
    public Connection conndb, conn;
    public PreparedStatement stat;
    public ResultSet res;
    public String query;
    public boolean isUpdate;
    public List<Object> list = new ArrayList<>();
    public SimpleDateFormat tglview = new SimpleDateFormat("dd-MM-yyyy");
    public SimpleDateFormat tglinput = new SimpleDateFormat("yyyy-MM-dd");
    
    public Connection getConnection() throws SQLException{
        try{
            String server = "jdbc:mysql://localhost/dv_aknkajen_jadwalmatkul";
            String drever = "com.mysql.jdbc.Driver";
            Class.forName(drever);
            conndb = DriverManager.getConnection(server, "root", "");
            return conndb;
        }catch(SQLException | ClassNotFoundException se ){
            System.out.println(se);
            JOptionPane.showMessageDialog(null, "Error koneksi database : "+se);
            return null;
        }
    }
    
}


