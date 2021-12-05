
package model;

import model.DAO.RoomManagementDao;
import model.DAO.TableManipulationDAO;
import javax.swing.JTable;
import javax.swing.table.TableModel;


public class RoomDetailsModel {
    private String roomNumber;
    private String roomType;
    private String bed;
    private String price;
    private JTable roomTable;

    public RoomDetailsModel() {
    }

    public RoomDetailsModel(String roomNumber, String roomType, String bed, String price, JTable roomTable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.bed = bed;
        this.price = price;
        this.roomTable = roomTable;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public JTable getRoomTable() {
        return roomTable;
    }

    public void setRoomTable(JTable roomTable) {
        this.roomTable = roomTable;
    }
    
    public TableModel roomTable() {
        TableModel table = null;
        table = TableManipulationDAO.roomTable();
        return table;
    }
    
    public String addRoom() {
        String check="";
        check = RoomManagementDao.addRoom(roomNumber, roomType, bed, price);
        return check;
    }

    public String deleteRoom(String roomNo, String status) {
        String check="";
        check = TableManipulationDAO.deleteRoom(roomNo, status);
        return check;
    }
    
}
