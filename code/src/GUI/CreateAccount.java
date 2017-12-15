/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.Entity;
import Person.CustomerService;
import Person.Employee;
import Person.UserInfo;
import Transaction.Balance;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author fatma
 */

public class CreateAccount extends JPanel{
JLabel un = new JLabel("Username: ");
JLabel pw = new JLabel("Password: ");
JLabel id = new JLabel("ID: ");
JLabel mn = new JLabel("Mobile Number: ");
JLabel hn = new JLabel("Home Number: ");
JLabel fn = new JLabel("Firt Name: ");
JLabel ln = new JLabel("Last Nmae: ");
JLabel em = new JLabel("E-mail: ");
JLabel adr = new JLabel("Address: ");
JLabel at = new JLabel("Account Type: ");
JLabel bal = new JLabel("Balance: ");

JButton back = new JButton("<-Back");
JButton ok = new JButton("Ok");
JTextField tun = new JTextField("enter your Username ");
JTextField tpw = new JTextField("enter your Password ");
JTextField tid = new JTextField("enter your ID ");
JTextField tmn = new JTextField("enter your Mobile Number ");
JTextField thn = new JTextField("enter your Home Number ");
JTextField tfn = new JTextField("enter your Firt Name ");
JTextField tln = new JTextField("enter your Last Nmae ");
JTextField tem = new JTextField("enter your E-mail ");
JTextField tadr = new JTextField("enter your Address ");
JTextField tat = new JTextField("enter your Account Type ");
JTextField tbal = new JTextField("enter your balance");
CustomerService csc = new CustomerService();
UserInfo user= new UserInfo();
Balance balance = new Balance ();
Entity entity;
public CreateAccount()
{
	
	setLayout(null);

	add(tun); tun.setBounds(150, 0, 260, 30);
	tun.setFont(new Font("duza",Font.ITALIC,14));
	tun.setForeground(Color.cyan);
	tun.setBackground(Color.BLACK);
	
	add(tpw); tpw.setBounds(150, 40, 260, 30);
	tpw.setFont(new Font("duza",Font.ITALIC,14));
	tpw.setForeground(Color.cyan);
	tpw.setBackground(Color.BLACK);
	
	add(tid); tid.setBounds(150, 80, 260, 30);
	tid.setFont(new Font("duza",Font.ITALIC,14));
	tid.setForeground(Color.cyan);
	tid.setBackground(Color.BLACK);
	

	add(tmn); tmn.setBounds(150, 120, 260, 30);
	tmn.setFont(new Font("duza",Font.ITALIC,14));
	tmn.setForeground(Color.cyan);
	tmn.setBackground(Color.BLACK);
	

	add(thn); thn.setBounds(150, 160, 260, 30);
	thn.setFont(new Font("duza",Font.ITALIC,14));
	thn.setForeground(Color.cyan);
	thn.setBackground(Color.BLACK);
	

	add(tfn); tfn.setBounds(150, 200, 260, 30);
	tfn.setFont(new Font("duza",Font.ITALIC,14));
	tfn.setForeground(Color.cyan);
	tfn.setBackground(Color.BLACK);
	

	add(tln); tln.setBounds(150, 240, 260, 30);
	tln.setFont(new Font("duza",Font.ITALIC,14));
	tln.setForeground(Color.cyan);
	tln.setBackground(Color.BLACK);
	

	add(tem); tem.setBounds(150, 280, 260, 30);
	tem.setFont(new Font("duza",Font.ITALIC,14));
	tem.setForeground(Color.cyan);
	tem.setBackground(Color.BLACK);

	add(tadr);tadr.setBounds(150, 320, 260, 30);
	tadr.setFont(new Font("duza",Font.ITALIC,14));
	tadr.setForeground(Color.cyan);
	tadr.setBackground(Color.BLACK);

	add(tat); tat.setBounds(150, 360, 260, 30);
	tat.setFont(new Font("duza",Font.ITALIC,14));
	tat.setForeground(Color.cyan);
	tat.setBackground(Color.BLACK);

	add(tbal); tbal.setBounds(150, 400, 260, 30);
	tbal.setFont(new Font("duza",Font.ITALIC,14));
	tbal.setForeground(Color.cyan);
	tbal.setBackground(Color.BLACK);
	
	add(back); back.setBounds(400, 450, 150, 30);
	back.setFont(new Font("duza",Font.ITALIC,14));
	back.setForeground(Color.cyan);
	back.setBackground(Color.BLACK);
        
	add(ok); ok.setBounds(200, 450, 150, 30);
	ok.setFont(new Font("duza",Font.ITALIC,14));
	ok.setForeground(Color.cyan);
	ok.setBackground(Color.BLACK);
	ok.addActionListener(new myHandler());
        
	add(un); un.setBounds(10, 0, 260, 30);
	un.setFont(new Font("duza",Font.ITALIC,18));
	un.setForeground(Color.cyan);
	
	add(pw); pw.setBounds(10, 40, 260, 30);
	pw.setFont(new Font("duza",Font.ITALIC,18));
	pw.setForeground(Color.cyan);
	
	add(id); id.setBounds(10, 80, 260, 30);
	id.setFont(new Font("duza",Font.ITALIC,18));
	id.setForeground(Color.cyan);
	

	add(mn); mn.setBounds(10, 120, 260, 30);
	mn.setFont(new Font("duza",Font.ITALIC,18));
	mn.setForeground(Color.cyan);
	

	add(hn); hn.setBounds(10, 160, 260, 30);
	hn.setFont(new Font("duza",Font.ITALIC,18));
	hn.setForeground(Color.cyan);
	

	add(fn); fn.setBounds(10, 200, 260, 30);
	fn.setFont(new Font("duza",Font.ITALIC,18));
	fn.setForeground(Color.cyan);
	

	add(ln); ln.setBounds(10, 240, 260, 30);
	ln.setFont(new Font("duza",Font.ITALIC,18));
	ln.setForeground(Color.cyan);
	

	add(em); em.setBounds(10, 280, 260, 30);
	em.setFont(new Font("duza",Font.ITALIC,18));
	em.setForeground(Color.cyan);

	add(adr); adr.setBounds(10, 320, 260, 30);
	adr.setFont(new Font("duza",Font.ITALIC,18));
	adr.setForeground(Color.cyan);

	add(at); at.setBounds(10, 360, 260, 30);
	at.setFont(new Font("duza",Font.ITALIC,18));
	at.setForeground(Color.cyan);

	add(bal); bal.setBounds(10, 400, 260, 30);
	bal.setFont(new Font("duza",Font.ITALIC,18));
	bal.setForeground(Color.cyan);
	setBackground(Color.BLACK);
}
public static void main(String []args)
{
	CreateAccount cs = new CreateAccount();
	cs.setVisible(true);
	cs.setSize(550,550);
}
private class myHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(ok)){
           String username=tun.getText();
               String pw=tpw.getText();
               String email=tem.getText();
               String id=tid.getText();
               int idd=Integer.parseInt(id);
               String mobileN=tmn.getText();
               long mobilen=Long.parseLong(mobileN);
               String homeN=thn.getText();
               int homen=Integer.parseInt(homeN);
               String fn=tfn.getText();
               String ln=tln.getText();
               String addsr=tadr.getText();
               String acct= tat.getText();
               String b = tbal.getText();
               double ba = Double.parseDouble(b);
        user.setFirstName(fn);
        user.setLastName(ln);
        user.setUserName(username);
        user.setPassword(pw);
        user.setAdress(addsr);
        user.setEmail(email);
        user.setMobileNumber(mobilen);
        user.setHomeNumber(homen);
        user.setAccType("Employee Account");
        entity=new Entity(idd);
        user.setId(entity);
        user.setAccType(acct);
        balance.setAmount(ba);
        csc.CreateAccount(user, balance, entity);
           }
        }
    
}
}
