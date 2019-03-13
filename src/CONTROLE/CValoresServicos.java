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
    public ValoresServicosDAO daoValoresServicos;

    public CValoresServicos() {
        daoValoresServicos = new ValoresServicosDAO();
        valoresServicos = new ValoresServicos();
    }

    public void pesq(String nome) {
        ResultSet rs = daoValoresServicos.pesquisar(nome);
        valoresServicos.getModel().removeAllElements();
    }
}
