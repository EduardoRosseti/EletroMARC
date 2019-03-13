/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONTROLE.CUsuario;
import MODELO.Usuario;
/**
 *
 * @author jose
 */

import java.sql.Connection;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Usuario usuario;
    public BD bd;

    public UsuarioDAO() {

        bd = new BD();
    }

    public boolean consultar(String login, String senha) {
        bd.setSql("select LOGIN,SENHA from tbusuario where LOGIN = '" + login + "' and SENHA = '" + senha + "'");
        try {
            Connection conex = bd.conectar();
            //JOptionPane.showMessageDialog(null, bd.connection);
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            if(bd.getRs().next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
