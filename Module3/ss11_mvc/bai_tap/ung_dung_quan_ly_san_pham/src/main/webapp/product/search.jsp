<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/13/2022
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<h1>Search product by name</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <h3>Please enter product name: </h3><br>
    <input type="text" name="nameForSearch"><br>
    <button type="submit">Search</button>
</form>
</body>
</html>
