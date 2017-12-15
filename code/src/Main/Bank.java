package Main;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author fatma
 */
public class Bank implements Serializable  {
    
    public String name;
    private int code;
    public int numberOfBranches;
    ArrayList<Branch> mybranches=new ArrayList<Branch>();
}
