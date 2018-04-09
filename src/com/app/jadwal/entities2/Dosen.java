package com.app.jadwal.entities2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Dosen extends KoneksiDB{
    public String nip;
    public String kd_dosen;
    public String nama_dosen;
    public String jk;
    public String tmp_lahir;
    public String tgl_lahir;
    public String agama;
    public String alamat;
    public String no_telepon;
    public String email;
    public String foto;
    public DefaultTableModel tbldosen = new DefaultTableModel();
  
   
    
   public void select(){
       tbldosen.setColumnIdentifiers(new Object[]{"NIP", "KD. Dosen", "Nama Dosen", "Jenis Kelamin", "Tempat Lahir",
            "Tanggal Lahir", "Agama", "Alamat", "No. Telepon", "Email", "Foto"});
    try {
        conn = getConnection();
        query = "select * from pg_dosen";
        stat = conn.prepareStatement(query);
        res = stat.executeQuery(query);
        list = new ArrayList<>();
        while (res.next()) {
            nip = res.getString("nip");
            kd_dosen = res.getString("kd_dosen");
            nama_dosen = res.getString("nama_dosen");
            jk = res.getString("jk");
            tmp_lahir =res.getString("tmp_lahir");
            tgl_lahir=tglview.format(res.getDate("tgl_lahir"));
            agama=res.getString("agama");
            alamat=res.getString("alamat");
            no_telepon=res.getString("no_telepon");
            email=res.getString("email");
            foto=res.getString("foto");
            
            list.add(new Object[]{nip, kd_dosen , nama_dosen, jk, tmp_lahir,
            tgl_lahir, agama, alamat, no_telepon, email, foto});
        }
        stat.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error Method Select() :"+ex);
    }
   }
   
   public void insert_update(){
        try {
        conn = getConnection();
        if(isUpdate==false){
            query ="insert into pg_dosen values(?,?,?,?,?,?,?,?,?,?,?) ";
        }else{
            query = "update pg_dosen set nip=?, kd_dosen=?, nama_dosen=?, jk=?, "
                    + " tmp_lahir=?, tgl_lahir=?, agama=?, alamat=?, no_telepon=?, email=?, foto=? "
                    + " where nip='"+nip+"' ";
            }
        stat = conn.prepareStatement(query);
            stat.setString(1, nip);
            stat.setString(2, kd_dosen);
            stat.setString(3, nama_dosen);
            stat.setString(4, jk);
            stat.setString(5, tmp_lahir);
            stat.setString(6, tgl_lahir);
            stat.setString(7, agama);
            stat.setString(8, alamat);
            stat.setString(9, no_telepon);
            stat.setString(10, email);
            stat.setString(11, foto);
            stat.executeUpdate();
            stat.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
    }
}
public void delete(String nik){
        try{
            conn = getConnection();
            query = "delete from pg_dosen where nip='"+nip+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
   }
  
   public String[] keydosen, dosen;
    public void listdosen(){
        
    }
    
}
