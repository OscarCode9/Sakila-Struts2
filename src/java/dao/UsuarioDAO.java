/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
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
public class UsuarioDAO {

    public UsuarioDAO() {

    }

    private String sql = "INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `password`, `correo`) VALUES(null,?,?,?,?);";

    public boolean insertUsuario(Usuario user) throws SQLException, ClassNotFoundException {
        boolean resultado = false;

        Connection cnn = Conexion.obtener();
        PreparedStatement ps = cnn.prepareStatement(sql);

        ps.setString(1, user.getNombre());
        ps.setString(2, user.getApellido());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getCorreo());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            cnn.close();

        }
        return resultado;
    }

    public List<Usuario> mostrarUsuarios() throws SQLException, ClassNotFoundException {
        List<Usuario> list = new ArrayList<Usuario>();

        String sql = "SELECT * FROM usuario";

        Connection cnn = Conexion.obtener();

        PreparedStatement ps = cnn.prepareStatement(sql);

        ResultSet res = ps.executeQuery();

        while (res.next()) {
            Usuario us = new Usuario();
            us.setId(res.getInt(1));
            us.setNombre(res.getString(2));
            us.setApellido(res.getString(3));
            us.setPassword(res.getString(4));
            us.setCorreo(res.getString(5));

            list.add(us);
        }

        ps.close();
        cnn.close();

        return list;

    }

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        boolean rowEliminar = false;
        String sql = "DELETE FROM usuario WHERE id=?";

        Connection conn = Conexion.obtener();
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        conn.close();

        return rowEliminar;
    }
}
