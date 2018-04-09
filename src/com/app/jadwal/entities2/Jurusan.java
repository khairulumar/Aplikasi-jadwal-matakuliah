package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.app.jadwal.database.KoneksiDB;
import javax.swing.table.DefaultTableModel;

public class Jurusan extends KoneksiDB{
    
    public String kd_jur;
    public String jurusan;
    public DefaultTableModel tbljurusan = new DefaultTableModel();
    
    public void select(){
        tbljurusan.setColumnIdentifiers(new Object[]{"Kode Jurusan", "Nama Jurusan"});
        try{
            conn = getConnection();
            query = "select * from akn_jurusan";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                kd_jur = res.getString("kd_jur");
                jurusan = res.getString("jurusan");
                
                list.add(new Object[]{kd_jur, jurusan});
            }
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method select() : " + ex);
        }
    }
    
    public void insert_update(){
        try{
            conn = getConnection();
            if(isUpdate == false){
                query = " insert into akn_jurusan values(?,?) ";
            }else{
                query = " update akn_jurusan set kd_jur=?, jurusan=? "
                        + " where kd_jur='"+kd_jur+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, kd_jur);
            stat.setString(2, jurusan);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(String kd_jur){
        try{
            conn = getConnection();
            query = "delete from akn_jurusan where kd_jur='"+kd_jur+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
    }
    
    public String[] keyjur, Jurusan;
    public void listjurusan(){
        try{
            conn = getConnection();
            query = "select * from akn_jurusan";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            int i = 1;
            while(res.next()){
                Jurusan[i] = res.getString(2);
                i++;
            }
            res.first();
            keyjur = new String[i+1];
            for(int x=1 ; x<i ; x++){
                keyjur[x] = res.getString(1);
                res.next();
            }
            stat.close();
        } catch (SQLException ex) {
            System.out.println("Error Method listjurusan : "+ex);
        }
    }
    
}
