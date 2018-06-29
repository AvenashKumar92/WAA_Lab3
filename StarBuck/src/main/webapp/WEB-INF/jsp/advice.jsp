<%--
  Created by IntelliJ IDEA.
  User: Avenash_2
  Date: 6/25/2018
  Time: 10:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask for advice about your favorite roast:</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "adviceController" method="get">
    <select name="roast" >
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <br/><br/>
    <input type="submit" value = "Submit"/>
</form>
<div id='advice'>

</div>
<p />
</body>
</html>
