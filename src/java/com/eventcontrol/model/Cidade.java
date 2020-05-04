package com.eventcontrol.model;

import java.io.Serializable;
import java.util.Objects;

public class Cidade implements Serializable {
    private int codigo;
    private String nome;
    private Estado uf;

    public Cidade() {
    }

    public Cidade(String nome, Estado uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public Cidade(int codigo, String nome, Estado uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0)
            this.codigo = codigo;
        else
            this.codigo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.uf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        return true;
    }
    
    
}
