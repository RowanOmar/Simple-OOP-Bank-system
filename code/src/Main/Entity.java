/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.Serializable;

/**
 *
 * @author fatma
 */
public class Entity implements Serializable{
    private int ID;
    public Entity(int id){
        this.ID=id;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
