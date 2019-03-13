/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ME-23
 */
public class FornecedorDAO {

    Fornecedor fornecedor;
    public BD bd;
    public String msg;
    
    public FornecedorDAO(){
        bd = new BD();
    }
    
     public ResultSet localizar(int cod) {
        // JOptionPane.showMessageDialog(null, "teste");
        bd.setSql("select * from tbfornecedor where COD_FORNECEDOR = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    
    public String gravar(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        try {
            bd.setSql("insert into tbfornecedor (COD_FORNECEDOR,NOME,TELEFONE,CELUALR,CNPJ,EMAIL,RUA,RUA_NUMERO,CEP,BAIRO,CIDADE,COMPLEMENTO) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, fornecedor.getCod());
            bd.getPst().setString(2, fornecedor.getNome());
            bd.getPst().setString(3, fornecedor.getTelefone());
            bd.getPst().setString(4, fornecedor.getCelular());
            bd.getPst().setString(5, fornecedor.getCnpj());
            bd.getPst().setString(6, fornecedor.getEmail());
            bd.getPst().setString(7, fornecedor.getRua());
            bd.getPst().setInt(8, fornecedor.getNumero());
            bd.getPst().setString(9, fornecedor.getCep());
            bd.getPst().setString(10, fornecedor.getBairro());
            bd.getPst().setString(11, fornecedor.getCidade());
            bd.getPst().setString(12, fornecedor.getComplemento());

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
        bd.setSql("delete from tbfornecedor where COD_FORNECEDOR = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                msg = "Cliente apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }

}
