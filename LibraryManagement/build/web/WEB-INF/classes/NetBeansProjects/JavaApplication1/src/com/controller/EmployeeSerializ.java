/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.modal.Employee;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author admin
 */ 
public class EmployeeSerializ 
{
    public static void main(String aks[]) throws Exception
    {
        Employee emp=new Employee();
        emp.setName("Hamma");
        emp.setEmpId(23);
        emp.setSalaray(35355);
        
        
        FileOutputStream fout=new FileOutputStream("C:/out.txt");
        ObjectOutputStream s=new ObjectOutputStream(fout);
        s.writeObject(emp);
        
        s.flush();
        fout.close();
        s.close();
        
        FileInputStream fin=new FileInputStream("C:/out.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        
        //String today=(String)oin.readObject();
        
        Employee outEmp=(Employee)oin.readObject();
        oin.close();
        fin.close();
        
        System.out.println("Name="+outEmp.getName());    
        System.out.println("Name="+outEmp.getEmpId());
        System.out.println("Name="+outEmp.getSalaray());
        
        
    }
}
