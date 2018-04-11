<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>

        <body>
                <h1>Edit city by id: </h1>

                <s:form action="updateCountry">
                    <s:textfield label="City id" name="country.country_id" value="%{country.country_id}"></s:textfield>
                    <s:textfield label="City name" name="country.country" value="%{country.country}"></s:textfield>
                    <s:submit value="Update"></s:submit>
                </s:form>

        </body>

        </html>