package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ruang extends Gedung{
    public String kd_ruang;
    public Jurusan jurusan;
    public String nama_ruang;
    public String warna_ruang;
    public DefaultTableModel tblruang = new DefaultTableModel();
    
    @Override
    public void select(){
        try{
            conn = getConnection();
            query = "select * from akn_ruang a, akn_gedung b, akn_jurusan c "
                    + " where a.kd_gedung=b.kd_gedung and a.kd_jur=c.kd_jur order by a.kd_gedung";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                kd_gedung = res.getString("kd_gedung");
                jurusan.kd_jur = res.getString("kd_jur");
                kd_ruang = res.getString("kd_ruang");
                nama_ruang = res.getString("nama_ruang");
                warna_ruang = res.getString("warna_ruang");
                
                list.add(new Object[]{kd_gedung, jurusan.kd_jur, kd_ruang, nama_ruang, warna_ruang});
            }
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method select() : " + ex);
        }
    }
    
    public void insert_update(){
        
    }
    
    public void delete(String kd_ruang){
        
    }
    
    public String[] keyruang;
    public void listruang(){
        
    }
}


