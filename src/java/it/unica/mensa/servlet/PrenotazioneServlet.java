/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package it.unica.mensa.servlet;

import java.io.IOException;
import java.time.LocalDate;
import it.unica.mensa.utils.Utils;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.unica.mensa.exceptions.InvalidParamException;
import it.unica.mensa.model.Prenotazione;

/**
 *
 * @author sever
 */
@WebServlet(name = "PrenotazioneServlet", urlPatterns = {"/PrenotazioneServlet"})
public class PrenotazioneServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            String nome=request.getParameter("nome");
            String cognome=request.getParameter("cognome");
            String email=request.getParameter("email");
            LocalDate data = LocalDate.parse(request.getParameter("data"));


            int minNome=3, maxNome=20;
            int minEmail=7, maxEmail=30;
            

/*

            try  {
                Utils.checkString(nome,minNome,maxNome);
                Utils.checkString(nome,minNome,maxNome);
                Utils.checkString(nome,minEmail,maxEmail);


            }
            catch(InvalidParamException e) {

            }
        }*/
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
