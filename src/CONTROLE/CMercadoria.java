/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.MercadoriaDAO;
import MODELO.Mercadoria;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CMercadoria {
    
           CMercadoria cMercadoria;
    public Mercadoria mercadoria;
    public MercadoriaDAO mercadoriaDao;
    private ResultSet rs;
    
    public CMercadoria(){
        mercadoria = new Mercadoria();
        mercadoriaDao = new MercadoriaDAO();
    }
public String gravar(Mercadoria mercadoria){
        return mercadoriaDao.gravar(mercadoria);
        
    }
    public boolean buscar(Mercadoria mercadoria){
        
        try {
           // JOptionPane.showMessageDialog(null,"antes DAO" + mercadoria.getCod());
            rs = mercadoriaDao.localizar((mercadoria.getCod()));
            mercadoria.setCod(rs.getInt(1));
            mercadoria.setCodFabricante(rs.getInt(2));
            mercadoria.setCodFornecedor(rs.getInt(3));
            mercadoria.setMarca(rs.getString(4));
            mercadoria.setModelo(rs.getString(5));
            mercadoria.setValorCustoMercadoria(rs.getFloat(6));
            mercadoria.setNome(rs.getString(7));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (Mercadoria mercadoria){
        String msg = mercadoriaDao.apagar(mercadoria.getCod());
        return msg;
    }
}
