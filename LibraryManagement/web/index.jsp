<%-- 
    Document   : index
    Created on : Nov 18, 2014, 11:14:06 PM
    Author     : shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BIT Patna Library Management System</title>
    </head>
    <body>
    <center>
        <form action="./LoginServlet" method="post">
        <table border ="1">
            <tr colspan="2">
                <td><center>Loginnn</center></td>
            </tr>
            <tr>
                <td>Username:</td><td><input type="text" name="uname" /></td>
            </tr>
            <tr>
                <td>Password:</td><td><input type="password" name="password" /></td>
            </tr>
            <tr colspan="2">
                <td><center><input type="submit" name="login" value="login"/></center></td>
            </tr>
        </table>
        </form>
    </center>
    </body>
</html>
