<%--
  Created by IntelliJ IDEA.
  User: Avenash_2
  Date: 6/25/2018
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  Login:
  <form action = "authenticationController" method = "post">
    Name: <input type = "text" name = "name" size = "9" /><br/>
    Password: <input type = "password" name = "password" size = "9" /><br/>
    <br/>
    <input type="submit" value = "Log In"/>
  </form>
  </body>
</html>
