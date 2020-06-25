/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.user;

import com.eventcontrol.model.Evento;
import com.eventcontrol.model.Palestra;
import com.eventcontrol.persistencia.dal.PalestraDAL;
import com.eventcontrol.util.ConfigPage;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
            
        String aluno_cod_str = (String)request.getSession().getAttribute("USER");
        int alu_cod;
        try {
            alu_cod = Integer.parseInt(aluno_cod_str);
        } catch (Exception e) {
            alu_cod = 1;
        }
        
        PalestraDAL p_dal = new PalestraDAL();
        List<Palestra> listaPalestrasUltimasVagas = p_dal.getByAluno(alu_cod);
            
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fim = null;
        Date inicio = null;
        try{
            fim = new Date(sdf.parse("2020-06-06").getTime());
            inicio = new Date(sdf.parse("2020-06-03").getTime());
        }catch(Exception e)
        {

        }
        Evento infoeste = new Evento(0,"Infoeste 2020",inicio,fim);
        request.setAttribute("listaPalestras", listaPalestrasUltimasVagas);
        request.setAttribute("evento", infoeste);
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
