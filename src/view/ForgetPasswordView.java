/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author muhib
 */
public class ForgetPasswordView extends JFrame {
    
    
    private JButton searchBtn;
    private JButton saveBtn;
    private JButton signupBtn;
    private JButton loginBtn;
    private JButton exitBtn;
    private JLabel sreenlable;
    private JLabel emailLabel;
    private JLabel sequrityQuesLabel;
    private JLabel answerLabel;
    private JLabel newPassLabel;
    private JLabel backgroundLabel;
    private JPasswordField newPassField;
    private JTextField emailTextField;
    private JTextField answerTextField;
    private JTextField sequrityQuesTextField;
    
    public ForgetPasswordView() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
                            
    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1366, 768));
        
        setTitle("Forget Password");

        sreenlable = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        sequrityQuesLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        newPassLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        answerTextField = new javax.swing.JTextField();
        newPassField = new javax.swing.JPasswordField();
        searchBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        sequrityQuesTextField = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1307, 11, 34, 37));

        
        sreenlable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sreenlable.setForeground(new java.awt.Color(255, 255, 255));
        sreenlable.setText("Forgot Password ?");
        getContentPane().add(sreenlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        sequrityQuesLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sequrityQuesLabel.setForeground(new java.awt.Color(255, 255, 255));
        sequrityQuesLabel.setText("Security Question");
        getContentPane().add(sequrityQuesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        answerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        answerLabel.setForeground(new java.awt.Color(255, 255, 255));
        answerLabel.setText("Answer");
        getContentPane().add(answerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        newPassLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPassLabel.setText("New Password");
        getContentPane().add(newPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 360, 31));

        answerTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(answerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 360, 31));

        newPassField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(newPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 360, 31));

        searchBtn.setBackground(new java.awt.Color(102, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 80, 30));

        saveBtn.setBackground(new java.awt.Color(102, 0, 0));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 70, -1));

        signupBtn.setBackground(new java.awt.Color(102, 0, 0));
        signupBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Signup");
        
        getContentPane().add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        loginBtn.setBackground(new java.awt.Color(102, 0, 0));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 70, -1));

        sequrityQuesTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(sequrityQuesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 360, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forgot password.PNG"))); // NOI18N
        backgroundLabel.setToolTipText("");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }// </editor-fold> 
    
    
    
    public JLabel getSecurityLabel() {
        return sequrityQuesLabel;
    }

    public void setSecurityLabel(JLabel sequrityQuesLabel) {
        this.sequrityQuesLabel = sequrityQuesLabel;
    }
    
    public JLabel getEmailLabel() {
        return emailLabel;
    }

    public void setEmailLabel(JLabel emailLabel) {
        this.emailLabel = emailLabel;
    }
    
    public JLabel getNewPasswordLabel() {
        return newPassLabel;
    }

    public void setNewPasswordLabel(JLabel newPassLabel) {
        this.newPassLabel = newPassLabel;
    }

    public JLabel getAnswerLabel() {
        return answerLabel;
    }

    public void setAnswerLabel(JLabel answerLabel) {
        this.answerLabel = answerLabel;
    }

    public JTextField getEmailTextfield() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }
    
    public JTextField getSequrityQuesTextField() {
        return sequrityQuesTextField;
    }

    public void setSequrityQuesTextField(JTextField sequrityQuesTextField) {
        this.sequrityQuesTextField = sequrityQuesTextField;
    }
    
    public JTextField getAnswerTextField() {
        return answerTextField;
    }

    public void setAnswerTextField(JTextField answerTextField) {
        this.answerTextField = answerTextField;
    }

    public JPasswordField getNewPassField() {
        return newPassField;
    }

    public void setNewPassField(JPasswordField newPassField) {
        this.newPassField = newPassField;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(JButton searchBtn) {
        this.searchBtn = searchBtn;
    }
    
    public JButton getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(JButton saveBtn) {
        this.saveBtn = saveBtn;
    }
    
    public JButton getSignupBtn() {
        return signupBtn;
    }

    public void setSignupBtn(JButton signupBtn) {
        this.signupBtn = signupBtn;
    }
    
    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }
    
}
