package Transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author fatma
 */
public class ChargesAndFees {
	protected double ChargesFees = 0.02;
	protected double newBalance;
	protected static Date CurrentDate = new Date();
	protected static Date DueDate = new Date();

	public double CalculateChargesAndFees(Balance balance) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		Calendar c = Calendar.getInstance();
		c.setTime(DueDate);
		c.add(Calendar.DATE, 0);
		DateFormat df = DateFormat.getDateInstance();
		if (sdf.format(c.getTime()).equals(df.format(CurrentDate))) {
			newBalance = balance.getAmount() - (balance.getAmount() * ChargesFees);
		} else
			System.out.println("Not Yet");

		return newBalance;
	}
}
