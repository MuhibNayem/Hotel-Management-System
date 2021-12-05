/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author muhib
 */
public class TableManipulationDAO {
    
    public static TableModel adminTable(){
        
         ResultSet rs = select.getData("select name, email, securityQuestion, address, status from users");
        TableModel tablemodel = DbUtils.resultSetToTableModel(rs);
        return tablemodel;
        
    }
    public static String employeeApprove(String status, String email){
        String flag="";
        flag = InsertUpdateDelete.setData("update users set status = '"+status+"' where email = '"+email+"'");
        return flag;
    }
    
    public static TableModel roomTable(){
        
        ResultSet rs = select.getData("select *from room");
        TableModel tablemodel = DbUtils.resultSetToTableModel(rs);
        return tablemodel;
    }
    
    public static TableModel adminSearch(String nameOrEmail){
        TableModel tablemodel = null;
        ResultSet rs = select.getData("select name, email, securityQuestion, address, status from users where name like '%"+nameOrEmail+"%' or email like '%"+nameOrEmail+"%'");
        tablemodel = DbUtils.resultSetToTableModel(rs);
        
        
        return tablemodel;
    
    }
    
    public static String deleteRoom(String roomNo, String status){
        String check = "";
        check = InsertUpdateDelete.setData("DELETE FROM room WHERE roomNo ='"+roomNo+"' and status= '"+status+"'");
        return check;
    }
    

    public static ArrayList getRoomNumber(String bed, String roomType){
        int column = 0;
        try{
            ResultSet rs = select.getData("select *from room where bed='"+bed+"' and roomType='"+roomType+"' and status = 'Not Booked'");
            
            while(rs.next()){
               column++;
                rs.getString(1);
            }
            
             
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        ResultSet rs = select.getData("select *from room where bed='"+bed+"' and roomType='"+roomType+"' and status = 'Not Booked'");
            
        ArrayList<String> al = new ArrayList<String>();
        try {
            while (rs.next()) {
                
                String value = rs.getString(1);
                al.add(value);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableManipulationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return al;
    }


    public static String getPrice(String roomNum) {
        String price = "";
        try{
            ResultSet rs = select.getData("select *from room where roomNo='"+roomNum+"'");
            while(rs.next()){
                
                price= rs.getString(4);
            }
            
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
            
        }
         return price;  
        
    }

    public static String allocateRoom(String name, String mobleNo, String nationality, String gender, String email, String idProof, String address, String checkIndate, String roomNumber, String bed, String roomType, String price) {
        String query ="select max(id) from customer";
        String status = "";
        int id = 1;
        try{
            
            ResultSet rs = select.getData(query);
            while(rs.next()){
                id = rs.getInt(1);
            }
            id = id + 1;
            if(!price.equals("")){
                query ="update room set status='Booked' where roomNo = '"+roomNumber+"'";
                InsertUpdateDelete.setData(query);
                query = "insert into customer(id, name, mobileNumber, nationality, gender, email, idProof, address, checkIn, roomNo, bed, roomType, pricePerDay) "
                        + "values("+id+", '"+name+"', '"+mobleNo+"', '"+nationality+"', '"+gender+"','"+email+"', '"+idProof+"', '"+address+"', '"+checkIndate+"', '"+roomNumber+"', '"+bed+"', '"+roomType+"', '"+price+"')";
                
                status = InsertUpdateDelete.setData(query);
                
            }   
            
        
        }
        catch(Exception e){
            status = e.toString();
        }
        return status;
    }

    public static TableModel checkedInCustomerTable() {
        ResultSet rs = select.getData("select id, name, mobileNumber,nationality, gender, "
                + "email, idProof,address,checkIn,roomNo,bed,roomType,pricePerDay from customer where checkOut is NULL");
        TableModel tablemodel = DbUtils.resultSetToTableModel(rs);
        
        return tablemodel;
    }

    public static ArrayList<String> getcustomerDetails(String roomNo) {
    
        ResultSet rs = select.getData("select * from customer where roomNo='"+roomNo+"' and checkOut is NULL");
            
        ArrayList<String> al = new ArrayList<String>();
        try {
            while (rs.next()) {
                
                String id = rs.getString(1);
                String name = rs.getString(2);
                String mobileNumber = rs.getString(3);
                String checkIn = rs.getString(9);
                String email = rs.getString(6);
                String pricePerDay = rs.getString(13);
                String roomType = rs.getString(12);
                String bed = rs.getString(11);
                al.add(id);
                al.add(name);
                al.add(mobileNumber);
                al.add(checkIn);
                al.add(email);
                al.add(pricePerDay);
                al.add(roomType);
                al.add(bed);
                
            }
        } catch (SQLException ex) {
            
        }        
        return al;
        
    }

    public static String vacantRoom(String roomNo) {
        String check = "";
        String query = "update room set status='Not Booked' where roomNo='"+roomNo+"'";
        check = InsertUpdateDelete.setData(query);
        
        return check;
    }

    public static void setcheckOutDetails(String totalDaysStayed, String totalAmountToPay, String checkOutDate, String id) {
        String query = "update customer set numberOfDaysStay = '"+totalDaysStayed+"', totalAmount = '"+totalAmountToPay+"', checkOut = '"+checkOutDate+"' where id = '"+id+"'";
        InsertUpdateDelete.setData(query);
    
    }
    
    public static TableModel prevCustomerTable() {
        ResultSet rs = select.getData("select *from customer where checkOut is not NULL");
        TableModel tablemodel = DbUtils.resultSetToTableModel(rs);
        return tablemodel;
    }

    public static TableModel searchPrevCustomer(String searchTxt) {
        TableModel tablemodel = null;
        ResultSet rs = select.getData("select *from customer where checkOut= '"+searchTxt+"'");
        tablemodel = DbUtils.resultSetToTableModel(rs);
        return tablemodel;
    }

    public static String deleteRecord(String id) {
        String check = "";
        check = InsertUpdateDelete.setData("DELETE FROM customer WHERE id ='"+id+"'");
        return check;
    }
    
}
