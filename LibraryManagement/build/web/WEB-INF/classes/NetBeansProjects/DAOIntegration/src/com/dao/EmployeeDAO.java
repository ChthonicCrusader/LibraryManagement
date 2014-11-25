package com.dao;
import com.factory.DBFactory;
import com.modal.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO 
{
    int result;    
    Connection con;
    PreparedStatement ps;

    public EmployeeDAO() 
    {
        DBFactory d=new DBFactory();
        con=d.getOracleConnection();
    }
    
    public int insertEmp(Employee e) throws SQLException
    {
        ps=con.prepareStatement("insert into employee values(?,?,?,null,null)");
        ps.setString(1,e.getName());
        ps.setInt(2,e.getId());
        ps.setFloat(3,e.getSalary());
       
        return ps.executeUpdate();   
    }
    
    public List<Employee> dispAllEmp() throws SQLException
    {
        ResultSet results;
        Employee emp;
        
            List<Employee> l=new ArrayList<Employee>();
            ps=con.prepareStatement("select * from employee");
            results=ps.executeQuery();
            while(results.next())
            {
                emp=new Employee();
                emp.setName(results.getString(1));
                emp.setId(results.getInt(2));
                emp.setSalary(results.getFloat(3));
                l.add(emp);
            }
        
        return l;
    }
}

