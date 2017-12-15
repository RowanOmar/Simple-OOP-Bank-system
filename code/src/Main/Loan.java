/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author fatma
 */
public class Loan implements Serializable,IArrayList{
    private String loanType;
    private double loanAmount;
    private Entity id;
    private String Purpose;
    private String date;
    private int accountNumber;
    private int NumberOfMonths;
    
    public Loan()
    {
        
    }
    
    public Loan(String loanType, double loanAmount) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        
    }
    
    public int getNumberOfMonths() {
        return NumberOfMonths;
    }

    public void setNumberOfMonths(int NumberOfMonths) {
        this.NumberOfMonths = NumberOfMonths;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }


    public Entity getId() {
        return id;
    }

    public void setId(Entity id) {
        this.id = id;
    }


 
    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
 
    public boolean saveLoan(Loan loan)
    {
        ArrayList loans=new ArrayList();
//        loans.add(loan);
//        write("C:\\Users\\Rawan\\Desktop\\binaryfiles\\loans.Bin",loans);  //first time to write to file
//        
        loans=read("loans.Bin");
        System.out.println(loans.get(0));
        loans.add(loan);
        write("loans.Bin",loans);
       
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
        System.out.println(e);
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
            System.out.println(e);
        }
    
        return temp;
        
    } 
    
}
