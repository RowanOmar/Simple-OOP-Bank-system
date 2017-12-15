/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author fatma
 */
public class CustomerServiceGui extends JFrame{
RemoveCustomerGui g = new RemoveCustomerGui();
DisplayAllAccounts a = new DisplayAllAccounts();
CreateAccount f = new CreateAccount();
JPanel p4= new JPanel();
JPanel c = new JPanel();
JButton da;
JButton ca;
JButton rm;
JButton Back;
JLabel lbe;
CustomerServiceGui(){
    setSize(550,550);
    p4.setSize(550, 550);
    p4.setLayout(null);
    p4.setBackground(Color.black);
    
    c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        c.setLayout(new CardLayout());
    
  
	    
		    da= new JButton("Display All Accounts"); da.setBounds(50,120,230,40);
			da.setForeground(Color.cyan); 
	    	da.setBackground(Color.BLACK);
	    	da.setFont(new Font("duza",Font.ITALIC,18));
	    	da.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                CardLayout cp = (CardLayout) c.getLayout();
	                cp.show(p4, "3");
	            }
	        });
		    ca= new JButton("Create new Account"); ca.setBounds(50,180,230,40);
			ca.setForeground(Color.cyan); 
	    	ca.setBackground(Color.BLACK);
	    	ca.setFont(new Font("duza",Font.ITALIC,18));
	    	ca.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                CardLayout cp = (CardLayout) c.getLayout();
	                cp.show(c, "4");
	            }
	        });
		    rm= new JButton("Remove Account"); rm.setBounds(50,240,230,40);
			rm.setForeground(Color.cyan); 
	    	rm.setBackground(Color.BLACK);
	    	rm.setFont(new Font("duza",Font.ITALIC,18));
	    	rm.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                CardLayout cp = (CardLayout) c.getLayout();
	                cp.show(c, "2");
	            }
	        });
		
		    Back= new JButton("<- Back"); Back.setBounds(200,380,100,40);
			Back.setForeground(Color.cyan); 
	    	Back.setBackground(Color.BLACK);
	    	Back.setFont(new Font("duza",Font.ITALIC,18));
	    	Back.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                CardLayout cp = (CardLayout) c.getLayout();
	                cp.show(p4, "1");
	            }
	        });

		          
		           p4.add(da);
		           p4.add(ca);
		           p4.add(rm);
		           p4.add(Back);
                           
                           c.add(p4,"1");
                           c.add(g,"2");
                           c.add(a,"3");
                           c.add(f,"4");
                           this.setContentPane(c);
                           
}

}