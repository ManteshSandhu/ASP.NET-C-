<%-- 
    Document   : searchBookHaz
    Created on : 6-Dec-2019, 9:11:39 PM
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
        <title>Search</title>
    </head>
    <body>
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
            
            <c:forEach items="${book2}" var="book" >
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
        <a href="SearchHaz.html">Back to Search</a>
        </div>
    </body>
</html>

