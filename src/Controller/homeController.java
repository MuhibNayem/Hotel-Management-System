/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import model.CheckOutModel;
import model.LoginModel;
import model.RoomDetailsModel;
import model.checkInModel;
import model.homeModel;
import model.previousCustomerDetailsModel;
import view.CheckOutView;
import view.RoomDetailsView;
import view.checkInView;
import view.homeView;
import view.loginView;
import view.previousCustomerDetailsView;

/**
 *
 * @author muhib
 */
public class homeController {

    private homeModel model;
    private homeView view;

    

    private RoomDetailsView roomDetaileView;

    private checkInView chekinView;

    private CheckOutView chekoutView;

    private previousCustomerDetailsView prevCustomerDetailsView;

    String email;
    String pass;

    public homeController(homeModel m, homeView v) {

        model = m;
        view = v;
    }

    public void initController() {
        view.setVisible(true);
        view.getRoomDetailsBtn().addActionListener(e -> roomDetails());
        view.getCheckInBtn().addActionListener(e -> checkIn());
        view.getExitBtn().addActionListener(e -> exit());
        view.getCheckOutBtn().addActionListener(e -> checkOut());
        view.getBillDetailsBtn().addActionListener(e -> billDetails());
        view.getLogoutBtn().addActionListener(e -> logOut());
        

        
    }

    

    private void roomDetails() {
        roomDetaileView = new RoomDetailsView();
        RoomDetailsModel sm = new RoomDetailsModel();
        RoomDetailsController c = new RoomDetailsController(sm, roomDetaileView);
        c.initController();
    }

    private void checkIn() {
        chekinView = new checkInView();
        checkInModel sm = new checkInModel();
        checkInController c = new checkInController(sm, chekinView);
        c.initController();

    }
    
    private void billDetails() {
        prevCustomerDetailsView = new previousCustomerDetailsView();
        previousCustomerDetailsModel sm = new previousCustomerDetailsModel();
        previousCustomerDetailsController cc = new previousCustomerDetailsController(sm, prevCustomerDetailsView);
        cc.initController();
    }

    private void exit() {
        int exit = JOptionPane.showConfirmDialog(null, "Do you really want to close Applicatin?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) {
            System.exit(0);
        }
    }

    private void checkOut() {
        chekoutView = new CheckOutView();
        CheckOutModel m = new CheckOutModel();
        CheckOutController c = new CheckOutController(m, chekoutView);
        c.initController();
    }

    

    private void logOut() {
        int logout = JOptionPane.showConfirmDialog(null, "Do you really want to Logout ?", "Select", JOptionPane.YES_NO_OPTION);
        if (logout == 0) {
            view.setVisible(false);
            view.dispose();
            LoginModel m = new LoginModel();
            loginView v = new loginView();
            loginController c = new loginController(m, v);
            c.initController();
        }

    }
}
