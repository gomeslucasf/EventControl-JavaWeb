package com.eventcontroller.dal;

import com.eventcontrol.model.Aluno;
import com.eventcontrol.persistencia.Conexao;
import com.eventcontrol.persistencia.DAOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAL {
    
    public AlunoDAL()
    {
        
    }
    
    private Aluno gerar(ResultSet rs) throws SQLException
    {
        return new Aluno(rs.getInt("alu_codigo"), rs.getInt("alu_numero"), 
                rs.getString("alu_nome"), rs.getString("alu_email"),
                rs.getString("alu_senha"), rs.getString("alu_endereco"), 
                rs.getString("alu_complemento"), rs.getString("alu_cep"), 
                rs.getString("alu_cpf"), rs.getString("alu_data_nasc"), 
                rs.getInt("cid_codigo"));
    }
    
    public Aluno getByEmail(String email)
    {
        String sql = "SELECT "
                + "*"
                + "FROM aluno "
                + "WHERE alu_email = #1";
        
        sql.replace("#1", "'"+ email +"'");
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
    
    public void inserir(Aluno novo)
            throws DAOException {
        String sql = "insert into aluno (alu_email, alu_senha) values ('" + novo.getEmail() + "', '" + novo.getSenha() + "')";
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
