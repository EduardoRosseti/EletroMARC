/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.RelatorioDAO;
import java.sql.Connection;

/**
 *
 * @author JOSE
 */


public class CRelatorio {

    public CRelatorio cRelatorio;
    public RelatorioDAO relatorioDao;
    
    public CRelatorio(){
        cRelatorio = new CRelatorio();
        relatorioDao = new RelatorioDAO();
    }
    
    public Connection conectar(){
        return relatorioDao.conectar();
    }
    
}
