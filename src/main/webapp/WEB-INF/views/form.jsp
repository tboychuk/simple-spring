<%--
  Created by IntelliJ IDEA.
  User: Taras
  Date: 22.09.2015
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate the sum</title>
</head>
<body>
<table>
    <form method="post" action="/sum">
        <tr>
            <td>a:</td>
            <td><input type="text" name="a" value="${a}"></td>
        </tr>
        <tr>
            <td>b:</td>
            <td><input type="text" name="b" value="${b}"></td>
        </tr>
        <tr>
            <td>sum</td>
            <td><input type="text" name="a" value="${sum}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Calculate"></td>
        </tr>
    </form>
</table>

</body>
</html>
