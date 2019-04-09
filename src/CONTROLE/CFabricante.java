/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.FabricanteDAO;
import MODELO.Fabricante;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ME-23
 */
public class CFabricante {
    public Fabricante fabricante;
    FabricanteDAO daoFabricante;
    public CFabricante(){
        fabricante = new Fabricante();
        daoFabricante = new FabricanteDAO();
    }
    
    public String gravar(Fabricante fabricante){
        String r = daoFabricante.gravar(fabricante);
        return r;
    }
    
     public boolean buscar(Fabricante fabricante){
        
        try {
            //JOptionPane.showMessageDialog(null,"antes DAO" + fabricante.getCod());
            ResultSet rs = daoFabricante.localizar((fabricante.getCod()));
            fabricante.setCod(rs.getInt(1));
            fabricante.setNome(rs.getString(2));
            fabricante.setTelefone(rs.getString(3));
            fabricante.setCelular(rs.getString(4));
            fabricante.setCnpj(rs.getString(5));
            fabricante.setEmail(rs.getString(6));
            fabricante.setRua(rs.getString(7));
            fabricante.setNumero(rs.getInt(8));
            fabricante.setCep(rs.getString(9));
            fabricante.setBairro(rs.getString(10));
            fabricante.setCidade(rs.getString(11));
            fabricante.setComplemento(rs.getString(12));
            fabricante.setEstado(rs.getString(13));
    
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    return false;
    }
     
     public String apagar (Fabricante fabricante){
        String msg = daoFabricante.apagar(fabricante.getCod());
        return msg;
    }
     
    public boolean alterar(Fabricante fabricante){
        return daoFabricante.alterar(fabricante);
    }
}
