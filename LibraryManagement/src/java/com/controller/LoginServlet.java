package com.controller;
import com.dao.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})

public class LoginServlet extends HttpServlet 
{
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String uname=request.getParameter("uname");
        String password=request.getParameter("password");
        LoginDAO loginDAO=new LoginDAO();
        
        try
        {
            if(loginDAO.checkLogin(uname,password).isEmpty())
                response.sendRedirect("index.jsp");
            else
            {
                HttpSession session=request.getSession(true);
                session.setAttribute("uname", uname);
                response.sendRedirect("home.jsp");
            }
        }catch(SQLException e)
            {
                System.out.println("My Exception buahahaha:"+e);
            }
    }

    
}
