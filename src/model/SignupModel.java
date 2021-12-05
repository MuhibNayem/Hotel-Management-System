/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DAO.singupDAO;

/**
 *
 * @author muhib
 */
public class SignupModel {
    
    private String email;
    private String password;
    private String name;
    private String address;
    private String answer;
    private String securityQues;
    
    public SignupModel(){
    
    }

    public SignupModel(String email, String password, String name, String address, String answer, String securityQues) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.answer = answer;
        this.securityQues = securityQues;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSecurityQues() {
        return securityQues;
    }

    public void setSecurityQues(String securityQues) {
        this.securityQues = securityQues;
    }

    public int signup() {
        int check = 0;
        check = singupDAO.signup(name,email,password,securityQues,answer,address);
        return check;
    }
    
    
    
}
