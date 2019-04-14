/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.ValoresServicos;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ValoresServicosDAO {

    ValoresServicos valoresServicos;
    BD bd;

    public ValoresServicosDAO() {
        bd = new BD();
    }

    public ResultSet localizar(int cod) {
        // JOptionPane.showMessageDialog(null, "teste");
        bd.setSql("select * from tbprestacaoservico where COD_PRESTACAO_SERVICO = " + cod);
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

    public String gravar(ValoresServicos valoresServicos) {
        this.valoresServicos = valoresServicos;
        try {
            bd.setSql("insert into tbprestacaoservico (NOME,DATA,VALOR_PAGO,DESCRICAO) values(?,now(),?,?)");
            //JOptionPane.showMessageDialog(null,sql);
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, valoresServicos.getNome());
            bd.getPst().setFloat(2, valoresServicos.getValorPrestacaoServico());
            bd.getPst().setString(3, valoresServicos.getDescricao());
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

    public String apagar(int cod) {
        bd.setSql("delete from tbprestacaoservico where COD_PRESTACAO_SERVICO = " + cod);
        try {
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            int i = bd.getPst().executeUpdate();
            if (i > 0) {

                return "ValoresServicos apagado com sucesso";
            }
            return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao apagar " + e);
            return null;
        }
    }

    public String alterar(ValoresServicos valoresServicos) {
        this.valoresServicos = valoresServicos;
        try {
            bd.setSql("update tbprestacaoservico set NOME = ? , DATA = now(), VALOR_PAGO = ?, DESCRICAO = ? WHERE COD_PRESTACAO_SERVICO = " + valoresServicos.getCod());
            System.out.println(bd.getSql());
            Connection conex = bd.conectar();
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.setPst(conex.prepareStatement(bd.getSql()));
            bd.getPst().setString(1, valoresServicos.getNome());
            bd.getPst().setFloat(2, valoresServicos.getValorPrestacaoServico());
            bd.getPst().setString(3, valoresServicos.getDescricao());
            if (bd.getPst().executeUpdate() == 0) {
                bd.connection.close();
                return "Falha na atualização";
            } else {
                bd.connection.close();
                return "Atualizado realizado com sucesso";

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "Falha";
    }
}
