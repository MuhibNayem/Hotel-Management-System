/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import model.DAO.TableManipulationDAO;

/**
 *
 * @author muhib
 */
public class CheckOutModel {
    
    ArrayList<String> customerDetails;

    public CheckOutModel() {
    }
    
    
    public TableModel customerTable() {
        TableModel table = null;
        table = TableManipulationDAO.checkedInCustomerTable();
        return table;
    }

    public ArrayList<String> customerDetails(String roomNo) {
        customerDetails = TableManipulationDAO.getcustomerDetails(roomNo);
        return customerDetails;
    }

    public String setRoomVacant(String roomNo) {
        String check = "";
        check = TableManipulationDAO.vacantRoom(roomNo);
        return check;
    }

    

    public void setFulldetails(String totalDaysStayed, String totalAmountToPay, String checkOutDate, String id) {
        TableManipulationDAO.setcheckOutDetails(totalDaysStayed,totalAmountToPay,checkOutDate,id);
    }
    
    
    
}
