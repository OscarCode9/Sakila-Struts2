<%-- 
    Document   : Exito
    Created on : Apr 9, 2018, 5:14:47 PM
    Author     : oscarcode
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exito al realizar la operacion</h1>
        
        <s:form action="mostrarClientes">
            <s:submit value="Mostrar clientes"></s:submit>
        </s:form>
    </body>
</html>
