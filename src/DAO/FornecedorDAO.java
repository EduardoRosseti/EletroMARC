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
        System.out.println(fornecedor.getEstado());
        this.fornecedor = fornecedor;
        try {
            bd.setSql("insert into tbfornecedor (NOME,TELEFONE,CELULAR,CNPJ,EMAIL,RUA,RUA_NUMERO,CEP,BAIRRO,CIDADE,COMPLEMENTO,ESTADO) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, fornecedor.getNome());
            bd.getPst().setString(2, fornecedor.getTelefone());
            bd.getPst().setString(3, fornecedor.getCelular());
            bd.getPst().setString(4, fornecedor.getCnpj());
            bd.getPst().setString(5, fornecedor.getEmail());
            bd.getPst().setString(6, fornecedor.getRua());
            bd.getPst().setInt(7, fornecedor.getNumero());
            bd.getPst().setString(8, fornecedor.getCep());
            bd.getPst().setString(9, fornecedor.getBairro());
            bd.getPst().setString(10, fornecedor.getCidade());
            bd.getPst().setString(11, fornecedor.getComplemento());
            bd.getPst().setString(12, fornecedor.getEstado());
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
    public String alterar(Fornecedor fornecedor) {
        System.out.println(fornecedor.getEstado());
        this.fornecedor = fornecedor;
        try {
            bd.setSql("update tbfornecedor SET NOME = ?,TELEFONE = ?,CELULAR = ?,CNPJ = ?,EMAIL = ? ,RUA = ?,RUA_NUMERO = ?,CEP = ?,BAIRRO = ?,CIDADE = ?,COMPLEMENTO = ?,ESTADO= ? where COD_FORNECEDOR = " + fornecedor.getCod());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, fornecedor.getNome());
            bd.getPst().setString(2, fornecedor.getTelefone());
            bd.getPst().setString(3, fornecedor.getCelular());
            bd.getPst().setString(4, fornecedor.getCnpj());
            bd.getPst().setString(5, fornecedor.getEmail());
            bd.getPst().setString(6, fornecedor.getRua());
            bd.getPst().setInt(7, fornecedor.getNumero());
            bd.getPst().setString(8, fornecedor.getCep());
            bd.getPst().setString(9, fornecedor.getBairro());
            bd.getPst().setString(10, fornecedor.getCidade());
            bd.getPst().setString(11, fornecedor.getComplemento());
            bd.getPst().setString(12, fornecedor.getEstado());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na atualização";
            } else {
                bd.connection.close();
                return "Atualizado com sucesso";

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
            int i = bd.getPst().executeUpdate();
            if (i > 0) {
                return "Fornecedor apagado com sucesso";               
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }

}
