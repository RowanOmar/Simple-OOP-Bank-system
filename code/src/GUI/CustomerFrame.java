/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import Main.*;
import Person.*;
import Transaction.*;
import java.awt.*;
/**
 *
 * @author fatma
 */
public class CustomerFrame extends JFrame{
    
    
    //Customer customer= new Customer();
   // Loan loan;
    Balance balance= new Balance();
    int ID;
    Entity entity= new Entity(ID);
    
    JPanel c;
    
    JPanel p1 = new JPanel();
    DisplayBalanceGui balancep1= new DisplayBalanceGui();
    GuiLoan p2= new GuiLoan();
    WithdrawGui p4= new WithdrawGui();
    DepositGui p3= new DepositGui();
    DisplayCustomerAccountGui p5 = new DisplayCustomerAccountGui();
    OfferGui o = new OfferGui();
    InterestGui it= new InterestGui();
    ChargesGui ch=new ChargesGui();
    JLabel id = new JLabel("Choose: ");

    JButton bloan=new JButton("Request Loan");
    JButton jb=new JButton("Display Balance");
    JButton jbaccount= new JButton("Display Account");
    JButton jbwithdraw = new JButton("Request Withdraw");
    JButton jbdeposit = new JButton ("Request Deposit");
    JButton boffer= new JButton("Display Offers");
    JButton Back;
    JButton Back2;
    JButton Back3;
    JButton Back4;
    JButton Back5;
    JButton k= new JButton("Interest");
    JButton i=new JButton("Charges");
    public CustomerFrame(String t)
    {
        setSize(550,550);
        setTitle(t);
        
        p1.setSize(500, 500);
        p1.setLayout(null);
        
        c = new JPanel();
        c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        c.setLayout(new CardLayout());
        
                k.setBounds(150, 300, 150, 30);
        k.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "8");
            }
        });
        
        p1.add(k); 
        
             i.setBounds(150, 350, 150, 30);
        i.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "9");
            }
        });
        
        p1.add(i);
        
        jbaccount.setBounds(150, 5, 150, 30);
        jbaccount.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "6");
            }
        });
        
        p1.add(jbaccount);  
        
        jb.setBounds(150, 50, 150, 30);
        jb.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "2");
            }
        });
                 p1.add(jb);  

        jbwithdraw.setBounds(150, 100, 150, 30);
        jbwithdraw.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "5");
            }
        });
                 p1.add(jbwithdraw);
                 
        jbdeposit.setBounds(150, 150, 150, 30);
        jbdeposit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "4");
            }
        });
                 p1.add(jbdeposit);                 
                 

        boffer.setBounds(150, 200, 150, 30);
         boffer.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "7");
            }
        });                 
               p1.add(boffer);  
               
        bloan.setBounds(150, 250, 150, 30);
        bloan.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "3");
            }
        }); 
                p1.add(bloan);
                
             Back=new JButton("Back");
             Back.setBounds(340, 60, 70, 30);
             Back.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 balancep1.add(Back);
                 
            Back2=new JButton("Back");
             Back2.setBounds(340, 60, 70, 30);
             Back2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 p2.add(Back2);
                 
                  Back3=new JButton("Back");
             Back3.setBounds(340, 60, 70, 30);
             Back3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 p3.add(Back3);
                 
                    Back4=new JButton("Back");
             Back4.setBounds(340, 60, 70, 30);
             Back4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 p4.add(Back4);
                 
                 Back5=new JButton("Back");
             Back5.setBounds(340, 60, 70, 30);
             Back5.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 p5.add(Back5);
                 
             c.add(p1,"1");
             c.add(balancep1,"2");
             c.add(p2,"3");
             c.add(p3,"4");
             c.add(p4,"5");
             c.add(p5,"6"); 
             c.add(o,"7");
           //  c.add(it,"8");
            // c.add(ch,"9");
                 this.setContentPane(c);
    }
  
    
}