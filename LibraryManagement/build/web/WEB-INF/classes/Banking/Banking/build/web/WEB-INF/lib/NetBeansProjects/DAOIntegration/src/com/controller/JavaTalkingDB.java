package com.controller;

import com.dao.EmployeeDAO;
import com.factory.DBFactory;
import com.modal.Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaTalkingDB 
{
    public static void main(String args[])
    {
         Connection con;
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String name="system";
    String pass="tiger";
     try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url, name, pass);
            CallableStatement cs=con.prepareCall("{call nnn(?,?)}");
            cs.setInt(1,783);
            cs.registerOutParameter(2,java.sql.Types.VARCHAR);
            cs.execute();
            System.out.println(cs.getString(2));
            System.out.println("Executed");
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DBFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
        
        
    }
}
