/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;
import Main.Entity;
import java.util.Date;
/**
 *
 * @author fatma
 */
public class SavingAccount extends Interest {

    Balance b;
    Date date;

   public boolean ApplyInterest(Entity en)
   {
       b=new Balance();
      date=new Date(); 
      b=b.getBalance(en);
      double newamount=DoInterest(b,date);
      b.changeBalance(en,newamount);       
    return true;
    }  
}
