

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>Agregar ciudad</h1>
            <div class="container">
                    <div class="row center">
        
                        <div class="col s6 l6 m6">
        
                            <s:form action="addCountry">
                                <s:textfield label="Country name" name="country.country"></s:textfield>
                                <s:submit value="Add"></s:submit>
                            </s:form>
        
                        </div>
                    </div>
        
            </div>
    </body>
</html>
