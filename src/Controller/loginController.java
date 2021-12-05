package Controller;

import javax.swing.JOptionPane;
import model.ForgetPassModel;
import model.LoginModel;
import model.SignupModel;
import model.adminHomeModel;
import model.homeModel;
import view.ForgetPasswordView;
import view.adminHomeView;
import view.homeView;
import view.loginView;
import view.signUpView;

public class loginController {

    private LoginModel model;
    private loginView view;
    
    String email;
    String pass;
    String check;

    public loginController(LoginModel m, loginView v) {

        model = m;
        view = v;
        
        
    }



    public void initController() {
        view.getLoginBtn().addActionListener(e -> login());
        view.getSignUpBtn().addActionListener(e -> signup());
        view.getExitBtn().addActionListener(e -> exit());
        view.getForgetPassBtn().addActionListener(e -> ForgetPass());
        view.setVisible(true);
        
    }

    private void login() {
        email = view.getEmailTextfield().getText();
        pass = view.getPasswordField().getText();
        model.setEmail(email);
        model.setPassword(pass);
        
        check = "";
        
        String flag = model.getAdminCredential();
        if(email.equals("") || pass.equals("")){
            check = "true";
            JOptionPane.showMessageDialog(null, "All fields are Required!");
        }
        
        else if (flag.equals("admin")){
            check = "ture";
            adminHomeModel am = new adminHomeModel();
            adminHomeView av = new adminHomeView();
            adminHomeController c = new adminHomeController(am, av);
            c.initController();
            view.dispose();
            
        }else{
            
            
            check = model.login();
            
            if(check.equals("true")){
                
                homeModel sm = new homeModel();
                homeView sv = new homeView();
                homeController c = new homeController(sm, sv);
                c.initController();
                view.dispose();
            }
            else if (check.equals("false")){
                JOptionPane.showMessageDialog(null, "Wait for Admin Approval");
                
            }
            else if(!check.equals("")){
                JOptionPane.showMessageDialog(null, check);
            }
            
        }
        if(check.isEmpty()){
            JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
        }
        
        
    }

    private void ForgetPass() {
        ForgetPassModel fm = new ForgetPassModel();
        ForgetPasswordView fv = new ForgetPasswordView();
        ForgatePassController c = new ForgatePassController(fm, fv);
        c.initController();
    }

    private void signup() {
        SignupModel sm = new SignupModel();
        signUpView sv = new signUpView();
        SignupController c = new SignupController(sm, sv);
        c.initController();
    }

    private void exit() {
        int exit = JOptionPane.showConfirmDialog(null,"Do you really want to close Applicatin?","Select",JOptionPane.YES_NO_OPTION);
        if(exit == 0){
            System.exit(0);
        }
    }

}
