package com.modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBFactory 
{
    Connection con;
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String name="system";
    String pass="tiger";
    
    
    public void setOracleDetails(String url, String name,String pass)
    {
        this.url=url;
        this.name=name;
        this.pass=pass;
    }
    
    public Connection getOracleConnection()
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url, name, pass);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DBFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return con;
    }
    
    public Connection getMySQLConnection()
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url, name, pass);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DBFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return con;
    }
}
