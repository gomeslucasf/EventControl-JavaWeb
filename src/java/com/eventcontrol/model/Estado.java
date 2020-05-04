package com.eventcontrol.model;

import java.io.Serializable;
import java.util.Objects;

public class Estado implements Serializable {
    private int codigo;
    private String nome, sigla;

    public Estado() {
        this.setCodigo(0);
        this.setNome("");
        this.setSigla("");
    }

    public Estado(String nome, String sigla) {
        this();
        this.setNome(nome);
        this.setSigla(sigla);
    }
    
    public Estado(int codigo, String nome, String sigla) {
        this(nome, sigla);
        this.setCodigo(codigo);
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.sigla);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sigla, other.sigla)) {
            return false;
        }
        return true;
    }
}
