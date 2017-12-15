/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.io.Serializable;
import Main.*;
/**
 *
 * @author fatma
 */
public class Manager  implements Serializable {
 
    private String name;
    private Entity id;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Entity getId() {
        return id;
    }

    public void setId(Entity id) {
        this.id = id;
    }
    public Manager() {
    }
    
    public Manager(String name, double salary) {
        this.name = name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
