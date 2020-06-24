/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.user;

import com.eventcontrol.model.Evento;
import com.eventcontrol.util.ConfigPage;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


/**
 *
 * @author Gomes
 */
@WebServlet(name = "UsuarioIndexServlet", urlPatterns = {"/usuario"})
public class UsuarioIndexServlet extends HttpServlet {

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
        
            // Lista Eventos com Ultimas vagas
            // Lista Dos meus eventos no dia 
            ArrayList<Evento> listEvent = new ArrayList<Evento>();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fim = null;
            Date inicio = null;
            try{
                fim = new Date(sdf.parse("2020-07-03").getTime());
                inicio = new Date(sdf.parse("2020-06-03").getTime());
            }catch(Exception e)
            {
                
            }
            listEvent.add(new Evento ("Javita uebis", inicio, fim));
            listEvent.add(new Evento ("LP", inicio, fim));
            listEvent.add(new Evento ("KALI LINUX", inicio, fim));
            
            listEvent.add(new Evento ("Hackingo", inicio, fim));
            
            request.setAttribute("listEvent", listEvent);
            
            request.setAttribute("configTemplate", new ConfigPage("../usuario/dashboard.jsp", "Tela inicial")); 
            request.getRequestDispatcher("/pages/template/templateUsuario.jsp").forward(request, response);
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
