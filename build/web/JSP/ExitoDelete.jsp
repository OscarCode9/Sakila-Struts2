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
        <h1>El usuario se ha borrado con exito</h1>
        
        <s:form action="consultar">
            <s:submit value="Ver todos los usuarios"></s:submit>
        </s:form>
    </body>
</html>
