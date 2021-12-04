/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author muhib
 */
import java.sql.Connection;
import java.sql.ResultSet;

public class loginDAO {

    public static String login(String email, String password) {

        String status = "";
        
            Connection con = ConnectionProvider.getCon();
            ResultSet rs = select.getData("select * from users where email='"+email+"' and password = '"+password+"'");
            try {
                if (rs.next()) {
                    
                    if (rs.getString(7).equals("true")) {
                        
                        status = "true";
                        
                    } else {
                        status = "false";
                    }
                }
            } catch (Exception e) {
                status = e.toString();
                
            }
        
        return status;
        
    }

}
