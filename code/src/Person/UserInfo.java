package Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import Main.*;

/**
 *
 * @author fatma
 */
public class UserInfo implements Serializable {

    private final String filePath = "bankcustomers.bin";
    private Entity id;
    private String adress;
    private long mobileNumber;
    private int homeNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userName;
    private String AccType;

    public UserInfo() {
    }

    public UserInfo(int userId, String userName, String password, String address, long mobileNumber, int homeNumber, String firstName, String lastName, String email, String accountType) {
        this.userName = userName;
        this.password = password;
        this.adress = address;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = new Entity(userId);
        this.AccType = accountType;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }

    public Entity getId() {
        return id;
    }

    public void setId(Entity id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String tostring() {
        String str;
        str = id + adress + mobileNumber + homeNumber + firstName + lastName + email;
        return str;
    }

    public  UserInfo Search(Entity id) throws ClassNotFoundException {

        //ArrayList<Object>objects=null;
        ArrayList<UserInfo> objects = new ArrayList<>();
        UserInfo o = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream Inp = new ObjectInputStream(fis);
            objects = (ArrayList) Inp.readObject();
            for (UserInfo x : objects) {
                if (x.id.getID() == id.getID()) {
                    o = x;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return o;
    }

    public boolean Remove(Entity id) throws ClassNotFoundException {

//User x=new User();
//  x=User.Search(id, "C:\\Users\\dandona\\Documents\\NetBeansProjects\\PHASE2\\bankcustomers.bin");
  ArrayList<UserInfo>objects= new ArrayList<>();
    // User o = null;
     int i;
    try{
    FileInputStream fis=new FileInputStream(filePath);
    ObjectInputStream Inp=new ObjectInputStream(fis);
    objects=(ArrayList)Inp.readObject();
    for (UserInfo x : objects) {
                if (x.id.getID() == id.getID()) {
          //o=x;  
     i= objects.indexOf(x);
     objects.remove(i);
     break;
      }   
     
    }
     ObjectOutputStream bin=new ObjectOutputStream(new FileOutputStream(filePath));
     bin.writeObject(objects);
     bin.close();
      }
     
      catch(IOException ex)
    {
        System.out.println(ex);
       // Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
    }
 

return true;
    }
public Result AccType(Entity id){

    Result R=null;  
    UserInfo x = new UserInfo();
           try {
               x = x.Search(id);
              R.setStr(x.getAccType());
               
           } 
           catch (ClassNotFoundException ex)
           {
               
               Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
           }
    
return R;
}

//public boolean  modify(int id,String filepath){
//    User x;
//    try  {
//               x=User.Search(id, filepath);
//           } 
//           catch (ClassNotFoundException ex)
//           {   
//           }
//   
//return true;
//}
public ArrayList<UserInfo> Read() throws ClassNotFoundException{
    
           ArrayList<UserInfo>objects = null;

    try
    {
       // ArrayList <byte>buffer=null;
    FileInputStream is=new FileInputStream(filePath);
    ObjectInputStream Inp=new ObjectInputStream(is);
    objects=(ArrayList<UserInfo>)Inp.readObject();
   System.out.println(((UserInfo)objects.get(0)).getFirstName());
 is.close();

    }
    catch(IOException ex)
    {
        System.out.println(ex);
    }
    return objects;
    }

 public boolean Add(UserInfo o){
 
        try {
            ArrayList<UserInfo>myobjects = o.Read();
            myobjects.add(o);
            FileOutputStream os=new FileOutputStream(filePath);
            ObjectOutputStream bin=new ObjectOutputStream(os);
            bin.writeObject(myobjects);
            bin.close();
         
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
        return true;
    }
}