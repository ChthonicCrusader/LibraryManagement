<%-- 
    Document   : home
    Created on : Aug 14, 2014, 11:21:20 AM
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
        <div>
        <%
            String name;
            HttpSession sess=request.getSession(false);
            name=(String)sess.getAttribute("uname");
            %>
            <h1>Hello World <%=name%>!</h1>
        </div>
        
        
        <form method="post" action="LogoutSession">
            <input type="submit" name="logout" value="Log Out">
        </form>
    </body>
</html>
