<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/9/2022
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <input type="text" name="product" placeholder="Enter name of product"/><br>
    <input type="text" name="listPrice" placeholder="Enter list price of product"/><br>
    <input type="text" name="discountPercent" placeholder="Enter % discount"/><br>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
