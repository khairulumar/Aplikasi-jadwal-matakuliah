package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Gedung extends KoneksiDB {
    public String kd_gedung;
    public String nama_gedung;
    public DefaultTableModel tblgedung = new DefaultTableModel();
    
    public void select(){
    tblgedung.setColumnIdentifiers(new Object[]{"Kode Gedung", "Nama Gedung"});
    
    try{
        conn = getConnection();
            query = "select * from akn_gedung";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                kd_gedung = res.getString("kd_gedung");
                nama_gedung = res.getString("nama_gedung");
                
                list.add(new Object[]{kd_gedung, nama_gedung});
            }
            stat.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error method select : " + ex);
        }
    }
    
    public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into akn_gedung values(?,?) ";
            }else{
                query = " update akn_gedung set kd_gedung=?, nama_gedung=? "
                        + " where kd_gedung='"+kd_gedung+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, kd_gedung);
            stat.setString(2, nama_gedung);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(String kd_gedung){
        try{
            conn = getConnection();
            query = "delete from akn_gedung where kd_gedung='"+kd_gedung+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
    }
    
    public String[] keygedung;
    public void listgedung(){
    
    }
    
}
