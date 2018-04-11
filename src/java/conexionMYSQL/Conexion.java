/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionMYSQL;

/**
 *
 * @author oscarcode
 */
import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String unicode = "useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/sakilaUPA?"+unicode, "root", "tristeGDA13##1");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println(ex.getMessage());
                System.out.println("couldn't connect!");
                throw new RuntimeException(ex);
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
