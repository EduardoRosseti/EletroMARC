/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class FuncionarioDAO {
    BD bd;
    Funcionario funcionario;
    
    public FuncionarioDAO() {
        bd = new BD();
    }
    
    
    public String gravar(Funcionario funcionario) {
        this.funcionario = funcionario;
        try {
            bd.setSql("insert into tbfuncionario (COD_FUNCIONARIO,NOME,DATA_NASCIMENTO,TELEFONE,CELUALR,CPF,RG,EMAIL,RUA,RUA_NUMERO,CEP,BAIRO,CIDADE,COMPLEMENTO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, funcionario.getCod());
            bd.getPst().setString(2, funcionario.getNome());
            bd.getPst().setString(3, funcionario.getDataNasc());
            bd.getPst().setString(4, funcionario.getTelefone());
            bd.getPst().setString(5, funcionario.getCelular());
            bd.getPst().setString(6, funcionario.getCpf());
            bd.getPst().setString(7, funcionario.getRg());
            bd.getPst().setString(8, funcionario.getEmail());
            bd.getPst().setString(9, funcionario.getRua());
            bd.getPst().setInt(10, funcionario.getNumero());
            bd.getPst().setString(11, funcionario.getCep());
            bd.getPst().setString(12, funcionario.getBairro());
            bd.getPst().setString(13, funcionario.getCidade());
            bd.getPst().setString(14, funcionario.getComplemento());
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

    /**
     *
     * @return
     */
    public ResultSet localizar(int cod) {
        bd.setSql("select * from tbfuncionario where COD_FUNCIONARIO = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String apagar(int cod) {
        bd.setSql("delete from tbfuncionario where COD_FUNCIONARIO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "Funcionario apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }

}
    

