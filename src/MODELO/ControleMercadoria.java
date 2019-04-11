/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;
import java.util.Date;
/**
 *
 * @author jose
 */
public class ControleMercadoria {
    
    private int cod;
    private int codMercadoria;
    private String motivoSaida;
    private String date;
    private double valor;

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
    
    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
