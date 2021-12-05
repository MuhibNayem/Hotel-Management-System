/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author muhib
 */
public class checkInView extends JFrame{
    
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton allocateRoomBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton getPriceBtn;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JComboBox<String> bedComboBox;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    private javax.swing.JComboBox<String> roomNumberComboBox;
    private javax.swing.JLabel customerCheckInLabel;
    private javax.swing.JLabel bedLabel;
    private javax.swing.JLabel bedTypeLabel;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel mobileNoLabel;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel idProofLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel checkInDateLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField mobileNoTextField;
    private javax.swing.JTextField nationalityTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idProofTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField checkInDateTextField;
    private javax.swing.JTextField priceTextField;
    
    public checkInView() {
        initComponents();
        checkInDateTextField.setEditable(false);
        priceTextField.setEditable(false);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        
        setBounds(0,0,1266, 600);
        
        setTitle("Check-In");

        customerCheckInLabel = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        getPriceBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        mobileNoLabel = new javax.swing.JLabel();
        mobileNoTextField = new javax.swing.JTextField();
        nationalityLabel = new javax.swing.JLabel();
        nationalityTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        idProofLabel = new javax.swing.JLabel();
        idProofTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        checkInDateLabel = new javax.swing.JLabel();
        checkInDateTextField = new javax.swing.JTextField();
        bedLabel = new javax.swing.JLabel();
        bedComboBox = new javax.swing.JComboBox<>();
        bedTypeLabel = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        roomNumberLabel = new javax.swing.JLabel();
        roomNumberComboBox = new javax.swing.JComboBox<>();
        priceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        allocateRoomBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerCheckInLabel.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        customerCheckInLabel.setForeground(new java.awt.Color(102, 0, 0));
        customerCheckInLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer Registration & Check IN.png"))); // NOI18N
        customerCheckInLabel.setText("Customer Check-In");
        getContentPane().add(customerCheckInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 31, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 96, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 119, 350, 32));

        mobileNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobileNoLabel.setText("Mobile No");
        getContentPane().add(mobileNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 181, -1, -1));

        mobileNoTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mobileNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 204, 350, 32));

        nationalityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nationalityLabel.setText("Nationality");
        getContentPane().add(nationalityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 267, -1, -1));

        nationalityTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nationalityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 350, 32));

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderLabel.setText("Gender");
        getContentPane().add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 355, -1, -1));

        genderComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 378, 350, 32));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 447, -1, -1));

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, 350, 32));

        idProofLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idProofLabel.setText("ID Proof");
        getContentPane().add(idProofLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 96, -1, -1));

        idProofTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(idProofTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 119, 350, 32));

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressLabel.setText("Address");
        getContentPane().add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 181, -1, -1));

        addressTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 204, 350, 32));

        checkInDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkInDateLabel.setText("Check-IN Date (today)");
        getContentPane().add(checkInDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 267, -1, -1));

        checkInDateTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(checkInDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 290, 350, 32));

        bedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedLabel.setText("Bed");
        getContentPane().add(bedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 96, -1, -1));

        bedComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Single ","Double" }));
        getContentPane().add(bedComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 119, 350, 35));

        bedTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedTypeLabel.setText("Room Type");
        getContentPane().add(bedTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 181, -1, -1));

        roomTypeComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC",}));
        getContentPane().add(roomTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 204, 350, 32));

        roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomNumberLabel.setText("Room Number");
        getContentPane().add(roomNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 267, -1, -1));

        roomNumberComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(roomNumberComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 290, 350, 32));

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel.setText("Price");
        getContentPane().add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 355, -1, -1));

        priceTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 378, 350, 32));

        allocateRoomBtn.setBackground(new java.awt.Color(102, 0, 0));
        allocateRoomBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allocateRoomBtn.setForeground(new java.awt.Color(255, 255, 255));
        allocateRoomBtn.setText("Allocate Room");
        getContentPane().add(allocateRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 480, -1, -1));

        clearBtn.setBackground(new java.awt.Color(153, 0, 0));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, -1));
        
        
        getPriceBtn.setBackground(new java.awt.Color(153, 0, 0));
        getPriceBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getPriceBtn.setForeground(new java.awt.Color(255, 255, 255));
        getPriceBtn.setText("Get Price");
        getContentPane().add(getPriceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 430, -1, -1));

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

    public JButton getAllocateRoomBtn() {
        return allocateRoomBtn;
    }

    public void setAllocateRoomBtn(JButton allocateRoomBtn) {
        this.allocateRoomBtn = allocateRoomBtn;
    }

    public JButton getClearBtn() {
        return clearBtn;
    }

    public JButton getGetPriceBtn() {
        return getPriceBtn;
    }

    public void setGetPriceBtn(JButton getPriceBtn) {
        this.getPriceBtn = getPriceBtn;
    }

    public void setClearBtn(JButton clearBtn) {
        this.clearBtn = clearBtn;
    }

    public JComboBox<String> getGenderComboBox() {
        return genderComboBox;
    }

    public void setGenderComboBox(JComboBox<String> genderComboBox) {
        this.genderComboBox = genderComboBox;
    }

    public JComboBox<String> getBedComboBox() {
        return bedComboBox;
    }

    public void setBedComboBox(JComboBox<String> bedComboBox) {
        this.bedComboBox = bedComboBox;
    }

    public JComboBox<String> getRoomTypeComboBox() {
        return roomTypeComboBox;
    }

    public void setRoomTypeComboBox(JComboBox<String> roomTypeComboBox) {
        this.roomTypeComboBox = roomTypeComboBox;
    }

    public JComboBox<String> getRoomNumberComboBox() {
        return roomNumberComboBox;
    }

    public void setRoomNumberComboBox(JComboBox<String> roomNumberComboBox) {
        this.roomNumberComboBox = roomNumberComboBox;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getMobileNoTextField() {
        return mobileNoTextField;
    }

    public void setMobileNoTextField(JTextField mobileNoTextField) {
        this.mobileNoTextField = mobileNoTextField;
    }

    public JTextField getNationalityTextField() {
        return nationalityTextField;
    }

    public void setNationalityTextField(JTextField nationalityTextField) {
        this.nationalityTextField = nationalityTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public JTextField getIdProofTextField() {
        return idProofTextField;
    }

    public void setIdProofTextField(JTextField idProofTextField) {
        this.idProofTextField = idProofTextField;
    }

    public JTextField getAddressTextField() {
        return addressTextField;
    }

    public void setAddressTextField(JTextField addressTextField) {
        this.addressTextField = addressTextField;
    }

    public JTextField getCheckInDateTextField() {
        return checkInDateTextField;
    }

    public void setCheckInDateTextField(JTextField checkInDateTextField) {
        this.checkInDateTextField = checkInDateTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public void setPriceTextField(JTextField priceTextField) {
        this.priceTextField = priceTextField;
    }
    
    
    
}
