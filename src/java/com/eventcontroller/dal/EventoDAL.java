package com.eventcontroller.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.eventcontrol.model.Evento;
import com.eventcontrol.persistencia.Conexao;
import com.eventcontrol.persistencia.DAOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferii
 */
public class EventoDAL {
    public EventoDAL()
    {
        
    }
    
    private Evento gerar(ResultSet rs) throws SQLException
    {
        return new Evento(rs.getInt("eve_codigo"), rs.getString("eve_nome"), 
                rs.getDate("eve_inicio"), rs.getDate("eve_fim"));
    }
    
    public Evento getByCodigo(int codigo)
    {
        String sql = "SELECT "
                + "*"
                + "FROM evento "
                + "WHERE codigo = #1";
        
        sql = sql.replace("#1", "'"+ codigo +"'");
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    if (rs.next()) {
                        return gerar(rs);
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
    
    public Evento getByNome(String nome)
    {
        String sql = "SELECT "
                + "*"
                + "FROM evento "
                + "WHERE eve_nome LIKE #1";
        
        sql = sql.replace("#1", "'%"+ nome +"%'");
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    if (rs.next()) {
                        return gerar(rs);
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
    
    public void inserir(Evento novo)
            throws DAOException {
        String sql = "INSERT INTO evento (alu_email, alu_senha) VALUES "
                + "('" + novo.getNome() + "', '" + novo.getInicio() + "', "
                + "'" + novo.getFim() + "')";
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
