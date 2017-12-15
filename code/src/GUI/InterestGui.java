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
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Transaction.*;
/**
 *
 * @author fatma
 */
public class InterestGui  extends JFrame {
	private JTextField Balance = new JTextField();
	private JTextField DueDate = new JTextField();
	private JTextField Years = new JTextField();
	private JLabel YourBalance = new JLabel("Enter your Balance ");
	private JLabel howyears = new JLabel("How many years  ");
	private JLabel newBalance = new JLabel("Your New Balance is ");
	private JLabel Result = new JLabel();
	private JLabel EnterDate = new JLabel("Enter Due Date");
	private JButton Calculate = new JButton("Calculate");
         public JButton appInt=new JButton("Apply Interest");
         

	public InterestGui() {
		setSize(500, 500);
		setTitle("GUI of Interest");
		Container contain = this.getContentPane();
		contain.setLayout(null);
		contain.add(Balance);
		contain.add(DueDate);
		contain.add(Years);
		contain.add(YourBalance);
		contain.add(howyears);
		contain.add(newBalance);
		contain.add(Result);
		contain.add(EnterDate);
		contain.add(Calculate);
                contain.add(appInt);
		Balance.setBounds(150, 10, 100, 30);
		YourBalance.setBounds(10, 10, 120, 30);
		howyears.setBounds(10, 50, 150, 30);
		Years.setBounds(150, 50, 100, 30);
		EnterDate.setBounds(10, 100, 100, 30);
		DueDate.setBounds(150, 100, 100, 30);
		newBalance.setBounds(10, 150, 120, 30);
		Result.setBounds(150, 150, 100, 30);
		Calculate.setBounds(10, 200, 100, 30);
		Calculate.addActionListener(new MyHandler());
		Balance.addActionListener(new MyHandler());
		Years.addActionListener(new MyHandler());
		DueDate.addActionListener(new MyHandler());
               appInt.addActionListener(new MyHandler());
		// Result.addActionListener(new MyHandler());
	}

	Interest interest = new Interest();
	Balance balance = new Balance();
	Date dueDate = new Date();

	private class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object ButtonPressed = e.getSource();
			if (ButtonPressed.equals(Calculate)) {
				double newbalance = Double.parseDouble(Balance.getText());
				balance.setAmount(newbalance);
				int year = Integer.parseInt(Years.getText());
				double result = interest.DoInterest(balance, dueDate);
				Result.setText("" + result);
			}
                        if(ButtonPressed.equals(appInt)){
                        SavingAccount sa=new SavingAccount();
                        Entity e1=new Entity(1);
                        sa.ApplyInterest(e1);   
                        }
		}

	}

//	public static void main(String args[]) {
//		GUI gui = new GUI();
//		gui.setVisible(true);
//		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	}

}
