package DAO;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DAO.InsertUpdateDelete;
import DAO.select;

public class ForgetPasswordDAO {

    public static String search(String email) {
        String ques = "";

        ResultSet rs = select.getData("select * from users where email = '" + email + "'");

        try {
            if (rs.next()) {
                ques = rs.getString(4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return ques;
    }
     public static String save(String email, String securityQuestion, String newPassword, String answer){
         String status = "";
         String check="";
         
         ResultSet rs = select.getData("select *from users where email='"+email+"' and  securityQuestion='"+securityQuestion+"' and answer = '"+answer+"'");
            try{
                if(rs.next()){
                    status = rs.getString(1);
                    status = InsertUpdateDelete.setData("update users set password = '"+newPassword+"' where email='"+email+"'");
                    
                    
                }
                
            }
            catch(Exception e){
                status = e.toString();
                //JOptionPane.showMessageDialog(null, e);
            }
         
         return status;
     }

}
