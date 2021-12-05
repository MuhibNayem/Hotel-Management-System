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
public class CheckOutView extends JFrame{
    
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel checkOutLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JLabel checkInDateLabel;
    private javax.swing.JLabel checkOutDateLabel;
    private javax.swing.JLabel MobileNumberLabel;
    private javax.swing.JLabel PricePerDayLabel;
    private javax.swing.JLabel totalDayesStayedLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JTextField checkInDateTextField;
    private javax.swing.JTextField checkOutDateTextField;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JTextField pricePerDayTextField;
    private javax.swing.JTextField totalDaysStayedTextField;
    private javax.swing.JTextField amountToPayTextField;
    private javax.swing.JTextField emailTextField;
    
    public CheckOutView() {
        initComponents();
        customerNameTextField.setEditable(false);
        checkInDateTextField.setEditable(false);
        checkOutDateTextField.setEditable(false);
        mobileNumberTextField.setEditable(false);
        pricePerDayTextField.setEditable(false);
        totalDaysStayedTextField.setEditable(false);
        amountToPayTextField.setEditable(false);
        emailTextField.setEditable(false);
        
    }
    int id = 0;
    String bed,roomNo,roomType,query;

    @SuppressWarnings("unchecked")
    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1266, 600));
        
        setTitle("check-Out");

        checkOutLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        ScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        closeBtn = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        checkInDateLabel = new javax.swing.JLabel();
        checkInDateTextField = new javax.swing.JTextField();
        checkOutDateLabel = new javax.swing.JLabel();
        checkOutDateTextField = new javax.swing.JTextField();
        MobileNumberLabel = new javax.swing.JLabel();
        mobileNumberTextField = new javax.swing.JTextField();
        PricePerDayLabel = new javax.swing.JLabel();
        pricePerDayTextField = new javax.swing.JTextField();
        totalDayesStayedLabel = new javax.swing.JLabel();
        totalDaysStayedTextField = new javax.swing.JTextField();
        totalAmountLabel = new javax.swing.JLabel();
        amountToPayTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        checkOutBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkOutLabel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        checkOutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Check Out.png"))); // NOI18N
        checkOutLabel.setText("Customer Check-Out");
        getContentPane().add(checkOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, -1, -1));

        customerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerNameLabel.setText("Customer Name");
        getContentPane().add(customerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 125, -1, -1));

        roomNumberLabel.setBackground(new java.awt.Color(255, 255, 255));
        roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomNumberLabel.setText("Room Number");
        getContentPane().add(roomNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 79, -1, 31));

        searchTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 79, 350, 31));

        searchBtn.setBackground(new java.awt.Color(102, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 79, -1, 31));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "Check-In Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        ScrollPane1.setViewportView(customerTable);

        getContentPane().add(ScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 372, 1195, 203));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1224, 11, 32, -1));

        customerNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(customerNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 148, 250, 32));

        checkInDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkInDateLabel.setText("Check-In Date");
        getContentPane().add(checkInDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 125, -1, -1));

        checkInDateTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(checkInDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 148, 250, 32));

        checkOutDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkOutDateLabel.setText("Check-Out Date (today)");
        getContentPane().add(checkOutDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 125, -1, -1));

        checkOutDateTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(checkOutDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 148, 250, 32));

        MobileNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MobileNumberLabel.setText("Customer Mobile Number");
        getContentPane().add(MobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 125, -1, -1));

        mobileNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobileNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 148, 250, 32));

        PricePerDayLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PricePerDayLabel.setText("Price Per Day");
        getContentPane().add(PricePerDayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 236, -1, -1));

        pricePerDayTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pricePerDayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 253, 250, 32));

        totalDayesStayedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalDayesStayedLabel.setText("Total Days Stayed");
        getContentPane().add(totalDayesStayedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 236, -1, -1));

        totalDaysStayedTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(totalDaysStayedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 253, 250, 32));

        totalAmountLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalAmountLabel.setText("Total Amount to Pay");
        getContentPane().add(totalAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 236, -1, -1));

        amountToPayTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(amountToPayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 253, 250, 32));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 230, -1, -1));

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 253, 250, 32));

        checkOutBtn.setBackground(new java.awt.Color(102, 0, 0));
        checkOutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkOutBtn.setText("Check-Out");
        getContentPane().add(checkOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        clearBtn.setBackground(new java.awt.Color(102, 0, 0));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all pages background.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }

    public JButton getCloseBtn() {
        return closeBtn;
    }

    public void setCloseBtn(JButton closeBtn) {
        this.closeBtn = closeBtn;
    }

    public JButton getCheckOutBtn() {
        return checkOutBtn;
    }

    public void setCheckOutBtn(JButton checkOutBtn) {
        this.checkOutBtn = checkOutBtn;
    }

    public JButton getClearBtn() {
        return clearBtn;
    }

    public void setClearBtn(JButton clearBtn) {
        this.clearBtn = clearBtn;
    }

    public JTable getCustomerTable() {
        return customerTable;
    }

    public void setCustomerTable(JTable customerTable) {
        this.customerTable = customerTable;
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public void setSearchTextField(JTextField searchTextField) {
        this.searchTextField = searchTextField;
    }

    public JTextField getCustomerNameTextField() {
        return customerNameTextField;
    }

    public void setCustomerNameTextField(JTextField customerNameTextField) {
        this.customerNameTextField = customerNameTextField;
    }

    public JTextField getCheckInDateTextField() {
        return checkInDateTextField;
    }

    public void setCheckInDateTextField(JTextField checkInDateTextField) {
        this.checkInDateTextField = checkInDateTextField;
    }

    public JTextField getCheckOutDateTextField() {
        return checkOutDateTextField;
    }

    public void setCheckOutDateTextField(JTextField checkOutDateTextField) {
        this.checkOutDateTextField = checkOutDateTextField;
    }

    public JTextField getMobileNumberTextField() {
        return mobileNumberTextField;
    }

    public void setMobileNumberTextField(JTextField mobileNumberTextField) {
        this.mobileNumberTextField = mobileNumberTextField;
    }

    public JTextField getPricePerDayTextField() {
        return pricePerDayTextField;
    }

    public void setPricePerDayTextField(JTextField pricePerDayTextField) {
        this.pricePerDayTextField = pricePerDayTextField;
    }

    public JTextField getTotalDaysStayedTextField() {
        return totalDaysStayedTextField;
    }

    public void setTotalDaysStayedTextField(JTextField totalDaysStayedTextField) {
        this.totalDaysStayedTextField = totalDaysStayedTextField;
    }

    public JTextField getAmountToPayTextField() {
        return amountToPayTextField;
    }

    public void setAmountToPayTextField(JTextField amountToPayTextField) {
        this.amountToPayTextField = amountToPayTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }
    
    
    
}
