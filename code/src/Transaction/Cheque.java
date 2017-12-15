/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Person.*;
import Main.*;

/**
 *
 * @author fatma
 */
public class Cheque {
	private Balance balanceTo = new Balance();
	private Balance balanceFrom = new Balance();
	private static Date CurrentDate = new Date();
	private static Date DueDate = new Date();
	private UserInfo user = new UserInfo();
	private int IDTo;
	private int IDFrom;
	private Entity entityTo = new Entity(IDTo);
	private Entity entityFrom = new Entity(IDFrom);
	private double Cheque_Amount;

	public int getIDTo() {
		return IDTo;
	}

	public void setIDTo(int iDTo) {
		IDTo = iDTo;
	}

	public int getIDFrom() {
		return IDFrom;
	}

	public void setIDFrom(int iDFrom) {
		IDFrom = iDFrom;
	}

	public Cheque() {
		
		  entityTo.setID(getIDTo()); entityFrom.setID(getIDFrom());
		 }

	public boolean CheckBalance() {
		boolean Checker = true;
		balanceFrom = balanceFrom.getBalance(entityFrom);
		if (Cheque_Amount > balanceFrom.getAmount())
			Checker = false;
		else /*if (Cheque_Amount < balanceFrom.getAmount())*/
			Checker = true;
		return Checker;
	/*	else
			System.out.println("Error in Check Balance ");
		return Checker;
*/
	}

	public boolean DoCheque(Entity entityTo, Entity entityFrom,
			double Cheque_Amount, String ddate) throws ParseException {

		if (CheckBalance() == true && CheckDate(ddate) == true) {
			balanceTo = balanceTo.getBalance(entityTo);
			balanceTo.setAmount(balanceTo.getAmount() + Cheque_Amount);
			balanceFrom = balanceFrom.getBalance(entityFrom);
			balanceFrom.setAmount(balanceFrom.getAmount() - Cheque_Amount);
			return true;
		} else {
			System.out.println("Error in Do Cheque ");

			return false;
		}
	}

	public boolean CheckDate(String DueDate) throws ParseException {

		// boolean Check ;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		Date testDate = new Date();
		if (testDate.before(df.parse(DueDate)) == true) {
			System.out.println("Invalid Date Before " + testDate);
			return false;
			// Check = false ;
			// return Check;
		} else if (testDate.before(df.parse(DueDate)) == true) {
			System.out.println("Invalid Date After " + testDate);
			// Check = false ;
			return false;
		} else /*if (testDate.equals(DueDate)) */{
			System.out.println("Valid");
			return true;
			// Check = true;
			// return Check ;
		} /*else
		{			System.out.println("Error in CheckDate ");
		 return false ;
		}*/
		// return Check ;
	}
/*public static void main(String [] args) throws ParseException
{
	int Idto = 1 , Idfrom = 3 ;
	double amount = 1.12 ;
	String date = "12/21/2015" ;
	Entity entityto = new Entity(Idto);
	Entity entityfrom = new Entity(Idfrom);
    Cheque cheque = new Cheque();
System.out.println( cheque.DoCheque(entityto,entityfrom,amount,date));
}*/
}
