package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.modal.RegisterDetailsData;
import com.dao.RegistrationDAO;

public class ServletClass extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
                String address=request.getParameter("address");
                String phonenumber=request.getParameter("phonenumber");
		String pandetails=request.getParameter("pandetails");
                String dob=request.getParameter("dob");
                String nationality=request.getParameter("nationality");
                
		if(pass1.equals(pass2))
		{
			RegisterDetailsData regDetails=new RegisterDetailsData();
			RegistrationDAO regDAO=new RegistrationDAO();
                        
			regDetails.setName(name);
			regDetails.setUname(uname);
			regDetails.setPassword(pass1);
                        regDetails.setAddress(address);
                        regDetails.setPhoneNumber(phonenumber);
			
                        try
			{
				if(regDAO.newRegistration(regDetails)>0)
                                    response.sendRedirect("LoginPage.jsp");
                                    //out.print("Hi "+name+"!U have successfully registered!!");
			}catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		else
			response.sendRedirect("LoginPage.html");
	}
}
