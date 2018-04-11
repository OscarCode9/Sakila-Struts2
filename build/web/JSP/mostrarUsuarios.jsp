<%-- 
    Document   : mostrarUsuarios
    Created on : Apr 9, 2018, 5:05:51 PM
    Author     : oscarcode
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
    </head>
    <body>
        

        <h1>Hello World!</h1>

        <table>
            <tr>
                <td>ID</td>
                <td>Nombre</td>
                <td>Correo</td>
                <td>Password</td>
                <td>Eliminar</td>
            </tr>

            <s:iterator value="list">
                <tr>
                    <td><s:property value="id"></s:property></td>
                    <td><s:property value="nombre"></s:property></td>
                    <td><s:property value="correo"></s:property></td>
                    <td><s:property value="password"></s:property></td>
                    <td><a href="deleteProduct.action?id=<s:property value="id"/>">Eliminar</a></td>
                </tr>

            </s:iterator>
        </table>

    </body>
</html>
