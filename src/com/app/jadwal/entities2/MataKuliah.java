
package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MataKuliah extends KelompokMK{
    public String kd_mk;
    public int tahun_kur;
    public Prodi prodi = new Prodi();
    public String nama_mk;
    public int semester;
    public int sks_t;
    public int sks_p;
    public int jam_t;
    public int jam_p;
    public DefaultTableModel tblmatakuliah = new DefaultTableModel();
            
    @Override
    public void select(){
        tblmatakuliah.setColumnIdentifiers(new Object[]{"Kode Mata Kuliah", "Kelompok Mata Kuliah","Tahun Kurikulum", 
           "Prodi", "Nama Mata Kuliah", "Semester", "SKS Teori","SKS Praktek", 
           "Jam Teori", "Jam Praktek"});
    
    try{
        conn = getConnection();
        query = "select * from mk_matakuliah a, mk_kelompokmk b, akn_prodi c "
                    + " where a.kd_kmk=b.kd_kmk and a.kd_prodi=c.kd_prodi order by a.kd_kmk";
        stat = conn.prepareStatement(query);
        res = stat.executeQuery(query);
        list = new ArrayList<>();
        while(res.next()){
            kd_mk = res.getString("kd_mk");
            kd_kmk = res.getString("kd_kmk");
            tahun_kur = res.getInt("tahun_kur");
            prodi.prodi = res.getString("prodi");
            nama_mk = res.getString("nama_mk");
            semester = res.getInt("semester");
            sks_t = res.getInt("sks_t");
            sks_p = res.getInt("sks_p");
            jam_t = res.getInt("jam_t");
            jam_p = res.getInt("jam_p");
            
            list.add(new Object[]{kd_mk, kd_kmk, tahun_kur, prodi.prodi, nama_mk, semester, sks_t, sks_p, jam_t, jam_p});
            
        }
        stat.close();
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error method select : " + ex);
        }
    }
    
    @Override
    public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into mk_matakuliah values(?,?,?,?,?,?,?,?,?,?) ";
            }else{
                query = " update akn_matakuliah set kd_mk=?, kd_kmk=?, "
                        + " tahun_kur=?, kd_prodi=?, nama_mk=?, "
                        + " smt=?, sks_t=?, sks_p=?, "
                        + " jam_t=?, jam_p=? "
                        + " where kd_mk='"+kd_mk+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, kd_mk);
            stat.setString(2, kd_kmk);
            stat.setInt(3, tahun_kur);
            stat.setString(4, prodi.kd_prodi);
            stat.setString(5, nama_mk);
            stat.setInt(6, semester);
            stat.setInt(7, sks_t);
            stat.setInt(8, sks_p);
            stat.setInt(11, jam_t);
            stat.setInt(12, jam_p);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(int kd_mk){
        try{
            conn = getConnection();
            query = "delete from mk_matakuliah where kd_mk='"+kd_mk+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void cetak_per_kurikulum(int tahun_kur, String kd_prodi){
        
    }
    
    public String[] keymatakuliah, matakuliah;
    public void listmatakuliah(){
        try{
            conn = getConnection();
            query = "select * from tbMatakuliah";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            int i = 1;
            while(res.next()){
                matakuliah[i] = res.getString(2);
                i++;
            }
            res.first();
            keymatakuliah = new String[i+1];
            for(int x=1 ; x<i ; x++){
                keymatakuliah[x] = res.getString(1);
                res.next();
            }
            stat.close();
        } catch (SQLException ex) {
            System.out.println("Error Method listMatakuliah : "+ex);
        }
    }
    
}
