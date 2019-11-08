/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sydrack.model.dao;

import br.com.sydrack.connection.ConnectionFactory;
import br.com.sydrack.model.bean.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Sadrac
 */
public class ProdutoDAO {
    
    public Produto save(Produto p){
        EntityManager em = new ConnectionFactory().getConnection();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            if(p.getId() ==  0){
               em.persist(p);
            }else{
               em.merge(p);
            }
            et.commit();
        }catch(NumberFormatException e){
            System.err.println(e);
            et.rollback();
        }finally{
           em.close();
           ConnectionFactory.closeConnection();
        }
        return p;
    }
    public List<Produto> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Produto> produtos = null;
        
        try{
            
           produtos = em.createQuery("from Produto p").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return produtos;
    }
    public Produto findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Produto produto = null;
        
        try{
            produto = em.find(Produto.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return produto;
    }
    public Produto remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Produto p = null;
        EntityTransaction et = em.getTransaction();
        
        try{
            
            p = em.find(Produto.class, id);
            et.begin();
            em.remove(p);
            et.commit();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return p;
    }
    
    
}
