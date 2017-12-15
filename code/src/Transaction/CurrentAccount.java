/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Main.Entity;
import java.util.Date;

/**
 * @author fatma
 */

public class CurrentAccount extends Interest{

     public class CAsubclass extends ChargesAndFees{
    
    Balance b;
    Date date;
    Interest i;
        public CAsubclass()
        {
            
        }   

        
     public boolean ApplyInterest(Entity en1){
      b=new Balance();
      date=new Date(); 
      b=b.getBalance(en1);
      double newamount=DoInterest(b,date);
      b.changeBalance(en1,newamount);
     return true;
    }
    
     public boolean ApplyCharges(Entity en2){
      b=new Balance();
      b=b.getBalance(en2);
      double newAmount=CalculateChargesAndFees(b);    
     b.changeBalance(en2,newAmount);
     return true;
     }
     
    }
    
}