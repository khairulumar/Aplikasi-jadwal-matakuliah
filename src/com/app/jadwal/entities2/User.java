package com.app.jadwal.entities2;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.app.jadwal.database.KoneksiDB;



public class User extends KoneksiDB{
    
    public static String id_user;
    public static String nama_user;
    public String pass;
    public String lev_user;
    public String foto;
    public DefaultTableModel tbluser = new DefaultTableModel();
    
    public void select(){
        //tbluser.setColumnIdentifiers(new Object[]{"ID. User", "Nama User", "Lev. User"});
        try{
            conn = getConnection();
            query = "select * from akn_user";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            list = new ArrayList<>();
            while(res.next()){
                id_user = res.getString("id_user");
                nama_user = res.getString("nama_user");
                pass = res.getString("pass");
                lev_user = res.getString("lev_user");
                foto = res.getString("foto");
                
                list.add(new Object[]{id_user, nama_user,pass, lev_user, foto});
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
                query = " insert into akn_user values(?,?,md5(?),?,?) ";
            }else{
                query = " update akn_user set id_user=?, nama_user=?, pass=md5(?), lev_user=?, foto=? "
                        + " where id_user='"+id_user+"' ";
            }
            stat = conn.prepareStatement(query);
            stat.setString(1, id_user);
            stat.setString(2, nama_user);
            stat.setString(3, pass);
            stat.setString(4, lev_user);
            stat.setString(5, foto);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method insert_update() : " + ex);
        }
    }
    
    public void delete(String id_user){
        try{
            conn = getConnection();
            query = "delete from akn_user where id_user='"+id_user+"' ";
            stat = conn.prepareStatement(query);
            stat.executeUpdate();
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method delete() : " + ex);
        }
    }
    
    public void login(String id_user, String pass, String lev_user){
        try{
            conn = getConnection();
            query = " select * from akn_user where id_user='"+id_user+"' and pass=md5('"+pass+"') "
                     + " and lev_user='"+lev_user+"' ";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            if(res.first()){
                User.id_user = res.getString("id_user");
                nama_user = res.getString("nama_user");
                this.pass = res.getString("pass");
                this.lev_user = res.getString("lev_user");
                foto = res.getString("foto");
                isLogin = true;
            }
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method login() : " + ex);
        }
    }
    
     public void ubah_password(String id_user, String passlama, String passbaru){
        try{
            conn = getConnection();
            query = " select * from akn_user where id_user='"+id_user+"' and pass=md5('"+passlama+"') ";
            stat = conn.prepareStatement(query);
            res = stat.executeQuery(query);
            if(res.first()){
                query = " update akn_user set pass = md5('"+passbaru+"') "
                        + " where id_user='"+id_user+"' ";
                stat = conn.prepareStatement(query);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Password telah berhasil diubah !", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Password lama salah !", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
            stat.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error method ubah_password() : " + ex);
        }
    }
    
    public void logout(String id_user, String pass, String lev_user){
        
    }
    
    
}
