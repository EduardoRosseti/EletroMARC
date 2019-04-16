/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Pagamento;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class PagamentoDAO {
    
    BD bd;
    Pagamento pagamento;

    public PagamentoDAO() {
        bd = new BD();
    }
    
    
    public ResultSet localizar(int cod) {
        // JOptionPane.showMessageDialog(null, "teste");
        bd.setSql("select * from tbpagamento where COD_PAGAMENTO = " + cod);
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
    
    
    public String gravar(Pagamento pagamento) {
        JOptionPane.showMessageDialog(null, pagamento.getCodOrcamento());
        this.pagamento = pagamento;
        try {
            bd.setSql("insert into tbpagamento (COD_ORCAMENTO,FORMA_PAGAMENTO,DESCONTO,DATA_PAGAMENTO,TOTAL) values (?,?,?,now(),?)");
            JOptionPane.showMessageDialog(null,bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, pagamento.getCodOrcamento());
            bd.getPst().setString(2, pagamento.getFormaPagamento());
            bd.getPst().setFloat(3, pagamento.getDesconto());
            bd.getPst().setFloat(4, pagamento.getValor());
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
    
        public String apagar(int cod) {
        bd.setSql("delete from tbpagamento where COD_PAGAMENTO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            if (i > 0) {
                return "Pagamento apagado com sucesso";
            }
            return "Houve falha ao apagar Pagamento";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null; 
        }
    }
    
}
