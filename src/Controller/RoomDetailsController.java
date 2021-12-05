/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.RoomDetailsModel;
import view.RoomDetailsView;

/**
 *
 * @author muhib
 */
public class RoomDetailsController {
    
    private final RoomDetailsModel model;
    private final RoomDetailsView view;
    
    JTable roomDetailsTable;
    String roomNumber, roomType, bed, price;
    
    public RoomDetailsController(RoomDetailsModel model, RoomDetailsView view) {
        this.model = model;
        this.view = view;
        initTable();
        view.setVisible(true);
    }
    
    public void initController() {
        view.getExitBtn().addActionListener(e -> exit());
        view.getAddBtn().addActionListener(e -> addRoom());
        
        roomDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageRoom();
            }
            
        });
        
    }
    
    private void manageRoom() {
        String check = "";
        int index = roomDetailsTable.getSelectedRow();
        TableModel tablemodel = roomDetailsTable.getModel();
        String roomNo = tablemodel.getValueAt(index, 0).toString();
        String status = tablemodel.getValueAt(index, 4).toString();
        if (status.equals("Not Booked")) {
            try {
                int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room no of " + roomNo + "" + "?", "Select", JOptionPane.YES_NO_OPTION);
                if (choice == 0) {
                    check = model.deleteRoom(roomNo, status);
                    if (check.equals("true")) {
                        JOptionPane.showMessageDialog(view, "Room Deleted Successfully");
                        view.setVisible(false);
                        view.dispose();
                        RoomDetailsModel sm = new RoomDetailsModel();
                        RoomDetailsView sv = new RoomDetailsView();
                        RoomDetailsController c = new RoomDetailsController(sm, sv);
                        c.initController();
                    }else{
                        JOptionPane.showMessageDialog(view, check);
                    }
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Room is Booked. Can not be deleted!!");
        }
    }
    
    private void initTable() {
        roomDetailsTable = view.getRoomDetailsTable();
        TableModel table = model.roomTable();
        roomDetailsTable.setModel(table);
    }
    
    private void exit() {
        view.setVisible(false);
        view.dispose();
    }
    
private void addRoom() {
        String check = "";
        String roomNumber = view.getRoomNumberTextField().getText();
        String price = view.getPriceTextField().getText();
        String RoomType = view.getRoomTypeComboBox().getSelectedItem().toString();
        String bed = view.getBedComboBox().getSelectedItem().toString();
        model.setPrice(price);
        model.setRoomNumber(roomNumber);
        model.setRoomType(RoomType);
        model.setBed(bed);

        if (price.isEmpty() || roomNumber.isEmpty()) {
            JOptionPane.showMessageDialog(view, "All fields are required");
        } else {
            check = model.addRoom();
            if (check.equals("true")) {
                view.setVisible(false);
                view.dispose();
                JOptionPane.showMessageDialog(view, "Room added successfully !");
                RoomDetailsModel sm = new RoomDetailsModel();
                RoomDetailsView sv = new RoomDetailsView();
                RoomDetailsController c = new RoomDetailsController(sm, sv);
                c.initController();
            } else if (check.isEmpty()) {
                JOptionPane.showConfirmDialog(view, "Something wrong happaens is Database !");
            } else {
                JOptionPane.showMessageDialog(view, check);
            }
        }

    }
    
}
