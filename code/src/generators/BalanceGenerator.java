/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author fatma
 */
public class BalanceGenerator {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
              hm.put(1, new Double(3434.34));
      hm.put(2, new Double(1230.22));
      hm.put(3, new Double(1378.00));
      hm.put(4, new Double(99080.22));
      hm.put(5, new Double(19273.08));
      hm.put(6, new Double(30203.90));
      hm.put(7, new Double(7093.8));
      hm.put(8, new Double(67930));
      hm.put(9, new Double(83942));
      hm.put(10, new Double(9038));
      hm.put(11, new Double (32343.43));
      hm.put(12, new Double (473922.3));
      hm.put(13, new Double (12038));
      hm.put(14, new Double (3333));
      hm.put(15, new Double (343221));
      hm.put(16, new Double (39.023));
      hm.put(17, new Double (32243));
      hm.put(18, new Double (89333));
      hm.put(19, new Double (3443.43));
      hm.put(20, new Double (9033));
        try {
            ObjectOutputStream in=new ObjectOutputStream(new FileOutputStream("Balance.bin"));
            in.writeObject(hm);
            in.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
