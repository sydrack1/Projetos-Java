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
import model.bean.Adiantamentos;
import model.bean.Funcionarios;

/**
 *
 * @author Sadrac
 */
public class AdiantamentosDAO {
 
    public void create(Adiantamentos a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO adiantamentos(dataadiantamento,saladiantado, idfuncionario) VALUES (?,?,?)");
            stmt.setString(1, a.getDataAdiantamento());
            stmt.setFloat(2, a.getSalAdiantado());
            stmt.setInt(3, a.getIdfuncionario());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " Salvo com sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<Adiantamentos> read(Funcionarios f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Adiantamentos> adiantamento = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT *" +
                                        "FROM adiantamentos WHERE idfuncionario = ? ORDER BY dataadiantamento");//a JOIN funcionarios f ON c.idfuncionario = f.id ORDER BY a.dataadiantamento");
            stmt.setInt(1, f.getId());
            rs = stmt.executeQuery();
            
            while(rs.next()){
                     Adiantamentos a = new Adiantamentos();
                
                     a.setId(rs.getInt("id"));
                     a.setDataAdiantamento(rs.getString("dataadiantamento"));
                     a.setSalAdiantado(rs.getFloat("saladiantado"));
                     a.setIdfuncionario(rs.getInt("idfuncionario"));
                     
                     adiantamento.add(a);
                
            }
       
        } catch (SQLException ex) {
            Logger.getLogger(AdiantamentosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return adiantamento;
    }
     public void delete(int id){
        
        // Abre a conexão
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM adiantamentos "
                                     + "WHERE id = ? ");
            stmt.setInt(1, id);
            // Executa o SQL
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    public void delete(Adiantamentos a){
        
        // Abre a conexão
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM adiantamentos "
                                     + "WHERE idfuncionario = ? ");
            stmt.setInt(1, a.getIdfuncionario());
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
