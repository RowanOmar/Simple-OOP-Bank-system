/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fatma
 */
public class Offer implements Serializable {
    private String offerype;

    public Offer(String offerype) {
        this.offerype = offerype;
    }

    public Offer() {
        
    }


    
    public String getOfferype() {
        return offerype;
    }
    ArrayList<String> offers=new ArrayList<String>();
    
    public ArrayList<Offer> getOffers(){
        ArrayList<Offer> offers=new ArrayList<Offer>();
        try {
            ObjectInputStream out= new ObjectInputStream (new FileInputStream ("Offers.Bin"));
            offers=(ArrayList<Offer>)out.readObject();
            
            out.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return offers;
    }
}