/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.jadwal.views;

import com.app.jadwal.entities2.User;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class FrMenu extends javax.swing.JFrame {

    public boolean gedung, ruangan, kelas, dosen, kmk, matakuliah, setjam, jadwal, user, pass, cetak;
    public boolean pMenu, modultu, moduldosen;
    User us = new User();
    
    public FrMenu() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | FrMenu.MAXIMIZED_BOTH);
        view_awal();
        
    }

    private void login(){
        if(txtIDUser.getText().equals("")){
            lblKeterangan.setText("Keterangan : ID. User belum diisi...");
            txtIDUser.requestFocus(true);
        }else if(txtPassword.getText().equals("") || txtPassword.getText().equals("")){
            lblKeterangan.setText("Keterangan : Password belum diisi...");
            txtPassword.requestFocus(true);
        }else{
            User.id_user = txtIDUser.getText().replaceAll("'", "");
            us.pass = txtPassword.getText().replaceAll("'", "");
            us.login(User.id_user, us.pass, us.lev_user);
            if(us.isLogin==true){
                
                switch (us.lev_user) {
                    case "Tata Usaha":
                        user_tu();
                        panelConfig.setVisible(true);
                        panelAlpha21.setVisible(true);
                        break;
                        
                    default:
                        user_dosen();
                        panelKonten.setVisible(false);
                        panelAlpha21.setVisible(true);
                        break;
                }
                lblStatus.setText("ID. User : " + User.id_user + " - " + us.nama_user + 
                        "  | Status : " + us.lev_user );
                lblNamaUser.setText("( " + us.nama_user + " )");
                lblLevUser.setText("( " + us.lev_user + " )");
            }else{
                lblKeterangan.setText("Keterangan : ID. User dan Password salah...");
                txtIDUser.requestFocus(true);
            }
        }
    }
    
     
    private void view_awal(){
        panelSlide.setVisible(false);
        panelLeft.setVisible(false);
        panelLogin.setVisible(false);
        panelConfig.setVisible(false);  
    }
    
    private void user_dosen(){
        panelKonten.setVisible(false);
        panelSlide.setVisible(true);
        panelLogin.setVisible(false);
        btnCetaklap.setVisible(true);
        btnUbahpass.setVisible(true);
        btnGedung.setVisible(false);
        btnRuangan.setVisible(false);
        btnKelas.setVisible(false);
        btnKmk.setVisible(false);
        btnMatakuliah.setVisible(false);
        btnSetjam.setVisible(false);
        btnJadwal.setVisible(false);
        btnUser.setVisible(false);
        panelAlpha21.setVisible(false);
        jSeparator2.setVisible(false);
    }
    
    private void user_tu(){
        panelSlide.setVisible(true);
        panelKonten.setVisible(false);
        panelLogin.setVisible(false);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        jSeparator2.setVisible(false);
        btnGedung.setVisible(true);
        btnRuangan.setVisible(true);
        btnKelas.setVisible(true);
        btnKmk.setVisible(true);
        btnMatakuliah.setVisible(true);
        btnSetjam.setVisible(true);
        btnJadwal.setVisible(true);
        btnUser.setVisible(true);
        btnCetaklap.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelBulat1 = new com.inpos.tools.PanelBulat();
        panelHeader = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbClose = new javax.swing.JLabel();
        panelFooter = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelLeft = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        lblLevUser = new javax.swing.JLabel();
        btnUbahpass = new javax.swing.JPanel();
        lblUbahpass = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btnGedung = new javax.swing.JPanel();
        lblGedung = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnRuangan = new javax.swing.JPanel();
        lblRuangan = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnKelas = new javax.swing.JPanel();
        lblKelas = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnKmk = new javax.swing.JPanel();
        lblKmk = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnMatakuliah = new javax.swing.JPanel();
        lblMatakuliah = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnSetjam = new javax.swing.JPanel();
        lblSetjam = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnJadwal = new javax.swing.JPanel();
        lblJadwal = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnUser = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btnCetaklap = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        lblcetaklap = new javax.swing.JLabel();
        panelSlide = new javax.swing.JPanel();
        lbSlide = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelAlpha21 = new com.inpos.tools.PanelAlpha2();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelConfig = new javax.swing.JPanel();
        lblBackup = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        lblRestore = new javax.swing.JLabel();
        panelKonten = new javax.swing.JPanel();
        panelModul = new com.inpos.tools.PanelAlpha2();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblModultu = new javax.swing.JLabel();
        lblModuldosen = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblKeterangan = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout panelBulat1Layout = new javax.swing.GroupLayout(panelBulat1);
        panelBulat1.setLayout(panelBulat1Layout);
        panelBulat1Layout.setHorizontalGroup(
            panelBulat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelBulat1Layout.setVerticalGroup(
            panelBulat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8_Male_User_25px.png"))); // NOI18N
        lblStatus.setText("ID. User : . . . . . . .     || Status : . . . . . .");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("|");

        lbClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/close.png"))); // NOI18N
        lbClose.setText("Close");
        lbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addComponent(lbClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFooter.setBackground(new java.awt.Color(27, 94, 32));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("    Copyright@2018                                               || Informasi Pengembangan 085727740114 / 085742817180");

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        panelLeft.setBackground(new java.awt.Color(0, 150, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8-male-user-100.png"))); // NOI18N

        lblNamaUser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lblNamaUser.setForeground(new java.awt.Color(255, 255, 255));
        lblNamaUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamaUser.setText("(Username)");

        lblLevUser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        lblLevUser.setForeground(new java.awt.Color(255, 255, 255));
        lblLevUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLevUser.setText("(Level User)");

        btnUbahpass.setBackground(new java.awt.Color(0, 150, 63));
        btnUbahpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbahpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUbahpassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUbahpassMousePressed(evt);
            }
        });

        lblUbahpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUbahpass.setForeground(new java.awt.Color(255, 255, 255));
        lblUbahpass.setText("Ubah Password");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/ubah-password2.png"))); // NOI18N

        javax.swing.GroupLayout btnUbahpassLayout = new javax.swing.GroupLayout(btnUbahpass);
        btnUbahpass.setLayout(btnUbahpassLayout);
        btnUbahpassLayout.setHorizontalGroup(
            btnUbahpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUbahpassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUbahpass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        btnUbahpassLayout.setVerticalGroup(
            btnUbahpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUbahpassLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnUbahpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(lblUbahpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnGedung.setBackground(new java.awt.Color(0, 150, 63));
        btnGedung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGedung.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnGedungAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnGedung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGedungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGedungMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGedungMousePressed(evt);
            }
        });

        lblGedung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGedung.setForeground(new java.awt.Color(255, 255, 255));
        lblGedung.setText("Gedung");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/Gedung2.png"))); // NOI18N

        javax.swing.GroupLayout btnGedungLayout = new javax.swing.GroupLayout(btnGedung);
        btnGedung.setLayout(btnGedungLayout);
        btnGedungLayout.setHorizontalGroup(
            btnGedungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGedungLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel29)
                .addGap(15, 15, 15)
                .addComponent(lblGedung, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        btnGedungLayout.setVerticalGroup(
            btnGedungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGedungLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnGedungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGedung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        btnRuangan.setBackground(new java.awt.Color(0, 150, 63));
        btnRuangan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRuanganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRuanganMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRuanganMousePressed(evt);
            }
        });

        lblRuangan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRuangan.setForeground(new java.awt.Color(255, 255, 255));
        lblRuangan.setText("Ruangan");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/ruangan-mini.png"))); // NOI18N

        javax.swing.GroupLayout btnRuanganLayout = new javax.swing.GroupLayout(btnRuangan);
        btnRuangan.setLayout(btnRuanganLayout);
        btnRuanganLayout.setHorizontalGroup(
            btnRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRuanganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        btnRuanganLayout.setVerticalGroup(
            btnRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRuanganLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(btnRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(lblRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnKelas.setBackground(new java.awt.Color(0, 150, 63));
        btnKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKelasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKelasMousePressed(evt);
            }
        });

        lblKelas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKelas.setForeground(new java.awt.Color(255, 255, 255));
        lblKelas.setText("Kelas");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/kelas2.png"))); // NOI18N

        javax.swing.GroupLayout btnKelasLayout = new javax.swing.GroupLayout(btnKelas);
        btnKelas.setLayout(btnKelasLayout);
        btnKelasLayout.setHorizontalGroup(
            btnKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKelasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel35)
                .addGap(15, 15, 15)
                .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnKelasLayout.setVerticalGroup(
            btnKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKelasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(btnKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnKmk.setBackground(new java.awt.Color(0, 150, 63));
        btnKmk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKmkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKmkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKmkMousePressed(evt);
            }
        });

        lblKmk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKmk.setForeground(new java.awt.Color(255, 255, 255));
        lblKmk.setText("Kelompok MK");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/kmk.png"))); // NOI18N

        javax.swing.GroupLayout btnKmkLayout = new javax.swing.GroupLayout(btnKmk);
        btnKmk.setLayout(btnKmkLayout);
        btnKmkLayout.setHorizontalGroup(
            btnKmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKmkLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addGap(15, 15, 15)
                .addComponent(lblKmk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        btnKmkLayout.setVerticalGroup(
            btnKmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKmkLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(btnKmkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(lblKmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnMatakuliah.setBackground(new java.awt.Color(0, 150, 63));
        btnMatakuliah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMatakuliah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMatakuliahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMatakuliahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMatakuliahMousePressed(evt);
            }
        });

        lblMatakuliah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatakuliah.setForeground(new java.awt.Color(255, 255, 255));
        lblMatakuliah.setText("Mata Kuliah");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/matakuliah2.png"))); // NOI18N

        javax.swing.GroupLayout btnMatakuliahLayout = new javax.swing.GroupLayout(btnMatakuliah);
        btnMatakuliah.setLayout(btnMatakuliahLayout);
        btnMatakuliahLayout.setHorizontalGroup(
            btnMatakuliahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMatakuliahLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel36)
                .addGap(15, 15, 15)
                .addComponent(lblMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMatakuliahLayout.setVerticalGroup(
            btnMatakuliahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMatakuliahLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(btnMatakuliahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(lblMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnSetjam.setBackground(new java.awt.Color(0, 150, 63));
        btnSetjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSetjamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSetjamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSetjamMousePressed(evt);
            }
        });

        lblSetjam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSetjam.setForeground(new java.awt.Color(255, 255, 255));
        lblSetjam.setText("Setting Jam");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/setting-jam2.png"))); // NOI18N

        javax.swing.GroupLayout btnSetjamLayout = new javax.swing.GroupLayout(btnSetjam);
        btnSetjam.setLayout(btnSetjamLayout);
        btnSetjamLayout.setHorizontalGroup(
            btnSetjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSetjamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSetjam, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        btnSetjamLayout.setVerticalGroup(
            btnSetjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSetjamLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnSetjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(lblSetjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        btnJadwal.setBackground(new java.awt.Color(0, 150, 63));
        btnJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJadwalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJadwalMousePressed(evt);
            }
        });

        lblJadwal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJadwal.setForeground(new java.awt.Color(255, 255, 255));
        lblJadwal.setText("Jadwal Mata Kuliah");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/jadwal-matkul2.png"))); // NOI18N

        javax.swing.GroupLayout btnJadwalLayout = new javax.swing.GroupLayout(btnJadwal);
        btnJadwal.setLayout(btnJadwalLayout);
        btnJadwalLayout.setHorizontalGroup(
            btnJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnJadwalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblJadwal)
                .addGap(8, 8, 8))
        );
        btnJadwalLayout.setVerticalGroup(
            btnJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnJadwalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(5, 5, 5))
        );

        btnUser.setBackground(new java.awt.Color(0, 150, 63));
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUserMousePressed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("User");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/user2.png"))); // NOI18N

        javax.swing.GroupLayout btnUserLayout = new javax.swing.GroupLayout(btnUser);
        btnUser.setLayout(btnUserLayout);
        btnUserLayout.setHorizontalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUserLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUserLayout.setVerticalGroup(
            btnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUserLayout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnCetaklap.setBackground(new java.awt.Color(0, 150, 63));
        btnCetaklap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetaklap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCetaklapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCetaklapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCetaklapMousePressed(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8-report-card-35.png"))); // NOI18N

        lblcetaklap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcetaklap.setForeground(new java.awt.Color(255, 255, 255));
        lblcetaklap.setText("Cetak Laporan");

        javax.swing.GroupLayout btnCetaklapLayout = new javax.swing.GroupLayout(btnCetaklap);
        btnCetaklap.setLayout(btnCetaklapLayout);
        btnCetaklapLayout.setHorizontalGroup(
            btnCetaklapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCetaklapLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcetaklap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCetaklapLayout.setVerticalGroup(
            btnCetaklapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCetaklapLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblcetaklap)
                .addGap(10, 10, 10))
            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeftLayout.createSequentialGroup()
                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCetaklap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGedung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRuangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKelas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKmk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMatakuliah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJadwal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUbahpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNamaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLevUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLeftLayout.setVerticalGroup(
            panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNamaUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLevUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnKmk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSetjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbahpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCetaklap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelSlide.setBackground(new java.awt.Color(0, 120, 63));

        lbSlide.setForeground(new java.awt.Color(255, 255, 255));
        lbSlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8-menu-24.png"))); // NOI18N
        lbSlide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSlide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSlideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSlideLayout = new javax.swing.GroupLayout(panelSlide);
        panelSlide.setLayout(panelSlideLayout);
        panelSlideLayout.setHorizontalGroup(
            panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSlide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSlideLayout.setVerticalGroup(
            panelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSlideLayout.createSequentialGroup()
                .addComponent(lbSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelMenu.setBackground(new java.awt.Color(1, 198, 83));

        jLabel9.setFont(new java.awt.Font("Heroes Assemble Academy", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/desktop.png"))); // NOI18N
        jLabel9.setText("Aplikasi Penjadwalan Mata Kuliah");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAlpha21Layout = new javax.swing.GroupLayout(panelAlpha21);
        panelAlpha21.setLayout(panelAlpha21Layout);
        panelAlpha21Layout.setHorizontalGroup(
            panelAlpha21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha21Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlpha21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        panelAlpha21Layout.setVerticalGroup(
            panelAlpha21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlpha21Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        panelConfig.setLayout(new java.awt.GridBagLayout());

        lblBackup.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lblBackup.setForeground(new java.awt.Color(51, 204, 0));
        lblBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/data-backup.png"))); // NOI18N
        lblBackup.setText("Backup DB");
        lblBackup.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBackup.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackupMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 171, 42, 0);
        panelConfig.add(lblBackup, gridBagConstraints);

        lbldata.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lbldata.setForeground(new java.awt.Color(51, 204, 0));
        lbldata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/clear-data.png"))); // NOI18N
        lbldata.setText("Clear Data");
        lbldata.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbldata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbldata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbldata.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbldataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbldataMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 140, 42, 171);
        panelConfig.add(lbldata, gridBagConstraints);

        lblRestore.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lblRestore.setForeground(new java.awt.Color(51, 204, 0));
        lblRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/database-restore.png"))); // NOI18N
        lblRestore.setText("Restore DB");
        lblRestore.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblRestore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRestore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblRestore.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblRestore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRestoreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRestoreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRestoreMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 140, 42, 0);
        panelConfig.add(lblRestore, gridBagConstraints);

        panelKonten.setBackground(new java.awt.Color(1, 198, 83));
        panelKonten.setLayout(new java.awt.CardLayout());

        panelModul.setLayout(new java.awt.GridBagLayout());

        jLabel11.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pilih Modul");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 16, 0, 0);
        panelModul.add(jLabel11, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 723;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 9);
        panelModul.add(jSeparator1, gridBagConstraints);

        lblModultu.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lblModultu.setForeground(new java.awt.Color(255, 255, 255));
        lblModultu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8-businesswoman-80.png"))); // NOI18N
        lblModultu.setText("Petugas Tu");
        lblModultu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblModultu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblModultu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModultu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblModultu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModultuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModultuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModultuMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 213, 0, 0);
        panelModul.add(lblModultu, gridBagConstraints);

        lblModuldosen.setBackground(new java.awt.Color(255, 255, 255));
        lblModuldosen.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lblModuldosen.setForeground(new java.awt.Color(255, 255, 255));
        lblModuldosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/icons8-people-100.png"))); // NOI18N
        lblModuldosen.setText("Dosen");
        lblModuldosen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblModuldosen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblModuldosen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblModuldosen.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblModuldosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModuldosenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblModuldosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblModuldosenMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 3, 0, 0);
        panelModul.add(lblModuldosen, gridBagConstraints);

        panelKonten.add(panelModul, "card2");

        panelLogin.setBackground(new java.awt.Color(1, 198, 83));

        lblLogin.setFont(new java.awt.Font("Baloo", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN APP");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/user.png"))); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/jadwal/icons/key.png"))); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        lblKeterangan.setForeground(new java.awt.Color(255, 255, 255));
        lblKeterangan.setText("Keterangan :");

        txtIDUser.setBackground(new java.awt.Color(1, 198, 83));
        txtIDUser.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtIDUser.setForeground(new java.awt.Color(255, 255, 255));
        txtIDUser.setText("ID. User");
        txtIDUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIDUser.setOpaque(false);
        txtIDUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDUserMouseClicked(evt);
            }
        });
        txtIDUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUserActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(1, 198, 83));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("1234567890");
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.setOpaque(false);
        txtPassword.setSelectionColor(new java.awt.Color(1, 198, 83));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Masukkan ID. User dan Password , Tekan enter untuk masuk");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPassword))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblKeterangan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIDUser)))))
                    .addComponent(jLabel1))
                .addGap(30, 30, 30))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlpha21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addComponent(panelKonten, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(panelConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAlpha21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelKonten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(panelConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSlide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblModultuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModultuMouseClicked
        lblKeterangan.setText("Keterangan : Anda login sebagai Tata Usaha");
        setColorLabel(lblModultu);
        panelLogin.setVisible(true);
        modultu = true;
        lblLogin.setText("Login APP  |  Tata Usaha");
        us.lev_user = "Tata Usaha";
        txtIDUser.requestFocus(true);
    }//GEN-LAST:event_lblModultuMouseClicked

    private void lblModultuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModultuMouseEntered
        setColorLabel(lblModultu);
    }//GEN-LAST:event_lblModultuMouseEntered

    private void lblModultuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModultuMouseExited
    if(modultu == false){
            resetColorLabel(lblModultu);
        }else{
           
        }
    }//GEN-LAST:event_lblModultuMouseExited

    private void lblModuldosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModuldosenMouseClicked
        lblKeterangan.setText("Keterangan : Anda login sebagai Dosen");
        setColorLabel(lblModuldosen);
        panelLogin.setVisible(true);
        moduldosen = true;
        lblLogin.setText("Login APP  |  Dosen");
        us.lev_user = "Dosen";
        txtIDUser.requestFocus(true); 
    }//GEN-LAST:event_lblModuldosenMouseClicked

    private void lblModuldosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModuldosenMouseEntered
        setColorLabel(lblModuldosen);   
        //us.lev_user ="Dosen";
    }//GEN-LAST:event_lblModuldosenMouseEntered

    private void lblModuldosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModuldosenMouseExited
      if(moduldosen == false){
            resetColorLabel(lblModuldosen);
        }else{
            
        }
    }//GEN-LAST:event_lblModuldosenMouseExited

    private void lblBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseClicked

    }//GEN-LAST:event_lblBackupMouseClicked

    private void lblBackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseEntered

    }//GEN-LAST:event_lblBackupMouseEntered

    private void lblBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseExited

    }//GEN-LAST:event_lblBackupMouseExited

    private void lbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbldataMouseClicked

    private void lbldataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbldataMouseEntered

    private void lbldataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldataMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbldataMouseExited

    private void lblRestoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestoreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRestoreMouseClicked

    private void lblRestoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestoreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRestoreMouseEntered

    private void lblRestoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestoreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRestoreMouseExited

    private void btnGedungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGedungMouseEntered
        setColor(btnGedung);
    }//GEN-LAST:event_btnGedungMouseEntered

    private void btnGedungAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnGedungAncestorAdded
        IfrGedung fr = new IfrGedung();
        fr.setVisible(true);
    }//GEN-LAST:event_btnGedungAncestorAdded

    private void btnGedungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGedungMouseExited
      if(gedung==false){
            resetColor(); 
        }
    }//GEN-LAST:event_btnGedungMouseExited

    private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
       int jawab = JOptionPane.showConfirmDialog(this, "Apakah anda akan keluar dari sistem?","Informasi",
            JOptionPane.YES_NO_OPTION);
        if(jawab == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_lbCloseMouseClicked

    private void txtIDUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDUserMouseClicked
        if(txtIDUser.getText().equals("ID. User")){
            txtIDUser.setText("");
        }else{

        }
    }//GEN-LAST:event_txtIDUserMouseClicked

    private void txtIDUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUserActionPerformed
        txtPassword.setText("");
        txtPassword.requestFocus(true);
    }//GEN-LAST:event_txtIDUserActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        if(txtPassword.getText().equals("") || txtPassword.getText().equals("1234567890")){
            txtPassword.setText("");
        }else{

        }
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        login();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnGedungMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGedungMousePressed
        resetColor(); setColor(btnGedung); gedung=true;
        IfrGedung fr = new IfrGedung();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnGedungMousePressed

    private void lbSlideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSlideMouseClicked
        if(pMenu == false){
            panelLeft.setVisible(true);
            pMenu = true;
        }else{
            panelLeft.setVisible(false);
            pMenu = false;
        }
    }//GEN-LAST:event_lbSlideMouseClicked

    private void btnRuanganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRuanganMousePressed
        resetColor(); setColor(btnRuangan); ruangan=true;
        IfrRuang fr = new IfrRuang();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnRuanganMousePressed

    private void btnRuanganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRuanganMouseEntered
        setColor(btnRuangan);
    }//GEN-LAST:event_btnRuanganMouseEntered

    private void btnRuanganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRuanganMouseExited
        if(ruangan==false){
            resetColor();
        }
    }//GEN-LAST:event_btnRuanganMouseExited

    private void btnKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKelasMousePressed
        resetColor(); setColor(btnKelas); kelas=true;
        IfrKelas fr = new IfrKelas();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnKelasMousePressed

    private void btnKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKelasMouseEntered
        setColor(btnKelas);
    }//GEN-LAST:event_btnKelasMouseEntered

    private void btnKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKelasMouseExited
        if(kelas==false){
            resetColor();
        }
    }//GEN-LAST:event_btnKelasMouseExited

    private void btnKmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKmkMouseEntered
        setColor(btnKmk);
    }//GEN-LAST:event_btnKmkMouseEntered

    private void btnKmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKmkMouseExited
        if(kmk==false){
            resetColor();
        }
    }//GEN-LAST:event_btnKmkMouseExited

    private void btnMatakuliahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatakuliahMousePressed
        resetColor(); setColor(btnMatakuliah); matakuliah=true;
        IfrMatakuliah fr = new IfrMatakuliah();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnMatakuliahMousePressed

    private void btnMatakuliahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatakuliahMouseEntered
         setColor(btnMatakuliah);
    }//GEN-LAST:event_btnMatakuliahMouseEntered

    private void btnMatakuliahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatakuliahMouseExited
        if(matakuliah==false){
            resetColor();
        }
    }//GEN-LAST:event_btnMatakuliahMouseExited

    private void btnSetjamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetjamMousePressed
        resetColor(); setColor(btnSetjam); setjam=true;
        IfrSetJam fr = new IfrSetJam();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnSetjamMousePressed

    private void btnSetjamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetjamMouseEntered
        setColor(btnSetjam);
    }//GEN-LAST:event_btnSetjamMouseEntered

    private void btnSetjamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSetjamMouseExited
        if(setjam==false){
            resetColor();
        }
    }//GEN-LAST:event_btnSetjamMouseExited

    private void btnJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJadwalMousePressed
        resetColor(); setColor(btnJadwal); jadwal=true;
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        FrJadwal2 fr = new FrJadwal2();
        
        fr.setVisible(true);
        
    }//GEN-LAST:event_btnJadwalMousePressed

    private void btnJadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJadwalMouseEntered
         setColor(btnJadwal);
    }//GEN-LAST:event_btnJadwalMouseEntered

    private void btnJadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJadwalMouseExited
        if(jadwal==false){
            resetColor();
        }
    }//GEN-LAST:event_btnJadwalMouseExited

    private void btnUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMousePressed
        resetColor(); setColor(btnUser); user=true;
        IfrUser fr = new IfrUser();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnUserMousePressed

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseEntered
        setColor(btnUser);
    }//GEN-LAST:event_btnUserMouseEntered

    private void btnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseExited
        if(user==false){
            resetColor();
        }
    }//GEN-LAST:event_btnUserMouseExited

    private void btnUbahpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahpassMousePressed
        resetColor(); setColor(btnUbahpass); pass=true;
        JdUbahPassword fr = new JdUbahPassword(this, true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_btnUbahpassMousePressed

    private void btnUbahpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahpassMouseEntered
       setColor(btnUbahpass);
    }//GEN-LAST:event_btnUbahpassMouseEntered

    private void btnUbahpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahpassMouseExited
        if(pass==false){
            resetColor();
        }
    }//GEN-LAST:event_btnUbahpassMouseExited

    private void btnCetaklapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetaklapMousePressed
        resetColor(); setColor(btnCetaklap); cetak=true;
        IfrCetakJadwal fr = new IfrCetakJadwal();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnCetaklapMousePressed

    private void btnCetaklapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetaklapMouseEntered
        setColor(btnCetaklap);
    }//GEN-LAST:event_btnCetaklapMouseEntered

    private void btnCetaklapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCetaklapMouseExited
        if(cetak==false){
            resetColor();
        }
    }//GEN-LAST:event_btnCetaklapMouseExited

    private void btnKmkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKmkMousePressed
        resetColor(); setColor(btnKmk); kmk=true;
        IfrKelompokMK fr = new IfrKelompokMK();
        panelMenu.add(fr); fr.setVisible(true);
        panelConfig.setVisible(false);
        panelAlpha21.setVisible(false);
        //fr.getDesktopPane().getDesktopManager().maximizeFrame(fr);
    }//GEN-LAST:event_btnKmkMousePressed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if(txtPassword.getText().length()==15){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Password maksimal 15 karakter !!!",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("windows");
            SwingUtilities.updateComponentTreeUI(new FrMenu());
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){

        }
        new FrMenu().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCetaklap;
    private javax.swing.JPanel btnGedung;
    private javax.swing.JPanel btnJadwal;
    private javax.swing.JPanel btnKelas;
    private javax.swing.JPanel btnKmk;
    private javax.swing.JPanel btnMatakuliah;
    private javax.swing.JPanel btnRuangan;
    private javax.swing.JPanel btnSetjam;
    private javax.swing.JPanel btnUbahpass;
    private javax.swing.JPanel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbSlide;
    private javax.swing.JLabel lblBackup;
    private javax.swing.JLabel lblGedung;
    private javax.swing.JLabel lblJadwal;
    private javax.swing.JLabel lblKelas;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JLabel lblKmk;
    private javax.swing.JLabel lblLevUser;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMatakuliah;
    private javax.swing.JLabel lblModuldosen;
    private javax.swing.JLabel lblModultu;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblRestore;
    private javax.swing.JLabel lblRuangan;
    private javax.swing.JLabel lblSetjam;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUbahpass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblcetaklap;
    private javax.swing.JLabel lbldata;
    private com.inpos.tools.PanelAlpha2 panelAlpha21;
    private com.inpos.tools.PanelBulat panelBulat1;
    private javax.swing.JPanel panelConfig;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelKonten;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private com.inpos.tools.PanelAlpha2 panelModul;
    private javax.swing.JPanel panelSlide;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

     void setColor(JPanel panel){
        panel.setBackground(new Color(1, 198, 83));
    }
    
    void resetColor(){        
        btnGedung.setBackground(new Color(0, 150, 63));
        btnRuangan.setBackground(new Color(0, 150, 63));
        btnKelas.setBackground(new Color(0, 150, 63));
        btnSetjam.setBackground(new Color(0, 150, 63));
        btnJadwal.setBackground(new Color(0, 150, 63));
        btnCetaklap.setBackground(new Color(0, 150, 63));
        btnKmk.setBackground(new Color(0, 150, 63));
        btnMatakuliah.setBackground(new Color(0, 150, 63));
        btnUser.setBackground(new Color(0, 150, 63));
        btnUbahpass .setBackground(new Color(0, 150, 63));
    }
    
    void resetColor1(JPanel panel){
        panel.setBackground(new Color(0, 150, 63));
    }
    
    void setColorLabel(JLabel label){
        label.setForeground(new Color(85, 65, 118));
    }
    
    void resetColorLabel(JLabel label){
        label.setForeground(new Color(255, 255, 255));
    }
}
