/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.DAO.TableManipulationDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author muhib
 */
public class checkInModel {
    
    private String name;
    private String mobleNo;
    private String nationality;
    private String gender;
    private String email;
    private String idProof;
    private String address;
    private String checkIndate;
    private String price;
    private String roomType;
    private String roomNumber;
    private String bed;
    private String initialBed;
    private String initialRoomType;
    
    ArrayList<String> room;
    

    public checkInModel() {
        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        this.checkIndate = myformat.format(cal.getTime());
        
        
        
    }
    public ArrayList setRoomNumberBox(String bed, String roomType) {
        
        room = TableManipulationDAO.getRoomNumber(bed, roomType);
        
        return room;
    }
    
    
    public String getRoomPrice(String roomNo) {
        this.price = TableManipulationDAO.getPrice(roomNo);
        return price;
    }

    public checkInModel(String name, String mobleNo, String nationality, String gender, String email, String idProof, String address, String checkIndate, String price, String roomType, String roomNumber, String bed) {
        this.name = name;
        this.mobleNo = mobleNo;
        this.nationality = nationality;
        this.gender = gender;
        this.email = email;
        this.idProof = idProof;
        this.address = address;
        this.price = price;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bed = bed;
        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        this.checkIndate = myformat.format(cal.getTime());
        
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobleNo() {
        return mobleNo;
    }

    public void setMobleNo(String mobleNo) {
        this.mobleNo = mobleNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCheckIndate() {
        return checkIndate;
    }

    public void setCheckIndate(String checkIndate) {
        this.checkIndate = checkIndate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     *
     * @param roomNumber
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getInitialBed() {
        return initialBed;
    }

    public void setInitialBed(String initialBed) {
        this.initialBed = initialBed;
    }

    public String getInitialRoomType() {
        return initialRoomType;
    }

    public void setInitialRoomType(String initialRoomType) {
        this.initialRoomType = initialRoomType;
    }
    
    public String allocateRoom() {
        String status="";
        
        status = TableManipulationDAO.allocateRoom(name,mobleNo,nationality,gender,email,idProof,address,checkIndate,roomNumber,bed,roomType,price);
               
        return status;
    }

}
