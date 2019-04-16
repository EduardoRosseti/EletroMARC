/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;
import DAO.ControleMercadoriaDAO;
import MODELO.ControleMercadoria;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CControleMercadoria {

    public ControleMercadoria    controleMercadoria;
    public ControleMercadoriaDAO controleMercadoriaDao;
    public CControleMercadoria   cControleMercadoria;
    ResultSet rs;

    public CControleMercadoria() {
        controleMercadoria = new ControleMercadoria();
        controleMercadoriaDao = new ControleMercadoriaDAO();
    }
    
    
    public String gravar(ControleMercadoria controleMercadoria){
        return controleMercadoriaDao.gravar(controleMercadoria);
        
    }
    public String alterar(ControleMercadoria controleMercadoria){
        return controleMercadoriaDao.alterar(controleMercadoria);
        
    }
    public boolean buscar(ControleMercadoria controleMercadoria){
        
        try {
           // JOptionPane.showMessageDialog(null,"antes DAO" + controleMercadoria.getCod());
            rs = controleMercadoriaDao.localizar((controleMercadoria.getCod()));
            controleMercadoria.setCod(rs.getInt(1));
            controleMercadoria.setCodMercadoria(rs.getInt(2));
            controleMercadoria.setMotivoSaida(rs.getString(3));
            controleMercadoria.setDate(rs.getString(4));
            controleMercadoria.setValor(rs.getDouble(5));
          
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (ControleMercadoria controleMercadoria){
        String msg = controleMercadoriaDao.apagar(controleMercadoria.getCod());
        return msg;
    }

}
