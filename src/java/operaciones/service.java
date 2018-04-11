/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Usuario;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
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
public class service extends ActionSupport {
    Usuario us = new Usuario();
    
    
    
    public String execute() throws SQLException, ClassNotFoundException{
        UsuarioDAO ad = new UsuarioDAO();
        ad.insertUsuario(us);
        
        return SUCCESS;
    }
    
    List<Usuario> list = new ArrayList<Usuario>();
    
    public String mostrarUsuarios() throws SQLException, ClassNotFoundException{
        
        UsuarioDAO ad = new UsuarioDAO();
        list = ad.mostrarUsuarios();
        
        return SUCCESS;
    }
    
    public String eliminarUsuario() throws SQLException, ClassNotFoundException{
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        int id = Integer.parseInt(request.getParameter("id"));
        UsuarioDAO ad = new UsuarioDAO();
        boolean eliminar = ad.eliminar(id);
        return SUCCESS;
    }
    
    

    public List<Usuario> getList() {
        return list;
    }

    public void setList(List<Usuario> list) {
        this.list = list;
    }
    
    
    

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Usuario getUs() {
        return us;
    }
    
}
