<%-- 
    Document   : arithmeticCalculator
    Created on : 29-May-2022, 3:04:20 PM
    Author     : KHUSH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmeticCalculator">
            <label>
                First:
            </label>
            <input type="number" name="first" value="${val1}">
            <br>
            <br>
            <label>
                Second:
            </label>
            <input type="number" name="second" value="${val2}">
            <br><br>
            <input type="submit" name="calculation" value="+">
            <input type="submit" name="calculation" value="-">
            <input type="submit" name="calculation"  value="*">
            <input type="submit" name="calculation" value="%">
            <br>
            <br>
            Result: ${message}
            <br>
            <br>
            <a href="ageCalculator">Age Calculator</a>
        </form>
    </body>
</html>
