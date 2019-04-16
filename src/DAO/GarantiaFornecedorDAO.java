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
            bd.setSql("insert into tbgarantiafornecedor (COD_MERCADORIA,DATA,VALOR_PAGO) values(?,now(),?)");
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, garantiaFornecedor.getCodMercadoria());
            bd.getPst().setDouble(2, garantiaFornecedor.getValorPagoFornecedor());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha no cadastro";
            } else {
                bd.connection.close();
               return "Cadastro realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public String alterar(GarantiaFornecedor garantiaFornecedor) {
        this.garantiaFornecedor = garantiaFornecedor;
        try {
            bd.setSql("Update tbgarantiafornecedor SET COD_MERCADORIA = ?, DATA = now(),VALOR_PAGO = ?  WHERE COD_GARANTIA_FORNECEDOR = " + garantiaFornecedor.getCod());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setInt(1, garantiaFornecedor.getCodMercadoria());
            bd.getPst().setDouble(2, garantiaFornecedor.getValorPagoFornecedor());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na atualização";
            } else {
                bd.connection.close();
               return "Alteracao realizada com sucesso";

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
        bd.setSql("select * from tbgarantiafornecedor where COD_GARANTIA_FORNECEDOR = " + cod);
        //JOptionPane.showMessageDialog(null, "localizao"+cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
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
            int i = bd.getPst().executeUpdate();
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
