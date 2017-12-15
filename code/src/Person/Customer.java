/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Main.*;
import Transaction.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fatma
 */
public class Customer{
    public Account account= new Account();
    public UserInfo userInfo = new UserInfo();
    public Entity entity;
    
    public Customer(Entity entity)
    {
        this.entity=entity;
        account.balance = Balance.getBalance(entity);
        try {
            userInfo = new UserInfo().Search(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean RequestLoan(Loan loan, CustomerService CS){
        if(CS.ApplyLoan(account.balance, loan)){ 
            loan.saveLoan(loan);
            return true;
        }
        else{ 
            return false;
        }
    }
    
}
