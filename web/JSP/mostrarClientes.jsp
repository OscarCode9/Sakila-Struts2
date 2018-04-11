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

        <div class="container"><h1>Mostrar todos los clientes</h1>
            <table>
                <tr>
                    <td>ID</td>
                    <td>Store id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Email</td>
                    <td>Address id</td>
                    <td>Active</td>
                    <td>Create date</td>
                    <td>Actions</td>
                </tr>

                <s:iterator value="Customers">
                    <tr>
                        <td><s:property value="customer_id"></s:property></td>
                        <td><s:property value="store_id"></s:property></td>
                        <td><s:property value="first_name"></s:property></td>
                        <td><s:property value="last_name"></s:property></td>
                        <td><s:property value="email"></s:property></td>
                        <td><s:property value="address_id"></s:property></td>
                        <td><s:property value="active"></s:property></td>
                        <td><s:property value="create_date"></s:property></td>
                        <td><a href="editCustomer.action?id=<s:property value="customer_id"/>">Edita</a></td>
                        <td><a href="deleteCustomer.action?id=<s:property value="customer_id"/>">Delete</a></td>
                    </tr>

                </s:iterator>
            </table>
        </div>



    </body>
</html>
