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
import Main.*;
/**
 *
 * @author fatma
 */
public class addEmployeeForm extends JPanel{
    private Admin admin=new Admin();
    private Employee employee;
    private Entity Idd;
    
            JButton add ;
	JLabel fn ;
	JTextField tfn ;
	
	JLabel ln ;
	JTextField tln ;
	
	JLabel em ;
	JTextField tem ;
	
	JLabel id ;
	JTextField tid;
	
	JLabel mn ;
	JTextField tmn;
	
	JLabel hn ;
	JTextField thn ;
	
	JLabel sa ;
	JTextField tsa ;
	
	JLabel us ;
	JTextField tus ;
	
	JLabel pw ;
	JTextField tps ;
        
        JLabel address;
        JTextField adress;

public addEmployeeForm()
{
        myhandeler hand=new myhandeler();
         

         add = new JButton ("save");
         add.addActionListener(hand);
	 fn = new JLabel("First Name: ");
	 tfn = new JTextField ("");
	
	ln = new JLabel("Last Name: ");
	tln = new JTextField ("");
	
	 em = new JLabel("E-mail: ");
	tem = new JTextField ("");
	
	 id = new JLabel("ID: ");
	 tid = new JTextField ("");
	
	 mn = new JLabel("Mobile Number: ");
	 tmn = new JTextField ("");
	
	 hn = new JLabel("Home Number: ");
	 thn = new JTextField ("");
	
	 sa = new JLabel("Monthly Salary: ");
	 tsa = new JTextField ("");
	
	 us = new JLabel("Username: ");
	 tus = new JTextField ("");
	
	 pw = new JLabel("Password: ");
	 tps = new JTextField ("");
        
        address=new JLabel("Address: ");
         adress=new JTextField("");
         

	setLayout(null);
	add(fn); fn.setBounds(20,10,150,30);
	add(ln); ln.setBounds(20,50,150,30);
	add(id); id.setBounds(20,90,150,30);
	add(em); em.setBounds(20,130,150,30);
	add(mn); mn.setBounds(20,170,150,30);
	add(hn); hn.setBounds(20,210,150,30);
	add(sa); sa.setBounds(20,250,150,30);
	add(us); us.setBounds(20,290,150,30);
	add(pw); pw.setBounds(20,330,150,30);
        add(address);address.setBounds(20, 370, 150, 30);
	
	
	add(tfn); tfn.setBounds(150,10,150,30);
	add(tln); tln.setBounds(150,50,150,30);
	add(tid); tid.setBounds(150,90,150,30);
	add(tem); tem.setBounds(150,130,150,30);
	add(tmn); tmn.setBounds(150,170,150,30);
	add(thn); thn.setBounds(150,210,150,30);
	add(tsa); tsa.setBounds(150,250,150,30);
	add(tus); tus.setBounds(150,290,150,30);
	add(tps); tps.setBounds(150,330,150,30);
        add(adress);adress.setBounds(150, 370, 150, 30);
	add(add); add.setBounds(320, 390, 90, 40);
       
}
        private class myhandeler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object pressed=e.getSource();
            try{
            if(pressed.equals(add))
            {
               String f=tfn.getText();
               String l=tln.getText();
               String email=tem.getText();
               String id=tid.getText();
               int idd=Integer.parseInt(id);
               String mobileN=tmn.getText();
               long mobilen=Long.parseLong(mobileN);
               String homeN=thn.getText();
               int homen=Integer.parseInt(homeN);
               String salaryy=tsa.getText();
               double salary=Double.parseDouble(salaryy);
               String usern=tus.getText();
               String pass=tps.getText();
               String addsr=adress.getText();
               employee=new Employee();
               
        employee.setFirstName(f);
        employee.setLastName(l);
        employee.setUserName(usern);
        employee.setPassword(pass);
        employee.setAdress(addsr);
        employee.setEmail(email);
        employee.setMobileNumber(mobilen);
        employee.setHomeNumber(homen);
        employee.setAccType("Employee Account");
        Idd=new Entity(idd);
        employee.setId(Idd);
        employee.setSalary(salary);
        admin.addEmployee(employee);
         JOptionPane.showMessageDialog(null, "Employee is added successfully");
        
                }
            }
         catch(Exception error)
       {
           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
      
            }
        }
            
        
	

//public static void main(String [] ags){
//	addEmployeeForm form = new addEmployeeForm();
//        JFrame frame=new JFrame();
//	frame.setTitle("New Employee");
//	frame.setSize(500, 500);
//	frame.setVisible(true);
//        frame.add(form);	
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}
}
    
