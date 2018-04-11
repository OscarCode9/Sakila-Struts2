/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Address;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import dao.AddressDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author oscarcode
 */
public class AdressService {
    Address add = new Address();

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    

    public String execute() throws SQLException, ClassNotFoundException {
        
        
        AddressDAO ad = new AddressDAO();
        
        boolean isInsert = ad.insert(add);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }

    }
    
    List<Address> addresses = new ArrayList<Address>();

    public String showAddresses() throws SQLException, ClassNotFoundException {

        AddressDAO ad = new AddressDAO();
        addresses  = ad.showAddress();
        return SUCCESS;

    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    
    

    

    
    
    public String deleteAddress() throws SQLException, ClassNotFoundException {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        
        AddressDAO ad = new AddressDAO();
        
        boolean eliminar = ad.eliminar(id);
        
        return SUCCESS;
    }
    
    public String editAddressById() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        
        AddressDAO ad = new AddressDAO();
        add  = ad.addressById(id);
        return SUCCESS;

    }
    
    public String updateAddress() throws SQLException, ClassNotFoundException{
         
        AddressDAO ad = new AddressDAO();
        
        boolean isInsert = ad.updateCity(add);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }
         
     }
    
}
