<%-- 
    Document   : LoginPage
    Created on : Aug 13, 2014, 1:02:20 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title> Welcome to ABC Bank</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div>
            <center><h1>Welcome</h1></center>
            <form action="./LoginServlet" method="post">
                <input type="text" name="uname">
                <input type="password" name="password">
                <input type="submit" name="submit">
            </form>
            
        </div>
    </body>
</html>
