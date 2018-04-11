/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Country;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import dao.CountryDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscarcode
 */
public class CountryService {

    Country country = new Country();

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String execute() throws SQLException, ClassNotFoundException {

        CountryDAO ad = new CountryDAO();
        boolean isInsert = ad.insert(country);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }

    }
    
    List<Country> Countries = new ArrayList<Country>();

    public String showCountries() throws SQLException, ClassNotFoundException {

        CountryDAO ad = new CountryDAO();
        Countries = ad.showCountries();
        return SUCCESS;

    }

    public void setCountries(List<Country> Countries) {
        this.Countries = Countries;
    }

    public List<Country> getCountries() {
        return Countries;
    }

}
