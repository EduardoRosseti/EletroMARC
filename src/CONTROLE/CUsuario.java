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
import javax.swing.JOptionPane;
/**
 *
 * @author jose
 */
public class CUsuario {
    
    public BD bd;
    public Usuario usuario;
    public UsuarioDAO usuarioDao;
    private ResultSet rs;
    
    public CUsuario(){
        usuario = new Usuario();
        usuarioDao = new UsuarioDAO();
        bd = new BD();
    }
    
    public boolean consultar(String login, String senha){
        return usuarioDao.consultar(login,senha);
        
    }
    public String gravar(Usuario usuario){
        return usuarioDao.gravar(usuario);
    }
    
    public boolean buscar(Usuario usuario){
        
        try {
           // JOptionPane.showMessageDialog(null,"antes DAO" + usuario.getCod());
            rs = usuarioDao.localizar((usuario.getCod()));
            usuario.setCod(rs.getInt(1));
            usuario.setFuncionario(rs.getInt(2));
            usuario.setLogin(rs.getString(3));
            usuario.setSenha(rs.getString(4));
            usuario.setPerfil(rs.getString(5));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (Usuario usuario){
        String msg = usuarioDao.apagar(usuario.getCod());
        return msg;
    }
    
    public String alterar(Usuario usuario){
        return usuarioDao.alterar(usuario);
    }
    
}
