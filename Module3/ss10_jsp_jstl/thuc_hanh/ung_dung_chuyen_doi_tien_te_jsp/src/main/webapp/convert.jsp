<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
Float rate = Float.parseFloat(request.getParameter("rate"));
Float amount = Float.parseFloat(request.getParameter("amount"));
Float result = rate*amount;
%>
<h2>Amount : <%=amount%> </h2>
<h2>Rate : <%=rate%> </h2>
<h2>Result : <%=result%> </h2>
</body>
</html>
