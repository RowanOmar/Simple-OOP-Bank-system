/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Person.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatma
 */
public class UsersGenerator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args){
    
ArrayList<UserInfo>myusers=new ArrayList<UserInfo>();
   UserInfo u1=new UserInfo(1,"dodo","dodo123","68 AbdelazizFymy",01066753,26377499,"donya","ahmed","dodo@yahoo.com","current");
   UserInfo u2=new UserInfo(2,"7amada","7amada234","34 Elmanyal",01234542,33454678,"mohamed","samir","7amada@gmail.com","saving");
   UserInfo u3=new UserInfo(3,"messi","messi2010","58 A elshorok",01123433,33456476,"samy","saeed","messi2000@yahoo.com","current");
   UserInfo u4=new UserInfo(4,"miro","miro2005","67 elnozha",01254356,335312456,"amira","ahmed","miro@yahoo.com","saving");
   UserInfo u5=new UserInfo(5,"sasso","sasso5555","56 ein shams",012432567,32157865,"sara","saad","sasso@hotmailcom","current");
   UserInfo u6=new UserInfo(6,"saloma","saloma2244","63 B futureCity",01234354,22543795,"salma","Ahmed","saloma44@windowslive.com","saving");
   UserInfo u7=new UserInfo(7,"bebo","bebo1996","45 A almaza",01326547,44321657,"Abdelrahman","mohamed","bebo96@hotmail.com","current");
   UserInfo u8=new UserInfo(8,"mido","mido771","31 B eldokky",01543645,21354376,"Ahmed","hamdy","mido19@gmail.com","saving");
   UserInfo u9=new UserInfo(9,"tito","tito553","39 A elmarghani",0154227,33537813,"mostafa","salah","tito99@yahoo.com","current");
   UserInfo u10=new UserInfo(10,"dandona","dandona2004","44 abdelaziz fahmy",01276537,22875437,"donya","adel","dandona24@gmail.com","saving");
   UserInfo u11=new UserInfo(11,"monmon","monmon977","23 A elrehab",01143265,23318976,"omnya","samy","monmon1997@miuegypt.edu.eg","current");
   UserInfo u12=new UserInfo(12,"yoyo","yoyo985","46 B elzaiton",01143256,44326789,"aya","mohamed","yoyo1985@gmail.com","saving");
   UserInfo u13=new UserInfo(13,"didi","didi995","12 A eltahrir",01143267,22443377,"diana","mohamed","didi@gmal.com","current");
   UserInfo u14 =new UserInfo(14,"battot","battot2004","42 B 6october",01243255,22341188,"fatma","Ahmed","battot24@hotmail.com","saving");
   UserInfo u15=new UserInfo(15,"samora","samora996","77 A elnozha",01276432,32428796,"samar","saeed","samora1996@hotmail.com","current");
   UserInfo u16=new UserInfo(16,"remo","remo995","29 gesrElSuez",01324564,2265467,"reem","masod","remo1995@gmail.com","saving");
   UserInfo u17=new UserInfo(17,"shosho","shosho973","86 AhmedEbnKathir",01265432,22316782,"shereen","Ali","shosho@yahoo.com","current");
   UserInfo u18=new UserInfo(18,"dondon","dondon994","11 B elhegaz",01143253,21134534,"dina","zyad","dondon@gmail.com","saving");
   UserInfo u19=new UserInfo(19,"shimo","shimo982","19 B elnozhaElgdida",01146523,22138897,"shimaa","adel","shimo82@hotmail.com","current");
   UserInfo u20=new UserInfo(20,"fofa","fofa970","14 B eltagamo'Elkhames",01132454,33431167,"fawzy","mohamed","fofa70@hotmail.com","saving");
   

    myusers.add(u1);
   myusers.add(u2);
   myusers.add(u3);
   myusers.add(u4);
   myusers.add(u5);
   myusers.add(u6);
   myusers.add(u7);
   myusers.add(u8);
   myusers.add(u9);
   myusers.add(u10);
   myusers.add(u11);
   myusers.add(u12);
   myusers.add(u13);
   myusers.add(u14);
   myusers.add(u15);
   myusers.add(u16);
   myusers.add(u17);
   myusers.add(u18);
   myusers.add(u19);
   myusers.add(u20);

   
   ObjectOutputStream bin;
    try {
        bin = new ObjectOutputStream(new FileOutputStream("bankcustomers.bin"));
           bin.writeObject(myusers);
  bin.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(UsersGenerator.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(UsersGenerator.class.getName()).log(Level.SEVERE, null, ex);
    }

   
}
}

   