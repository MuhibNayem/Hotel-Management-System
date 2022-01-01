/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import model.ForgetPassModel;
import model.LoginModel;
import model.SignupModel;

import view.ForgetPasswordView;
import view.loginView;
import view.signUpView;

/**
 *
 * @author muhib
 */
public class ForgatePassController {

    private ForgetPassModel model;
    private ForgetPasswordView view;

    public ForgatePassController(ForgetPassModel m, ForgetPasswordView v) {

        model = m;
        view = v;
        view.setVisible(true);

    }
    
    String email, answer, newPassword, securityQues;

    public void initController() {
        view.getLoginBtn().addActionListener(e -> login());
        view.getSaveBtn().addActionListener(e -> SaveNewPass());
        view.getSignupBtn().addActionListener(e -> signup());
        view.getSearchBtn().addActionListener(e -> searchUser());
        view.getExitBtn().addActionListener(e -> exit());

    }

    private void login() {

        LoginModel m = new LoginModel("", "");
        loginView v = new loginView();
        loginController c = new loginController(m, v);
        c.initController();
        view.setVisible(false);
        view.dispose();
    }

    private void SaveNewPass() {
        int check = 0;

        
        model.setAnswer(view.getAnswerTextField().getText());
        model.setNewPassword(view.getNewPassField().getText());
        

         
         answer = model.getAnswer();
         newPassword = model.getNewPassword();
         

        if (answer.equals("") || newPassword.equals("")) {
            check = 1;
            JOptionPane.showMessageDialog(null, "All Aields are Required !");
        } else {
            
            String flag = model.savePassword();
                    
            try {
                
                if (!flag.equals("")) {
                    check = 1;
                    ForgetPassModel fm = new ForgetPassModel();
                    ForgetPasswordView fv = new ForgetPasswordView();
                    ForgatePassController c = new ForgatePassController(fm, fv);
                    c.initController();
                    JOptionPane.showMessageDialog(null, "password updated successfully");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check==0){
            JOptionPane.showMessageDialog(null, "Incorrect Answer !");
        }

    }

    private void signup() {
        SignupModel sm = new SignupModel();
        signUpView sv = new signUpView();
        SignupController c = new SignupController(sm, sv);
        c.initController();
        view.setVisible(false);
        view.dispose();
    }

    private void searchUser() {
        int check = 0;
        model.setEmail(view.getEmailTextfield().getText());
        model.setSecurityQues(view.getSequrityQuesTextField().getText());
        email = model.getEmail();
        

        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email is Required!");
        } else {

            securityQues = model.getSecurityQues();
                    
             
            try {
                if (!securityQues.equals("")) {
                    check = 1;
                    view.getSequrityQuesTextField()
                            .setText(securityQues);
                    view.getSequrityQuesTextField()
                            .setEditable(false);
                    view.getEmailTextfield()
                            .setEditable(false);
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (check == 0 && !email.equals("")) {
            JOptionPane.showMessageDialog(null, "Incorrect Email !");
        }

    }

    private void exit() {
        int exit = JOptionPane.showConfirmDialog(null, "Do you really want to close Applicatin?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) {
            System.exit(0);
        }
    }
}
