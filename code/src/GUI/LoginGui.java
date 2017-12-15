/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Main.*;
import javax.swing.SwingUtilities;
/**
 *
 * @author fatma
 */
public class LoginGui extends JFrame{
	JLabel Welcome = new JLabel("  WELCOME TO OUR BANK");
	JLabel Username = new JLabel("Username");
	JLabel Password = new JLabel("Password");
	JTextField UserField = new JTextField();
	JPasswordField PassField = new JPasswordField();
	JButton Log_in = new JButton("Log in");
	public LoginGui()
	{
		
//		Username.setOpaque(true);
		Welcome.setForeground(Color.GREEN);
		Username.setForeground(Color.GREEN);
		Password.setForeground(Color.GREEN);
		UserField.setForeground(Color.GREEN);
		PassField.setForeground(Color.GREEN);
		Log_in.setForeground(Color.GREEN);
		UserField.setBackground(Color.BLACK);
		PassField.setBackground(Color.BLACK);
		Log_in.setBackground(Color.BLACK);
		Welcome.setBackground(Color.BLACK);
		setSize(550,550);
		setTitle("Login System");
		Container contain = this.getContentPane();
		contain.setBackground(Color.BLACK);
		contain.setLayout(null);
		contain.add(Username);
		contain.add(Password);
		contain.add(UserField);
		contain.add(PassField);
		contain.add(Log_in);
		contain.add(Welcome);
		UserField.addActionListener(new myHandler());
		PassField.addActionListener(new myHandler());
		Log_in.addActionListener(new myHandler());
		Welcome.setFont(new Font("Nader",Font.BOLD,18));
		Welcome.setBounds(10,10,250,30);
		Username.setBounds(20,40,70,30);
		Password.setBounds(20,70,70,30);
		UserField.setBounds(100,45,70,20);
		PassField.setBounds(100,80,70,20);
		Log_in.setBounds(200,125,70,30);
	}
	Login ln = new Login();
		private class myHandler implements ActionListener
		{

			Object ButtonPressed ;
			@Override
			public void actionPerformed(ActionEvent e) {

			 ButtonPressed = e.getSource();
			 if(ButtonPressed.equals(Log_in))
			 {
				 String name = UserField.getText();
				
				 
				 int pass = Integer.parseInt(PassField.getText());
				 if( ln.readfromfileEmployee(name))
				 {
					 if(pass == ln.UpEmployee.get(name)){
						 JOptionPane.showMessageDialog(null, "Logged In","Confirmation Message",JOptionPane.INFORMATION_MESSAGE);
                                                  SwingUtilities.invokeLater(new Runnable() {
                                                        public void run() {
                                                        EmployeeFrame frame = new EmployeeFrame();

                                                        frame.setVisible(true);

                                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                                        }

                                                        });
                                                                                 }
					 else
						 JOptionPane.showMessageDialog(null,"Error in Password ","Error Message",JOptionPane.ERROR_MESSAGE);
				 }
				 else  if( ln.readfromfileCustomer(name))
				 {
					 if(pass == ln.UpCustomer.get(name)){
                                             JOptionPane.showMessageDialog(null, "Logged In","Confirmation Message",JOptionPane.INFORMATION_MESSAGE);
                                             setVisible(false);
                                             
                                                SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {
                                                CustomerFrame frame = new CustomerFrame("Customer");
                                                frame.setVisible(true);

                                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                                }

                                                });
                                         }
                                         else
						 JOptionPane.showMessageDialog(null,"Error in Password ","Error Message",JOptionPane.ERROR_MESSAGE);
				 }
				 else if (ln.readfromfileAdmin(name))
				 {
					 if(pass == ln.UpAdmin.get(name)){
                                             JOptionPane.showMessageDialog(null, "Logged In","Confirmation Message",JOptionPane.INFORMATION_MESSAGE);
                                                SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {
                                                AdminGuiMenu frame=new AdminGuiMenu("Admin");
                                                frame.setVisible(true);

                                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                                                }

                                                });
						 
                                         }
					 else
						 JOptionPane.showMessageDialog(null,"Error in Password ","Error Message",JOptionPane.ERROR_MESSAGE);
				 
				 }
				 else
					 JOptionPane.showMessageDialog(null,"Error in Username ","Error Message",JOptionPane.ERROR_MESSAGE);
					
			 }
			}
			
		}

//public static void main(String [] args)
//{
//  LoginGui lg = new LoginGui();
//  lg.setVisible(true);
//  lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}
}