/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author fatma
 */
public class TellerGui extends JFrame
{
    JButton button1;
    JButton button2;
    JButton Back1;
    JButton back2;
    
    WithdrawGui b1=new WithdrawGui();
    DepositGui b2=new DepositGui ();
    JPanel panel=new JPanel();
        JPanel panel1=new JPanel();

    public TellerGui(){
        setSize(550,550);
        setLayout(null);
        
        panel1.setLayout(null);
        panel1.setSize(500, 500);
        
        b1.setLayout(null);
        b1.setSize(500, 500);
        
        b2.setLayout(null);
        b2.setSize(500, 500);
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new CardLayout());
//        add(panel);
                
        
        button1=new JButton("Withdraw");
        button1.setBounds(170, 150, 120, 30);
         button1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) panel.getLayout();
                cp.show(panel, "2");
            }
        });
        panel1.add(button1);
        
        button2=new JButton("Deposit");
        button2.setBounds(170, 200, 120, 30); 
        button2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) panel.getLayout();
                cp.show(panel, "3");
            }
        });
        
        panel1.add(button2);
        
        
         Back1=new JButton("Back");
        Back1.setBounds(340, 60, 100, 50);
                 Back1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) panel.getLayout();
                cp.show(panel, "1");
            }
        });
        b2.add(Back1);
        
        back2=new JButton("Back");
        back2.setBounds(340, 60, 100, 50);
                 back2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) panel.getLayout();
                cp.show(panel, "1");
            }
        });
        b1.add(back2);
        
        
        
        
        add(panel1);
        
        panel.add(panel1,"1");
        panel.add(b1,"2");
        panel.add(b2,"3");
        
                this.setContentPane(panel);

        
    }}
//    public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//               TellerGui frame=new TellerGui();
//        
//               frame.setVisible(true);
//        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            }
//            
//        });
//
//         //TODO code application logic here
//  
//}}
    

