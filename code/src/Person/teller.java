/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Transaction.*;

/**
 *
 * @author fatma
 */
public class teller {

    private double cash;

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public synchronized void withdraw(Customer customer, double amount) throws InterruptedException {

        Balance tempBalance;
        double tempamount;
        tempBalance = customer.account.balance.getBalance(customer.entity);
        tempamount = tempBalance.getAmount();
        tempamount -= amount;
        tempBalance.setAmount(tempamount);
        customer.account.balance.changeBalance(customer.entity, tempamount);
    }

    public synchronized void deposit(Customer customer, double amount) throws InterruptedException {
        Balance tempBalance;
        double tempamount;
        tempBalance = customer.account.balance.getBalance(customer.entity);
        tempamount = tempBalance.getAmount();
        tempamount += amount;
        tempBalance.setAmount(tempamount);
        customer.account.balance.changeBalance(customer.entity, tempamount);
    }

}
