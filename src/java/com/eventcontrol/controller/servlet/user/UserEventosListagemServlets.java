/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.user;

import com.eventcontrol.model.Evento;
import com.eventcontrol.model.Palestra;
import com.eventcontrol.util.ConfigPage;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gomes
 */
@WebServlet(name = "UserEventosListagemServlets", urlPatterns = {"/usuario/lista"})
public class UserEventosListagemServlets extends HttpServlet {

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
            
        
        ArrayList<Palestra> listaPalestrasUltimasVagas = new ArrayList<Palestra>();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fim = null;
            Date inicio = null;
            try{
                fim = new Date(sdf.parse("2020-07-03").getTime());
                inicio = new Date(sdf.parse("2020-06-03").getTime());
            }catch(Exception e)
            {
                
            }
            listaPalestrasUltimasVagas.add(new Palestra (0,1,"Javita uebis", 20,"Essa palestra e sobre java",inicio));
            listaPalestrasUltimasVagas.add(new Palestra (0,1,"Javita uebis 2 ", 20,"Essa palestra e sobre java",inicio));
            listaPalestrasUltimasVagas.add(new Palestra (0,1,"Javita uebis 3 ", 20,"Essa palestra e sobre java",inicio));
            
            
            request.setAttribute("listaPalestrasUltimasVagas", listaPalestrasUltimasVagas);
            request.setAttribute("palestraHoje", new Palestra (0,1,"Javita uebis", 20,"Essa palestra e sobre java",inicio));
            request.setAttribute("configTemplate", new ConfigPage("../usuario/listaEscolherEventos.jsp","Lista de Eventos"));
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
