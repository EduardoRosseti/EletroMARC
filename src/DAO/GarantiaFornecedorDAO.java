/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.GarantiaFornecedor;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class GarantiaFornecedorDAO {

    BD bd;
    GarantiaFornecedor garantiaFornecedor;
    
    public GarantiaFornecedorDAO() {
        bd = new BD();
    }
    
    
    public String gravar(GarantiaFornecedor garantiaFornecedor) {
        this.garantiaFornecedor = garantiaFornecedor;
        try {
            bd.setSql("insert into tbgarantiafornecedor (COD_GARANTIA_FORNECEDOR,COD_MERCADORIA,DATA,VALOR_PAGO) values(?,?,?,?)");
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, garantiaFornecedor.getCod());
            bd.getPst().setInt(2, garantiaFornecedor.getMercadoria().getCod());
            bd.getPst().setString(3, garantiaFornecedor.getDataCadastro());
            bd.getPst().setDouble(4, garantiaFornecedor.getValorPagoFornecedor());
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
        bd.setSql("select * from tbgarantiaFornecedor where COD_FUNCIONARIO = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            JOptionPane.showMessageDialog(null, "dd: "+ bd.getRs());
            bd.getRs().next();
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public String apagar(int cod) {
        bd.setSql("delete from tbgarantiaFornecedor where COD_GARANTIA_FORNECEDOR = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            JOptionPane.showMessageDialog(null, "Apagar " + bd.getPst());
            int i = bd.getPst().executeUpdate();
            JOptionPane.showMessageDialog(null, "Apagar " + i);
            if (i > 0) {
                String msg = "GarantiaFornecedor apagado com sucesso";
                return msg;
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }
    
}
