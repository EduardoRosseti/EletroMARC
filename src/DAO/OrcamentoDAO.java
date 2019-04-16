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
            bd.setSql("insert into tborcamento (COD_CLIENTE,COD_MERCADORIA,SERVICO_SOLICITADO,DESCRICAO,DATA,VALOR_MERCADORIA,COD_PRESTACAO_SERVICO,VALOR_TOTAL,STATUS,STATUS_PAG) values(?,?,?,?,?,?,?,?,?,?)");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, orcamento.getCodCliente());
            bd.getPst().setInt(2, orcamento.getCodMercadoria());
            bd.getPst().setString(3, orcamento.getServicoSolicitado());
            bd.getPst().setString(4, orcamento.getDescricaoProblema());
            String dia = orcamento.getDataSolicitacao().substring(0, 2);
            String mes = orcamento.getDataSolicitacao().substring(3, 5);
            String ano = orcamento.getDataSolicitacao().substring(6);
            orcamento.setDataSolicitacao(ano+"-"+mes+"-"+dia);
            bd.getPst().setString(5, orcamento.getDataSolicitacao());
            bd.getPst().setFloat(6, orcamento.getValorProdutoUtilizado());
            bd.getPst().setInt(7, orcamento.getcodPrestacaoServicos());
            bd.getPst().setFloat(8, orcamento.getValorTotal());
            bd.getPst().setString(9, orcamento.getStatus());
            bd.getPst().setString(10, "Nao Pago");
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
    public String alterar(Orcamento orcamento) {
        this.orcamento = orcamento;
        try {
            bd.setSql("update tborcamento set COD_CLIENTE = ? ,COD_MERCADORIA = ?,SERVICO_SOLICITADO = ?,DESCRICAO = ? ,DATA = ?,VALOR_MERCADORIA = ?,COD_PRESTACAO_SERVICO = ?,VALOR_TOTAL = ?,STATUS = ? WHERE COD_ORCAMENTO = "+ orcamento.getCod());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, orcamento.getCodCliente());
            bd.getPst().setInt(2, orcamento.getCodMercadoria());
            bd.getPst().setString(3, orcamento.getServicoSolicitado());
            bd.getPst().setString(4, orcamento.getDescricaoProblema());
            String dia = orcamento.getDataSolicitacao().substring(0, 2);
            String mes = orcamento.getDataSolicitacao().substring(3, 5);
            String ano = orcamento.getDataSolicitacao().substring(6);
            orcamento.setDataSolicitacao(ano+"-"+mes+"-"+dia);
            bd.getPst().setString(5, orcamento.getDataSolicitacao());
            bd.getPst().setFloat(6, orcamento.getValorProdutoUtilizado());
            bd.getPst().setInt(7, orcamento.getcodPrestacaoServicos());
            bd.getPst().setFloat(8, orcamento.getValorTotal());
            bd.getPst().setString(9, orcamento.getStatus());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na alteração";
            } else {
                bd.connection.close();
               return "Alteração realizada com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public String alterar(Orcamento orcamento,String pago) {
        this.orcamento = orcamento;
        try {
            bd.setSql("update tborcamento set STATUS_PAG = ? WHERE COD_ORCAMENTO = "+ orcamento.getCod());
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, "Pago");
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na alteração";
            } else {
                bd.connection.close();
               return "Alteração realizada com sucesso";

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
            int i = bd.getPst().executeUpdate();
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
