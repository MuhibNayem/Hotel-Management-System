/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author muhib
 */
public class adminHomeView extends JFrame{
    
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton refreashBtn;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JScrollPane employeeTableScrollPane;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField searchTextField;
    
    public adminHomeView() {
        initComponents();
    }

    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1366, 768));
        
        setTitle("Admin Home");

        welcomeLabel = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        refreashBtn = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        employeeTableScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(102, 0, 0));
        welcomeLabel.setText("Welcome Admin !");
        getContentPane().add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(102, 0, 0));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 130, 64));

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(102, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        logoutBtn.setText("Logout");
        
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, 64));

        refreashBtn.setBackground(new java.awt.Color(102, 0, 0));
        refreashBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreashBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreashBtn.setText("Refresh");
        
        getContentPane().add(refreashBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 140, 90, 30));

        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchLabel.setText("Search by Name or Email");
        getContentPane().add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, 33));
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 348, 33));

        searchBtn.setBackground(new java.awt.Color(102, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 82, 33));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "SecurityQuestion", "Address", "Status"
            }
        ));
        
        employeeTableScrollPane.setViewportView(employeeTable);

        getContentPane().add(employeeTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 185, 1280, 572));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin Home.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JButton getLogoutBtn() {
        return logoutBtn;
    }

    public void setLogoutBtn(JButton logoutBtn) {
        this.logoutBtn = logoutBtn;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }

    public JButton getRefreashBtn() {
        return refreashBtn;
    }

    public void setRefreashBtn(JButton refreashBtn) {
        this.refreashBtn = refreashBtn;
    }

    public JTable getEmployeeTable() {
        return employeeTable;
    }

    public void setEmployeeTable(JTable employeeTable) {
        this.employeeTable = employeeTable;
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public void setSearchTextField(JTextField searchTextField) {
        this.searchTextField = searchTextField;
    }
    
    
    
}
