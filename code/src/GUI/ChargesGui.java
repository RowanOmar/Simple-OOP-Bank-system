/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.Entity;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Transaction.*;
import Transaction.CurrentAccount.CAsubclass;
/**
 *
 * @author fatma
 */
public class ChargesGui extends JFrame {
	private JLabel YourBalance = new JLabel("Your Balance ");
	private JTextField UBalance = new JTextField();
	private JLabel OurCharges = new JLabel("Our Charges And Fees is 2 %");
	private JLabel YourNewBalance = new JLabel("Your New Balance is ");
	private JLabel NewBalance = new JLabel();
	private JButton Calculate = new JButton("Calculate");
	private Balance balance = new Balance();
	private ChargesAndFees caf = new ChargesAndFees();
 public JButton appCh=new JButton("Apply Charges");
         
         
	public ChargesGui() {
		setSize(500, 500);
		setTitle("KNOW WHAT YOU PAY");
		Container contain = this.getContentPane();
		contain.setLayout(null);
		contain.add(YourBalance);
		contain.add(UBalance);
		contain.add(OurCharges);
		contain.add(YourNewBalance);
		contain.add(NewBalance);
		contain.add(Calculate);
                contain.add(appCh);
                
		YourBalance.setBounds(10, 10, 100, 30);
		UBalance.setBounds(120, 10, 100, 30);
		OurCharges.setBounds(10, 40, 200, 30);
		YourNewBalance.setBounds(10, 80, 120, 30);
		NewBalance.setBounds(120, 100, 120, 30);
		Calculate.setBounds(10, 150, 100, 30);
               
                appCh.setBounds(10,190,100,30);
                
                
		Calculate.addActionListener(new MyHandler());
               appCh.addActionListener(new MyHandler());
		// NewBalance.addActionListener(new MyHandler());
	}

	private class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object ButtonPressed = e.getSource();
			if (ButtonPressed.equals(Calculate)) {
				NewBalance.setText(caf.CalculateChargesAndFees(balance) + "");
				UBalance.setText(balance.getAmount() + "");
			}
                        if(ButtonPressed.equals(appCh)){
                        
                            Balance b=new Balance();
            CAsubclass c=new CurrentAccount().new CAsubclass(); 
            Entity t=new Entity(1);
          
            c.ApplyCharges(t);
                        }
                        
		}

	}

//	public static void main(String[] args) {
//		GUICharges gui = new GUICharges();
//		gui.setVisible(true);
//		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}

}
