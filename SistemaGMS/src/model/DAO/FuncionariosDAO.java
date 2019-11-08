/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conecttion.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcionarios;

/**
 *
 * @author Sadrac
 */
public class FuncionariosDAO {
    
    public void create(Funcionarios f){
        
        // Abre a conexão
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionarios (nome, datanascimento, obra) VALUES (?, ?, ?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getDatanascimento());
            stmt.setString(3, f.getObra());
            // EXECUTA O SQL
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Funcionarios> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionarios> funcionarios = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT id,nome,obra FROM funcionarios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios f = new Funcionarios();
                
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setObra(rs.getString("obra"));
                funcionarios.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return funcionarios;
    }
    public List<Funcionarios> readForUpdate(int id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionarios> funcionario = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM funcionarios WHERE id LIKE ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Funcionarios f = new Funcionarios();
                
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setObra(rs.getString("obra"));
                f.setDatanascimento(rs.getString("datanascimento"));
                funcionario.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return funcionario;
    }
    public void update(Funcionarios f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt =  con.prepareStatement("UPDATE funcionarios SET nome = ?, obra = ?, datanascimento = ? WHERE id = ?");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getObra());
            stmt.setString(3, f.getDatanascimento());
            stmt.setInt(4, f.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!!");
 
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Funcionarios f){
        
        // Abre a conexão
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionarios "
                                      + "WHERE id = ? ");
            stmt.setInt(1, f.getId());
            // Executa o SQL
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
