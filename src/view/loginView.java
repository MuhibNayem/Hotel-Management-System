/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author muhib
 */
public class loginView extends JFrame{

    // Variables declaration - do not modify                     
    private JButton loginBtn;
    private JButton signUpBtn;
    private JButton forgetPassBtn;
    private JButton exitBtn;
    private JLabel emailLable;
    private JLabel loginLable;
    private JLabel passwordLable;
    private JLabel backgroundabel;
    private JPasswordField PasswordField;
    private JTextField emailTextField;
    
    
    public loginView(){
        initComponents();
    }
    
    
    private void initComponents() {
        
        setBounds(0, 0, 1366, 768);
        setTitle("Login");

        loginLable = new javax.swing.JLabel();
        emailLable = new javax.swing.JLabel();
        passwordLable = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        forgetPassBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        backgroundabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginLable.setForeground(new java.awt.Color(255, 255, 255));
        loginLable.setText("Login");
        getContentPane().add(loginLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        emailLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLable.setForeground(new java.awt.Color(255, 255, 255));
        emailLable.setText("Email");
        getContentPane().add(emailLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        passwordLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLable.setForeground(new java.awt.Color(255, 255, 255));
        passwordLable.setText("password");
        getContentPane().add(passwordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 344, 34));

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 344, 31));

        loginBtn.setBackground(new java.awt.Color(102, 0, 0));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        signUpBtn.setBackground(new java.awt.Color(102, 0, 0));
        signUpBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Signup");
        
        getContentPane().add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        forgetPassBtn.setBackground(new java.awt.Color(102, 0, 0));
        forgetPassBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forgetPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgetPassBtn.setText("Forgot Password?");
        
        getContentPane().add(forgetPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, -1, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 40, 40));

        backgroundabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.PNG"))); // NOI18N
        getContentPane().add(backgroundabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
        
    }

    public JLabel getEmailLabel() {
        return emailLable;
    }

    public void setEmailLabel(JLabel emailLable) {
        this.emailLable = emailLable;
    }
    
    public JLabel getBackgroundabel() {
        return backgroundabel;
    }

    public void setBackgroundabel(JLabel backgroundabel) {
        this.backgroundabel = backgroundabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLable;
    }

    public void setPasswordLabel(JLabel passwordLable) {
        this.passwordLable = passwordLable;
    }

    public JTextField getEmailTextfield() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public JPasswordField getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(JPasswordField PasswordField) {
        this.PasswordField = PasswordField;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public JButton getForgetPassBtn() {
        return forgetPassBtn;
    }

    public void setForgetPassBtn(JButton forgetPassBtn) {
        this.forgetPassBtn = forgetPassBtn;
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

}


