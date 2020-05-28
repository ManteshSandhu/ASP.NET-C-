<%-- 
    Document   : login
    Created on : 7-Dec-2019, 4:23:53 PM
    Author     : SandhuM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       
        <div>
            <form method="POST" action="j_security_check">
                username: <input type="text" name="j_username">
                password: <input type="password" name="j_password">
                <input type="submit" value="ENTER">
                
            </form>
        </div>
    </body>
</html>
