/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import MODELO.Validacao;
import javax.swing.JOptionPane;

/**
 *
 * @author ME-23
 */
public class CValidacao {
    Validacao validacao;
  
    public CValidacao(){
        validacao = new Validacao();
    }
    public boolean validaCpf(String cpf){
        JOptionPane.showMessageDialog(null, cpf);
        return validacao.validaCpf(cpf);
    }
    public boolean validaCnpj(String cnpj){
        return validacao.validaCnpj(cnpj);
    }
}
