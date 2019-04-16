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
public class GarantiaFornecedor {
    
    private int cod;
    private int codMercadoria;
    private float valorPagoFornecedor;
    private String dataCadastro;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodMercadoria() {
        return codMercadoria;
    }

    public void setCodMercadoria(int codMercadoria) {
        this.codMercadoria = codMercadoria;
    }
    
    

    public float getValorPagoFornecedor() {
        return valorPagoFornecedor;
    }

    public void setValorPagoFornecedor(float valorPagoFornecedor) {
        this.valorPagoFornecedor = valorPagoFornecedor;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}
