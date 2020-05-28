<%-- 
    Document   : PurchaseBook
    Created on : 30-Nov-2019, 5:03:32 PM
    Author     : SandhuM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css" href="css/daviscss.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Davis BookStore</title>
    </head>
    <body id="back">
        <div id="header">
            <h3>Welcome to Davis Campus Book Store</h3>
            <h3>Your Order Summary</h3>
            <img src="images/davis.jpg" alt="logo">
            </div>
        <hr>
        
            <c:forEach items="${booke}" var="book" >
            <c:choose> 
                <c:when test="${quantity<=book.inventory}">
          
                <form action="CompletePurchase" method="POST">
                    <table border="1">
                        <tr><td>BookID:</td><td>${book.ID}</td></tr> 
                        <tr><td>Title:</td><td> ${book.title}</td></tr> 
                        <tr><td> Author:</td><td> ${book.author}</td></tr>
                        <tr><td>Price:</td><td> ${book.price}</td> 
                        <tr><td> Available Inventory:</td><td>${book.inventory}</td></tr>
                        <tr><td>Courses:</td><td> ${book.courses}</td></tr>
            <c:set var="price" value="${book.price}"/>
           
            <tr><td>Total Books requested:</td><td> ${quantity}</td></tr><br><br>
            <input type="hidden" value=${quantity} name="quantity">
            <input type="hidden" value=${book.inventory-quantity} name="quantit">
            <input type="hidden" value=${book.ID} name="BookID">
            <tr><td>Subtotal</td><td>$${quantity*price} + taxes extra</td></tr><br><br>
           
            
            
                    </table>
             <br>
            <input type="submit" Value="Purchase">
        </form>
            </c:when>
            <c:otherwise>
                <h2>Your purchase cannot be completed as there is not enough inventory 
                    at this time</h2>
                <table border="1">
            <tr><td>BookID:</td><td>${book.ID}</td></tr> 
                        <tr><td>Title:</td><td> ${book.title}</td></tr> 
                        <tr><td> Author:</td><td> ${book.author}</td></tr>
                        <tr><td>Price:</td><td> ${book.price}</td> 
                        <tr><td> Available Inventory:</td><td>${book.inventory}</td></tr>
                        <tr><td>Courses:</td><td> ${book.courses}</td></tr>
                </table>
                
                
            
                        </c:otherwise>
            </c:choose>
            </c:forEach> 
            <br><br>
            <div><button onclick="window.location.href ='index.html';" >
                Home
                </button><br><br>
            <button onclick="window.location.href ='PurchaseBook.html';" >
                Go Back
            </button><br></div>
    </body>
</html>
