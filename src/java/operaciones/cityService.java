/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.City;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import dao.CityDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author oscarcode
 */
public class cityService {

    City city = new City();

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public String execute() throws SQLException, ClassNotFoundException {

        CityDAO ad = new CityDAO();
        boolean isInsert = ad.insert(city);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }

    }

    List<City> Cities = new ArrayList<City>();

    public String showCities() throws SQLException, ClassNotFoundException {

        CityDAO ad = new CityDAO();
        Cities = ad.shoCities();
        return SUCCESS;

    }

    public List<City> getCities() {
        return Cities;
    }

    public void setCities(List<City> Cities) {
        this.Cities = Cities;
    }

    public String deleteCity() throws SQLException, ClassNotFoundException {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        CityDAO ad = new CityDAO();
        boolean eliminar = ad.eliminar(id);
        return SUCCESS;
    }
    
    
    
    public String editCityById() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        CityDAO ad = new CityDAO();
        city  = ad.cityById(id);
        return SUCCESS;

    }
    
    public String updateCity() throws SQLException, ClassNotFoundException{
         
        CityDAO ad = new CityDAO();
        boolean isInsert = ad.updateCity(city);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }
         
     }

}
