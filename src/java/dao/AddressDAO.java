/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import bean.Address;
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
public class AddressDAO {
    
    
    public boolean insert(Address address) throws SQLException, ClassNotFoundException {
        
        boolean result = false;

        String sql = "INSERT INTO `address` (`address_id`, `address`, `address2`, `district`, `city_id`, `postal_code`) VALUES (null,?,?,?,?,?);";

        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);
        
        ps.setString(1, address.getAddress());
        ps.setString(2, address.getAddress2());
        ps.setString(3, address.getDistrict());
        ps.setInt(4, address.getCity_id());
        ps.setString(5, address.getPostal_code());
        
        
        
        
        if (ps.executeUpdate() == 1) {
            result = true;
            ps.close();
            cnn.close();

        }

        return result;

    }
    
    public List<Address> showAddress() throws SQLException, ClassNotFoundException {
        
        List<Address> addresses = new ArrayList<Address>();

        String sql = "SELECT * FROM address";

        Connection cnn = Conexion.obtener();

        PreparedStatement ps = cnn.prepareStatement(sql);

        ResultSet res = ps.executeQuery();

        while (res.next()) {
            
            Address address = new Address();
            
            address.setAddress_id(res.getInt(1));
            address.setAddress(res.getString(2));
            address.setAddress2(res.getString(3));
            address.setDistrict(res.getString(4));
            address.setCity_id(res.getInt(5));
            address.setPostal_code(res.getString(6));
            addresses.add(address);
            
        }

        ps.close();
        cnn.close();

        return addresses;

    }

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        
        boolean rowEliminar = false;
        
        String sql = "DELETE FROM address WHERE address_id = ?";

        Connection conn = Conexion.obtener();
        
        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setInt(1, id);

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        conn.close();

        return rowEliminar;
    }
    
    public Address addressById (int id) throws SQLException, ClassNotFoundException {
        Address address = new Address();

        String sql = "SELECT * FROM "
                + "address WHERE address_id = ? ";
        Connection conn = Conexion.obtener();

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {

            
            address.setAddress_id(res.getInt(1));
            address.setAddress(res.getString(2));
            address.setAddress2(res.getString(3));
            address.setDistrict(res.getString(4));
            address.setCity_id(res.getInt(5));
            address.setPostal_code(res.getString(6));
            
        }
        res.close();
        conn.close();

        return address;
    }
    
    public boolean updateCity(Address address) throws SQLException, ClassNotFoundException {
        
        boolean rowActualizar = false;
        String sql = "UPDATE `address` SET  `address` = ?, `address2` = ?, `district` =?, `city_id` =?, `postal_code` = ? WHERE `address_id` = ?;";

        Connection conn = Conexion.obtener();

        PreparedStatement ps = conn.prepareStatement(sql);

        
        ps.setString(1, address.getAddress());
        ps.setString(2, address.getAddress2());
        ps.setString(3, address.getDistrict());
        ps.setInt(4, address.getCity_id());
        ps.setString(5, address.getPostal_code());
        ps.setInt(6, address.getAddress_id());
        
        

        rowActualizar = ps.executeUpdate() > 0;
        ps.close();
        conn.close();
        return rowActualizar;
    }
    
}
