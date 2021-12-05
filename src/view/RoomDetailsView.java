
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class RoomDetailsView extends JFrame{
    
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> roomTypeComboBox;
    private javax.swing.JComboBox<String> bedComboBox;
    private javax.swing.JLabel roomDetailsLabel;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JLabel roomTypeLabel;
    private javax.swing.JLabel bedLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomDetailsTable;
    private javax.swing.JTextField roomNumberTextField;
    private javax.swing.JTextField priceTextField;
    
    public RoomDetailsView() {
        initComponents();
    }

    private void initComponents() {
        
        setPreferredSize(new java.awt.Dimension(1266, 600));
        
        setTitle("Manage Room");

        roomDetailsLabel = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomDetailsTable = new javax.swing.JTable();
        roomNumberLabel = new javax.swing.JLabel();
        roomNumberTextField = new javax.swing.JTextField();
        roomTypeLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        bedLabel = new javax.swing.JLabel();
        roomTypeComboBox = new javax.swing.JComboBox<>();
        bedComboBox = new javax.swing.JComboBox<>();
        priceLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomDetailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        roomDetailsLabel.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        roomDetailsLabel.setForeground(new java.awt.Color(102, 0, 0));
        roomDetailsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage room.png"))); // NOI18N
        roomDetailsLabel.setText("Room Details");
        getContentPane().add(roomDetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 32, -1, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 11, 35, -1));

        roomDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(roomDetailsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 100, 594, 450));

        roomNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomNumberLabel.setText("Room Number");
        getContentPane().add(roomNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));

        roomNumberTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(roomNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 123, 455, 31));

        roomTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomTypeLabel.setText("Room Type");
        getContentPane().add(roomTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 177, -1, -1));

        priceTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 351, 455, 31));

        bedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedLabel.setText("Bed");
        getContentPane().add(bedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 256, -1, -1));

        roomTypeComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roomTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC" }));
        getContentPane().add(roomTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 455, 31));

        bedComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single ", "Double" }));
        getContentPane().add(bedComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 279, 455, 31));

        priceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceLabel.setText("Price");
        getContentPane().add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 328, -1, -1));

        addBtn.setBackground(new java.awt.Color(102, 0, 0));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add ");
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 425, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all pages background.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JButton exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public void setAddBtn(JButton addBtn) {
        this.addBtn = addBtn;
    }

    public JComboBox<String> getRoomTypeComboBox() {
        return roomTypeComboBox;
    }

    public void setRoomTypeComboBox(JComboBox<String> roomTypeComboBox) {
        this.roomTypeComboBox = roomTypeComboBox;
    }

    public JComboBox<String> getBedComboBox() {
        return bedComboBox;
    }

    public void setBedComboBox(JComboBox<String> bedComboBox) {
        this.bedComboBox = bedComboBox;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getRoomDetailsTable() {
        return roomDetailsTable;
    }

    public void setRoomDetailsTable(JTable roomDetailsTable) {
        this.roomDetailsTable = roomDetailsTable;
    }

    public JTextField getRoomNumberTextField() {
        return roomNumberTextField;
    }

    public void setRoomNumberTextField(JTextField roomNumberTextField) {
        this.roomNumberTextField = roomNumberTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public void setPriceTextField(JTextField priceTextField) {
        this.priceTextField = priceTextField;
    }
    
    
}
