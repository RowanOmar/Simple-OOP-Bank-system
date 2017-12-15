/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author fatma
 */
public class Main {

    public static void main(String[] args){
        Welcome w = new Welcome();
        w.setBackground(Color.BLACK);
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       // InterestGui i = new InterestGui();
        //i.setVisible(true);
//        statistics s=new statistics("Statistics","Bank Account Type Statistics");
//        s.pack();
//        s.setVisible(true);
        
        
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//               // EmployeeFrame frame = new EmployeeFrame();
//                CustomerServiceGui frame = new CustomerServiceGui();
//               //TellerGui frame=new TellerGui();
//                 //      AdminGuiMenu frame=new AdminGuiMenu("Admin");
////                 CustomerFrame frame = new CustomerFrame("Customer");
//                frame.setVisible(true);
//
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            }
//
//        });
    }
}
