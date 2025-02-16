/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yihan
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewPanel
     */
    JPanel bottomPanel;
    ArrayList<User> users;

    public ViewPanel(User input, JPanel bottomPanel) {
        initComponents();
        initUsers();
        this.bottomPanel = bottomPanel;
        showTableData();

        userTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = userTable.getSelectedRow();
                    if (selectedRow != -1) {
                        // 从选择的行中获取数据并显示在文本字段中
                        String firstName = (String) userTable.getValueAt(selectedRow, 1);
                        String lastName = (String) userTable.getValueAt(selectedRow, 2);
                        String age = String.valueOf(userTable.getValueAt(selectedRow, 3));
                        firstNameTextField.setText(firstName);
                        lastNameTextField.setText(lastName);
                        ageTextField.setText(age);
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age"
            }
        ));
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setHeaderValue("First Name");
            userTable.getColumnModel().getColumn(1).setHeaderValue("Last Name");
            userTable.getColumnModel().getColumn(2).setHeaderValue("Age");
        }

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(ageLabel))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstNameLabel))
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 257, Short.MAX_VALUE))
        );

        titleLabel.setText("Patient Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(383, 383, 383))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initUsers() {
        users = DatabaseConnector.getAllUsers();
    }

    private boolean validateInput() {
        if (firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!firstNameTextField.getText().matches("[a-zA-Z\\s]+") || !lastNameTextField.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Name must contain only letters and spaces.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRow = userTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to edit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String newFirstName = firstNameTextField.getText();
        String newLastName = lastNameTextField.getText();
        int newAge = Integer.parseInt(ageTextField.getText());

        if (newAge < 0 || newAge > 150) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (newFirstName.isEmpty() || newLastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newFirstName.matches("[a-zA-Z\\s]+") || !newLastName.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "Name must contain only letters and spaces.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        model.setValueAt(newFirstName, selectedRow, 1); // 更新姓
        model.setValueAt(newLastName, selectedRow, 2);
        model.setValueAt(newAge, selectedRow, 3);

        User oldUser = users.get(selectedRow); // 假设 users 是保存所有用户数据的列表

        User newUser = new User();

        newUser.setFirstName(newFirstName);
        newUser.setLastName(newLastName);
        newUser.setAge(newAge);

        DatabaseConnector.editUser(oldUser, newUser); // 调用方法来更新数据库中的用户信息

        // 清空文本框
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        ageTextField.setText("");

        // 显示成功消息
        JOptionPane.showMessageDialog(this, "User Details Updated Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = userTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        User user = users.get(selectedRow);

        DatabaseConnector.deleteUser(user);

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.removeRow(selectedRow);

        firstNameTextField.setText("");
        lastNameTextField.setText("");
        ageTextField.setText("");

        JOptionPane.showMessageDialog(this, "User deleted successfully.");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void showTableData() {
        // 创建一个默认的表格模型
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Age");

        // 将用户数据添加到表格模型
        for (User user : users) {
            model.addRow(new Object[]{user.getId(), user.getFirstName(), user.getLastName(), user.getAge()});
        }
        // 将表格模型设置给表格组件
        userTable.setModel(model); // jTable1 是表格组件的名称，根据实际情况修改

        // 刷新表格
        model.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

}
