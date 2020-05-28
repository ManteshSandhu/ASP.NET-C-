<%-- 
    Document   : HazelBooks
    Created on : 12-Nov-2019, 8:52:54 PM
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
        <title>JSP Page</title>
    </head>
    <div id="header">
        <h3>Current Books At Hazel Macallion Campus Store</h3>
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
            
            <c:forEach items="${books}" var="book" >
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
        <a href="Hazel.html"> Add Books </a>
        <br><br>
        <a href="index.html">Home</a>
        
    </body>
</html>
