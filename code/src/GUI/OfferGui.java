/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.Offer;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author fatma
 */
public class OfferGui extends JPanel{
 private JTextField jtf;

OfferGui(){
    setSize(550,550);
    
	setLayout(null);
jtf = new JTextField();
add(jtf);

jtf.setBounds(0,0,550,550);
jtf.setBackground(Color.BLACK);
jtf.setForeground(Color.CYAN);
jtf.setFont(new Font("duza",Font.ITALIC,18));
Offer offer = new Offer();
ArrayList out = new ArrayList();
String str ="";
out= offer.getOffers();
Iterator<Offer> i=out.iterator();
while (i.hasNext())
{
str = str+"\n"+i.next().getOfferype();
}
jtf.setText(str);

}

}
