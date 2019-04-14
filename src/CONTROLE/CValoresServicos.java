/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import VISUAL.TelaValoresServicosCadastro;
import DAO.ValoresServicosDAO;
import MODELO.ValoresServicos;
import java.sql.ResultSet;
import MODELO.ValoresServicos;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CValoresServicos {

    public ValoresServicos valoresServicos;
    public ValoresServicosDAO valoresServicosDao;

    public CValoresServicos() {
        valoresServicosDao = new ValoresServicosDAO();
        valoresServicos = new ValoresServicos();
    }

    public String gravar(ValoresServicos valoresServicos){
        String r = valoresServicosDao.gravar(valoresServicos);
        return r;
    }
    
     public boolean buscar(ValoresServicos valoresServico){
        
        try {
            //JOptionPane.showMessageDialog(null,"antes DAO" + valoresServicos.getCod());
            ResultSet rs = valoresServicosDao.localizar((valoresServico.getCod()));
            valoresServicos.setCod(rs.getInt(1));
            valoresServicos.setNome(rs.getString(2));
            valoresServicos.setDataCadastro(rs.getString(3));
            valoresServicos.setValorPrestacaoServico(rs.getFloat(4));
            valoresServicos.setDescricao(rs.getString(5));
    
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    return false;
    }
     
     public String apagar (ValoresServicos valoresServicos){
        String msg = valoresServicosDao.apagar(valoresServicos.getCod());
        return msg;
    }
     
    public String alterar(ValoresServicos valoresServicos){
        return valoresServicosDao.alterar(valoresServicos);
    }
}
