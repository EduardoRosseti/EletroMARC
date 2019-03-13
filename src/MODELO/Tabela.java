/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jose
 */
public class Tabela extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null; 
    private int lin;
    private int cod;
    private int tipo;
    
    public Tabela CTabela(ArrayList lin, String[] col) {
        Tabela teste = new Tabela();
        teste.setLinhas(lin);
        teste.setColunas(col);
        return teste;
    }

    public Tabela() {
       
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    /*public void deletarLinha(int lin) {
        JOptionPane.showMessageDialog(null, "liodkjnmkdl,.d");
        linhas.remove(lin);
        JOptionPane.showMessageDialog(null, "deleta");
        fireTableRowsDeleted(lin, lin);
        JOptionPane.showMessageDialog(null, "deleta");
    }*/

    public int getLin() {
        return lin;
    }

    public void setLin(int lin) {
        this.lin = lin;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    

   
    
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList dados) {
        linhas = dados;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] col) {
        colunas = col;
    }

    public int getColumnCount() {
        return colunas.length;

    }

    public int getRowCount() {
        return linhas.size();
    }

    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }
}
