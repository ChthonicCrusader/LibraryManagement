<%-- 
    Document   : index
    Created on : Aug 14, 2014, 2:28:07 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center><h2>Welcome to ABC banking!!</h2></center>
        To register:<a href="registration.jsp">Click here!</a><br>
        <br>
        To login:<br>
        <div>
            <form action="./LoginServlet" method="post">
                <input type="text" name="uname"><br>
                <input type="password" name="password"><br>
                <input type="submit" name="submit">
            </form>
            
        </div>
    </body>
</html>
