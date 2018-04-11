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

        <div class="container"><h1>Show all cities</h1>
            <table>
                <tr>
                    <td>City id</td>
                    <td>City name</td>
                    <td>Country id</td>
                    <td>Actions</td>
                    
                </tr>

                <s:iterator value="Cities">
                    <tr>
                        <td><s:property value="city_id"></s:property></td>
                        <td><s:property value="city"></s:property></td>
                        <td><a href="showCityById.action?id=<s:property value="country_id"></s:property>"><s:property value="country_id"></s:property></a></td>
                        
                        <td><a href="editCity.action?id=<s:property value="city_id"/>">Edita</a></td>
                        <td><a href="deleteCity.action?id=<s:property value="city_id"/>">Delete</a></td>
                    </tr>

                </s:iterator>
            </table>
        </div>



    </body>
</html>
