package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SettingJam extends KoneksiDB{
    public int id_sj;
    public Prodi prodi;
    public TahunAjaran tahun_ajaran;
    public int jam_ke;
    public String jam_mulai;
    public String jam_selesai;
    public DefaultTableModel tblsetjam = new DefaultTableModel();
    
    public void select(){
        
    }
    
    public void insert_update(){
        
    }
    
    public void delete(int id_sj){
        
    }
}
