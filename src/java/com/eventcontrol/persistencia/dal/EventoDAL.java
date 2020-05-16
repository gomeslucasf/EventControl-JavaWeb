package com.eventcontrol.persistencia.dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.eventcontrol.model.Evento;
import com.eventcontrol.persistencia.Conexao;
import com.eventcontrol.persistencia.DAOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                        Evento evento = gerar(rs);
                        con.close();
                        return evento;
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
    
    public List<Evento> getByIniDate(String eval, String date)
    {
        String sql = "SELECT "
                + "*"
                + "FROM evento "
                + "WHERE eve_ini #1 #2";
        
        sql = sql.replace("#1", eval);
        sql = sql.replace("#2", "'%"+ date +"%'");
        List<Evento> eventos = new ArrayList<Evento>();
        try(Connection con = Conexao.abrir())
        {
            try (Statement st = con.createStatement())
            {
                try (ResultSet rs = st.executeQuery(sql)) {
                    if (rs.next()) {
                        eventos.add(gerar(rs));
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
        
        return eventos;
    }
    
    public void inserir(Evento novo)
            throws DAOException {
        String sql = "INSERT INTO evento (eve_nome, eve_ini, eve_fim) VALUES "
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
    
    public void update(Evento alt)
            throws DAOException {
        String sql = "UPDATE evento SET eve_nome = #1, eve_ini = #2, eve_fim = #3"
                + "WHERE codigo = #4";
        sql = sql.replace("#1", "'"+ alt.getNome() +"'");
        sql = sql.replace("#2", "'"+ alt.getInicio() +"'");
        sql = sql.replace("#3", "'"+ alt.getFim() +"'");
        sql = sql.replace("#4", "'"+ alt.getCodigo() +"'");

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
        String sql = "DELETE FROM evento WHERE codigo = #1";
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
