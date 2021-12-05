/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author muhib
 */
public class homeView extends JFrame{
    
    private javax.swing.JButton roomDetailsBtn;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JButton billDetailsBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel backgroundLabel;
    
    public homeView() {
        initComponents();
    }

    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1366, 768));
        
        setTitle("Home");

        roomDetailsBtn = new javax.swing.JButton();
        checkInBtn = new javax.swing.JButton();
        checkOutBtn = new javax.swing.JButton();
        billDetailsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomDetailsBtn.setBackground(new java.awt.Color(102, 0, 0));
        roomDetailsBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        roomDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        roomDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage room.png"))); // NOI18N
        roomDetailsBtn.setText("Room Details");
        getContentPane().add(roomDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 28, -1, -1));

        checkInBtn.setBackground(new java.awt.Color(102, 0, 0));
        checkInBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        checkInBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkInBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Registration & Check IN.png"))); // NOI18N
        checkInBtn.setText("Check-In");
        getContentPane().add(checkInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 28, -1, -1));

        checkOutBtn.setBackground(new java.awt.Color(102, 0, 0));
        checkOutBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        checkOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Check Out.png"))); // NOI18N
        checkOutBtn.setText("Check-Out");
        getContentPane().add(checkOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 28, -1, -1));

        billDetailsBtn.setBackground(new java.awt.Color(102, 0, 0));
        billDetailsBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        billDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        billDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Details Bill.png"))); // NOI18N
        billDetailsBtn.setText("Bill Details");
        billDetailsBtn.setToolTipText("");
        getContentPane().add(billDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 28, -1, -1));

        logoutBtn.setBackground(new java.awt.Color(102, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn.setText("Logout");
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 28, -1, -1));

        exitBtn.setBackground(new java.awt.Color(102, 0, 0));
        exitBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1182, 28, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }

    public JButton getRoomDetailsBtn() {
        return roomDetailsBtn;
    }

    public void setRoomDetailsBtn(JButton roomDetailsBtn) {
        this.roomDetailsBtn = roomDetailsBtn;
    }

    public JButton getCheckInBtn() {
        return checkInBtn;
    }

    public void setCheckInBtn(JButton checkInBtn) {
        this.checkInBtn = checkInBtn;
    }

    public JButton getCheckOutBtn() {
        return checkOutBtn;
    }

    public void setCheckOutBtn(JButton checkOutBtn) {
        this.checkOutBtn = checkOutBtn;
    }

    public JButton getBillDetailsBtn() {
        return billDetailsBtn;
    }

    public void setBillDetailsBtn(JButton billDetailsBtn) {
        this.billDetailsBtn = billDetailsBtn;
    }

    public JButton getLogoutBtn() {
        return logoutBtn;
    }

    public void setLogoutBtn(JButton logoutBtn) {
        this.logoutBtn = logoutBtn;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JLabel getBackgroundLabel() {
        return backgroundLabel;
    }

    public void setBackgroundLabel(JLabel backgroundLabel) {
        this.backgroundLabel = backgroundLabel;
    }
    
    
    
}
