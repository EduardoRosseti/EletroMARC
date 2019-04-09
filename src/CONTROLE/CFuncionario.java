/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.FabricanteDAO;
import DAO.FuncionarioDAO;
import MODELO.Funcionario;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class CFuncionario{
    
          CFuncionario cFuncionario;
   public Funcionario funcionario;
   public FuncionarioDAO funcionarioDao;
    
    public CFuncionario(){
        funcionario = new Funcionario();
        funcionarioDao = new FuncionarioDAO();
        
    }
       public String gravar(Funcionario funcionario){
        return funcionarioDao.gravar(funcionario);
        
    }
    public boolean buscar(Funcionario funcionario){
        
        try {
            JOptionPane.showMessageDialog(null,"antes DAO" + funcionario.getCod());
            ResultSet rs = funcionarioDao.localizar((funcionario.getCod()));
            funcionario.setCod(rs.getInt(1));
            funcionario.setNome(rs.getString(2));
            funcionario.setDataNasc(rs.getString(3));
            funcionario.setTelefone(rs.getString(4));
            funcionario.setCelular(rs.getString(5));
            funcionario.setCpf(rs.getString(6));
            funcionario.setRg(rs.getString(7));
            funcionario.setEmail(rs.getString(8));
            funcionario.setRua(rs.getString(9));
            funcionario.setNumero(rs.getInt(10));
            funcionario.setCep(rs.getString(11));
            funcionario.setBairro(rs.getString(12));
            funcionario.setCidade(rs.getString(13));
            funcionario.setComplemento(rs.getString(14));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro " + e);
        }
    
    return false;
    }
    public String apagar (Funcionario funcionario){
        String msg = funcionarioDao.apagar(funcionario.getCod());
        return msg;
    }
    
    public boolean alterar(Funcionario funcionario){
        return funcionarioDao.alterar(funcionario);
    }
}
