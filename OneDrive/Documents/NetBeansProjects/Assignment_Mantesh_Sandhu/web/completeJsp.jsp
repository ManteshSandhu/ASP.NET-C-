<%-- 
    Document   : completeJsp
    Created on : 6-Dec-2019, 10:03:50 PM
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
        <title>Sheridan BookStore</title>
    </head>
    <body id="back">
        <div id="header">
            <h3>Sheridan Book Store</h3>
            <h3>Your Receipt :</h3>
            <img src="images/davis.jpg" alt="logo">
            </div>
        <hr>
        
            <c:forEach items="${booke}" var="book" >
            
                
                    <table border="1">
                        <tr><td>BookID:</td><td>${book.ID}</td></tr> 
                        <tr><td>Title:</td><td> ${book.title}</td></tr> 
                        <tr><td> Author:</td><td> ${book.author}</td></tr>
                        <tr><td>Price:</td><td> ${book.price}</td> 
                       
                        <tr><td>Courses:</td><td> ${book.courses}</td></tr>
            <c:set var="price" value="${book.price}"/>
           
            <tr><td>Total Books requested:</td><td> ${quantity}</td></tr><br><br>
            <input type="hidden" value=${book.inventory-quantity} name="quantity">
            <input type="hidden" value=${book.ID} name="BookID">
            <tr><td>Subtotal</td><td>$${quantity*price}</td></tr><br><br>
           
            <c:set var="sub" value="${price*quantity}"/> 
            <c:set var="tax" value="${sub*0.13}"/>
            
            <tr><td>Taxes 13%</td><td>$<fmt:formatNumber
                type="number"  maxFractionDigits="2" value="${tax}"/>
           </td></tr>
            <tr><td>Total</td><td>$<fmt:formatNumber
                type="number"  maxFractionDigits="2" value="${sub + tax}"/></td></tr>
            
                    </table>
             <br>
            </c:forEach> <br><br>
             <a href="PurchaseBook.html">Purchase more Books Davis Campus</a><br><br>
             <a href="PurchaseBookHazel.html">Purchase more Books HazelMacallion Campus</a><br><br>
             <a href="PurchaseBookTraf.html">Purchase more Books Trafalgar Campus</a><br><br>
             <a href="index.html">Home</a>
             </body>
             
</html>
