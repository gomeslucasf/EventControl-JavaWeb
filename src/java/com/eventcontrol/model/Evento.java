package com.eventcontrol.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ferii
 */
public class Evento {
    private int codigo;
    private String nome;
    private Date inicio;
    private Date fim;

    public Evento() {
        this.codigo = 0;
        this.nome = "";
        this.inicio = null;
        this.fim = null;
    }
    
    public Evento(String nome, Date inicio, Date fim) {
        setNome(nome);
        setInicio(inicio);
        setFim(fim);
    }

    public Evento(int codigo, String nome, Date inicio, Date fim) {
        setCodigo(codigo);
        setNome(nome);
        setInicio(inicio);
        setFim(fim);
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    
    public void setInicio(String inicio) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.inicio = new Date(sdf.parse(inicio).getTime());
    }

    public Date getFim() {
        return fim;
    }
    
    public void setFim(String fim) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.fim = new Date(sdf.parse(fim).getTime());
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.codigo;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.inicio);
        hash = 19 * hash + Objects.hashCode(this.fim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.inicio, other.inicio)) {
            return false;
        }
        if (!Objects.equals(this.fim, other.fim)) {
            return false;
        }
        return true;
    }
    
    
}
