package com.controller;

import com.dao.EmployeeDAO;
import com.modal.Employee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class RegisterEmployee 
{
    public static void main(String args[])
    {
        String name;
        int id;
        float salary;
        int res;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Employee emp=new Employee();
        EmployeeDAO empDAO=new EmployeeDAO();
        
        try{
            /*System.out.println("Name:");
            emp.setName(br.readLine());
            System.out.println("ID:");
            emp.setId(Integer.parseInt(br.readLine()));
            System.out.println("Salary:");
            emp.setSalary(Float.parseFloat(br.readLine()));
            
            res=empDAO.insertEmp(emp);*/
            List l=empDAO.dispAllEmp();
            Iterator<Employee> empI=l.iterator();
            
            while(empI.hasNext())
            {
                Employee e=empI.next();
                System.out.println(e.getName());
                System.out.println(e.getSalary());
                System.out.println(e.getId());
            }
            
        }
           /*catch(IOException e)
           {
               System.out.println(e);
           }*/
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
}
