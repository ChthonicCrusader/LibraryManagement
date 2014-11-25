/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.jmx.snmp.Enumerated;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.lang.System.*;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

public class JavaApplication1 {

    public static void main(String[] args) 
    {
        Map<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(14, "as");
        hm.put(276, "bs");
        hm.put(354, "");
        hm.put(434, "fs");
        hm.put(5, "rs");
        hm.put(7, "ts");
        hm.put(856, "ys");
        hm.put(9, "js");
        
        
        
        out.println(hm);
        Iterator<Integer> i=hm.keySet().iterator();
        out.println("HashMAp:");
        while(i.hasNext())
        {
            Integer keys=i.next();
            System.out.println(hm.get(keys));
            out.println(hm.hashCode());
            
        }
        out.println("//HashMap");
        Map<Integer, String> ht=new Hashtable<Integer, String>();
        
        ht.put(1,"re");
        ht.put(2,"re");
        ht.put(1,"re");
        ht.put(4,"re");
        ht.put(5,"re");
        ht.put(1,"re");
        ht.put(1,"re");
        ht.put(1,"re");
        
        Iterator<Integer> r=ht.keySet().iterator();
        out.println("Hash tree:");
        while(r.hasNext())
        {
            Integer keys=r.next();
            out.println(ht.get(keys));
            out.println(ht.hashCode());
        }
        
        out.println("//Hash tree:");
        
        Map<Integer, String> hTree=new TreeMap<Integer, String>();
              
        hTree.put(1, "as");
        hTree.put(2, "bs");        
        hTree.put(7, "ts");
        hTree.put(8, "ys");
        hTree.put(3, "");
        hTree.put(5, "fs");
        hTree.put(10, "rs");
        hTree.put(9, "js");
        hTree.remove(8);
       
        String hello=new String();
        
        Iterator<Integer> t=hTree.keySet().iterator();
        out.println("Hola");
        out.println(hTree);
        while(t.hasNext())
        {
            Integer keys= t.next();
            out.println(hTree.get(keys));
            out.println(hTree.hashCode());
        }
        
        out.println("Hola");
        
        
        List<Integer> l=new Vector<Integer>();
        
       
        
        
        
        
        
        
        
        
        
    }
}
