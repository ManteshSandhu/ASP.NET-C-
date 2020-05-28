<%-- 
    Document   : EditBook
    Created on : 29-Nov-2019, 12:25:00 PM
    Author     : SandhuM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/jspcss.css">
        <title>Davis Campus</title>
    </head>
    <body>
        <form action="UpdateServlet" method="POST">
            
            <c:forEach items="${booke}" var="book" >
                <h2>Edit Book Below:</h2><br>
            BookID: <input type="text" value=${book.ID} name="id" readonly><br><br>
            Title: <input type="text" value="${book.title}" name="title"><br><br>
            Author: <input type="text" value="${book.author}" name="author"><br><br>
            Price: <input type="text" value=${book.price} name="price"><br><br>
            Inventory: <input type="text" value=${book.inventory} name="inventory"><br><br>
            Courses: <input type="text" value="${book.courses}" name="courses"><br><br>
                    <input type="submit">            
            </c:forEach>  
            
            
        </form>
        <br><div><button onclick="window.location.href ='index.html';" >
                Home
            </button><br><br>
            <button onclick="window.location.href ='Edit.html';" >
                Go Back
            </button><br></div>
    </body>
</html>
