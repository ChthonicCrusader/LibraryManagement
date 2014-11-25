/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Tokens_1 
{
    public static void main(String a[])
    {
        Map<Integer,String> m1=new HashMap<Integer, String>();
         m1.put(1, "a");
         m1.put(2, "c");
         m1.put(3, "b");
              
         Map<Integer,String> m2=new HashMap<Integer, String>();
         m2.put(1, "aa");
         m2.put(2, "ca");
         m2.put(3, "ab");
         
         Map<Integer, Map> m3=new HashMap<Integer, Map>();
         m3.put(1,m1);
         m3.put(2, m2);
         
        Iterator<Integer> i=m3.keySet().iterator();
        
        while(i.hasNext())
        {
            Integer keys=i.next();
            System.out.println(m3.get(keys));
        }
    }
}
