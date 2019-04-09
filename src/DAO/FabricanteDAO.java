/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.Fabricante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ME-23
 */
public class FabricanteDAO {
    Fabricante fabricante;
    public BD bd;
    public String msg;
    public String sql;
    
    
    public FabricanteDAO(){
        bd = new BD();
    }
    
    
    public ResultSet localizar(int cod) {
        // JOptionPane.showMessageDialog(null, "teste");
        sql = "select * from tbfabricante where COD_FABRICANTE = " + cod;
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(sql));
            bd.setRs(bd.getPst().executeQuery());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    
    public String gravar(Fabricante fabricante) {
        JOptionPane.showMessageDialog(null, "Esta chegando no fabricante dao");
        this.fabricante = fabricante;
        try {
            bd.setSql("insert into tbfabricante (COD_FABRICANTE, NOME,TELEFONE,CELULAR,CNPJ,EMAIL,RUA,RUA_NUMERO,CEP,BAIRRO,CIDADE,COMPLEMENTO,ESTADO) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //JOptionPane.showMessageDialog(null,sql);
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, fabricante.getCod());
            bd.getPst().setString(2, fabricante.getNome());
            bd.getPst().setString(3, fabricante.getTelefone());
            bd.getPst().setString(4, fabricante.getCelular());
            bd.getPst().setString(5, fabricante.getCnpj());
            bd.getPst().setString(6, fabricante.getEmail());
            bd.getPst().setString(7, fabricante.getRua());
            bd.getPst().setInt(8, fabricante.getNumero());
            bd.getPst().setString(9, fabricante.getCep());
            bd.getPst().setString(10, fabricante.getBairro());
            bd.getPst().setString(11, fabricante.getCidade());
            bd.getPst().setString(12, fabricante.getComplemento());
            bd.getPst().setString(13, fabricante.getEstado());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return msg = "Falha no cadastro";
            } else {
                bd.connection.close();
                return msg = "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
        public String apagar(int cod) {
        bd.setSql("delete from tbfabricante where COD_FABRICANTE = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                msg = "Fabricante apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
        public boolean alterar(Fabricante fabricante) {
        this.fabricante = fabricante;
        try {
            bd.setSql("update tbfabricante set NOME = ?,TELEFONE = ? ,CELULAR = ?,CNPJ = ?,EMAIL = ?,RUA = ?,RUA_NUMERO = ?,CEP = ?,BAIRRO = ?,CIDADE = ?,COMPLEMENTO = ?,ESTADO = ? WHERE COD_FABRICANTE = ?");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));

            bd.getPst().setString(1, fabricante.getNome());
            bd.getPst().setString(2, fabricante.getTelefone());
            bd.getPst().setString(3, fabricante.getCelular());
            bd.getPst().setString(4, fabricante.getCnpj());
            bd.getPst().setString(5, fabricante.getEmail());
            bd.getPst().setString(6, fabricante.getRua());
            bd.getPst().setInt(7, fabricante.getNumero());
            bd.getPst().setString(8, fabricante.getCep());
            bd.getPst().setString(9, fabricante.getBairro());
            bd.getPst().setString(10, fabricante.getCidade());
            bd.getPst().setString(11, fabricante.getComplemento());
            bd.getPst().setString(12, fabricante.getEstado());
            bd.getPst().setInt(13, fabricante.getCod());
            JOptionPane.showMessageDialog(null, bd.getPst().executeUpdate());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return true;
                //return msg = "Falha no cadastro";
            } else {
                bd.connection.close();
               // return msg = "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
