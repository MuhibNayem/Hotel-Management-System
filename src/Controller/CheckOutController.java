/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.CheckOutModel;
import view.CheckOutView;

/**
 *
 * @author muhib
 */
public class CheckOutController {

    private CheckOutModel model;
    private CheckOutView view;
    ArrayList<String> customerDetails;

    JTable customerDetailsTable;
    int flag = 0;
    String roomNumber, roomType, name, checkOutDate, bed, price, id, checkInDate, email, mobileNumber, totalDaysStayed, totalAmountToPay;

    public CheckOutController(CheckOutModel model, CheckOutView view) {
        this.model = model;
        this.view = view;
    }

    public void initController() {
        view.setVisible(true);
        initTable();
        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        view.getCheckOutDateTextField().setText(myformat.format(cal.getTime()));
        view.getCloseBtn().addActionListener(e -> exit());
        view.getCheckOutBtn().addActionListener(e -> checkOut());
        view.getClearBtn().addActionListener(e -> clear());
        view.getSearchTextField().setText("");
        view.getSearchBtn().addActionListener(e -> searchCustomer());

    }

    private void exit() {
        view.setVisible(false);
        view.dispose();
    }

    private void initTable() {
        customerDetailsTable = view.getCustomerTable();
        TableModel table = model.customerTable();
        customerDetailsTable.setModel(table);
    }

    private void searchCustomer() {

        roomNumber = view.getSearchTextField().getText();
        customerDetails = model.customerDetails(roomNumber);

        view.getSearchTextField().setEditable(false);

        price = customerDetails.get(5);
        email = customerDetails.get(4);
        roomType = customerDetails.get(6);
        bed = customerDetails.get(7);
        id = customerDetails.get(0);
        checkInDate = customerDetails.get(3);
        name = customerDetails.get(1);
        mobileNumber = customerDetails.get(2);
        email = customerDetails.get(4);

        view.getCustomerNameTextField().setText(name);
        view.getMobileNumberTextField().setText(mobileNumber);
        view.getCheckInDateTextField().setText(checkInDate);
        view.getEmailTextField().setText(email);
        view.getPricePerDayTextField().setText(price);
        flag = 1;

        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();

        try {

            String dateBeforeString = checkInDate;
            java.util.Date dateBefore = myformat.parse(dateBeforeString);
            String dateAfterString = myformat.format(cal.getTime());
            java.util.Date dateAfter = myformat.parse(dateAfterString);
            long difference = dateAfter.getTime() - dateBefore.getTime();
            int noOfDaysStayed = (int) (difference / (1000 * 60 * 60 * 24));

            if (noOfDaysStayed == 0) {
                noOfDaysStayed = 1;
            }
            totalDaysStayed = String.valueOf(noOfDaysStayed);
            view.getTotalDaysStayedTextField().setText(totalDaysStayed);
            float price = Float.parseFloat(this.price);
            totalAmountToPay = String.valueOf(price * noOfDaysStayed);
            view.getAmountToPayTextField().setText(totalAmountToPay);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void checkOut() {

        if (flag != 0) {

            checkOutDate = view.getCheckOutDateTextField().getText();
            model.setFulldetails(totalDaysStayed, totalAmountToPay, checkOutDate, id);
            String check = model.setRoomVacant(roomNumber);

            String path = "F:\\MVCLearning\\MVCLearning\\invoices\\";
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("F:\\MVCLearning\\MVCLearning\\invoices\\" + id + ".pdf"));
                doc.open();
                Paragraph paragrapg1 = new Paragraph("                                                                    Spydo Tech\n");
                doc.add(paragrapg1);
                Paragraph paragrapg2 = new Paragraph("****************************************************************************************************************");
                doc.add(paragrapg2);
                Paragraph paragrapg3 = new Paragraph("\tBill ID: " + id + "\nCustomer Details:\nName: " + name + "\nMobile Number: " + mobileNumber + "\nEmail: " + email + "\n");
                doc.add(paragrapg3);
                doc.add(paragrapg2);
                Paragraph paragrapg4 = new Paragraph("\tRoom Details:\nNumber: " + roomNumber + "\nType: " + roomType + "\nBed: " + bed + "\nPricec Per Day: " + price + "");
                doc.add(paragrapg4);
                doc.add(paragrapg2);
                PdfPTable tb = new PdfPTable(4);
                tb.addCell("Check-In Date\n" + "\t" + checkInDate);
                tb.addCell("Check-Out Date\n" + "\t" + checkOutDate);
                tb.addCell("Days Stayed\n" + "\t" + totalDaysStayed);
                tb.addCell("Total Paid Amount\n" + "\t" + totalAmountToPay);
                doc.add(tb);
                doc.add(paragrapg2);
                Paragraph paragrapg5 = new Paragraph("Thank You.\nPlease visit again.");
                doc.add(paragrapg5);
                printInvoices();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();

        } else {
            JOptionPane.showMessageDialog(view, "All fields are required !!");
        }

    }

    private void clear() {
        view.setVisible(false);
        view.dispose();
        CheckOutModel m = new CheckOutModel();
        CheckOutView v = new CheckOutView();
        CheckOutController c = new CheckOutController(m, v);
        c.initController();
    }

    private void printInvoices() {
        int printPdf = JOptionPane.showConfirmDialog(null, "Do you want to print the bill ?", "Select", JOptionPane.YES_NO_OPTION);
        if (printPdf == 1) {
            view.setVisible(false);
            view.dispose();
            CheckOutModel m = new CheckOutModel();
            CheckOutView v = new CheckOutView();
            CheckOutController c = new CheckOutController(m, v);
            c.initController();
        } else {

            try {
                String newPath = "F:\\MVCLearning\\MVCLearning\\invoices\\" + id + ".pdf";
                if ((new File(newPath)).exists()) {

                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll, FileProtocolHandler " + newPath + "");

                } else {
                    System.out.println("File is not Exists.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            view.setVisible(false);
            view.dispose();
            CheckOutModel m = new CheckOutModel();
            CheckOutView v = new CheckOutView();
            CheckOutController c = new CheckOutController(m, v);
            c.initController();
        }
    }

}
