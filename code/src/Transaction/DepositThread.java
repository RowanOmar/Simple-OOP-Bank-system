/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Person.*;
import Main.*;
/**
 *
 * @author fatma
 */
public class DepositThread extends Thread{
    private teller t;
    private Account account=new Account();
    private Entity id;
    private double amount;
    private Customer customer;
    
    public DepositThread(Customer customer,double A,teller T)
    {
        this.customer=customer;
        this.amount=A;
        this.t=T;
        
    }
        public void run(){
        try
        {
            t.deposit(customer, amount);
            System.out.println("eda3"+amount);
                        sleep(10);

        }
        catch (InterruptedException ex) {
                System.out.println(ex);
        }
    
}
    
}