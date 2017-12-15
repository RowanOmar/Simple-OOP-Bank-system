/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author fatma
 */
public class Login  implements Serializable {
	public HashMap<String, Integer> UpCustomer;
    public HashMap<String, Integer> UpEmployee ;
    public HashMap<String, Integer> UpAdmin ;
    public Login() {
		UpCustomer = new HashMap<String, Integer>();
		UpCustomer.put("Nader", 1000);
		UpCustomer.put("Ramy", 1001);
		UpCustomer.put("Shady", 1002);
		UpCustomer.put("Doaa", 1003);
		UpCustomer.put("Asmaa", 1004);
		UpCustomer.put("Youmna", 1005);
		UpCustomer.put("Ibrahim", 1006);
		UpCustomer.put("Amal", 1007);
		UpCustomer.put("Ahmed", 1008);
		UpCustomer.put("Hamedo", 1009);
		UpCustomer.put("Gehan", 1010);
		UpCustomer.put("Dalia", 1011);
		UpCustomer.put("Omar", 1012);
		UpCustomer.put("Shazly", 1013);
		UpCustomer.put("Mohab", 1014);
		UpCustomer.put("Samir", 1015);
		UpCustomer.put("Mo2mn", 1016);
		UpCustomer.put("Mohamed", 1017);
		writetofileCustomer(UpCustomer);
		UpEmployee = new HashMap<String , Integer>();
		UpEmployee.put("Saleh",2000);
		UpEmployee.put("Salem",2001);
		UpEmployee.put("Gamal",2002);
		UpEmployee.put("Radwa",2003);
		UpEmployee.put("San2",2004);
		UpEmployee.put("Ayman",2005);
		UpEmployee.put("Abdelrady",2006);
		UpEmployee.put("Hazem",2007);
		UpEmployee.put("Khairy",2008);
		UpEmployee.put("Amr",2009);
		UpEmployee.put("AbdelFatah",2010);
		UpEmployee.put("Saeed",2011);
		UpEmployee.put("Sonbaty",2012);
		UpEmployee.put("Durrah",2013);
		UpEmployee.put("Mahmoud",2014);
		UpEmployee.put("Rezk",2015);
		UpEmployee.put("Ali",2016);
		UpEmployee.put("Abdullah",2017);
		writetofileEmployee(UpEmployee);
		UpAdmin = new HashMap<String , Integer>();
		UpAdmin.put("Mohamed",3000);
		UpAdmin.put("Hesham",3001);
		UpAdmin.put("Loai",3002);
		UpAdmin.put("Ammar",3003);
		UpAdmin.put("Youssef",3004);
		UpAdmin.put("Samy",3005);
		UpAdmin.put("Adel",3006);
		UpAdmin.put("Gooda",3007);
		UpAdmin.put("Medhat",3008);
		UpAdmin.put("Mona",3009);
		UpAdmin.put("Lina",3010);
		UpAdmin.put("Abdo",3011);
		UpAdmin.put("Abdelrahman",3012);
		UpAdmin.put("Hassan",3013);
		UpAdmin.put("Boody",3014);
		UpAdmin.put("Hatem",3015);
		UpAdmin.put("Mostafa",3016);
		UpAdmin.put("Reda",3017);
		writetofileAdmin(UpAdmin);

	}

	public void writetofileAdmin(HashMap<String, Integer> map) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(
					new FileOutputStream(
							"BinaryLoginAdmin.bin"));
			write.writeObject(map);
			write.close();
		} catch (Exception e) {
		}
		
		
	}

	public void writetofileCustomer(HashMap<String, Integer> map) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(
					new FileOutputStream(
							"BinaryLoginCustomer.bin"));
			write.writeObject(map);
			write.close();
		} catch (Exception e) {
		}
	}
	public void writetofileEmployee(HashMap<String, Integer> map) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(
					new FileOutputStream(
							"BinaryLoginEmployee.bin"));
			write.writeObject(map);
			write.close();
		} catch (Exception e) {
		}
	}

	public boolean readfromfileCustomer(String Name) {
		try {

			ObjectInputStream read = new ObjectInputStream(
					new FileInputStream(
							"BinaryLoginCustomer.bin"));
			HashMap<String, Integer> map2 = new HashMap<String, Integer>();
			map2 = (HashMap) read.readObject();
			if (map2.containsKey(Name)) {
//				System.out.println("Contains this key name ");
				return true;
			}
			read.close();

		} catch (Exception e) {
		}
		return false;

	}
	public boolean readfromfileEmployee(String Name) {
		try {

			ObjectInputStream read = new ObjectInputStream(
					new FileInputStream(
							"BinaryLoginEmployee.bin"));
			HashMap<String, Integer> map2 = new HashMap<String, Integer>();
			map2 = (HashMap) read.readObject();
			if (map2.containsKey(Name)) {
//				System.out.println("Contains this key name ");
				return true;
			}
			read.close();

		} catch (Exception e) {
		}
		return false;

	}
	public boolean readfromfileAdmin(String Name) {
		try {

			ObjectInputStream read = new ObjectInputStream(
					new FileInputStream(
							"BinaryLoginAdmin.bin"));
			HashMap<String, Integer> map2 = new HashMap<String, Integer>();
			map2 = (HashMap) read.readObject();
			if (map2.containsKey(Name)) {
//				System.out.println("Contains this key name ");
				return true;
			}
			read.close();

		} catch (Exception e) {
		}
		return false;

	}
/*
public static void main(String []args)
{
 Login ln = new Login();
 System.out.println(ln.readfromfileAdmin("Hassan"));
}*/
}