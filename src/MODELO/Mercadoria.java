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
public class Mercadoria {
    private int cod;
    private int codMercadoria;
    private int codFornecedor;
    private String marca;
    private String modelo;
    private float valorCustoMercadoria;

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

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValorCustoMercadoria() {
        return valorCustoMercadoria;
    }

    public void setValorCustoMercadoria(float valorCustoMercadoria) {
        this.valorCustoMercadoria = valorCustoMercadoria;
    }
    
    
}
