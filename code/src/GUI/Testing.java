package GUI;

import Person.*;
import Main.Entity;
import Main.Offer;
import Transaction.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Testing {  

    public static void main(String[] args) throws Exception{
           Offer offer = new Offer();
            ArrayList array = new ArrayList();
            String str ="";
            array= offer.getOffers();
            Iterator<Offer> i=array.iterator();


        while (i.hasNext())
        {
            str = str +"\n"+i.next().getOfferype();
            
        }
        System.out.println(str);
        
//********msh rady ye3ml login*****************
       // LoginGui g = new LoginGui();
       // g.setVisible(true);
        
//************ create account, remove account fel customer service sha3'ala************
//        Entity e = new Entity (21);
//        Balance balance = new Balance();
//        UserInfo userInfo= new UserInfo();
//        userInfo.setAccType("Cuurent");
//        userInfo.setAdress("nasr city");
//        userInfo.setEmail("fatma@bank.com");
//        userInfo.setFirstName("fatima");
//        userInfo.setHomeNumber(27349);
//        userInfo.setId(e);
//        userInfo.setLastName("aboelghar");
//        userInfo.setMobileNumber(985579);
//        userInfo.setPassword("1234");
//        userInfo.setUserName("fatimaaboelghar");
//        balance.setAmount((double) 99909);
//        balance.addnewbalance(balance, e);
//        CustomerService c = new CustomerService();
//        c.CreateAccount(userInfo,balance,e);
 
        
        
//        c.RemoveAccount(e);
    }
}
