/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;
import DAO.BD;
import DAO.UsuarioDAO;
import MODELO.Usuario;
import java.sql.*;
/**
 *
 * @author jose
 */
public class CUsuario {
    
    public BD bd;
    public Usuario usuario;
    public UsuarioDAO daoUsuario;
    private ResultSet rs;
    
    public CUsuario(){
        usuario = new Usuario();
        daoUsuario = new UsuarioDAO();
        bd = new BD();
    }
    
    public boolean consulta(Usuario usuario){
        try {
            System.out.println("CHEGOOOOOOOO CONTROLE");
            boolean result = daoUsuario.consultar(usuario.getLogin(), usuario.getSenha());
            //System.out.println(result);
           // bd.connection.close();
            return result;
        } catch (Exception e) {
            return false;
        }
    }
    
}
