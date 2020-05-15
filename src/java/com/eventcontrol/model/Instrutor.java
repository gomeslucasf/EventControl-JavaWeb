/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.model;

/**
 *
 * @author Gomes
 */
public class Instrutor {
    private int codigo;
    private String nome;
    private String curriculo;

    public Instrutor() {
    }

    public Instrutor(int codigo, String nome, String curriculo) {
        this.codigo = codigo;
        this.nome = nome;
        this.curriculo = curriculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
    
}
