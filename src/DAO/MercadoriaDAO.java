/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.BD;
import MODELO.Mercadoria;

/**
 *
 * @author jose
 */
public class MercadoriaDAO {
 
    BD bd;
    Mercadoria mercadoria;

    public MercadoriaDAO() {
        bd = new BD();
    }
    
}
