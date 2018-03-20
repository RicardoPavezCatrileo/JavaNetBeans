<%-- 
    Document   : success
    Created on : 20-03-2018, 15:19:11
    Author     : qa-ntb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión Éxito </title>
    </head>
    <body>
        <h1> Felicitaciones!</h1> 

        <p> han iniciado la sesión correctamente </p>. 

        <p> Su nombre es :. <bean:write name="LoginForm" property="name" />.</p> 

        <p> Su dirección de correo electrónico es :.<bean:write name="LoginForm" property="email" />. </p> 
    </body>
</html>
