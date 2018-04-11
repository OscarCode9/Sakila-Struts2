<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>

        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>

        <body>
            <h1>Editar usuario con id: </h1>

            <s:form action="updateCustomer">


                <s:textfield name="cus.customer_id" label="Customer Id" value="%{customer.customer_id}" />
                <s:textfield label="Store id" name="cus.store_id" value="%{customer.store_id}"></s:textfield>
                <s:textfield name="cus.first_name" label="First name" value="%{customer.first_name}"></s:textfield>
                <s:textfield name="cus.last_name" label="last name" value="%{customer.last_name}"></s:textfield>
                <s:textfield name="cus.email" label="Email" value="%{customer.email}"></s:textfield>
                <s:textfield name="cus.address_id" label="Adress id" value="%{customer.address_id}"></s:textfield>
                <s:checkbox name="cus.active" label="Active" ></s:checkbox>
                <s:textfield name="cus.create_date" label="Create Date" value="%{customer.create_date}"></s:textfield>
                <s:submit value="Update"></s:submit>
            </s:form>

        </body>

        </html>