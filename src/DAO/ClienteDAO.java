/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import CONTROLE.CCliente;
import MODELO.Cliente;
import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ClienteDAO {

    Cliente cliente;
    BD bd; 

    public ClienteDAO() {
        bd = new BD();
    }

    public String gravar(Cliente cliente) {
        this.cliente = cliente;
        try {
            bd.setSql("insert into tbcliente (COD_CLIENTE,NOME,DATA_NASCIMENTO,TELEFONE,CELULAR,CPF,RG,EMAIL,RUA,RUA_NUMERO,CEP,BAIRRO,CIDADE,COMPLEMENTO,ESTADO) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, cliente.getCod());
            bd.getPst().setString(2, cliente.getNome());
            String dia = cliente.getDataNasc().substring(0, 2);
            String mes = cliente.getDataNasc().substring(3, 5);
            String ano = cliente.getDataNasc().substring(6);
            cliente.setDataNasc(ano+"-"+mes+"-"+dia);
            bd.getPst().setString(3, cliente.getDataNasc());
            bd.getPst().setString(4, cliente.getTelefone());
            bd.getPst().setString(5, cliente.getCelular());
            bd.getPst().setString(6, cliente.getCpf());
            bd.getPst().setString(7, cliente.getRg());
            bd.getPst().setString(8, cliente.getEmail());
            bd.getPst().setString(9, cliente.getRua());
            bd.getPst().setInt(10, cliente.getNumero());
            bd.getPst().setString(11, cliente.getCep());
            bd.getPst().setString(12, cliente.getBairro());
            bd.getPst().setString(13, cliente.getCidade());
            bd.getPst().setString(14, cliente.getComplemento());
            bd.getPst().setString(15, cliente.getEstado());
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
    public boolean alterar(Cliente cliente) {
        this.cliente = cliente;
         JOptionPane.showMessageDialog(null, cliente.getDataNasc());
        try {
            bd.setSql("update tbcliente set NOME = ?,DATA_NASCIMENTO = ?,TELEFONE = ? ,CELULAR = ?,CPF = ?,RG = ?,EMAIL = ?,RUA = ?,RUA_NUMERO = ?,CEP = ?,BAIRRO = ?,CIDADE = ?,COMPLEMENTO = ?,ESTADO = ? WHERE COD_CLIENTE = ?");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));

            bd.getPst().setString(1, cliente.getNome());
            String dia = cliente.getDataNasc().substring(0, 2);
            String mes = cliente.getDataNasc().substring(2, 4);
            String ano = cliente.getDataNasc().substring(4,8);
            cliente.setDataNasc(ano+"-"+mes+"-"+dia);
           JOptionPane.showMessageDialog(null, cliente.getDataNasc());
            bd.getPst().setString(2, cliente.getDataNasc());
            bd.getPst().setString(3, cliente.getTelefone());
            bd.getPst().setString(4, cliente.getCelular());
            bd.getPst().setString(5, cliente.getCpf());
            bd.getPst().setString(6, cliente.getRg());
            bd.getPst().setString(7, cliente.getEmail());
            bd.getPst().setString(8, cliente.getRua());
            bd.getPst().setInt(9, cliente.getNumero());
            bd.getPst().setString(10, cliente.getCep());
            bd.getPst().setString(11, cliente.getBairro());
            bd.getPst().setString(12, cliente.getCidade());
            bd.getPst().setString(13, cliente.getComplemento());
            bd.getPst().setString(14, cliente.getEstado());
            bd.getPst().setInt(15, cliente.getCod());
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

    /**
     *
     * @return
     */
    public ResultSet localizar(int cod) {
        bd.setSql("select * from tbcliente where COD_CLIENTE = " + cod);
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
        bd.setSql("delete from tbcliente where COD_CLIENTE = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "Cliente apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
}




