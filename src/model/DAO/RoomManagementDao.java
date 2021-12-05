/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

/**
 *
 * @author muhib
 */
public class RoomManagementDao {
    
    public static String addRoom(String roomNo, String roomType, String bed, String price) {
        String status = "";
        String flag = "";

        String query = "insert into room values('" + roomNo + "', '" + roomType + "', '" + bed + "', '" + price + "', 'Not Booked')";
        flag = InsertUpdateDelete.setData(query);
        if (flag.equals("true")) {
            status = flag;
        } else {
            status = "duplicate room for room no" + " " + roomNo + " " + " can not be created";
        }

        return status;
    }
    
}
