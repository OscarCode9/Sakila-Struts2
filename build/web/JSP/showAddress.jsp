

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

        <div class="container"><h1>Show all address</h1>
            <table>
                <tr>

                    <td>address_id</td>
                    <td>address</td>
                    <td>address2</td>
                    <td>district</td>
                    <td>city_id</td>
                    <td>postal_code</td>
                    <td>Actions</td>
                    
                    
                    
                    
                    
                </tr>

                <s:iterator value="addresses">
                    <tr>
                        <td><s:property value="address_id"></s:property></td>
                        <td><s:property value="address"></s:property></td>
                        <td><s:property value="address2"></s:property></td>
                        <td><s:property value="district"></s:property></td>
                        <td><s:property value="city_id"></s:property></td>
                        <td><s:property value="postal_code"></s:property></td>
                    
                        
                        <td><a href="editAddress.action?id=<s:property value="address_id"/>">Edit</a></td>
                        <td><a href="deleteAddress.action?id=<s:property value="address_id"/>">Delete</a></td>
                        
                    </tr>

                </s:iterator>
            </table>
        </div>



    </body>
</html>
