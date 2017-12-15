/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Person.*;
/**
 *
 *@author fatma
 */
public class WithdrawThread extends Thread{
    private teller t;
    private double amount;
    private Customer customer;
    
    public WithdrawThread(Customer customer,double A,teller T)
    {
        this.customer=customer;
        this.amount=A;
        this.t=T;
        
    }
    public void run(){
        try
        {
            t.withdraw(customer, amount);
            System.out.println("sa7abt"+amount);
                        sleep(10);

        }
        catch (InterruptedException ex) {
                System.out.println(ex);
        }
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
