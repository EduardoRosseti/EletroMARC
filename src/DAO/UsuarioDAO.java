/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.Usuario;
/**
 *
 * @author jose
 */

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Usuario usuario;
    public BD bd;

    public UsuarioDAO() {

        bd = new BD();
    }

    public boolean consultar(String login, String senha) {
        bd.setSql("select LOGIN,SENHA from tbusuario where LOGIN = '" + login + "' and SENHA = '" + senha + "'");
        System.out.println(bd.getSql());
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
    
    
    public String gravar(Usuario usuario) {
        this.usuario = usuario;
        try {
            bd.setSql("insert into tbusuario (COD_FUNCIONARIO,LOGIN,SENHA,PERFIL) values(?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, usuario.getFuncionario());
            bd.getPst().setString(2, usuario.getLogin());
            bd.getPst().setString(3, usuario.getSenha());
            bd.getPst().setString(4, usuario.getPerfil());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha no cadastro";
            } else {
                bd.connection.close();
                return "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public String alterar(Usuario usuario) {
        this.usuario = usuario;
        try {
            bd.setSql("update tbusuario set COD_FUNCIONARIO = ?,LOGIN = ?,SENHA = ?, PERFIL = ?, WHERE COD_FUNCIONARIO = " + usuario.getCod());
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, usuario.getFuncionario());
            bd.getPst().setString(2, usuario.getLogin());
            bd.getPst().setString(3, usuario.getSenha());
            bd.getPst().setString(4, usuario.getPerfil());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na atualização";
            } else {
                bd.connection.close();
               return "Atualização realizada com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ResultSet localizar(String cod) {
        bd.setSql("select * from tbusuario where login = '" + cod +"'");
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            //JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            if(bd.getRs().next());
                return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha " + e);
        }
        return null;
    }

    public String apagar(int cod) {
        bd.setSql("delete from tbusuario where COD_FUNCIONARIO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            int i = bd.getPst().executeUpdate();
            if (i > 0) {
                String msg = "Usuario apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
}
