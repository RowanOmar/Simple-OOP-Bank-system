/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Main.*;
/**
 *
 * @author fatma
 */
public class GuiLoan extends JPanel{
    JButton b1;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;

    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    JTextField text5;
    JTextField text6;
//    String [] types={"Personal loan ","Unsecured personal loan","Secured personal loan","Auto loan ","Mortgage loan","Investment loan"};
    
    JComboBox box1;
    private Loan loan;
    private Entity iD;
    

    
    public GuiLoan()
    {
        myhandeler hand=new myhandeler();
        setSize(500,500);
        setLayout(null);
   
        label1=new JLabel("Select Loan type : ");
        label1.setBounds(5,5,200,100);
        add(label1);
        box1=new JComboBox();
        box1.addItem("Personal loan ");
        box1.addItem("Unsecured personal loan");
        box1.addItem("Secured personal loan ");
        box1.addItem("Auto loan ");
        box1.addItem("Mortgage loan");
        box1.addItem("Investment loan");
        box1.setBounds(120,45,200,25);
//        box1.addActionListener(hand);
        add(box1);
        
        
        label2=new JLabel("Enter loan Amount : ");
        label2.setBounds(5, 60, 200, 100);
        add(label2);
        
        text1=new JTextField("");
        text1.setBounds(120,95,200,25);
        add(text1);
        
        label3=new JLabel("Enter ID : ");
        label3.setBounds(5, 120, 200, 100);
        add(label3);
        
        text2=new JTextField("");
        text2.setBounds(120,160,200,25);
        add(text2);
        
        label4=new JLabel("Loan purpose: ");
        label4.setBounds(5, 180, 200, 100);
        add(label4);
        
        text3=new JTextField("");
        text3.setBounds(120,215,200,25);
        add(text3);

        label5=new JLabel("Date Prepared: ");
        label5.setBounds(5,230,200,100);
        add(label5);
        
        text4=new JTextField("");
        text4.setBounds(120, 265, 200, 25);
        add(text4);
        
        label6=new JLabel("#Account Number: ");
        label6.setBounds(5, 280, 200, 100);
        add(label6);
        
        text5=new JTextField("");
        text5.setBounds(120, 315, 200, 25);
        add(text5);
        
        label7=new JLabel("Number of Months: ");
        label7.setBounds(4,330,200,100);
        add(label7);
        
        text6=new JTextField("");
        text6.setBounds(120, 370, 200, 25);
        add(text6);
                
        
        b1=new JButton("save loan");
        b1.setBounds(155, 410, 150, 25);
        b1.addActionListener(hand);
        add(b1);
                      
    }
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed=e.getSource();
             try{
            if(pressed.equals(b1))
            {
             
                String type;
                type = box1.getSelectedItem().toString();
                
                String amount;
                amount=text1.getText();
                double amountt=Double.parseDouble(amount);
                String id;
                id=text2.getText();
                int idd=Integer.parseInt(id);
                String Purpose=text3.getText();
                String Dat=text4.getText();
                String AN=text5.getText();
                int accountnum=Integer.parseInt(AN);
                String NM=text6.getText();
                int numberofmonths=Integer.parseInt(NM);
                
                loan=new Loan();
                iD=new Entity(idd);
                loan.setId(iD);
                loan.setLoanAmount(amountt);
                loan.setLoanType(type);
                loan.setAccountNumber(accountnum);
                loan.setDate(Dat);
                loan.setNumberOfMonths(numberofmonths);
                loan.setPurpose(Purpose);
                
                loan.saveLoan(loan);
                
                 JOptionPane.showMessageDialog(null, "Loan is saved successfully");
                
            }
             }
            catch(Exception error)
       {
           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }           
        }
   
    }
    
    
}