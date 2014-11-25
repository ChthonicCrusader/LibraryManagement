package com.dao;

import com.factory.DBFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
/**
 *
 * @author shubham
 */
public class LoginDAO 
{
    Connection con;
    PreparedStatement ps;
    
    public LoginDAO()
    {
        DBFactory db=new DBFactory();
        con=db.getOracleConnection();
        System.out.println("Check Point DAO reached");
    }
    
    public List<ResultSet> checkLogin(String uname, String enteredPassword) throws SQLException
        {
            ps=con.prepareStatement("select password, account_type from USERACCOUNTS where username=?");
            ps.setString(1, uname);
            ResultSet rs=ps.executeQuery();
            List<ResultSet> l=new ArrayList<ResultSet>();
           while(rs.next())
           {
              String temp=rs.getString("password");
                System.out.println("Password is:"+temp);

               if(temp.equals(enteredPassword))
               {
                   temp=rs.getString("account_type");
                   l.add(rs);
               }
                l.add(rs);
           }
                return l;
        }
}
