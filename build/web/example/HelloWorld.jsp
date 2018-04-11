<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
        <h2><s:property value="message"/></h2>

        <h3>Languages</h3>
        <ul>
            <li>
                <a href="mostrarClientes.action">Mostrar todos los clientes</a><br>
                
            </li>
            <li>
                <a href="JSP/agregarCustomer.jsp">Agregar cliente</a>
            </li>
            
            <li>
                <a href="showCities.action">Mostrar todos las ciudades</a>
            </li>
            
            <li>
                <a href="JSP/addCity.jsp">Agregar ciudad</a>
            </li>
            
            <li>
                <a href="JSP/addCountry.jsp">Agregar Pais</a>
            </li>
            
            <li>
                <a href="showCountries.action">Mostrar countries</a>
            </li>

            <li>
                <s:url id="url" action="HelloWorld">
                    <s:param name="request_locale">es</s:param>
                </s:url>

                <s:a href="%{url}">Espanol</s:a>

            </li>
        </ul>
    </body>
</html>

