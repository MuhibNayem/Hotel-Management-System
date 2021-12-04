/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.loginDAO;

/**
 *
 * @author muhib
 */
public class LoginModel {

    

    private String email;
    private String password;

    public LoginModel(){
    
    }
    
    public  String login() {
        String check = "";
        check = loginDAO.login(email,password);
        return check;
    }
    
    public LoginModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

}
