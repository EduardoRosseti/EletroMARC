/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author jose
 */
public class Orcamento {
    
    private int codCliente;
    private int  codMercadoria;
    private String servicoSolicitado;
    private String dataSolicitacao;
    private String descricaoProblema;
    private float valorProdutoUtilizado;
    private float valorMaoObra;
    private float valorTotal;
    private String status;
    private int cod;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodMercadoria() {
        return codMercadoria;
    }

    public void setCodMercadoria(int codMercadoria) {
        this.codMercadoria = codMercadoria;
    }


    

    public String getServicoSolicitado() {
        return servicoSolicitado;
    }

    public void setServicoSolicitado(String servicoSolicitado) {
        this.servicoSolicitado = servicoSolicitado;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public float getValorProdutoUtilizado() {
        return valorProdutoUtilizado;
    }

    public void setValorProdutoUtilizado(float valorProdutoUtilizado) {
        this.valorProdutoUtilizado = valorProdutoUtilizado;
    }

    public float getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(float valorMaoObra) {
        this.valorMaoObra = valorMaoObra;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}
