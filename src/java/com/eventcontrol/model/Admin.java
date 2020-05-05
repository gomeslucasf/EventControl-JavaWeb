package com.eventcontrol.model;

import java.io.Serializable;

public class Admin implements Serializable {
    private int codigo;
    private String nome, login, senha;

    public Admin(int codigo, String nome, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
