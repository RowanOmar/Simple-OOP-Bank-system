/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author fatma
 */
public interface IArrayList {
     public boolean write(String path,ArrayList array);
    public ArrayList read(String path);
}
