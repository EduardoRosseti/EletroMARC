/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.PagamentoDAO;
import MODELO.Pagamento;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CPagamento {
    
           CPagamento cPagamento;
    public Pagamento pagamento;
    public PagamentoDAO pagamentoDao;
    
    public CPagamento(){
        pagamento = new Pagamento();
        pagamentoDao = new PagamentoDAO();
    }
    
        
    public String gravar(Pagamento pagamento){
        String r = pagamentoDao.gravar(pagamento);
        return r;
    }
    
     public boolean buscar(Pagamento pagamento){
        
        try {
            //JOptionPane.showMessageDialog(null,"antes DAO" + pagamento.getCod());
            ResultSet rs = pagamentoDao.localizar((pagamento.getCod()));
            pagamento.setCod(rs.getInt(1));
            pagamento.setCodOrcamento(rs.getInt(2));
            pagamento.setFormaPagamento(rs.getString(3));
            pagamento.setDesconto(rs.getFloat(4));
            pagamento.setDataPagamento(rs.getString(5));
            pagamento.setValor(rs.getFloat(6));    
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    return false;
    }
     
     public String apagar (Pagamento pagamento){
        String msg = pagamentoDao.apagar(pagamento.getCod());
        return msg;
    }
}
