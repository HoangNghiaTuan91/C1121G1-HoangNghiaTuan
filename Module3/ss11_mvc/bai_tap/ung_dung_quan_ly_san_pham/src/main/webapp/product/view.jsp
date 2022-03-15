<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/13/2022
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Producer</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${requestScope["product"].getId()}</td>
        <td>${requestScope["product"].getName()}</td>
        <td>${requestScope["product"].getPrice()}</td>
        <td>${requestScope["product"].getDescription()}</td>
        <td>${requestScope["product"].getManufacturer()}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
