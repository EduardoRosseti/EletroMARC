/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.FornecedorDAO;
import MODELO.Fornecedor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ME-23
 */
public class CFornecedor {
    public Fornecedor fornecedor;
    public FornecedorDAO daoFornecedor;
    
    public CFornecedor(){
        fornecedor = new Fornecedor();
        daoFornecedor = new FornecedorDAO();
    }
    
    public String gravar(Fornecedor fornecedor){
        String r =daoFornecedor.gravar(fornecedor);
        return r;
    }
    
     public boolean buscar(Fornecedor fornecedor){
        
        try {
            //JOptionPane.showMessageDialog(null,"antes DAO" + fornecedor.getCod());
            ResultSet rs = daoFornecedor.localizar((fornecedor.getCod()));
            fornecedor.setCod(rs.getInt(1));
            fornecedor.setNome(rs.getString(2));
            fornecedor.setTelefone(rs.getString(3));
            fornecedor.setCelular(rs.getString(4));
            fornecedor.setCnpj(rs.getString(5));
            fornecedor.setEmail(rs.getString(6));
            fornecedor.setRua(rs.getString(7));
            fornecedor.setNumero(rs.getInt(8));
            fornecedor.setCep(rs.getString(9));
            fornecedor.setBairro(rs.getString(10));
            fornecedor.setCidade(rs.getString(11));
            fornecedor.setComplemento(rs.getString(12));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    return false;
    }
     
     public String apagar (Fornecedor fornecedor){
        String msg = daoFornecedor.apagar(fornecedor.getCod());
        return msg;
    }
}
