/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.admin;

import com.eventcontrol.model.Admin;
import com.eventcontrol.util.AuthHelper;
import com.eventcontrol.persistencia.dal.AdminDAL;
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
@WebServlet(name = "AdminServlet", urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {

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
        
        AuthHelper auth = new AuthHelper(request.getSession());
        
        String erro = "";
        if(!auth.isAdminLoggedIn())
        {
            String bSubmit = (String)request.getParameter("btnAcessar");

            if(request.getMethod().equals("POST") && bSubmit != null && !bSubmit.isEmpty())
            {
                String a_login = (String)request.getParameter("a_login");
                String a_passwd = (String)request.getParameter("a_password");

                AdminDAL adal = new AdminDAL();
                Admin usuario = adal.getByLogin(a_login);

                if(usuario != null)
                {
                    if(usuario.getSenha().equals(a_passwd))
                    {
                        request.getSession().setAttribute("admin", usuario);
                        response.sendRedirect("/eventos/admin/index");
                        return;
                    } else {
                        erro = "Senha inválida";
                    }
                } else {
                    erro = "Usuário inválido";
                }
            }
        } else {
            response.sendRedirect("/eventos/admin/index");
        }
        request.setAttribute("erro", erro);
        request.getRequestDispatcher("/pages/admin/login.jsp").forward(request, response);
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
