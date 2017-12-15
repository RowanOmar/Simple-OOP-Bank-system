/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Main.*;
import Person.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatma
 */
public class OffersGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 

       ArrayList<Offer> offers = new ArrayList<Offer>();

        offers.add(new Offer("1]Open a new qualifying saving account at our Bank by December 31, 2015 using promo code BAW100N (if you currently have a personal saving account with our Bank you are not eligible for this offer)."));
        offers.add(new Offer("2]Open a new, qualified account at our bank, using the referral code REFERKRCXV, and make a qualifying deposit of $10,000 within 45 days of enrollment, and receive a $100 cash bonus. You must maintain your net deposit for at least one year or the bonus may be charged back to you. "));
        offers.add(new Offer("3]Open up a new extra20 current account with our Bank and set up direct deposit. For every month you have at least $1,500 in direct deposits credited to your account, you receive a $10 bonus."));
        offers.add(new Offer("4]Open a BankDirect Mileage saving Account and earn American Airlines AAdvantage miles."));
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Offers.Bin"));
            out.writeObject(offers);
            out.close();
        } catch (IOException e) {
            System.out.println(e + " write");
        }

    }
}
