package Transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author fatma
 */
public  class Interest {
	protected static double rateofInterest = 0.03;
	protected static final int IncInterestperyear = 1;
	protected static Date CurrentDate = new Date();
	protected static Date DueDate = new Date();
	protected static double time = 1;
	protected static double NewAmount;

	public static double DoInterest(Balance balance, Date Creationdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Calendar c = Calendar.getInstance();
		c.setTime(DueDate);
		c.add(Calendar.DATE, 0);
		DateFormat df = DateFormat.getDateInstance();
		if (sdf.format(c.getTime()).equals(df.format(CurrentDate))) {
			// rateofInterest += 0.01;
			NewAmount = balance.getAmount()
					* Math.pow((1 + (rateofInterest / IncInterestperyear)),
							IncInterestperyear * time);
		}
		// System.out.println("CurrentDate = "+df.format(CurrentDate)+"\n DueDate ="+sdf.format(c.getTime()));
		else
			System.out.println("Not Yet");
                
		return NewAmount;
	}

//	public static void main(String args[]) {
//		Balance balance = new Balance();
//		Date d1 = new Date();
//		Interest inter = new Interest();
//		System.out.println(inter.DoInterest(balance, d1));
//	}
}
