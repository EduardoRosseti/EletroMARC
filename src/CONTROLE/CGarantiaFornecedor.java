/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.GarantiaFornecedorDAO;
import MODELO.GarantiaFornecedor;

/**
 *
 * @author jose
 */
public class CGarantiaFornecedor {
    
           CGarantiaFornecedor cGarantiaFornecedor;
    public GarantiaFornecedor garantiaFornecedor;
    public GarantiaFornecedorDAO garantiaFornecedorDao;
    
    public CGarantiaFornecedor() {
        garantiaFornecedorDao = new GarantiaFornecedorDAO();
        garantiaFornecedor = new GarantiaFornecedor();
    }
    
}
