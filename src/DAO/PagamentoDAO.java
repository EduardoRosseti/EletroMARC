/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Pagamento;

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
    
}
