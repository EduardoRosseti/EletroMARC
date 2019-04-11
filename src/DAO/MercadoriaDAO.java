/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.Mercadoria;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class MercadoriaDAO {
 
    BD bd;
    Mercadoria mercadoria;

    public MercadoriaDAO() {
        bd = new BD();
    }
    public String gravar(Mercadoria mercadoria) {
        this.mercadoria = mercadoria;
        try {
            bd.setSql("insert into tbmercadoria (COD_FABRICANTE,COD_FORNECEDOR,MARCA,MODELO,CUSTO,NOME) values(?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, mercadoria.getCodFabricante());
            bd.getPst().setInt(2, mercadoria.getCodFornecedor());
            bd.getPst().setString(3, mercadoria.getMarca());
            bd.getPst().setString(4, mercadoria.getModelo());
            bd.getPst().setFloat(5, mercadoria.getValorCustoMercadoria());
            bd.getPst().setString(6, mercadoria.getNome());
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
    
      public ResultSet localizar(int cod) {
        bd.setSql("select * from tbmercadoria where COD_MERCADORIA = " + cod + " or " + "Nome = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            //JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public String alterar(Mercadoria mercadoria) {
        this.mercadoria = mercadoria;
        try {
            bd.setSql("update tbmercadoria set COD_FABRICANTE = ?,COD_FORNECEDOR = ?,MARCA = ?,MODELO = ?,CUSTO = ?,NOME = ? WHERE COD_MERCADORIA = " + mercadoria.getCod());
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, mercadoria.getCodFabricante());
            bd.getPst().setInt(2, mercadoria.getCodFornecedor());
            bd.getPst().setString(3, mercadoria.getMarca());
            bd.getPst().setString(4, mercadoria.getModelo());
            bd.getPst().setFloat(5, mercadoria.getValorCustoMercadoria());
            bd.getPst().setString(6, mercadoria.getNome());
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
       
      public ResultSet localiza(int cod) {
        bd.setSql("select * from tbmercadoria where COD_MERCADORIA = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            //JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String apagar(int cod) {
        bd.setSql("delete from tbmercadoria where COD_MERCADORIA = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            int i = bd.getPst().executeUpdate();
            if (i > 0) {
                String msg = "Mercadoria apagado com sucesso";
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
}
