/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package it.unica.mensa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.unica.mensa.exceptions.InvalidParamException;
import it.unica.mensa.utils.Utils;
import java.util.Hashtable;
import javax.servlet.http.HttpSession;
import it.unica.mensa.model.Utente;
import it.unica.mensa.model.UtenteFactory;

/**
 *
 * @author sever
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        
        
        
        String username = request.getParameter("username");
        String psw = request.getParameter("psw");
        int minUsername=4, maxUsername=20;
        int minPsw=4, maxPsw=50;
        
            
            try{
                Utils.checkUsername(username);
                Utils.checkPassword(psw);
                Utente utente = UtenteFactory.getInstance().getUtentebyUsernamePassword(username,psw);
                if(utente!=null){
                    session.setAttribute("username",username); // Set Username
                    session.setAttribute("lastLogin",Utils.convertTime(session.getLastAccessedTime())); // Set Last Login
                    session.setAttribute("email",utente.getEmail()); // Set Last Login
                    
                    session.setMaxInactiveInterval(120); // Set tempo massimo di inattività prima che la sessione scada
                    response.sendRedirect("areaPersonale.jsp");
        
                }   
            else{throw new InvalidParamException("Username o Password non validi");
                }
        }
        catch(InvalidParamException e){
            session.invalidate(); // Invalido la sessione per qualunque errore in fase di login
            request.setAttribute("errorMessage", e.getMessage());
            request.setAttribute("link", "Accedi.jsp");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            
        }
            
        
    }
    
     private boolean login(String user, String pass){
        Hashtable<String, String> users = new Hashtable<String, String>();
        users.put("cucca","66190");
        users.put("delrio","66186");
        users.put("fele","66164");
        users.put("olla","66195");
        
        
        if(users.containsKey(user) && users.get(user).equals(pass)) return true;
        
        return false;
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
