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
public class Welcome extends JFrame {

    LoginGui g = new LoginGui();
  
    public Welcome() {

        setSize(550,550);
        JLabel lb = new JLabel("Welcome to our Bank :)");
        JButton jb = new JButton ("next ->");
        Container contain = this.getContentPane();
		contain.setBackground(Color.BLACK);
		contain.setLayout(null);
 
        setPreferredSize (new Dimension (550,550));
        setLayout (null);
        lb.setBounds(100,50,250,50);
    	lb.setFont(new Font("duza",Font.BOLD,20));
    	lb.setForeground(Color.green); 
    	 jb.setBounds(280, 380, 150, 50);
    	jb.setForeground(Color.GREEN); 
    	jb.setBackground(Color.BLACK);
    	jb.setFont(new Font("duza",Font.ITALIC,18));
    	setBackground(Color.BLACK);
//jb.addActionListener(new myhandler());
        jb.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                setVisible (false);
                g.setVisible(true);
                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
        add (lb);
        add (jb);              
    }
}
