/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.io.*;
import java.util.ArrayList;
import Main.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fatma
 */
public class Admin implements  Serializable,IArrayList{
    public Admin()
    {
        
    }
    public boolean addBranch (Branch branch) 
    {
        ArrayList branches=new ArrayList();
//        branches.add(branch);
//        write("branches.Bin",branches);  //irst time to write to file
//        
        branches=read("branches.Bin");
        System.out.println(branches.get(0));
        branches.add(branch);
        write("branches.Bin",branches);       
return true;
}
    
    public boolean addEmployee(Employee employee)
    {
        ArrayList employees=new ArrayList();
//        employees.add(employee);
//        
//        write("employees.Bin",employees);  //irst time to write to file
        
        employees=read("Employees.Bin");
        System.out.println(employees.get(0));
        employees.add(employee);
        write("Employees.Bin",employees);
        
return true;
}
public boolean addOffer(Offer offer)    
{
            ArrayList offers=new ArrayList();
//        offers.add(offer);
//        write("C:\\Users\\Rawan\\Desktop\\binaryfiles\\offers.Bin",offers);  //irst time to write to file
//        
        offers=read("Offers.Bin");
        System.out.println(offers.get(0));
        offers.add(offer);
        write("Offers.Bin",offers);
        
        
      return true;
    }

public Branch DisplayBranch(int code)
{
    ArrayList<Branch> branchs=new ArrayList<Branch>();
    Branch temp=new Branch();
    branchs=read("branches.Bin");
    for(Branch s: branchs)
    {
        if(s.getCode()==code)
        {
            temp=s;
        
        }   
    }
    
     return temp;
}

public Employee DisplayEmployee(int id)
{
    ArrayList<Employee> employees=new ArrayList<Employee>();
    Employee temp=new Employee();
    employees=read("Employees.Bin");
    for(Employee s: employees)
    {
        if(s.getId().getID()==id)
        {
            temp=s;
        
        }   
    }
    
     return temp;    
}
public boolean RemoveBranch(int code)
{

       ArrayList<Branch> branches=new ArrayList<Branch>();
    branches=read("branches.Bin");
    for(int i=0;i<branches.size();i++)
    {
        if(branches.get(i).getCode()==code)
        {
            branches.remove(i);
        
        } 
    }        
        write("branches.Bin",branches);

        return true;    
    }
public boolean RemoveEmployee(int id)
{

    ArrayList<Employee> employees=new ArrayList<Employee>();
    employees=read("Employees.Bin");
    for(int i=0;i<employees.size();i++)
    {
        if(employees.get(i).getId().getID()==id)
        {
            employees.remove(i);
        
        } 
    }   
        write("Employees.Bin",employees);

    return true;    
    }

    @Override
    public boolean write(String path, ArrayList array) {

      try{
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(path,false));
        out.writeObject(array);
        out.close();
        System.out.println("Done");
      }
        catch (IOException e)
        {
        System.out.println(e+" write");
        }

        return true;
    }
    

    @Override
    public ArrayList read(String path) {
        ArrayList temp=new ArrayList();
                try{
               ObjectInputStream in=new ObjectInputStream(new FileInputStream(path));
     
               temp=(ArrayList)in.readObject();
       }
        
        catch (IOException | ClassNotFoundException e) {
            Logger.getLogger(Offer.class.getName()).log(Level.SEVERE, null, e);
        
            System.out.println(e+" read");
        }
    
        return temp;
        
    }
 }
  
