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
public class previousCustomerDetailsView extends JFrame{
    
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel introLabel;
    private javax.swing.JLabel searcgByCheckOutDateLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable previousCustomerTable1;
    private javax.swing.JTextField searchTextField;
    
    public previousCustomerDetailsView() {
        initComponents();
        
    }

    

    private void initComponents() {

        introLabel = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        searcgByCheckOutDateLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        previousCustomerTable1 = new javax.swing.JTable();
        infoLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        introLabel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        introLabel.setForeground(new java.awt.Color(102, 0, 0));
        introLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Details Bill.png"))); // NOI18N
        introLabel.setText("Customer's Bill Details");
        introLabel.setToolTipText("");
        getContentPane().add(introLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 11, 35, -1));

        searcgByCheckOutDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searcgByCheckOutDateLabel.setText("Search By Check-Out Date");
        getContentPane().add(searcgByCheckOutDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 32));

        searchTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 300, 32));

        searchBtn.setBackground(new java.awt.Color(102, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, 32));

        previousCustomerTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Numner", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check-In Date", "Room No", "Bed", "Room Type", "Price Per Day", "Days Sated", "Total Amount", "Check-Out Date"
            }
        ));
        
        jScrollPane1.setViewportView(previousCustomerTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 1246, 380));

        infoLabel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(102, 0, 0));
        infoLabel.setText("*Click on table row to Open Bill Or Delete Record");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        refreshBtn.setBackground(new java.awt.Color(102, 0, 0));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("refresh");
        getContentPane().add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1175, 100, -1, 32));
        
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all pages background.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }                        

    public JButton getCloseBtn() {
        return closeBtn;
    }

    public void setCloseBtn(JButton closeBtn) {
        this.closeBtn = closeBtn;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }

    public JTable getPreviousCustomerTable1() {
        return previousCustomerTable1;
    }

    public void setPreviousCustomerTable1(JTable previousCustomerTable1) {
        this.previousCustomerTable1 = previousCustomerTable1;
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public void setSearchTextField(JTextField searchTextField) {
        this.searchTextField = searchTextField;
    }

    public JButton getRefreshBtn() {
        return refreshBtn;
    }

    public void setRefreshBtn(JButton refreshBtn) {
        this.refreshBtn = refreshBtn;
    }
    
    
    
}
