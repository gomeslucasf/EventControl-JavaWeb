/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.admin;

import com.eventcontrol.model.Evento;
import com.eventcontrol.util.AuthHelper;
import com.eventcontrol.util.ConfigPage;
import com.eventcontrol.persistencia.dal.EventoDAL;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferii
 */
@WebServlet(name = "AdminEventosServlet", urlPatterns = {"/admin/evento/cadastro"})
public class AdminEventosServlet extends HttpServlet {

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
        if(auth.isAdminLoggedIn())
        {
            String error = "";
            if(request.getMethod().equals("DELETE"))
            {
                String btn_remover = (String)request.getParameter("btnRemover");
                
                if(btn_remover != null && !btn_remover.isEmpty())
                {
                    EventoDAL edal = new EventoDAL();
                    String evt_id = (String)request.getParameter("evt_id");
                    if(evt_id != null && !evt_id.isEmpty())
                    {
                        try
                        {
                            int cod = Integer.parseInt(evt_id);
                            edal.delete(cod);
                        } catch(Exception e) {
                            error = "Código inválido";
                        }
                    } else {
                        error = "Código não informado";
                    }
                }
            }

            request.setAttribute("error", error);
            request.setAttribute("configTemplate", new ConfigPage("../admin/cadastroEvento.jsp","Evento"));
            request.getRequestDispatcher("/pages/template/templateAdministrador.jsp").forward(request, response); 
        } else {
            response.sendRedirect("/eventos/");
            return;
        }
        
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
