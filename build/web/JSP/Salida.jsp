<%-- 
    Document   : Salida
    Created on : Apr 9, 2018, 4:30:47 PM
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
        <h1>Exito al insertar usuario</h1>
        <s:property value="us.nombre"></s:property>
        <s:property value="us.apellido"></s:property>
    </body>
</html>
