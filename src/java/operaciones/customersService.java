/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Customers;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.CustomersDAO;
import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author oscarcode
 */
public class customersService {

    public Customers getCus() {
        return cus;
    }

    public void setCus(Customers cus) {
        this.cus = cus;
    }

    Customers cus = new Customers();

    public String execute() throws SQLException, ClassNotFoundException {

        CustomersDAO ad = new CustomersDAO();
        boolean isInsert = ad.insertCustomer(cus);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }

    }
    
     public String updateCustomer() throws SQLException, ClassNotFoundException{
         
        CustomersDAO ad = new CustomersDAO();
        boolean isInsert = ad.updateCustomer(cus);

        if (isInsert) {
            return SUCCESS;

        } else {
            return ERROR;
        }
         
     }

    List<Customers> Customers = new ArrayList<Customers>();

    public void setCustomers(List<Customers> Customers) {
        this.Customers = Customers;
    }

    public List<Customers> getCustomers() {
        return Customers;
    }
    

    public String mostrarClientes() throws SQLException, ClassNotFoundException {
        
        CustomersDAO ad = new CustomersDAO();
        
        Customers  = ad.mostrarClientes();
        
        return SUCCESS;

    }
    public Customers customer;

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
    
     public String mostrarClientePorId() throws SQLException, ClassNotFoundException {
        
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        
        CustomersDAO ad = new CustomersDAO();
        
        customer  = ad.customerPorId(id);
        
        return SUCCESS;

    }
    
    public String eliminarUsuario() throws SQLException, ClassNotFoundException{
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        CustomersDAO ad = new CustomersDAO();
        boolean eliminar = ad.eliminar(id);
        return SUCCESS;
    }
    

}
