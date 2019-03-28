/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
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
            bd.setSql("insert into tbmercadoria (COD_MERCADORIA,COD_FABRICANTE,COD_FORNECEDOR,MARCA,MODELO,CUSTO,NOME) values(?,?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, mercadoria.getCod());
            bd.getPst().setInt(2, mercadoria.getCodFabricante());
            bd.getPst().setInt(3, mercadoria.getCodFornecedor());
            bd.getPst().setString(4, mercadoria.getMarca());
            bd.getPst().setString(5, mercadoria.getModelo());
            bd.getPst().setFloat(6, mercadoria.getValorCustoMercadoria());
            bd.getPst().setString(7, mercadoria.getRg());
            bd.getPst().setString(8, mercadoria.getEmail());
            bd.getPst().setString(9, mercadoria.getRua());
            bd.getPst().setInt(10, mercadoria.getNumero());
            bd.getPst().setString(11, mercadoria.getCep());
            bd.getPst().setString(12, mercadoria.getBairro());
            bd.getPst().setString(13, mercadoria.getCidade());
            bd.getPst().setString(14, mercadoria.getComplemento());
            JOptionPane.showMessageDialog(null, bd.getPst().executeUpdate());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                //return msg = "Falha no cadastro";
            } else {
                bd.connection.close();
               // return msg = "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
      public ResultSet localizar(int cod) {
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
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "Mercadoria apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
}
