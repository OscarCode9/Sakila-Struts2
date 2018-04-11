

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar customer</title>
    </head>
    <body>
       
        <div class="container">
            <div class="row center">

                <div class="col s6 l6 m6">

                    <s:form action="registrarAdress">
                        <s:textfield  label="Address" name="add.address"></s:textfield>
                        <s:textfield name="add.address2" label="Address 2"></s:textfield>
                        <s:textfield name="add.district" label="District"></s:textfield>
                        <s:textfield name="add.email" label="Email"></s:textfield>
                        <s:textfield name="add.city_id" label="City id"></s:textfield>
                        <s:textfield name="add.postal_code" label="Postal Code"></s:textfield>
                        
                        
                        <s:submit value="Registrar"></s:submit>
                    </s:form>

                </div>
            </div>

        </div>


    </body>
</html>
