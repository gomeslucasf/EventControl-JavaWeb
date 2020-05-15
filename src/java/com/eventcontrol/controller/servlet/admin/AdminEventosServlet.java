/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.admin;

import com.eventcontrol.model.Evento;
import com.eventcontrol.util.AuthHelper;
import com.eventcontrol.util.ConfigPage;
import com.eventcontroller.dal.EventoDAL;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AdminEventosServlet", urlPatterns = {"/admin/eventos"})
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
            String bSubmit = (String)request.getParameter("bSubmit");
            if(request.getMethod().equals("POST") && bSubmit != null && bSubmit.isEmpty())
            {
                String titulo = (String)request.getParameter("evt_titulo");
                String data_inicio = (String)request.getParameter("evt_data_ini");
                String data_fim = (String)request.getParameter("evt_data_fim");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                Date inicio = null;
                Date fim = null;
                
                if(titulo != null && !titulo.isEmpty())
                {
                    if(data_inicio != null && !data_inicio.isEmpty())
                    {
                        try {
                            inicio = new Date(sdf.parse(data_inicio).getTime());
                        }
                        catch (Exception e) {
                            error = "ERR_INVALID_IDATE";
                        }
                    }
                    
                    if(data_fim != null && !data_fim.isEmpty())
                    {
                        try {
                            fim = new Date(sdf.parse(data_fim).getTime());
                        }
                        catch (Exception e) {
                            error = "ERR_INVALID_EDATE";
                        }
                    }
                } else {
                    error = "ERR_TITLE_EMPTY";
                }
                
                if(error.isEmpty())
                {
                    Evento evento = new Evento();
                    evento.setFim(fim);
                    evento.setInicio(inicio);
                    evento.setNome(titulo);
                    
                    EventoDAL e_dal = new EventoDAL();
                    e_dal.insert(evento);
                }
            }
            
            ConfigPage cfg = new ConfigPage();
            request.getRequestDispatcher("/pages/admin/cadastroEvento.jsp").forward(request, response);
        } else {
            response.sendRedirect("/eventos/logout");
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
