/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.OrcamentoDAO;
import MODELO.Orcamento;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class COrcamento {
    
          COrcamento cOrcamento;
   public Orcamento orcamento;
   public OrcamentoDAO orcamentoDao;
    ResultSet rs;
    
    public COrcamento() {
        orcamento = new Orcamento();
        orcamentoDao = new OrcamentoDAO();
    }
    public String gravar(Orcamento orcamento){
        return orcamentoDao.gravar(orcamento);    
    }
    
    public String alterar(Orcamento orcamento){
        return orcamentoDao.alterar(orcamento);    
    }
    
    public boolean buscar(Orcamento orcamento){
        
        try {
           // JOptionPane.showMessageDialog(null,"antes DAO" + orcamento.getCod());
            rs = orcamentoDao.localizar((orcamento.getCod()));
            orcamento.setCod(rs.getInt(1));
            orcamento.setCodMercadoria(rs.getInt(2));
            orcamento.setCodCliente(rs.getInt(3));
            orcamento.setServicoSolicitado(rs.getString(4));
            orcamento.setDescricaoProblema(rs.getString(5));
            orcamento.setDataSolicitacao(rs.getString(6));
            orcamento.setValorProdutoUtilizado(rs.getFloat(7));
            orcamento.setcodPrestacaoServicos(rs.getInt(8));
            orcamento.setValorTotal(rs.getFloat(9));
            orcamento.setStatus(rs.getString(10));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (Orcamento orcamento){
        String msg = orcamentoDao.apagar(orcamento.getCod());
        return msg;
    }
    
    
}
