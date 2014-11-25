package com.modal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SQLReduceCode
{
    public static void main(String args[]) throws ParseException
    {             
        DBFactory myCon=new DBFactory();                          
        Connection con;
        
        try{            
            con=myCon.getOracleConnection();      
            PreparedStatement ps=con.prepareStatement("select * from employee");          
            System.out.println("Successss222");
            int res=ps.executeUpdate();
            if(res>0)
                System.out.println("Successss!!!");
            else
                System.out.println("Wrong!!");
            
            ResultSet rs=ps.executeQuery();
            List<ResultSet> recordArray=new ArrayList<ResultSet>();
            String temp;
            while(rs.next())
            {                                                               
                temp=rs.getString("emp_id");
                System.out.println(temp);
                recordArray.add(rs);
            }           
            con.commit();
            con.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
}
