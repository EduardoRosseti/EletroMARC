/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.MercadoriaDAO;
import MODELO.Mercadoria;
import MODELO.Mercadoria;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CMercadoria {
    
           CMercadoria cMercadoria;
    public Mercadoria mercadoria;
    public MercadoriaDAO mercadoriaDao;
    
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
            mercadoria.setNome(rs.getString(2));
            mercadoria.setDataNasc(rs.getString(3));
            mercadoria.setTelefone(rs.getString(4));
            mercadoria.setCelular(rs.getString(5));
            mercadoria.setCpf(rs.getString(6));
            mercadoria.setRg(rs.getString(7));
            mercadoria.setEmail(rs.getString(8));
            mercadoria.setRua(rs.getString(9));
            mercadoria.setNumero(rs.getInt(10));
            mercadoria.setCep(rs.getString(11));
            mercadoria.setBairro(rs.getString(12));
            mercadoria.setCidade(rs.getString(13));
            mercadoria.setComplemento(rs.getString(14));
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
