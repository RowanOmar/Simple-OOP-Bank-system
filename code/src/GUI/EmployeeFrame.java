/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author fatma
 */
public class EmployeeFrame extends JFrame{
    JLabel lbe= new JLabel("are you: ");
    JButton tel= new JButton("Teller ");
    JButton cs= new JButton("Customer Service ");
    JPanel p3= new JPanel();
    JPanel c = new JPanel();
    
    EmployeeFrame (){
        setSize(550,550);
        setLayout(null);
        p3.setSize(500, 500);
        p3.setLayout(null);
        p3.setBackground(Color.BLACK);
        c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        c.setLayout(new CardLayout());
        		    lbe = new JLabel("Choose From The Following: "); lbe.setBounds(50,10,250,40);
		    lbe.setForeground(Color.cyan);
	    	lbe.setFont(new Font("duza",Font.ITALIC,18));
			       p3.add(lbe);
        add(tel); tel.setBounds(50,220,200,40);
	        tel.setForeground(Color.cyan); 
	    	tel.setBackground(Color.BLACK);
	    	tel.setFont(new Font("duza",Font.ITALIC,18));
	    	tel.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
                        if(e.getSource().equals(tel)){
	                setVisible(false);
                        TellerGui t = new TellerGui();
                          SwingUtilities.invokeLater(new Runnable()
                            {
                            public void run()
                            {
                               TellerGui frame=new TellerGui();

                               frame.setVisible(true);

                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                            }

                            });
                        }
                                    }
	        });
	    	p3.add(tel);
	        add(cs); cs.setBounds(50, 160, 200, 40);
	        cs.setForeground(Color.cyan); 
	    	cs.setBackground(Color.BLACK);
	    	cs.setFont(new Font("duza",Font.ITALIC,18));
	    	cs.addActionListener( new ActionListener()
	        {
	            public void actionPerformed(ActionEvent e)
	            {
	                       SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CustomerServiceGui frame = new CustomerServiceGui();
                frame.setVisible(true);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }

        });
	            }
	        }); 
                p3.add(cs);

                c.add(p3,"1");
                 this.setContentPane(c);
             //c.add(balancep1,"2");
    }

}
