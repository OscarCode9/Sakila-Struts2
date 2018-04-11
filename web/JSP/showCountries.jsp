

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

        <div class="container"><h1>Show all Countries</h1>
            <table>
                <tr>

                    <td>Country_id</td>
                    <td>Country name</td>
                    <td>Actions</td>
                    
                </tr>

                <s:iterator value="Countries">
                    <tr>
                        <td><s:property value="country_id"></s:property></td>
                        <td><s:property value="country"></s:property></td>
                        
                        
                        <td><a href="editCountry.action?id=<s:property value="country_id"/>">Edit</a></td>
                        <td><a href="deleteCountry.action?id=<s:property value="country_id"/>">Delete</a></td>
                    </tr>

                </s:iterator>
            </table>
        </div>



    </body>
</html>
