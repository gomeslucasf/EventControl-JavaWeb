/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Gomes
 */
public class Palestra {
    
    private int codigo;
    private int codigoEvento;
    private String nome;
    private int numeroMaxInscritos;
    private String descricao;
    private Date data;

    public Palestra(int codigo, int codigoEvento, String pal_nome, int numeroMaxInscritos, String descricao, Date data) {
        this.codigo = codigo;
        this.codigoEvento = codigoEvento;
        this.nome = pal_nome;
        this.numeroMaxInscritos = numeroMaxInscritos;
        this.descricao = descricao;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String pal_nome) {
        this.nome = pal_nome;
    }

    public int getNumeroMaxInscritos() {
        return numeroMaxInscritos;
    }

    public void setNumeroMaxInscritos(int numeroMaxInscritos) {
        this.numeroMaxInscritos = numeroMaxInscritos;
    }

    public String getData() {
        
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()). format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
