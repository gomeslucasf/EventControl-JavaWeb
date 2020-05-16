/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.persistencia.dal;

import com.eventcontrol.model.Instrutor;
import com.eventcontrol.persistencia.Conexao;
import com.eventcontrol.persistencia.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author feriip3d
 */
public class InstrutorDAL {

    public InstrutorDAL() {
    }
    
    private Instrutor gerar(ResultSet rs) throws SQLException
    {
        return new Instrutor(rs.getInt("ins_codigo"), rs.getString("ins_nome"), 
                rs.getString("ins_curriculo"));
    }
    
    public Instrutor getByCodigo(int codigo)
    {
        String sql = "SELECT "
                + "*"
                + "FROM instrutor "
                + "WHERE codigo = #1";
        
        sql = sql.replace("#1", "'"+ codigo +"'");
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    if (rs.next()) {
                        Instrutor inst = gerar(rs);
                        con.close();
                        return inst;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha ao conectar-se ao banco de dados.");
        }
        
        return null;
    }
    
    public List<Instrutor> getAll()
    {
        String sql = "SELECT "
                + "*"
                + "FROM instrutor ";
        
        List<Instrutor> insts = new ArrayList<Instrutor>();
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    if (rs.next()) {
                        insts.add(gerar(rs));
                    }
                }
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha ao conectar-se ao banco de dados.");
        }
        
        return insts;
    }
    
    public void inserir(Instrutor novo)
            throws DAOException {
        String sql = "INSERT INTO instrutor (nome, curriculo) VALUES "
                + "('" + novo.getNome() + "', '" + novo.getCurriculo() + "')";
        try (Connection conn = Conexao.abrir()) {
            try (Statement st = conn.createStatement()) {
                st.execute(sql);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Erro inserindo registro.");
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha abrindo banco de dados.");
        }
    }
    
    public void delete(int codigo)
            throws DAOException {
        String sql = "DELETE FROM instrutor WHERE codigo = #1";
        sql = sql.replace("#1", "'"+ codigo +"'");
        try (Connection conn = Conexao.abrir()) {
            try (Statement st = conn.createStatement()) {
                st.execute(sql);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Erro inserindo registro.");
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha abrindo banco de dados.");
        }
    }
}
