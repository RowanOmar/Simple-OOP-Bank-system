
package Person;

import java.io.*;
import java.util.*;
import Main.*;
import Transaction.*;
import java.util.logging.*;


/**
 *
 * @author fatma
 */
public class CustomerService extends Employee implements Serializable, IHashmap,IArrayList {

    public boolean CreateAccount(UserInfo userInfo, Balance balance,Entity entity) {
      
     
     ////////////////////////
     
       ArrayList array = new ArrayList();
        array = (ArrayList)read("bankcustomers.bin");
        array.add(userInfo);
        write("bankcustomers.bin",array);
        HashMap hm = new HashMap();
        hm= (HashMap) Read("Balance.Bin");
        hm.put(entity.getID(), balance.getAmount());
        wirte("Balance.bin", hm);
        
        
        return true;
    }

    public boolean RemoveAccount(Entity id) {
        boolean found = false;
        Customer customer = new Customer(id);
        if (!found) {
            try {
                found = customer.account.balance.RemoveBalance(id);
                customer.userInfo.Remove(id);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return found;

    }

    @Override
    public boolean wirte(String path, HashMap hm) {
        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(path));
            in.writeObject(hm);
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public HashMap Read(String path) {
        ObjectInputStream out;
        HashMap hm = new HashMap();
        try {
            out = new ObjectInputStream(new FileInputStream(path));
            hm = (HashMap) out.readObject();
        } catch (IOException ex) {

            System.out.println(ex);
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        return hm;

    }

    @Override
    public boolean write(String path, ArrayList array) {
        try{
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path,false));
        out.writeObject(array);
        out.close();
      }
        catch (IOException e)
        {
        System.out.println(e+" write");
        }

        return true;
    }

    @Override
    public ArrayList read(String path) {
        ArrayList temp=new ArrayList();
                try{
               ObjectInputStream in=new ObjectInputStream(new FileInputStream(path));
     
               temp=(ArrayList)in.readObject();
       }
        
        catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, e);
        
            System.out.println(e+" read");
        }
    
        return temp;
    }

}
