 /*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class BD {

   public Connection connection = null;
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/eletromarc";
    static String user = "root";
    static String password = "";
    private PreparedStatement pst = null;
    private ResultSet rs;
    private String sql;
    private String msg;
    
    public BD(){
        
    }
    
    public Connection conectar() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Certo");
            return connection;
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null,erro);
            return null;
        }
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
