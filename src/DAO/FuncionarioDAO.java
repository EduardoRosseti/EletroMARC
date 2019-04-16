/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Funcionario;
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
            bd.setSql("insert into tbfuncionario (COD_FUNCIONARIO,NOME_FUNCIONARIO,DATA_NASCIMENTO,TELEFONE,CELULAR,CPF,RG,EMAIL,RUA,RUA_NUMERO,CEP,BAIRRO,CIDADE,COMPLEMENTO,ESTADO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, funcionario.getCod());
            bd.getPst().setString(2, funcionario.getNome());
            String dia = funcionario.getDataNasc().substring(0, 2);
            String mes = funcionario.getDataNasc().substring(2, 4);
            String ano = funcionario.getDataNasc().substring(4,8);
            funcionario.setDataNasc(ano+"-"+mes+"-"+dia);
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
            bd.getPst().setString(15, funcionario.getEstado());
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

    public String alterar(Funcionario funcionario) {
        this.funcionario = funcionario;
        try {
            bd.setSql("update tbfuncionario set NOME_FUNCIONARIO = ?,DATA_NASCIMENTO = ?,TELEFONE = ? ,CELULAR = ?,CPF = ?,RG = ?,EMAIL = ?,RUA = ?,RUA_NUMERO = ?,CEP = ?,BAIRRO = ?,CIDADE = ?,COMPLEMENTO = ?,ESTADO = ? WHERE COD_FUNCIONARIO = ?");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, funcionario.getNome());
            String dia = funcionario.getDataNasc().substring(0, 2);
            String mes = funcionario.getDataNasc().substring(2, 4);
            String ano = funcionario.getDataNasc().substring(4, 8);
            funcionario.setDataNasc(ano + "-" + mes + "-" + dia);
            bd.getPst().setString(2, funcionario.getDataNasc());
            bd.getPst().setString(3, funcionario.getTelefone());
            bd.getPst().setString(4, funcionario.getCelular());
            bd.getPst().setString(5, funcionario.getCpf());
            bd.getPst().setString(6, funcionario.getRg());
            bd.getPst().setString(7, funcionario.getEmail());
            bd.getPst().setString(8, funcionario.getRua());
            bd.getPst().setInt(9, funcionario.getNumero());
            bd.getPst().setString(10, funcionario.getCep());
            bd.getPst().setString(11, funcionario.getBairro());
            bd.getPst().setString(12, funcionario.getCidade());
            bd.getPst().setString(13, funcionario.getComplemento());
            bd.getPst().setString(14, funcionario.getEstado());
            bd.getPst().setInt(15, funcionario.getCod());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha ao atualizar";
            } else {
                bd.connection.close();
                return "Atualizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    /**
     *
     * @param cod
     * @return
     */
    
    public ResultSet localizar(int cod) {
        bd.setSql("select * from tbfuncionario where COD_FUNCIONARIO = " + cod);
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

    public String apagar(int cod) {
        bd.setSql("delete from tbfuncionario where COD_FUNCIONARIO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            int i = bd.getPst().executeUpdate();
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
