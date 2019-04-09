/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editobd.getRs().
 */
package DAO;

/**
 *
 * @author jose
 */
import CONTROLE.CTabela;
import java.util.ArrayList;
import MODELO.Tabela;
import java.sql.*;
import javax.swing.JOptionPane;
public class TabelaDAO {
    
    BD bd;
    public Tabela tabela;
    public TabelaDAO(){
        bd = new BD();
    }
    
    public ArrayList table(String []p){
        ArrayList dad = new ArrayList();
        bd.setSql("select "+p[0]+","+p[1]+","+p[2]+","+p[3]+" from "+p[4]);
        try {
            Connection conexao = bd.conectar();
            bd.setPst(conexao.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            bd.getRs().first();
            do{

                dad.add(new Object[]{bd.getRs().getInt(p[0]),bd.getRs().getString(p[1]),bd.getRs().getString(p[2]),bd.getRs().getString(p[3])});
            }while(bd.getRs().next());
            JOptionPane.showMessageDialog(null, "chegoo");
            return dad; 
        } catch (Exception e) {
            return dad;
        }
        //return null;
    }
    
    public ResultSet pesquisar(String tb, String nome, String op){
        bd.setSql("select * from  "+tb+" where "+op+" like '" + nome +"%'");
        try {
            Connection conexao = bd.conectar();
            bd.setPst(conexao.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao efetuar leiura " + e);
        }
        return null;
    }
        public ResultSet pesquisarOrc(String tb, String nome, String op){
        bd.setSql("SELECT COD_ORCAMENTO,C.NOME AS 'NOME CLIENTE',M.NOME AS 'NOME MERCADORIA' ,SERVICO_SOLICITADO,DESCRICAO,DATA,VALOR_MERCADORIA,VALOR_MAO_OBRA,VALOR_TOTAL,STATUS FROM "+tb+" AS O " +
                "INNER JOIN TBCLIENTE AS C ON O.COD_CLIENTE = C.COD_CLIENTE " +
                "INNER JOIN TBMERCADORIA AS M ON O.COD_MERCADORIA = M.COD_MERCADORIA where "+op+" like '" + nome +"%'");

        try {
            Connection conexao = bd.conectar();
            bd.setPst(conexao.prepareStatement(bd.getSql()));
            bd.setRs(bd.getPst().executeQuery());
            return bd.getRs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao efetuar leiura " + e);
        }
        return null;
    }
}
