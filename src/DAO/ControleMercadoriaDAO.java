/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;

import MODELO.ControleMercadoria;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ControleMercadoriaDAO {

    BD bd;
    ControleMercadoria controleMercadoria;
    
    public ControleMercadoriaDAO() {
        bd = new BD();
    }
    
        public String gravar(ControleMercadoria controleMercadoria) {
        this.controleMercadoria = controleMercadoria;
        try {
            bd.setSql("insert into tbcontroleMercadoria (COD_SAIDA_MERCADORIA,COD_MERCADORIA,MOTIVO_SAIDA,DATA_SAIDA,VALOR) values(?,?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, controleMercadoria.getCod());
            bd.getPst().setInt(2, controleMercadoria.getCodMercadoria());
            bd.getPst().setString(3, controleMercadoria.getMotivoSaida());
            bd.getPst().setString(4, controleMercadoria.getDate());
            bd.getPst().setDouble(5, controleMercadoria.getValor());
            JOptionPane.showMessageDialog(null, bd.getPst().executeUpdate());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                //return msg = "Falha no cadastro";
            } else {
                bd.connection.close();
               // return msg = "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ResultSet localizar(int cod) {
        bd.setSql("select * from tbcontroleMercadoria where COD_SAIDA_MERCADORIA = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            //JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String apagar(int cod) {
        bd.setSql("delete from tbcontroleMercadoria where COD_SAIDA_MERCADORIA = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "ControleMercadoria apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }

}
