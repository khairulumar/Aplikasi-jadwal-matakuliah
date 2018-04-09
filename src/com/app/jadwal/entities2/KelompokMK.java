package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KelompokMK extends KoneksiDB{
    public String kd_kmk;
    public String kelompok_mk;
    public DefaultTableModel tblkmk = new DefaultTableModel();
    
    public void select(){
        tblkmk.setColumnIdentifiers(new Object[]{"Kode Kelompok Mata Kuliah", "Kelompok Mata Kuliah"});
    
    try{
        conn = getConnection();
            query = "select * from mk_kelompokmk";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                kd_kmk = res.getString("kd_kmk");
                kelompok_mk = res.getString("kelompok_mk");
                
                list.add(new Object[]{kd_kmk, kelompok_mk});
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
                query = " insert into mk_kelompokmk values(?,?) ";
            }else{
                query = " update mk_kelompokmk set kd_kmk=?, kelompok_mk=? "
                        + " where kd_kmk='"+kd_kmk+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, kd_kmk);
            stat.setString(2, kelompok_mk);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(String kd_kmk){
        try{
            conn = getConnection();
            query = "delete from mk_kelompokmk where kd_kmk='"+kd_kmk+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
    }
    
    public String[] keykmk;
    public void listkmk(){
        
    }
}
