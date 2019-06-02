/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author JOSE
 */
public class RelatorioDAO {
    
    
    BD bd;
    
    public RelatorioDAO(){
        bd = new BD();
    }
    
    public Connection conectar(){
        return bd.conectar();
    }
}
