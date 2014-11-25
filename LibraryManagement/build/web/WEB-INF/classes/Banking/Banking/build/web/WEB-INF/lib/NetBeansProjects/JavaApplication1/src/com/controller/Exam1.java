
package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



abstract class Customer
{
     String name;
     int id;
     String address;
     float billamount;
     String custtype;

    abstract public String getName();
    abstract public void setName(String name);
    abstract public int getId() ;
    abstract public void setId(int id);
    abstract public String getAddress();
    abstract public void setAddress(String address);
    abstract public float getBillamount();
    abstract public void setBillamount(float billamount);
    abstract public String getCusttype();
    abstract public void setCusttype(String custtype);
    
}

class DatacardCustomer extends Customer
{
 
    public DatacardCustomer() 
    {
        custtype="data";
        name=null;
        id=3422;
        address=null;
        billamount=0.0f;
        
        System.out.println("Default Information of Data Card Customer is:\n");
        System.out.println("Customer type="+custtype);
        System.out.println("Cus name= "+name);
        System.out.println("Cus id= "+id);
        System.out.println("Cus address= "+address);
        System.out.println("Cus billamount= "+billamount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public float getBillamount() {
        return billamount;
    }

  
    public void setBillamount(float billamount) {
        this.billamount = billamount;
    }


    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }
}

class WirelessCustomer extends Customer
{
  
    public WirelessCustomer() 
    {
        custtype="wireless";
        name=null;
        id=3422;
        address=null;
        billamount=0.0f;
        
        System.out.println("Default Information of Wireless Customer is:\n");
        System.out.println("Customer type="+custtype);
        System.out.println("Cus name= "+name);
        System.out.println("Cus id= "+id);
        System.out.println("Cus address= "+address);
        System.out.println("Cus billamount= "+billamount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }

    public float getBillamount() {
        return billamount;
    }

  
    public void setBillamount(float billamount) {
        this.billamount = billamount;
    }


    public String getCusttype() {
        return custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }
}
    
class Enquiry extends DatacardCustomer
{
    DatacardCustomer dcobj=new DatacardCustomer();
    Enquiry(DatacardCustomer dcobj)
    {
        this.dcobj=dcobj;
    }
   String a=dcobj.getAddress(); 
   Map<Integer,String> m1=new HashMap<Integer, String>();
   
    m1.put(1,a);
    
    
}

public class Exam1 
{
    public static void main(String args[]) throws IOException
    {
        DatacardCustomer dcCust=new DatacardCustomer();
        WirelessCustomer wlCust=new WirelessCustomer();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        dcCust.setAddress(br.readLine());
        dcCust.setName(br.readLine());
        dcCust.setBillamount(Float.parseFloat(br.readLine()));
        dcCust.setId(Integer.parseInt(br.readLine()));
        
        
        
        wlCust.setAddress(br.readLine());
        wlCust.setName(br.readLine());
        wlCust.setBillamount(Float.parseFloat(br.readLine()));
        wlCust.setId(Integer.parseInt(br.readLine()));
        
        System.out.println(" data card info is:"+
                            dcCust.getCusttype()+"\n"+
                            dcCust.getAddress()+"\n"+
                            dcCust.getName()+"\n"+
                            dcCust.getId()+"\n"+
                            dcCust.getBillamount() );
        
        
        System.out.println(" data card info is:"+
                            wlCust.getCusttype()+"\n"+
                            wlCust.getAddress()+"\n"+
                            wlCust.getName()+"\n"+
                            wlCust.getId()+"\n"+
                            wlCust.getBillamount() );
        
    }
}
