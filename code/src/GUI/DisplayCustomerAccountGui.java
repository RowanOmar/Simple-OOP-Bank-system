/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Person.*;
import Main.*;
import Transaction.Account;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fatma
 */
public class DisplayCustomerAccountGui extends JPanel {

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JTextField text1;
    JButton button1;
    UserInfo user = new UserInfo();
    Entity entity;

    public DisplayCustomerAccountGui() {
        myhandeler hand = new myhandeler();
        setSize(500, 500);
        setLayout(null);
        label1 = new JLabel("First Name : ");
        label1.setBounds(5, 10, 150, 30);
        add(label1);
        l1 = new JLabel("");
        l1.setBounds(120, 10, 150, 30);
        l1.setForeground(Color.red);
        add(l1);

        label2 = new JLabel("Last Name:");
        label2.setBounds(5, 40, 150, 30);
        add(label2);
        l2 = new JLabel("");
        l2.setBounds(120, 40, 150, 30);
        l2.setForeground(Color.red);
        add(l2);

        label3 = new JLabel("Address: ");
        label3.setBounds(5, 70, 150, 30);
        add(label3);
        l3 = new JLabel("");
        l3.setBounds(120, 70, 150, 30);
        l3.setForeground(Color.red);
        add(l3);

        label4 = new JLabel("Mobile Number : ");
        label4.setBounds(5, 100, 150, 30);
        add(label4);
        l4 = new JLabel(" ");
        l4.setBounds(120, 100, 150, 30);
        l4.setForeground(Color.red);
        add(l4);

        label5 = new JLabel("Home Number : ");
        label5.setBounds(5, 130, 150, 30);
        add(label5);
        l5 = new JLabel("");
        l5.setBounds(120, 130, 150, 30);
        l5.setForeground(Color.red);
        add(l5);

        label6 = new JLabel("User Name : ");
        label6.setBounds(5, 160, 150, 30);
        add(label6);
        l6 = new JLabel("");
        l6.setBounds(120, 160, 150, 30);
        l6.setForeground(Color.red);
        add(l6);

        label7 = new JLabel("Password : ");
        label7.setBounds(5, 190, 150, 30);
        add(label7);
        l7 = new JLabel("");
        l7.setBounds(120, 190, 150, 30);
        l7.setForeground(Color.red);
        add(l7);

        label8 = new JLabel("Email : ");
        label8.setBounds(5, 220, 150, 30);
        add(label8);
        l8 = new JLabel("");
        l8.setBounds(120, 220, 170, 30);
        l8.setForeground(Color.red);
        add(l8);
        
        label10 = new JLabel("Account balance");
        label10.setBounds(5, 250, 150, 30);
        add(label10);
        l10 = new JLabel("");
        l10.setBounds(120, 250, 150, 30);
        l10.setForeground(Color.red);
        add(l10);

        label9 = new JLabel("Enter Account No : ");
        label9.setBounds(330, 200, 150, 30);
        label9.setForeground(Color.blue);
        add(label9);
        text1 = new JTextField("");
        text1.setBounds(330, 230, 100, 25);
        add(text1);

        button1 = new JButton("Display");
        button1.setBounds(330, 270, 80, 30);
        button1.addActionListener(hand);
        add(button1);

    }

    private class myhandeler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed = e.getSource();
            try {
                if (pressed.equals(button1)) {
                    String IDD = text1.getText();
                    int ID = Integer.parseInt(IDD);
                    entity = new Entity(ID);
                    Customer customer = new Customer(entity);
                   
                    String firstn = customer.userInfo.getFirstName();
                    String lastn = customer.userInfo.getLastName();
                    String address = customer.userInfo.getAdress();
                    String usern = customer.userInfo.getUserName();
                    String password = customer.userInfo.getPassword();
                    String email = customer.userInfo.getEmail();
                    long mobilen = customer.userInfo.getMobileNumber();
                    String mobilenumber = Long.toString(mobilen);
                    int homen = customer.userInfo.getHomeNumber();
                    String homenum = Integer.toString(homen);
                    String balance = Double.toString(customer.account.balance.getAmount());
                    l1.setText(firstn);
                    l2.setText(lastn);
                    l3.setText(address);
                    l4.setText(mobilenumber);
                    l5.setText(homenum);
                    l6.setText(usern);
                    l7.setText(password);
                    l8.setText(email);
                    l10.setText(balance);
                }
            } catch (Exception error) {
                System.out.println(error.toString());
                JOptionPane.showMessageDialog(null, "error", "error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

        }
    }
}
