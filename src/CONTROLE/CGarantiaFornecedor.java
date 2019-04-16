/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.GarantiaFornecedorDAO;
import MODELO.Cliente;
import MODELO.GarantiaFornecedor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CGarantiaFornecedor {
    
           CGarantiaFornecedor cGarantiaFornecedor;
    public GarantiaFornecedor garantiaFornecedor;
    public GarantiaFornecedorDAO garantiaFornecedorDao;
     private ResultSet rs;
    public CGarantiaFornecedor() {
        garantiaFornecedorDao = new GarantiaFornecedorDAO();
        garantiaFornecedor = new GarantiaFornecedor();
    }
    
    
    public String gravar(GarantiaFornecedor garantiaFornecedor){
        return garantiaFornecedorDao.gravar(garantiaFornecedor);
        
    }
    public String alterar(GarantiaFornecedor garantiaFornecedor){
        return garantiaFornecedorDao.alterar(garantiaFornecedor);
        
    }
    public boolean buscar(GarantiaFornecedor garantiaFornecedor){
        try {
            rs = garantiaFornecedorDao.localizar((garantiaFornecedor.getCod()));
            garantiaFornecedor.setCod(rs.getInt(1));
            garantiaFornecedor.setCodMercadoria(rs.getInt(2));
            garantiaFornecedor.setDataCadastro(rs.getString(3));
            garantiaFornecedor.setValorPagoFornecedor(rs.getFloat(4));
            
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (GarantiaFornecedor garantiaFornecedor){
        String msg = garantiaFornecedorDao.apagar(garantiaFornecedor.getCod());
        return msg;
    }
    
}
