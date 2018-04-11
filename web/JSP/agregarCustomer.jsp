

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar customer</title>
    </head>
    <body>
        <nav>
            <div class="nav-wrapper">
                <a href="#" class="brand-logo right">Logo</a>
                <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <li><a href="mostrarClientes.action">Mostrar todos los cliente</a></li>
                    <li><a href="badges.html">Agregar nuevo cliente</a></li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row center">

                <div class="col s6 l6 m6">

                    <s:form action="registrarCustomer">
                        <s:textfield  type="number" label="Store id" name="cus.store_id"></s:textfield>
                        <s:textfield name="cus.first_name" label="First name"></s:textfield>
                        <s:textfield name="cus.last_name" label="last name"></s:textfield>
                        <s:textfield name="cus.email" label="Email"></s:textfield>
                        <s:textfield name="cus.address_id" label="Adress id"></s:textfield>
                        <s:checkbox name="cus.active" label="Active"></s:checkbox>
                        <s:textfield name="cus.create_date" label="Create Date"></s:textfield>
                        <s:submit value="Registrar"></s:submit>
                    </s:form>

                </div>
            </div>

        </div>


    </body>
</html>
