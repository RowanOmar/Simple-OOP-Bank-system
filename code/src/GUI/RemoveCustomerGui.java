/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.Entity;
import Person.CustomerService;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author fatma
 */
public class RemoveCustomerGui extends JPanel{
    JLabel lb1;
    JLabel lb2;
    JTextField tln = new JTextField ("");

    JLabel fn = new JLabel("Enter your ID");
    Entity entity;
    JButton jb = new JButton("Ok");
    public RemoveCustomerGui (){
        
        setSize(500,500);
        setLayout(null);

	add(fn); fn.setBounds(20,50,150,30);
        
        add(jb);jb.setBounds(280, 150, 50, 30);
        lb1 = new JLabel();
        lb1.setBounds(20, 190, 150, 30);
        add(lb1);
        lb2= new JLabel();
        lb2.setBounds(190, 190, 150, 30);
        add(lb2);
        tln.setBounds(190, 110, 150, 30);
        add(tln);
        jb.addActionListener(new myHandler());
    }
    private class myHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if (e.getSource().equals(jb)){
                entity = new Entity(Integer.parseInt(tln.getText()));
                CustomerService c = new CustomerService();
                c.RemoveAccount(entity);
                    System.out.println("Done! ");
                }
            }
            catch(Exception error)
            {
                System.out.println(error);
                JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    
    }
}

