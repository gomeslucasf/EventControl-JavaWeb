/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.controller.servlet.admin;

import com.eventcontrol.model.Instrutor;
import com.eventcontrol.persistencia.dal.InstrutorDAL;
import com.eventcontrol.util.AuthHelper;
import com.eventcontrol.util.ConfigPage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gomes
 */
@WebServlet(name = "AdminInstrutorServlet", urlPatterns = {"/admin/instrutor/cadastro"})
public class AdminInstrutorServlet extends HttpServlet {

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
        if (auth.isAdminLoggedIn()) {
            String error = "";
            if (request.getMethod().equals("DELETE")) {
                String btn_remover = (String) request.getParameter("btnRemover");

                if (btn_remover != null && !btn_remover.isEmpty()) {
                    InstrutorDAL idal = new InstrutorDAL();
                    String evt_id = (String) request.getParameter("inst_id");
                    if (evt_id != null && !evt_id.isEmpty()) {
                        try {
                            int cod = Integer.parseInt(evt_id);
                            idal.delete(cod);
                        } catch (Exception e) {
                            error = "Código inválido";
                        }
                    } else {
                        error = "Código não informado";
                    }
                }
            } else if(request.getMethod().equals("POST")) 
            {
                String btn_submit = (String)request.getParameter("btnSubmit");
                if(btn_submit != null && !btn_submit.isEmpty())
                {
                    String nome_instrutor = (String)request.getParameter("inputNomeInstrutor");
                    String curr_instrutor = (String)request.getParameter("inputNomeEvento");
                    String id_instrutor = (String)request.getParameter("inputCurriculo");

                    if(nome_instrutor != null && !nome_instrutor.isEmpty())
                    {
                        if(curr_instrutor != null && !curr_instrutor.isEmpty())
                        {
                            InstrutorDAL idal = new InstrutorDAL();
                            Instrutor inst = new Instrutor();
                            inst.setNome(nome_instrutor);
                            inst.setCurriculo(curr_instrutor);
                            
                            if(id_instrutor != null && !id_instrutor.isEmpty())
                            {
                                inst.setCodigo(id_instrutor);
                                idal.update(inst);
                            }else{
                                idal.inserir(inst);
                            }
                            
                        } else {
                            error = "Data de inicio obrigatória";
                        }
                    } else {
                        error = "Nome do evento obrigatório";
                    }
                }
            }

            request.setAttribute("error", error);
            request.setAttribute("configTemplate", new ConfigPage("../admin/cadastroEvento.jsp", "Evento"));
            request.getRequestDispatcher("/pages/template/templateAdministrador.jsp").forward(request, response);
        } else {
            response.sendRedirect("/eventos/");
            return;
        }
        
        request.setAttribute("configTemplate", new ConfigPage("../admin/cadastroInstrutor.jsp","Instrutor"));
        request.getRequestDispatcher("/pages/template/templateAdministrador.jsp").forward(request, response); 
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
