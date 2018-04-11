<%-- 
    Document   : index
    Created on : Apr 9, 2018, 11:40:10 AM
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
        <h1>Hello World!</h1>
        <s:form action="registrar">
            
            <s:textfield name="us.nombre"></s:textfield>
            <s:textfield name="us.apellido"></s:textfield>
            <s:textfield name="us.correo"></s:textfield>
            <s:textfield name="us.password"></s:textfield>
            
            <s:submit value="Registro"></s:submit>
        </s:form>
        
    </body>
</html>
