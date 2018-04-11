/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.City;
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
public class CityDAO {
    public boolean insert(City city) throws SQLException, ClassNotFoundException {
        boolean result = false;

        String sql = "INSERT INTO `city` (`city_id`, `city`, `country_id`) VALUES (null,?,?);";

        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);
        
        ps.setString(1, city.getCity());
        ps.setInt(2, city.getCountry_id());
        
        if (ps.executeUpdate() == 1) {
            result = true;
            ps.close();
            cnn.close();

        }

        return result;

    }
    
    public List<City> shoCities() throws SQLException, ClassNotFoundException {
        List<City> cities = new ArrayList<City>();

        String sql = "SELECT * FROM city";

        Connection cnn = Conexion.obtener();

        PreparedStatement ps = cnn.prepareStatement(sql);

        ResultSet res = ps.executeQuery();

        while (res.next()) {
            
            City city = new City();
            city.setCity_id(res.getInt(1));
            city.setCity(res.getString(2));
            city.setCountry_id(res.getInt(3));
            cities.add(city);
            
        }

        ps.close();
        cnn.close();

        return cities;

    }

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        boolean rowEliminar = false;
        String sql = "DELETE FROM city WHERE city_id=?";

        Connection conn = Conexion.obtener();
        
        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setInt(1, id);

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        conn.close();

        return rowEliminar;
    }
    
    public City cityById(int id) throws SQLException, ClassNotFoundException {
        City city = new City();

        String sql = "SELECT * FROM "
                + "city WHERE city_id = ? ";
        Connection conn = Conexion.obtener();

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {

            
            city.setCity_id(res.getInt(1));
            city.setCity(res.getString(2));
            city.setCountry_id(res.getInt(3));
            
        }
        res.close();
        conn.close();

        return city;
    }
    
    public boolean updateCity(City city) throws SQLException, ClassNotFoundException {
        boolean rowActualizar = false;
        String sql = "UPDATE `city` SET `city` = ?, `country_id` = ? WHERE `city_id` = ?;";

        Connection conn = Conexion.obtener();

        PreparedStatement ps = conn.prepareStatement(sql);

        
        ps.setString(1, city.getCity());
        ps.setInt(2, city.getCountry_id());
        ps.setInt(3, city.getCity_id());
        

        rowActualizar = ps.executeUpdate() > 0;
        ps.close();
        conn.close();
        return rowActualizar;
    }
    
}
