/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DAO.TableManipulationDAO;
import javax.swing.table.TableModel;

/**
 *
 * @author muhib
 */
public class adminHomeModel {
    
    
    private String searchText;


    public adminHomeModel() {
    }

    public adminHomeModel(String searchText ){
        this.searchText = searchText;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    
    public String employeeApprove(String email, String status) {
        String check = "";
        check = TableManipulationDAO.employeeApprove(status, email);
        return check;
    }

    public TableModel adminTable() {
        TableModel table = null;
        table = TableManipulationDAO.adminTable();
        return table;
    }
    
    public static TableModel adminSearch(String searchTxt) {
        TableModel table = null;
        table = TableManipulationDAO.adminSearch(searchTxt);
        return table;
    }
    
    
}
