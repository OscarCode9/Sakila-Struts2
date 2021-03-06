/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Country;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import dao.CountryDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

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
    
    public String deleteCountry() throws SQLException, ClassNotFoundException {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        CountryDAO ad = new CountryDAO();
        boolean eliminar = ad.eliminar(id);
        return SUCCESS;
    }
    
    public String editCountryById() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        CountryDAO ad = new CountryDAO();
        country  = ad.countryById(id);
        return SUCCESS;

    }
    
    public String updateCountry() throws SQLException, ClassNotFoundException{
         
        CountryDAO ad = new CountryDAO();
        boolean isInsert = ad.updateCity(country);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }
         
     }
    
    

}
