/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author muhib
 */
public class signUpView extends JFrame{
    
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JComboBox<String> securityQuesComboBox;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel securityQuesLabel;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField emailTextField;
    
    public signUpView() {
        initComponents();
    }

                             
    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1366, 768));
        
        setTitle("Signup");

        exitBtn = new javax.swing.JButton();
        signupLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        securityQuesLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        answerTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        securityQuesComboBox = new javax.swing.JComboBox<>();
        signUpBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        forgotPassBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        exitBtn.setActionCommand("exit");
        
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 33, 30));

        signupLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(255, 255, 255));
        signupLabel.setText("SignUp");
        getContentPane().add(signupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 138, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        securityQuesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        securityQuesLabel.setForeground(new java.awt.Color(255, 255, 255));
        securityQuesLabel.setText("Security Question:");
        getContentPane().add(securityQuesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        answerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        answerLabel.setForeground(new java.awt.Color(255, 255, 255));
        answerLabel.setText("Answer");
        getContentPane().add(answerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address");
        getContentPane().add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 369, 31));

        answerTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        
        getContentPane().add(answerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 369, 29));

        addressTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 369, 30));

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 369, 29));

        passwordField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 369, 30));

        securityQuesComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        securityQuesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?" }));
        getContentPane().add(securityQuesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 369, 26));

        signUpBtn.setBackground(new java.awt.Color(102, 0, 0));
        signUpBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Signup");
        
        getContentPane().add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, -1));

        loginBtn.setBackground(new java.awt.Color(102, 0, 0));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, -1, -1));

        forgotPassBtn.setBackground(new java.awt.Color(102, 0, 0));
        forgotPassBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forgotPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassBtn.setText("Forgot Password ?");
        
        getContentPane().add(forgotPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signup.PNG"))); // NOI18N
        backgroundLabel.setText("jLabel8");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    } 

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JButton getSignUpBtn() {
        return signUpBtn;
    }

    public void setSignUpBtn(JButton signUpBtn) {
        this.signUpBtn = signUpBtn;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public JButton getForgotPassBtn() {
        return forgotPassBtn;
    }

    public void setForgotPassBtn(JButton forgotPassBtn) {
        this.forgotPassBtn = forgotPassBtn;
    }

    public JComboBox<String> getSecurityQuesComboBox() {
        return securityQuesComboBox;
    }

    public void setSecurityQuesComboBox(JComboBox<String> securityQuesComboBox) {
        this.securityQuesComboBox = securityQuesComboBox;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getAnswerTextField() {
        return answerTextField;
    }

    public void setAnswerTextField(JTextField answerTextField) {
        this.answerTextField = answerTextField;
    }

    public JTextField getAddressTextField() {
        return addressTextField;
    }

    public void setAddressTextField(JTextField addressTextField) {
        this.addressTextField = addressTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    
    
    
    
}
