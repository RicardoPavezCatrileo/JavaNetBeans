<%-- 
    Document   : login
    Created on : 20-03-2018, 14:55:15
    Author     : qa-ntb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Form de Log-in.</title>
    </head>
    <body>
        <h1> Form de Log-in.</h1>
<html:form action="/login">
    <table border="0">
        <tbody>
            <tr>
               <td>Introduzca su nombre: </td> 
               <td><html:text property="name" /></td> 
            </tr>
            <tr>
                <td>Introduzca su email:</td>
                <td><html:text property="email" /></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit value="Login" /></td>
            </tr>
        </tbody>
    </table>
    <html:submit value="Login" />
</html:form>
    </body>
</html>
