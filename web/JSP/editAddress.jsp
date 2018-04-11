<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>

        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>

        <body>
            <h1>Editar address </h1>

            <s:form action="updateAddress">
                <s:textfield name="add.address_id" label="Customer Id" value="%{add.address_id}" />
                <s:textfield name="add.address" label="address" value="%{add.address}"></s:textfield>
                <s:textfield name="add.address2" label="address2" value="%{add.address2}"></s:textfield>
                <s:textfield name="add.district" label="district" value="%{add.district}"></s:textfield>
                <s:textfield name="add.city_id" label="city_id" value="%{add.city_id}"></s:textfield>
                <s:textfield name="add.postal_code" label="Create Date" value="%{add.postal_code}"></s:textfield>
                <s:submit value="Update"></s:submit>
            </s:form>

        </body>

        </html>