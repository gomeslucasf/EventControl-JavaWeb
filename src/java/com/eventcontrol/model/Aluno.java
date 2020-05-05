package com.eventcontrol.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Aluno implements Serializable {
    private int codigo, end_numero;
    private String nome, email, senha, endereco, complemento, cep, cpf;
    private String data_nasc;
    private int cidade;

    public Aluno() {
    }

    public Aluno(int end_numero, String nome, String email, String senha, String endereco, String complemento, String cep, String cpf, String data_nasc, int cidade) {
        this.setEnd_numero(end_numero);
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setCpf(cpf);
        this.setData_nasc(data_nasc);
        this.setCidade(cidade);
    }

    public Aluno(int codigo, int end_numero, String nome, String email, String senha, String endereco, String complemento, String cep, String cpf, String data_nasc, int cidade) {
        this.setCodigo(codigo);
        this.setEnd_numero(end_numero);
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setEndereco(endereco);
        this.setComplemento(complemento);
        this.setCep(cep);
        this.setCpf(cpf);
        this.setData_nasc(data_nasc);
        this.setCidade(cidade);
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cod_cidade) {
        this.cidade = cod_cidade;
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
