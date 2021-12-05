package Controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.LoginModel;
import model.adminHomeModel;
import view.adminHomeView;
import view.loginView;

public class adminHomeController {

    private adminHomeModel model;
    private adminHomeView view;

    JTable employeeTable;

    public adminHomeController(adminHomeModel model, adminHomeView view) {
        this.model = model;
        this.view = view;
        view.setVisible(true);
        initTable();
    }

    public void initController() {
        view.getExitBtn().addActionListener(e -> exit());
        view.getLogoutBtn().addActionListener(e -> logout());
        view.getSearchBtn().addActionListener(e -> search());
        view.getRefreashBtn().addActionListener(e -> refresh());
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveEmployee();
            }

        });

    }

    private void approveEmployee() {
        String flag = "";
        int index = employeeTable.getSelectedRow();
        TableModel tableModel = employeeTable.getModel();
        String email = tableModel.getValueAt(index, 1).toString();
        String status = tableModel.getValueAt(index, 4).toString();
        if (status.equals("true")) {
            status = "false";
        } else {
            status = "true";
        }
        try {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to change the status of " + email + "", "Select", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                
                flag = model.employeeApprove(email,status);
                if(flag.equals("true")){
                    JOptionPane.showMessageDialog(view, "Status changed Successfully");
                    adminHomeModel am = new adminHomeModel();
                adminHomeView av = new adminHomeView();
                adminHomeController c = new adminHomeController(am, av);
                c.initController();
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void exit() {
        int exit = JOptionPane.showConfirmDialog(null, "Do you really want to close Applicatin?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) {
            System.exit(0);
        }
    }

    private void logout() {
        int logout = JOptionPane.showConfirmDialog(null,"Do you really want to Logout ?","Select",JOptionPane.YES_NO_OPTION);
        if(logout == 0){
            view.setVisible(false);
            view.dispose();
            LoginModel m = new LoginModel();
        loginView v = new loginView();
        loginController c = new loginController(m, v);
        c.initController();
        }
        
    }

    private void search() {
        String searchTxt = view.getSearchTextField().getText();
        employeeTable = view.getEmployeeTable();
        TableModel table = adminHomeModel.adminSearch(searchTxt);
        employeeTable.setModel(table);

    }

    private void initTable() {
        employeeTable = view.getEmployeeTable();
        TableModel table = model.adminTable();
        employeeTable.setModel(table);

    }

    private void refresh() {
        view.setVisible(false);
        view.dispose();

        adminHomeModel am = new adminHomeModel();
        adminHomeView av = new adminHomeView();
        adminHomeController c = new adminHomeController(am, av);
        c.initController();

    }

}
