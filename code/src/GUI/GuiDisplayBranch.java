/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Person.*;
import Main.*;
/**
 *
 * @author fatma
 */
public class GuiDisplayBranch  extends JPanel implements Serializable{
    JLabel label1;
    JLabel l1;
    JLabel label2;
    JLabel l2;
    JLabel label3;
    JLabel l3;
    JLabel label4;
    JLabel l4;
    JLabel label5;
    JLabel l5;
    JLabel label6;
    JTextField text1;
    JButton button1;
    private Admin admin;
    private Branch branch;
//    ID IDD;
//    private static final long serialVersionUID = 1113799434508676095L;

    
    
    public GuiDisplayBranch()
    {
        
        myhandeler hand=new myhandeler();
        setLayout(null);
        setSize(500,500);
        
        admin=new Admin();
       branch=new Branch();


        
        label1=new JLabel("Branch Location : ");
        label1.setBounds(5, 10, 150, 30);
        add(label1);
        l1=new JLabel("");
        l1.setBounds(120,10,150,30);
        l1.setForeground(Color.red);
        add(l1);
        
        label2=new JLabel("Branch code :");
        label2.setBounds(5,40,150,30);
        add(label2);
        l2=new JLabel("");
        l2.setBounds(120, 40, 150, 30);
        l2.setForeground(Color.red);
        add(l2);
        
        label3=new JLabel("Manager Name : ");
        label3.setBounds(5, 70, 150, 30);
        add(label3);
        l3=new JLabel("");
        l3.setBounds(120, 70, 150, 30);
        l3.setForeground(Color.red);
        add(l3);
        
        label4=new JLabel("Manager ID : ");
        label4.setBounds(5, 100, 150, 30);
        add(label4);
        l4=new JLabel(" ");
        l4.setBounds(120, 100, 150, 30);
        l4.setForeground(Color.red);
        add(l4);
        
        label5=new JLabel("Manager Salary: ");
        label5.setBounds(5, 130, 150, 30);
        add(label5);
        l5=new JLabel("");
        l5.setBounds(120, 130, 150, 30);
        l5.setForeground(Color.red);
        add(l5);
        
        
        label6=new JLabel("Enter code : ");
        label6.setBounds(200, 200, 150, 30);
        label6.setForeground(Color.blue);
        add(label6);
        text1=new JTextField("");
        text1.setBounds(200, 230, 100, 25);
        add(text1);
        
        button1=new JButton("Display");
        button1.setBounds(200, 270, 80, 30);
        button1.addActionListener(hand);
        add(button1);
    }
    
    private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed=e.getSource();
            try
            {
                if(pressed.equals(button1))
                {
//                    admin=new Admin();
 //                   branch=new Branch();
                    String code=text1.getText();
                    int cod=Integer.parseInt(code);
                    branch=admin.DisplayBranch(cod);
                    String location=branch.getLocation();
                    String managrn=branch.getManager().getName();
//                    System.out.println(code);
                    int iD;
                    iD=branch.getManager().getId().getID();
                    String idd=Integer.toString(iD);
                    double salry=branch.getManager().getSalary();
                    String salary=Double.toString(salry);
                    l1.setText(location);
                    l2.setText(code);
                    l3.setText(managrn);
                    l4.setText(idd);
                    l5.setText(salary);
                        
                }
                
            }
                    catch(Exception error)
       {           System.out.println("error");

           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
            
        }
        
    }
    
    
    
    
//        public static void main(String[] args) {
//            
//        GuiDisplayBranch l=new GuiDisplayBranch();
//        JFrame frame=new JFrame();
//	frame.setTitle("Display Branch");
//	frame.setSize(500, 500);
//	frame.setVisible(true);
//       frame.add(l);	
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////}
//
//        // TODO code application logic here
//    }
            
    
    
}
