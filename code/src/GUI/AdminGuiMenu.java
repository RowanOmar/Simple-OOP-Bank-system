/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Person.*;
import Main.*;
/**
 *
 *@author fatma
 */
public class AdminGuiMenu extends JFrame{
    private Admin admin=new Admin();
    private Branch branch;
    private Manager manager;
    private Offer offer;
    private Entity id;
    
    JPanel b1=new JPanel();
    JPanel b2=new JPanel();
    addEmployeeForm b3=new addEmployeeForm();
    GuiDisplayBranch b4=new GuiDisplayBranch();
    JPanel b5=new JPanel();
    GuiDisplayEmployee b6=new GuiDisplayEmployee();
RemoveEmployeeGui b7=new RemoveEmployeeGui();

RemoveBranchGui b8=new RemoveBranchGui();
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton back1;
    JButton back2;
    JButton back3;
    JButton back4;
    JButton back5;
    JButton back6;
    JButton back7;
    
    JTextField location;
    JTextField Bcode;
    JTextField mangerN;
    JTextField mangerid;
    JTextField salary;
    JTextField offertype;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    
    JPanel c;


    public AdminGuiMenu(String title)
    {
       
        myhandeler hand=new myhandeler();
        Font f1 = new Font("SansSerif", Font.BOLD, 12);
        
        c = new JPanel();
        c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        c.setLayout(new CardLayout());

        setSize(500,500);
        setTitle(title);   
        
        b1.setSize(500, 500);
        b1.setLayout(null);
        b2.setSize(500,500);
        b2.setLayout(null);
        b4.setSize(500, 500);
        b4.setLayout(null);
        b5.setSize(500, 500);
        b5.setLayout(null);
                
        
        button1=new JButton("Add branch");
        button1.setBounds(150, 5, 150, 30);
        button1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "2");
            }
        });
        
        b1.add(button1);
        
        button3=new JButton("Add Employee");
        button3.setBounds(150, 50, 150, 30);
         button3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "3");
            }
        });
                 b1.add(button3);
                 
             button4=new JButton("Add offer");
        button4.setBounds(150, 100, 150, 30);
         button4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "5");
            }
        });
                 b1.add(button4);  
                 
        button5=new JButton("Display Branch");
        button5.setBounds(150, 150, 150, 30);
         button5.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "4");
            }
        });
                 b1.add(button5);
                 
        button6=new JButton("Display Employee");
        button6.setBounds(150, 200, 150, 30);
         button6.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "6");
            }
        });
                 b1.add(button6);         
 
        button2=new JButton("save");
        button2.setBounds(5, 270, 90, 30);
        b2.add(button2);
        button2.addActionListener(hand);

        label1=new JLabel(" Enter branch location");
        label1.setBounds(5, 0, 150, 20);
        label1.setFont(f1);
        b2.add(label1);
        
        location=new JTextField("");
        location.setBounds(5, 25, 250, 30);
        b2.add(location);
        
        label2=new JLabel("Enter branch code ");
        label2.setBounds(5, 50, 250, 30);
        label2.setFont(f1);
        b2.add(label2);
        
        Bcode=new JTextField("");
        Bcode.setBounds(5, 75, 250, 30);
        b2.add(Bcode);
        
        label3=new JLabel("Enter manager name ");
        label3.setBounds(5, 100, 250, 30);
        label3.setFont(f1);
        b2.add(label3);
        
        mangerN=new JTextField("");
        mangerN.setBounds(5, 125, 250, 30);
        b2.add(mangerN);
        
        label4=new JLabel("Enter manager ID ");
        label4.setBounds(5, 150, 250, 30);
        label4.setFont(f1);
        b2.add(label4);
        
        mangerid=new JTextField("");
        mangerid.setBounds(5, 175, 250, 30);
        b2.add(mangerid);
        
        label5=new JLabel("Enter manager salary ");
        label5.setBounds(5, 200, 250, 30);
        label5.setFont(f1);
        b2.add(label5);
        
        
        salary=new JTextField("");
        salary.setBounds(5, 225, 250, 30);
        b2.add(salary);
        
        back1=new JButton("Back");
        back1.setBounds(340, 60, 100, 50);
                 back1.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
        b2.add(back1);
        
        
        
//        all=new JTextArea();
//        all.setSize(420,420);
        
//        JScrollPane scroll = new JScrollPane ( all );
//        scroll.setBounds(350, 0, 100, 420);
//        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
//        b4.add(scroll);
//        b4.add(all);

        
        
        label6=new JLabel("Offer Type:");
        label6.setBounds(150,100,150,30);
        b5.add(label6);
                
                
        offertype=new JTextField("");
        offertype.setBounds(150,125,150,30);
        b5.add(offertype);
        
        back2=new JButton("Back");
                back2.setBounds(340, 60, 100, 50);
                 back2.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 b5.add(back2);
                 
                 
             back3=new JButton("Back");
             back3.setBounds(340, 60, 100, 50);
             back3.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 b3.add(back3);
                 
                 
                 
            back4=new JButton("Back");
            back4.setBounds(340, 60, 100, 50);
            back4.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 b4.add(back4);
                 
                 
                 back7=new JButton("Back");
            back7.setBounds(340, 60, 100, 50);
            back7.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 b6.add(back7);
                 
                 
        back5=new JButton("Back");
        back5.setBounds(340, 60, 100, 50);
                 back5.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
        b6.add(back5); 
        b7.add(back5);
        
        button9=new JButton("Remove Branch");
         button9.setBounds(150, 250, 150, 30);
         b1.add(button9);
            button9.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "8");
            }
        });
         
          button10=new JButton("Remove Employee");
         button10.setBounds(150, 300, 150, 30);
         b1.add(button10);
            button10.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "7");
            }
        });
            
                         back6=new JButton("Back");
             back6.setBounds(340, 60, 100, 50);
             back6.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CardLayout cp = (CardLayout) c.getLayout();
                cp.show(c, "1");
            }
        });
                 b8.add(back6);
                 
        
             
        
        
        button6=new JButton("save");
        button6.setBounds(150,160,150,30);
        b5.add(button6);
        button6.addActionListener(hand);
        
        c.add(b1,"1");
        c.add(b2,"2");
        c.add(b3,"3"); 
        c.add(b4,"4");
        c.add(b5,"5");
        c.add(b6,"6");
        c.add(b7,"7");
        c.add(b8,"8");
        
        
        
        
        this.setContentPane(c);

        
}
    private class myhandeler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {  
        Object pressed=e.getSource();

        try{
            if(pressed.equals(button2))
            {      
        String loc=location.getText();       
        String cod=Bcode.getText();
        int code=Integer.parseInt(cod);
        String managername=mangerN.getText();
        String managerid=mangerid.getText();
        int manId=Integer.parseInt(managerid);
        String salaryy=salary.getText();
        double salry=Double.parseDouble(salaryy);
//        s=new Salary(salry);
//        s.calculateTaxes(salry);
//        s.calculateBonus(salry); 
        Manager manager=new Manager(managername,salry);
        id=new Entity(manId);
        manager.setId(id);
        Branch branch=new Branch(loc,code,manager);
              admin.addBranch(branch);
              JOptionPane.showMessageDialog(null, "Branch is added successfully");
            }
            if(pressed.equals(button6))
            {
                String offerr=offertype.getText();
                offer=new Offer(offerr);
                admin.addOffer(offer);
                JOptionPane.showMessageDialog(null, "offer is added successfully");
            }
            
              }
        catch(Exception error)
       {
           JOptionPane.showMessageDialog(null, "error", "error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }

        }}   }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//               AdminGuiMenu frame=new AdminGuiMenu("Admin");
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

  
