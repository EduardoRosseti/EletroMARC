/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ValoresServicos {
    private int cod;
    private String nome;
    private float valorPrestacaoServico;
    private String dataCadastro;
    private String descricao;


    public ValoresServicos(){
        
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valorPrestacaoServico
     */
    public float getValorPrestacaoServico() {
        return valorPrestacaoServico;
    }

    /**
     * @param valorPrestacaoServico the valorPrestacaoServico to set
     */
    public void setValorPrestacaoServico(float valorPrestacaoServico) {
        this.valorPrestacaoServico = valorPrestacaoServico;
    }

    /**
     * @return the dataCadastro
     */
    public String getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
