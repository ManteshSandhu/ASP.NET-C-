<%-- 
    Document   : DavisBooks
    Created on : 12-Nov-2019, 7:51:46 PM
    Author     : SandhuM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/jspcss.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Davis Books</title>
    </head>
    <body>
       <div id="header">
        <h3>Current Books At Davis Campus Store</h3>
       </div>
        <div id="tabl">
          <table>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Inventory</th>
                <th>Courses</th>
                
            </tr>
            
            <c:forEach items="${book}" var="book" >
        <tr>
				<td>${book.ID}</td>
                                <td>${book.title}</td>
                                <td>${book.author}</td>
                                <td>${book.price}</td>
                                <td>${book.inventory}</td>
                                <td>${book.courses}</td>
                                
			</tr>
		</c:forEach>
              
          </table>
        
        <br><br>
        </div>
        <a href="Davis.html"> Add Books </a><br>
        <br>
        <a href="index.html">Home</a>
       
    </body>
</html>
