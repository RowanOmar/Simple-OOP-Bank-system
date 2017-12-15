/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import java.io.*;
import java.util.*;
import Main.*;
import java.util.logging.*;
/**
 *
 * @author fatma
 */
public class Balance implements IHashmap{
    private double Amount;
    private static final String filepath = "Balance.bin";
    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    public boolean changeBalance(Entity entity,double newAmount){
        HashMap hm= new HashMap();
        boolean found = false;
        hm= Read(filepath);
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            if((int) me.getKey()== entity.getID()){
                found = true;
                Amount = newAmount;
                hm.put(entity.getID(), newAmount);
                
                wirte(filepath,hm);
            }
        }
        
        return found;
    }
    public static Balance getBalance(Entity entity)
    {
        Balance balance=new Balance();
        HashMap hm = new HashMap();
        hm= new Balance().Read(filepath);
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me= (Map.Entry) i.next();
            if((int) me.getKey() == entity.getID()){
                balance.setAmount((Double) me.getValue());
            }
        }
        return balance;
    }
     public boolean addnewbalance(Balance balance,Entity entity)
    {
        HashMap hm = new HashMap();
        hm=Read(filepath);
        hm.put(entity.getID(), balance.getAmount());
        wirte(filepath,hm);
        return true;
    }
     public boolean RemoveBalance (Entity entity){
         boolean done=false;
        HashMap hm = new HashMap();
        hm=Read(filepath);
        Set set = hm.entrySet();
        Iterator it = set.iterator();
        for(int i=0;i<hm.size();i++)
        {
            Map.Entry me= (Map.Entry) it.next();
            if((int) me.getKey() == entity.getID()){
                hm.remove(me.getKey());
            } 
        }
        wirte(filepath,hm);
        return done;
     }
     
    @Override
    public boolean wirte(String path, HashMap hm) {   
        ObjectOutputStream in;
        try {
            in = new ObjectOutputStream(new FileOutputStream(path));
            in.writeObject(hm);
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return true;
    }

    
    public HashMap Read(String path) {
         ObjectInputStream out;
        HashMap hm = new HashMap();
        try {
            out = new ObjectInputStream(new FileInputStream(path));
             hm = (HashMap) out.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Balance.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hm;
    }
}