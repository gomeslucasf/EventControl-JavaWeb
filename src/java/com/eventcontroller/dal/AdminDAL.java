/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontroller.dal;

import com.eventcontrol.model.Admin;
import com.eventcontrol.model.Aluno;
import com.eventcontrol.persistencia.Conexao;
import com.eventcontrol.persistencia.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gomes
 */
public class AdminDAL {
    
    public AdminDAL(){}
    
    private Admin gerar(ResultSet rs) throws SQLException
    {
        return new Admin(rs.getInt("usu_codigo"),rs.getString("usu_nome"), rs.getString("usu_login"),rs.getString("usu_senha"));
    }
    
    
    public Admin getByLogin(String login){
        String sql = "SELECT * FROM usuario WHERE usu_login = #1";
        sql = sql.replace("#1", "'"+ login +"'");
        
        try
        {
            Connection con =  Conexao.abrir();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return gerar(rs);
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha ao conectar-se ao banco de dados.");
        }
        return null; 
    }
    
    public void inserir(Admin novo) throws DAOException{

        String sql = "inset into usuario (usu_nome, usu_login, usu_senha) values('"+novo.getNome()+"','"+novo.getLogin()+"','"+novo.getSenha()+"')";
        
        try{
            Connection con = Conexao.abrir();
            Statement st = con.createStatement();
            st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Erro inserindo registro.");
        } catch (NullPointerException ex) {
            Logger.getLogger(AlunoDAL.class.getName()).log(Level.SEVERE, null, ex);
            throw new DAOException("Falha abrindo banco de dados.");
        }
    }
}
