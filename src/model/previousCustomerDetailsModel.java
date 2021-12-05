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
public class previousCustomerDetailsModel {
    
    String id;
    public TableModel prevCustomerTable() {
        TableModel table = null;
        table = TableManipulationDAO.prevCustomerTable();
        return table;
    }

    public TableModel prevCustomerSearch(String searchTxt) {
        TableModel table = null;
        table = TableManipulationDAO.searchPrevCustomer(searchTxt);
        return table;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String deleteRecord() {
        String Check ="";
        Check = TableManipulationDAO.deleteRecord(id);
        return Check;
    }
    
    

}
