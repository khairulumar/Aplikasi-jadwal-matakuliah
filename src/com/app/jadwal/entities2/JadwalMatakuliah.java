package com.app.jadwal.entities2;

import javax.swing.table.DefaultTableModel;


public class JadwalMatakuliah extends KoneksiDB{
    public int id_th;
    public int semester;
    public Prodi prodi;
    public Kelas kls;
    public User user;
    public String hari;
    public SettingJam sj;
    public MataKuliah mk;
    public Dosen dosen;
    public Ruang ruang;
    public String walikelas;
    public DefaultTableModel tbljadwalmatakuliah = new DefaultTableModel();
    
    
   public void select_by_thajaran(int id_th){
      
    }
   
   public void select_by_prodi(String kd_prodi, String kelas){
       
   }
   
   public void select_by_dosen(String kd_dosen){
       
   }
   
   public void insert_update(){
       
    }
   
   public void delete(int id_th){
        
    }
   
   public void cetak_per_thajaran(){
       
   }
   
   public void cetak_per_prodi(){
       
   }
   
   public void cetak_per_dosen(){
       
   }
   
   
   
   public String[] keyjadwalmatkul, jadwalmk;
    public void listjadwalmk(){
        
    }
   
}

