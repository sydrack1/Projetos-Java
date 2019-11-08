/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sydrack.tests;

import br.com.sydrack.model.dao.CategoriaDAO;

/**
 *
 * @author Sadrac
 */
public class CategoriaTest {
    
    public static void main(String[] args) {
        
        CategoriaDAO cDAO = new CategoriaDAO();
       // cDAO.findAll().forEach((c) -> {
        //  System.out.println("Descrição: " + c.getDescricao());
       // }); //System.out.println("Descrição: " + c.getDescricao());
        cDAO.remove(3);
    }
}
