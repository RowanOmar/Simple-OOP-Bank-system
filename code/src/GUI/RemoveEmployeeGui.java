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
/**
 *
 * @author fatma
 */
public class RemoveEmployeeGui extends JPanel{
    JLabel label1;
    JTextField text1;
    JButton button1;
     Admin admin=new Admin();
    public RemoveEmployeeGui(){
        myhandeler hand=new myhandeler();
        setSize(500,500);
        setLayout(null);
        label1=new JLabel("Enter Employee's ID: ");
        label1.setBounds(10, 150, 150, 30);
        add(label1);
                
        text1=new JTextField();
        text1.setBounds(135, 150, 100, 30);
        add(text1);
        
        button1=new JButton("Remove");
        button1.setBounds(135,200,150,30);
        button1.addActionListener(hand);
        add(button1);
        
    }
        
        private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed=e.getSource();
            try{
                
            
            if(pressed.equals(button1))
            {
                String idd=text1.getText();
                int id=Integer.parseInt(idd);
                admin.RemoveEmployee(id);
                JOptionPane.showMessageDialog(null, "Employee is removed successfully");
                
            }
        }
              catch(Exception error)
       {
           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
            
        }
            
        }
                
        
    
//    public static void main(String [] ags){
//	RemoveEmployeeGui form = new RemoveEmployeeGui();
//        JFrame frame=new JFrame();
//	frame.setTitle("Remove Employee");
//	frame.setSize(500, 500);
//	frame.setVisible(true);
//        frame.add(form);	
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}
//    
}
