package Controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.previousCustomerDetailsModel;
import view.customConfirmationPanel;
import view.previousCustomerDetailsView;

public class previousCustomerDetailsController {

    private previousCustomerDetailsModel model;
    private previousCustomerDetailsView view;

    JTable prevCustomerDetailsTable;
    //String roomNumber, roomType, name, checkOutDate, bed, price, id, checkInDate, email, mobileNumber, totalDaysStayed, totalAmountToPay;

    public previousCustomerDetailsController(previousCustomerDetailsModel model, previousCustomerDetailsView view) {
        this.model = model;
        this.view = view;
        initTable();

    }

    public void initController() {
        view.setVisible(true);
        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        view.getSearchTextField().setText(myformat.format(cal.getTime()));

        view.getCloseBtn().addActionListener(e -> exit());

        view.getRefreshBtn().addActionListener(e -> refreash());

        view.getSearchBtn().addActionListener(e -> searchCustomer());
        prevCustomerDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewInvoice();
            }
        });

    }

    private void initTable() {
        prevCustomerDetailsTable = view.getPreviousCustomerTable1();
        TableModel table = model.prevCustomerTable();
        prevCustomerDetailsTable.setModel(table);
    }

    private void searchCustomer() {
        String searchTxt = view.getSearchTextField().getText();
        prevCustomerDetailsTable = view.getPreviousCustomerTable1();
        TableModel table = model.prevCustomerSearch(searchTxt);
        prevCustomerDetailsTable.setModel(table);
    }

    private void exit() {
        view.setVisible(false);
        view.dispose();
    }

//    private void viewInvoice() {
//        int index = prevCustomerDetailsTable.getSelectedRow();
//        TableModel model = prevCustomerDetailsTable.getModel();
//        String id = model.getValueAt(index, 0).toString();
//        
//        try{
//            String newPath = "F:\\MVCLearning\\MVCLearning\\invoices\\"+id+".pdf";
//                if((new File(newPath)).exists()){
//                    Process p = Runtime
//                            .getRuntime()
//                            .exec("rundll32 url.dll, FileProtocolHandler "+newPath+"");
//                }
//                else
//                    System.out.println("File is not Exists.");
//        
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    private void viewInvoice() {
        int index = prevCustomerDetailsTable.getSelectedRow();
        TableModel tableModel = prevCustomerDetailsTable.getModel();
        String id = tableModel.getValueAt(index, 0).toString();
        model.setId(id);
        try {
            int choice = customConfirmationPanel.initView("Open Invoice","Delete Record");
            if (choice == 1) {
                String check = model.deleteRecord();
                if (check.equals("true")) {
                    JOptionPane.showMessageDialog(view, "Record Deleted Successfully");
                    view.setVisible(false);
                    view.dispose();
                    previousCustomerDetailsModel sm = new previousCustomerDetailsModel();
                    previousCustomerDetailsView sv = new previousCustomerDetailsView();
                    previousCustomerDetailsController c = new previousCustomerDetailsController(sm, sv);
                    c.initController();

                } else {
                    JOptionPane.showMessageDialog(view, check);
                }

            } else if (choice == 0) {
                try {
                    String newPath = "F:\\MVCLearning\\MVCLearning\\invoices\\" + id + ".pdf";
                    if ((new File(newPath)).exists()) {
                        Process p = Runtime
                                .getRuntime()
                                .exec("rundll32 url.dll, FileProtocolHandler " + newPath + "");
                    } else {
                        JOptionPane.showMessageDialog(view, "File does not exist");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void refreash() {
        view.setVisible(false);
        view.dispose();
        previousCustomerDetailsModel sm = new previousCustomerDetailsModel();
        previousCustomerDetailsView sv = new previousCustomerDetailsView();
        previousCustomerDetailsController c = new previousCustomerDetailsController(sm, sv);
        c.initController();
    }

}
