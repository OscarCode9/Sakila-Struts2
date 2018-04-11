/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Customers;
import conexionMYSQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscarcode
 */
public class CustomersDAO {

    public boolean insertCustomer(Customers customer) throws SQLException, ClassNotFoundException {
        boolean result = false;

        String sql = "INSERT INTO `customer` (`customer_id`,`store_id`,`first_name`,`last_name`,`email`,`address_id`,`active`,`create_date`)VALUES (null,?,?,?,?,?,?,?);";

        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);
        int active = 0;
        if (customer.isActive()) {
            active = 1;
        }
        ps.setInt(1, customer.getStore_id());
        ps.setString(2, customer.getFirst_name());
        ps.setString(3, customer.getLast_name());
        ps.setString(4, customer.getEmail());
        ps.setInt(5, customer.getAddress_id());
        ps.setInt(6, active);
        ps.setString(7, customer.getCreate_date());

        if (ps.executeUpdate() == 1) {
            result = true;
            ps.close();
            cnn.close();

        }

        return result;

    }

    public List<Customers> mostrarClientes() throws SQLException, ClassNotFoundException {

        List<Customers> list = new ArrayList<Customers>();

        String sql = "SELECT * FROM customer";

        Connection cnn = Conexion.obtener();

        PreparedStatement ps = cnn.prepareStatement(sql);

        ResultSet res = ps.executeQuery();

        while (res.next()) {

            Customers cus = new Customers();

            cus.setCustomer_id(res.getInt(1));
            cus.setStore_id(res.getInt(2));
            cus.setFirst_name(res.getString(3));
            cus.setLast_name(res.getString(4));
            cus.setEmail(res.getString(5));
            cus.setAddress_id(res.getInt(6));

            boolean active;

            active = res.getInt(7) != 0;

            cus.setActive(active);
            cus.setCreate_date(res.getString(8));

            list.add(cus);
        }

        ps.close();
        cnn.close();

        return list;

    }

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        boolean rowEliminar = false;

        String sql = "DELETE FROM customer WHERE customer_id=?";

        Connection conn = Conexion.obtener();

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        conn.close();

        return rowEliminar;
    }

    public Customers customerPorId(int id) throws SQLException, ClassNotFoundException {
        Customers cus = new Customers();

        String sql = "SELECT * FROM "
                + "customer WHERE customer_id = ? ";
        Connection conn = Conexion.obtener();

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {

            cus.setCustomer_id(res.getInt(1));
            cus.setStore_id(res.getInt(2));
            cus.setFirst_name(res.getString(3));
            cus.setLast_name(res.getString(4));
            cus.setEmail(res.getString(5));
            cus.setAddress_id(res.getInt(6));
        }
        res.close();
        conn.close();

        return cus;
    }

    public boolean updateCustomer(Customers customer) throws SQLException, ClassNotFoundException {
        boolean rowActualizar = false;
        String sql = "UPDATE `customer` SET  `store_id` = ?, `first_name` = ?, `last_name` = ?, `email` = ?, `address_id` = ?, `active` = ?, `create_date` = ?, `last_update` = SYSDATE() WHERE `customer_id` = ?;";

        Connection conn = Conexion.obtener();

        PreparedStatement ps = conn.prepareStatement(sql);

        int active = 0;
        if (customer.isActive()) {
            active = 1;
        }
        ps.setInt(1, customer.getStore_id());
        ps.setString(2, customer.getFirst_name());
        ps.setString(3, customer.getLast_name());
        ps.setString(4, customer.getEmail());
        ps.setInt(5, customer.getAddress_id());
        ps.setInt(6, active);
        ps.setString(7, customer.getCreate_date());
        ps.setInt(8, customer.getCustomer_id());

        rowActualizar = ps.executeUpdate() > 0;
        ps.close();
        conn.close();
        return rowActualizar;
    }

}
