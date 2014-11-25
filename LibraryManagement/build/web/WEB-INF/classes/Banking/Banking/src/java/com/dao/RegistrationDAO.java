package com.dao;
import com.factory.DBFactory;
import java.sql.Connection;
import java.sql.SQLException;
import com.modal.RegisterDetailsData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDAO 
{
	Connection con;
	PreparedStatement ps;
	
	public RegistrationDAO()
	{
		DBFactory d=new DBFactory();
		con=d.getOracleConnection();
	}
	
	public int newRegistration(RegisterDetailsData d) throws SQLException
	{
		ps=con.prepareStatement("insert into Registration values(?,?,?,?,?,null,null,null,null)");
		ps.setString(1, d.getName());
		ps.setString(2, d.getUname());
		ps.setString(3, d.getPassword());
                ps.setString(4, d.getAddress());
                ps.setString(5, d.getPhoneNumber());
         //       ps.setInt(9,d.getAccount_number());
		return ps.executeUpdate();
	}
        
        public List<ResultSet> checkLogin(String uname, String password) throws SQLException
        {
            ps=con.prepareStatement("select * from Registration where username=? and password=?");
            ps.setString(1, uname);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            List<ResultSet> l=new ArrayList<ResultSet>();
           while(rs.next())
           {
              String temp=rs.getString("password");
                System.out.println("Password is:"+temp);
               l.add(rs);
           }
                return l;
        }
	
}
