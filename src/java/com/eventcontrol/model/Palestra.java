/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.model;

import java.util.Date;

/**
 *
 * @author Gomes
 */
public class Palestra {
    
    private int codigo;
    private int codigoEvento;
    private String pal_nome;
    private int numeroMaxIncritos;
    private Date data;

    public Palestra(int codigo, int codigoEvento, String pal_nome, int numeroMaxIncritos, Date data) {
        this.codigo = codigo;
        this.codigoEvento = codigoEvento;
        this.pal_nome = pal_nome;
        this.numeroMaxIncritos = numeroMaxIncritos;
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getPal_nome() {
        return pal_nome;
    }

    public void setPal_nome(String pal_nome) {
        this.pal_nome = pal_nome;
    }

    public int getNumeroMaxIncritos() {
        return numeroMaxIncritos;
    }

    public void setNumeroMaxIncritos(int numeroMaxIncritos) {
        this.numeroMaxIncritos = numeroMaxIncritos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
