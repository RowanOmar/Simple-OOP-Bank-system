/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;
import java.util.ArrayList;
import Person.*;
/**
 *
 * @author fatma
 */
public class Branch implements Serializable{
   private String location;
    private int code;
    Manager manager;
    ArrayList<UserInfo> users=new ArrayList<UserInfo>();
    
     public Branch()
    {}
    
     public Branch(String location,int code,Manager manager)
    {
        this.location=location;
        this.code=code;
        this.manager=manager;
    }
 
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Manager getManager() {
        return manager;
    }
    

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }    
}
