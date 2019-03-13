/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.PagamentoDAO;
import MODELO.Pagamento;

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
}
