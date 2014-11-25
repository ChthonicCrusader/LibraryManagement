package com.modal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SQLSample 
{
    public static void main(String args[]) throws ParseException
    {
        /*String url="jdbc:oracle:thin:@localhost:1521:xe";
        String name="system";
        String pass="tiger";*/
       
        DBFactory myCon=new DBFactory();
        
        SimpleDateFormat sft=new SimpleDateFormat("dd-MM-yyyy");                
       // myCon.setOracleDetails("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
        Connection con;
        
        try{
            /*Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url, name, pass);       
            System.out.println("Connection");*/
            con=myCon.getOracleConnection();
         //   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
            //String empname=br.readLine();
         //   int empnum=Integer.parseInt(br.readLine());
          /*  float empsal=Float.parseFloat(br.readLine());
          
            java.util.Date empjoindate=sft.parse(br.readLine());
            java.util.Date empdob=sft.parse(br.readLine());
            
            java.sql.Date sql_empjoindate=new java.sql.Date(empjoindate.getTime());
            java.sql.Date sql_empdob=new java.sql.Date(empdob.getTime());
            
            System.out.println(empname);
            System.out.println(empnum);
            System.out.println(empsal);
            System.out.println(sql_empjoindate);
            System.out.println(sql_empdob);
            System.out.println("Successss111");
           */
         //  PreparedStatement ps=con.prepareStatement("update employee set emp_id=? where emp_name='Goat'");
            PreparedStatement ps=con.prepareStatement("select * from employee");
            //ps.setString(1,empname);
            //ps.setInt(1, empnum);
            //ps.setFloat(2, empsal);
         //   ps.setDate(4, sql_empjoindate);
          //  ps.setDate(5, sql_empdob);
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
