<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/13/2022
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search by name</title>
</head>
<body>
<h1>Search product by name</h1>
<c:if test="${empty productList}">
    <h3 style="color: red">No results were found</h3>
    <p><a href="/product">Back to product list</a></p>
</c:if>
<c:if test="${not empty productList}">
    <p>
        <c:if test='${requestScope["message"] != null}'>
            <span class="message">${requestScope["message"]}</span>
        </c:if>
    </p>
    <p>
        <a href="/product">Back to product list</a>
    </p>
    <table>
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Description</th>
            <th scope="col">Manufacturer</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope['productList']}" var="productList">
            <tr>
                <td>${productList.getName()}</td>
                <td>${productList.getPrice()}</td>
                <td>${productList.getDescription()}</td>
                <td>${productList.getManufacturer()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
</body>
</html>
