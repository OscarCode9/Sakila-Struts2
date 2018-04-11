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

                <s:form action="updateCity">
                    <s:textfield label="City id" name="city.city_id" value="%{city.city_id}"></s:textfield>
                    <s:textfield label="City name" name="city.city" value="%{city.city}"></s:textfield>
                    <s:textfield name="city.country_id" label="Country name" value="%{city.country_id}"></s:textfield>
                    <s:submit value="Update"></s:submit>
                </s:form>

        </body>

        </html>