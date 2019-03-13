/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import javax.swing.DefaultListModel;

/**
 *
 * @author jose
 */
public class Lista {
 
    
   public DefaultListModel modelo;
    
    public Lista(){
        modelo = new DefaultListModel();
    }
    public DefaultListModel getModelo() {
        return this.modelo;
    }

    public void setModelo(DefaultListModel modelo) {
        this.modelo = modelo;
    }
}
