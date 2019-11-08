/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Sadrac
 */
public class Adiantamentos {
    private int id;
    private String dataAdiantamento;
    private float salAdiantado;
    private int idfuncionario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDataAdiantamento() {
        return dataAdiantamento;
    }

    public void setDataAdiantamento(String dataAdiantamento) {
        this.dataAdiantamento = dataAdiantamento;
    }
    
    public float getSalAdiantado() {
        return salAdiantado;
    }

    public void setSalAdiantado(float salAdiantado) {
        this.salAdiantado = salAdiantado;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

}
