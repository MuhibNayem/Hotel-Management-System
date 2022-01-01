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
public class SignupController {

    private SignupModel model;
    private signUpView view;

    public SignupController(SignupModel m, signUpView v) {

        model = m;
        view = v;
        view.setVisible(true);

    }

    public void initController() {
        view.getLoginBtn().addActionListener(e -> login());
        view.getForgotPassBtn().addActionListener(e -> forgetPass());
        view.getSignUpBtn().addActionListener(e -> signup());
        view.getExitBtn().addActionListener(e -> exit());

    }

    private void login() {
        view.setVisible(false);
        view.dispose();
        LoginModel m = new LoginModel();
        loginView v = new loginView();
        loginController c = new loginController(m, v);
        c.initController();
    }

    private void exit() {
        int exit = JOptionPane.showConfirmDialog(null, "Do you really want to close Applicatin?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) {
            System.exit(0);
        }
    }   

    private void signup() {
        
        String securityQues = view.getSecurityQuesComboBox().getSelectedItem().toString();
        String name = view.getNameTextField().getText();
        String email = view.getEmailTextField().getText();
        String password = view.getPasswordField().getText();
        String answer = view.getAnswerTextField().getText();
        String address = view.getAddressTextField().getText();
        
        model.setSecurityQues(securityQues);
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setAnswer(answer);
        model.setAddress(address);

        

        int check = 0;

        check = model.signup();

        if (check == 1) {
            JOptionPane.showConfirmDialog(view,  "Registered Successfully");
            LoginModel m = new LoginModel();
            loginView v = new loginView();
            loginController c = new loginController(m, v);
            c.initController();
        }

    }

    private void forgetPass() {
        view.setVisible(false);
        view.dispose();
        ForgetPassModel fm = new ForgetPassModel();
        ForgetPasswordView fv = new ForgetPasswordView();
        ForgatePassController c = new ForgatePassController(fm, fv);
        c.initController();
    }

}
