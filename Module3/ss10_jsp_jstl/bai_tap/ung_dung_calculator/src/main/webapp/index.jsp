<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/10/2022
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>SIMPLE CALCULATOR</h1>
<form action="/calculate" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand:</td>
                <td><input type="text" name="first-operand" placeholder="enter first value"></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Minus</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand</td>
                <td><input type="text" name="second-operand" placeholder="enter second value"></td>
            </tr>
            <tr>
                <td><button type="submit">Calculate</button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
