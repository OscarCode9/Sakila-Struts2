/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.City;
import bean.Country;
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
public class CountryDAO {
    
    public boolean insert(Country country) throws SQLException, ClassNotFoundException {
        boolean result = false;

        String sql = "INSERT INTO `country` (`country_id`, `country`) VALUES (null,?);";

        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);
        
        ps.setString(1, country.getCountry());
        
        
        if (ps.executeUpdate() == 1) {
            result = true;
            ps.close();
            cnn.close();
        }

        return result;

    }
    
    public List<Country> showCountries() throws SQLException, ClassNotFoundException {
        
        List<Country> countries = new ArrayList<Country>();
        String sql = "SELECT * FROM country";
        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);
        ResultSet res = ps.executeQuery();

        while (res.next()) {
            
            Country country = new Country();
            
            country.setCountry_id(res.getInt(1));
            country.setCountry(res.getString(2));
            
            countries.add(country);
            
        }

        ps.close();
        cnn.close();

        return countries;

    }

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        boolean rowEliminar = false;
        String sql = "DELETE FROM country WHERE country_id =?";

        Connection conn = Conexion.obtener();
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        conn.close();

        return rowEliminar;
    }
    
    public Country countryById(int id) throws SQLException, ClassNotFoundException {
        Country country = new Country();

        String sql = "SELECT * FROM "
                + "country  WHERE country_id = ? ";
        
        Connection conn = Conexion.obtener();

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {

            country.setCountry_id(res.getInt(1));
            country.setCountry(res.getString(2));
            
            
        }
        res.close();
        conn.close();

        return country;
    }
    
    public boolean updateCity(Country country) throws SQLException, ClassNotFoundException {
        boolean rowActualizar = false;
        String sql = "UPDATE `country` SET `country` = ? WHERE `country_id` = ?;";

        Connection conn = Conexion.obtener();

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, country.getCountry());
        ps.setInt(2, country.getCountry_id());
        

        rowActualizar = ps.executeUpdate() > 0;
        ps.close();
        conn.close();
        return rowActualizar;
    }
    
    
}
