/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package it.unica.mensa.servlet;

import it.unica.mensa.exceptions.InvalidParamException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import it.unica.mensa.model.Utente;
import it.unica.mensa.model.UtenteFactory;
import it.unica.mensa.utils.Utils;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sever
 */
@WebServlet(name = "RegistratiServlet", urlPatterns = {"/RegistratiServlet"})
public class RegistratiServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
       HttpSession session = request.getSession();
       
       Utente nuovo= new Utente();
       
       nuovo.setUsername(request.getParameter("username"));
       nuovo.setPassword(request.getParameter("password"));
       nuovo.setNome(request.getParameter("nome"));
       nuovo.setCognome(request.getParameter("cognome"));
       nuovo.setEmail(request.getParameter("email"));
       //Manca l'immagine
       
       
       try{
           Utils.checkUsername(nuovo.getUsername());
           Utils.checkPassword(nuovo.getPassword());
           Utils.checkNomeCognome(nuovo.getNome());
           Utils.checkNomeCognome(nuovo.getCognome());
           Utils.checkEmail(nuovo.getEmail());
   
           boolean inserimentoCorretto=UtenteFactory.getInstance().registraUtente(nuovo); // Registra Utente nel Database
           
           if(inserimentoCorretto)
           {
               session.setAttribute("nuovo_inserimento",inserimentoCorretto); 
               session.setAttribute("nuovo_nome",nuovo.getNome());
               session.setAttribute("nuovo_cognome",nuovo.getCognome()); 
               session.setAttribute("nuovo_email",nuovo.getEmail()); 
               session.setAttribute("nuovo_username",nuovo.getUsername());
               session.setAttribute("inserimento_corretto", true);
               response.sendRedirect("NuovoUtenteCreato.jsp");
           }
           
           else{
               session.setAttribute("inserimento_corretto", false);
               throw new InvalidParamException("La registrazione non e' andata a buon fine");
                
                }
           
       }
       
       catch(InvalidParamException e){
            session.invalidate(); // Invalido la sessione per qualunque errore in fase di login
            request.setAttribute("errorMessage", e.getMessage());
            request.setAttribute("link", "Registrazione.jsp");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistratiServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    
      /*      try (PrintWriter out = response.getWriter()) {
            
            
            
            
         
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           
            out.println("<h1>Dati inseriti</h1><br>");
            out.println(" <ul>\n" +
"                <li>Nome: </li>\n" +nuovo.getNome() +
"                <li>Cognome: </li>\n" + nuovo.getCognome() +
"                <li>Username: </li>\n" + nuovo.getUsername() + 
"                <li>Email: </li>\n" + nuovo.getEmail() + 
"            </ul>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1><br>");
            out.println("</body>");
            out.println("</html>");
        }*/
}
