/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONTROLE.CValoresServicos;
import MODELO.Tabela;
import MODELO.ValoresServicos;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ValoresServicosDAO {
    ValoresServicos valoresServicos;
    BD bd;
    
    public ValoresServicosDAO(){
        bd = new BD();
    }
    
    public ResultSet pesquisar(String nome){
        try{
            bd.setSql("SELECT nome from tbcliente where nome like '"+nome+"%' order by nome");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            return bd.getRs();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
    public ResultSet seleciona(int linha, String nome){
        try {
            bd.setSql("SELECT NOME FROM TBCLIENTE WHERE NOME LIKE '"+nome+"%' order by nome limit "+ linha +", 1");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
    

