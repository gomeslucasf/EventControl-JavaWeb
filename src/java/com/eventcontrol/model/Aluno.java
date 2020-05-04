package com.eventcontrol.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Aluno implements Serializable {
    private int codigo, end_numero;
    private String nome, email, senha, endereco, complemento, cep, cpf;
    private Date data_nasc;
    private Cidade cidade;

    public Aluno() {
    }

    public Aluno(int end_numero, String nome, String email, String senha, String endereco, String complemento, String cep, String cpf, Date data_nasc, Cidade cidade) {
        this.end_numero = end_numero;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.complemento = complemento;
        this.cep = cep;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.cidade = cidade;
    }

    public Aluno(int codigo, int end_numero, String nome, String email, String senha, String endereco, String complemento, String cep, String cpf, Date data_nasc, Cidade cidade) {
        this.codigo = codigo;
        this.end_numero = end_numero;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.complemento = complemento;
        this.cep = cep;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.cidade = cidade;
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

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        if(end_numero > 0)
            this.end_numero = end_numero;
        else
            this.end_numero = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.senha);
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
        final Aluno other = (Aluno) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
}
