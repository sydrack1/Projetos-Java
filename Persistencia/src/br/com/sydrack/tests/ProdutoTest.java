/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sydrack.tests;
import br.com.sydrack.model.bean.Produto;
//import br.com.sydrack.model.bean.Categoria;
import br.com.sydrack.model.dao.ProdutoDAO;
//import java.util.List;

/**
 *
 * @author Sadrac
 */
public class ProdutoTest {
    public static void main(String[] args) {
        ProdutoDAO pDAO = new ProdutoDAO();
        pDAO.remove(5);
       
       
        pDAO.findAll().forEach((Produto p) ->{
           String name = "Nome: "+ p.getNome()+ " Quantidade: "+Integer.toString(p.getQtd()) +"  Preço: "+ Double.toString(p.getPreco())+" Categoria: "+ p.getCategoria().getDescricao();
           System.out.println(name);
        });
        
    }
}
