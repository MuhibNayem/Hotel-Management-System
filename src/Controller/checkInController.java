/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.checkInModel;
import view.checkInView;

/**
 *
 * @author muhib
 */
public class checkInController {

    private checkInModel model;
    private checkInView view;

    String name, nationality, email, bed, roomType, roomNum;
    String price;
    String pass, gender, address, idProof, mobileNo, checkInDate;
    JComboBox<String> roomNumberBox, updatedRoomNumberBo;
    JTextField pricefield;
    ArrayList<String> availableRooms;
    int checkDuplicateFrame = 0;

    public checkInController(checkInModel m, checkInView v) {

        model = m;
        view = v;
        initView();
        view.setVisible(true);

    }

    public void initView() {
        
           
        
        view.getCheckInDateTextField()
                .setText(model.getCheckIndate());

    }

    public void initController() {

        view.getCloseBtn().addActionListener(e -> close());
        view.getClearBtn().addActionListener(e -> clear());
        view.getGetPriceBtn().addActionListener(e -> getPrice());
        view.getAllocateRoomBtn().addActionListener(e -> allocateRoom());

        roomType = view.getRoomTypeComboBox()
                .getSelectedItem().toString();

        bed = view.getBedComboBox()
                .getSelectedItem().toString();
        roomDetails();

        view.getBedComboBox().addActionListener((ActionEvent e) -> {

            roomDetails();
        });
        view.getRoomTypeComboBox().addActionListener((ActionEvent e) -> {

            roomDetails();
        });

        view.getGenderComboBox().addActionListener((ActionEvent e) -> {
            gender = view.getGenderComboBox().getSelectedItem().toString();

        });
        view.getRoomNumberComboBox().addActionListener((ActionEvent e) -> {
            
            view.getPriceTextField()
                .setText("");
        });

    }

    private void close() {
        view.setVisible(false);
    }

    private void clear() {
        view.setVisible(false);
        checkInModel sm = new checkInModel();
        checkInView sv = new checkInView();
        checkInController c = new checkInController(sm, sv);
        c.initController();

    }

    public void roomDetails() {
        //experimental new code

        roomType = view.getRoomTypeComboBox()
                .getSelectedItem().toString();

        bed = view.getBedComboBox()
                .getSelectedItem().toString();

        availableRooms = model.setRoomNumberBox(bed, roomType);

        view.getRoomNumberComboBox().removeAllItems();
        view.getPriceTextField()
                .setText("");

        for (int i = 0; i < availableRooms.size(); i++) {
            view.getRoomNumberComboBox().addItem(availableRooms.get(i));

        }

    }

    private void allocateRoom() {
        String status="";
        if (view.getPriceTextField().getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Price need to be set !!");

        } else {

            address = view.getAddressTextField().getText();
            name = view.getNameTextField().getText();
            mobileNo = view.getMobileNoTextField().getText();
            nationality = view.getNationalityTextField().getText();
            gender = view.getGenderComboBox().getSelectedItem().toString();
            email = view.getEmailTextField().getText();
            idProof = view.getIdProofTextField().getText();
            roomNum = view.getRoomNumberComboBox().getSelectedItem().toString();
            price = view.getPriceTextField().getText();

            model.setAddress(address);
            model.setName(name);
            model.setMobleNo(mobileNo);
            model.setNationality(nationality);
            model.setGender(gender);
            model.setEmail(email);
            model.setIdProof(idProof);
            model.setRoomType(roomType);
            model.setBed(bed);
            model.setRoomNumber(roomNum);
            model.setPrice(price);

            if (name.isEmpty() || mobileNo.isEmpty() || email.isEmpty() || idProof.isEmpty() || nationality.isEmpty() || gender.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                status=model.allocateRoom();
                if(status.equals("true")){
                    JOptionPane.showMessageDialog(null, "Customer Checked-In Successfully");
                    view.setVisible(false);
                    view.dispose();
                    checkInView sv = new checkInView();
                    checkInModel sm = new checkInModel();
                    checkInController c = new checkInController(sm, sv);
                    c.initController();
                }
                else if(status.isEmpty()){
                    JOptionPane.showMessageDialog(null, "something gone wrong in database!!");
                }
                else{
                    JOptionPane.showMessageDialog(null, status);
                }
            }
        }

    }

    private void getPrice() {
        view.getPriceTextField()
                .setText(model.getRoomPrice(view.getRoomNumberComboBox().getSelectedItem().toString()));

    }

}
