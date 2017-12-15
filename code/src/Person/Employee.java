/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.io.*;
import Main.*;
import Transaction.*;
/**
 *
 * @author fatma
 */
public class Employee extends UserInfo implements Serializable{
private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
public Boolean ApplyLoan(Balance balance,Loan loan){
	boolean found = false ;
	double a=balance.getAmount()*0.75;
	if(loan.getLoanAmount()<a){
		found=true;
	}
	else
            found=false;
	return found;
}
	

}