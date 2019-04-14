/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;
import CONTROLE.CUsuario;

/**
 *
 * @author jose
 */
public class Usuario {
    
    private int cod;
    private int codFuncionario;
    private String login;
    private String senha;
    private String perfil;

    
        public int getCod() {
       return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public int getFuncionario() {
        return codFuncionario;
    }

    public void setFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
}
