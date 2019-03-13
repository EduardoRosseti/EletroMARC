/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.MercadoriaDAO;
import MODELO.Mercadoria;

/**
 *
 * @author jose
 */
public class CMercadoria {
    
           CMercadoria cMercadoria;
    public Mercadoria mercadoria;
    public MercadoriaDAO daoMercadoria;
    
    public CMercadoria(){
        mercadoria = new Mercadoria();
        daoMercadoria = new MercadoriaDAO();
    }
}
