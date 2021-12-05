package model.DAO;


import javax.swing.JOptionPane;

public class singupDAO {

    public static int signup(String name, String email, String password, String securityQuestion, String answer, String address) {

        int status = 0;

        if (name.equals("") || email.equals("") || password.equals("") || securityQuestion.equals("") || answer.equals("") || address.equals("")) {
            JOptionPane.showMessageDialog(null, "All Fields are Required!");
        } else {
            String Query;
            Query = "insert into users values('" + name + "','" + email + "','" + password + "','" + securityQuestion + "','" + answer + "','" + address + "','false')";
            InsertUpdateDelete.setData(Query);
            status = 1;

        }
        

        return status;
    }
}
