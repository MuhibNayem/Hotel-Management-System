/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author muhib
 */
public class InsertUpdateDelete {
    
    public static String setData(String Query){
        String status ="";
        Connection con = null;
        Statement st = null;
        
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            status="true";
//            if(!msg.equals("")){
//                JOptionPane.showMessageDialog(null, msg);
//            }
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            status = e.toString();
        }
        finally{
            try{
        
            }
            catch(Exception e){
                  
            }
        }
        return status;
    }
    
    
}
