/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Person.*;
import Transaction.*;
import Main.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fatma
 */

public class DepositGui  extends JPanel{
    JLabel label1;
    JLabel label2;
    JTextField text1;
    JTextField text2;
    JButton button1;
    teller Teller;
    Balance balance1;
    Balance balance2;
    Entity Id;
    Customer customer;
    public DepositGui()
    {
        setSize(500,500);
        setLayout(null);
        myhandeler hand=new myhandeler();
        label1=new JLabel("Enter your ID : ");
        label1.setBounds(5, 5, 150, 30);
        add(label1);
        
        text1=new JTextField("");
        text1.setBounds(100, 5, 150, 30);
        add(text1);
        
        label2=new JLabel("Enter Amount : ");
        label2.setBounds(5,50,150,30);
        add(label2);
        
        text2=new JTextField("");
        text2.setBounds(100, 50, 150, 30);
        add(text2);
        
        button1=new JButton("Save");
        button1.setBounds(200, 100, 100, 50);
        button1.addActionListener(hand);
        add(button1);
        
    }
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed=e.getSource();
            if(pressed.equals(button1))
            {
                
                String id=text1.getText();
                int idd=Integer.parseInt(id);
                Id=new Entity(idd);
                try {
                    customer = new Customer(Id);
                } catch (Exception ex) {
                    Logger.getLogger(DepositGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                String amount=text2.getText();
                Double amountt=Double.parseDouble(amount);
                Teller=new teller();        
                balance1=new Balance();               
                balance2=new Balance(); 
                balance1= balance2.getBalance(Id);
                DepositThread D=new DepositThread(customer,amountt,Teller);
                D.start();
                JOptionPane.showMessageDialog(null, "The Amount was deposited successfully");                  
            }
                
            }
        
    }

   

    
    
    
}
