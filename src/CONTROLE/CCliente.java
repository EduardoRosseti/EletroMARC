/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;
import DAO.ClienteDAO;
import MODELO.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jose
 */
public class CCliente {
    
    public CCliente ccliente;
    public Cliente cliente;
    public ClienteDAO clientedao;
    private ResultSet rs;

    public CCliente(){
        cliente = new Cliente();
        clientedao = new ClienteDAO();
    }
    public String gravar(Cliente cliente){
        return clientedao.gravar(cliente);
        
    }
    public boolean buscar(Cliente cliente){
        
        try {
           // JOptionPane.showMessageDialog(null,"antes DAO" + cliente.getCod());
            rs = clientedao.localizar((cliente.getCod()));
            cliente.setCod(rs.getInt(1));
            cliente.setNome(rs.getString(2));
            cliente.setDataNasc(rs.getString(3));
            cliente.setTelefone(rs.getString(4));
            cliente.setCelular(rs.getString(5));
            cliente.setCpf(rs.getString(6));
            cliente.setRg(rs.getString(7));
            cliente.setEmail(rs.getString(8));
            cliente.setRua(rs.getString(9));
            cliente.setNumero(rs.getInt(10));
            cliente.setCep(rs.getString(11));
            cliente.setBairro(rs.getString(12));
            cliente.setCidade(rs.getString(13));
            cliente.setComplemento(rs.getString(14));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (Cliente cliente){
        String msg = clientedao.apagar(cliente.getCod());
        return msg;
    }
    
    public boolean alterar(Cliente cliente){
        return clientedao.alterar(cliente);
    }
}
