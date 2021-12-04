/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.ForgetPasswordDAO;

/**
 *
 * @author muhib
 */
public class ForgetPassModel {
    
    private String email;
    private String newPassword;
    private String answer;
    private String securityQues;
    
    public ForgetPassModel(){
    
    }

    public ForgetPassModel(String email, String newPassword, String answer, String securityQues) {
        this.email = email;
        this.newPassword = newPassword;
        this.answer = answer;
        this.securityQues = securityQues;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public String getSecurityQues() {
        securityQues=ForgetPasswordDAO.search(email);
        return securityQues;
    }

    public void setSecurityQues(String securityQues) {
        this.securityQues = answer;
    }

    public String savePassword() {
        String flag = "";
        flag = ForgetPasswordDAO.save(email, securityQues, newPassword, answer);
        return flag;
    }
    
}
