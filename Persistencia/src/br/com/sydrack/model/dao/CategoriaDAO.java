/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sydrack.model.dao;


import br.com.sydrack.connection.ConnectionFactory;
import br.com.sydrack.model.bean.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author Sadrac
 */
public class CategoriaDAO {
    
    public Categoria save(Categoria c){
        
        EntityManager em = new ConnectionFactory().getConnection();
        EntityTransaction et = em.getTransaction();
        
        try{
            et.begin();
            if(c.getId() == Integer.parseInt(null)){
                em.persist(c);
            }else{
                em.merge(c);
            }
            et.commit();
        }catch(Exception e){
            System.err.println(e);
            et.rollback();
        }finally{
            em.close();
            ConnectionFactory.closeConnection();
        }
        return c;
    }
    public Categoria findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria c = null;
        try{
            c = em.find(Categoria.class, id);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
            ConnectionFactory.closeConnection();
        }
        return c;
    }
    public List<Categoria> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Categoria> categorias = null;
        
        try{
            
            categorias = em.createQuery("from Categoria c").getResultList();
            
        }catch(Exception e){
            System.err.println(e);
        }finally{
            em.close();
        }
        
        return categorias;
    }
    public Categoria remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria c = null;
        try{
            c = em.find(Categoria.class, id);
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        }catch(Exception e){
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return c;
    }
}
