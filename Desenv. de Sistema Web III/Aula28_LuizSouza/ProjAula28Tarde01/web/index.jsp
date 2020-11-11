<%-- 
    Document   : index
    Created on : 25 de jun. de 2020, 15:55:03
    Author     : luixs
--%>
<%@page language="java"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="estilo.css">
    </head>
    <body>
        <h1 style="color:lawngreen">Hello World!</h1>
        <hr>
        <h2 style="color:palevioletred">
            <%
                out.print("Sejam Bem Vindos!");
            %>
        </h2>
    </body>
</html>
