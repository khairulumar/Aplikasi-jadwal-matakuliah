package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Kelas extends Prodi{
    public String kelas;
    public DefaultTableModel tblkelas = new DefaultTableModel();
    
    
    public void select(){
        tblkelas.setColumnIdentifiers(new Object[]{"No","Kode Prodi","Prodi", "Kelas"});
    try {
        conn = getConnection();
        query = "select * from akn_kelas a, akn_prodi b "
                + " where a.kd_prodi=b.kd_prodi order by a.kd_prodi";
        stat = conn.prepareStatement(query);
        res = stat.executeQuery(query);
        list = new ArrayList<>();
        int i=1;
        while (res.next()) {
            kd_prodi = res.getString("kd_prodi");
            prodi = res.getString("prodi");
            kelas = res.getString("kelas");
            
            list.add(new Object[]{i++,kd_prodi,prodi,kelas});
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
            query ="insert into akn_kelas values(?,?) ";
            konf = "Data berhasil disimpan";
        }else{
            query = "update akn_kelas set kd_prodi=?, kelas=? where kelas='"+kelas+"' ";
            konf = "Data berhasil diubah";
            }
        stat = conn.prepareStatement(query);
            stat.setString(1, kd_prodi);
            stat.setString(2, kelas);
            stat.executeUpdate();
            stat.close();
            JOptionPane.showMessageDialog(null, konf,
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Data tersebut sudah ada ! ");
        System.out.println("Error method insert_update() : " +ex);
    }
    }
    
}
