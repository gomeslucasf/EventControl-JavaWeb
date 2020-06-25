/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.persistencia.dal;

import com.eventcontrol.model.Palestra;
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
public class PalestraDAL {
    
    public PalestraDAL()
    {
        
    }
    
    private Palestra gerar(ResultSet rs) throws SQLException
    {
        return new Palestra(rs.getInt("pal_codigo"), rs.getInt("eve_codigo"), 
                rs.getString("pal_nome"), rs.getInt("pal_nr_inscritos_max"),
                rs.getString("pal_descricao"), rs.getDate("pal_data")
        );
    }
    
    public List<Palestra> getByAluno(int aluno)
    {
        String sql = "SELECT "
                + "*"
                + "FROM palestra "
                + "INNER JOIN matricula_palestra ON matricula_palestra.pal_codigo = palestra.pal_codigo"
                + "INNER JOIN matricula ON matricula.mat_codigo = matricula_palestra.mat_codigo"
                + "INNER JOIN aluno ON aluno.alu_codigo = matricula.alu_codigo"
                + "WHERE aluno.alu_codigo = #1";
        
        sql = sql.replace("#1", "'"+ aluno +"'");
        List<Palestra> palestras = new ArrayList<Palestra>();
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    while(rs.next()) {
                        palestras.add(gerar(rs));
                    }
                    
                    return palestras;
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
    
    public void inserir(Palestra novo)
            throws DAOException {
        String sql = "insert into palestra(eve_codigo, pal_nome,"
                + "pal_nr_inscritos_max, pal_descricao, pal_data) values ('" + novo.getCodigoEvento() + "', '" + novo.getNumeroMaxInscritos()+ "', "
                + " '"+ novo.getDescricao() +"', '"+ novo.getData() +"')";
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
