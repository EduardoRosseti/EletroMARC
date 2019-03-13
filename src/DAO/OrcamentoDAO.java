/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Orcamento;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class OrcamentoDAO {
    
    BD bd;
    Orcamento orcamento;

    public OrcamentoDAO() {
        bd = new BD();
    }
    
    public String gravar(Orcamento orcamento) {
        this.orcamento = orcamento;
        try {
            bd.setSql("insert into tborcamento (COD_ORCAMENTO,COD_MERCADORIA,COD_CLIENTE,SERVICO_SOLICITADO,DESCRICAO,DATA,VALOR_MERCADORIA,VALOR_MAO_OBRA,VALOR_TOTAL,STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, orcamento.getCod());
            bd.getPst().setInt(2, orcamento.getCodCliente());
            bd.getPst().setInt(3, orcamento.getCodMercadoria());
            bd.getPst().setString(4, orcamento.getServicoSolicitado());
            bd.getPst().setString(5, orcamento.getDescricaoProblema());
            bd.getPst().setString(6, orcamento.getDataSolicitacao());
            bd.getPst().setFloat(7, orcamento.getValorProdutoUtilizado());
            bd.getPst().setFloat(8, orcamento.getValorMaoObra());
            bd.getPst().setFloat(9, orcamento.getValorTotal());
            bd.getPst().setString(10, orcamento.getStatus());
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
        bd.setSql("select * from tborcamento where COD_ORCAMENTO = " + cod);
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
        bd.setSql("delete from tborcamento where COD_ORCAMENTO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "Orcamento apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
    
}
