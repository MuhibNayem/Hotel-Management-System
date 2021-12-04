/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvclearning;

import Controller.loginController;
import model.LoginModel;
import view.loginView;

/**
 *
 * @author muhib
 */
public class MVCLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Assemble all the pieces of the MVC
        LoginModel m = new LoginModel("","");
        loginView v = new loginView();
        loginController c = new loginController(m, v);
        c.initController();
        
    }
    
}
