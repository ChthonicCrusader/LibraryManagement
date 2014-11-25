//package com.controller;

import com.dao.RegistrationDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String uname=request.getParameter("uname");
        String password=request.getParameter("password");
        RegistrationDAO regDao=new RegistrationDAO();
        
        try
        {
            if(regDao.checkLogin(uname, password).isEmpty())
                response.sendRedirect("index.jsp");
            else//login correct
            {
                HttpSession session=request.getSession(true);
        //        response.sendRedirect("index.jsp");
                session.setAttribute("uname", uname);
                response.sendRedirect("home.jsp");
            }
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
