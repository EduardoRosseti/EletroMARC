/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;
import DAO.TabelaDAO;
import MODELO.Tabela;
import VISUAL.TelaPrincipal;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author jose
 */
public class CTabela {
    public Tabela tabela;
    public TabelaDAO tabeladao;
    
    
    public CTabela(){
        tabela = new Tabela();
        tabeladao = new TabelaDAO();
        
    }
    
    public ArrayList preencherCliente(String []p){
        ArrayList result = tabeladao.table(p);
       // JOptionPane.showMessageDialog(null, "retorno a tabeladao.table "+result);
        return result;
    }
    public ArrayList preencherFornecedor(String []p){
        ArrayList result = tabeladao.table(p);
       // JOptionPane.showMessageDialog(null, "retorno a tabeladao.table "+result);
        return result;
    }
    public ArrayList preencherFabricante(String []p){
        ArrayList result = tabeladao.table(p);
       // JOptionPane.showMessageDialog(null, "retorno a tabeladao.table "+result);
        return result;
    }
    
    public ResultSet pesq(String tb, String nome,String op){
        ResultSet result = tabeladao.pesquisar(tb,nome,op);

        //JOptionPane.showMessageDialog(null," " + result);
        return result;
    }
    public ResultSet pesqOrc(String tb, String nome,String op){
        ResultSet result = tabeladao.pesquisarOrc(tb,nome,op);

        //JOptionPane.showMessageDialog(null," " + result);
        return result;
    }
   
}
