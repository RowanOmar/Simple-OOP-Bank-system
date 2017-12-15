/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;

/**
 *
 * @author fatma
 */
public interface IHashmap {

    public boolean wirte(String path, HashMap hm);
    public abstract HashMap Read(String path);
}
