package com.eventcontrol.controller.servlet;

import com.eventcontrol.model.Aluno;
import com.eventcontroller.dal.AlunoDAL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferii
 */
@WebServlet(name = "CadastroServlet", urlPatterns = {"/login/cadastro"})
public class CadastroServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String bSubmit = (String)request.getParameter("bSubmit");
        String erro = "";
        
        if(bSubmit != null && !bSubmit.isEmpty())
        {
            String u_email = (String)request.getParameter("u_email");
            String u_passwd = (String)request.getParameter("u_password");
            
            AlunoDAL adal = new AlunoDAL();
            Aluno usuario = adal.getByEmail(u_email);
            
            if(usuario != null)
            {
                erro = "Usuario existente";
            } else {
                Aluno novo = new Aluno();
                novo.setEmail(u_email);
                novo.setSenha(u_passwd);
                
                adal.inserir(novo);
            }
        }
        
        request.setAttribute("erro", erro);
        request.getRequestDispatcher("/pages/cadastro.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
