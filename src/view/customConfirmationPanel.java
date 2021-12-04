package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public  class customConfirmationPanel {

    public static int initView(String option1, String option2){  
      
      final JLabel label = new JLabel();
            JFrame frame = new JFrame();
         
            String[] options = {option1, option2}; 
            int result = JOptionPane.showOptionDialog(
               frame,
               "What do you want to do?", 
               "Confirmation",            
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               null,     
               options,  
               options[0] 
            );
            return result;
            
 }
      
}
    

