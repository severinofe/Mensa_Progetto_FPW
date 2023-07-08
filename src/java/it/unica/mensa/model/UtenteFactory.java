/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unica.mensa.model;

import it.unica.mensa.db.DatabaseManager;
import it.unica.mensa.exceptions.InvalidParamException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sever
 */
public class UtenteFactory {
    
    private static UtenteFactory instance;
    
    private UtenteFactory(){}
    
    public static UtenteFactory getInstance(){
        if (instance == null){
                instance = new UtenteFactory();
        }
        return instance;
    } 
    
    public boolean registraUtente(Utente nuovoUtente) throws SQLException, InvalidParamException{

        if(nuovoUtente==null)
        {
            throw new InvalidParamException("ERRORE NUOVOUTENTE=NULL");
        }
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;

        try {
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "INSERT INTO utenti VALUES (?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1,nuovoUtente.getUsername());
            stmt.setString(2, nuovoUtente.getPassword());
            stmt.setString(3, nuovoUtente.getNome());
            stmt.setString(4, nuovoUtente.getCognome());
            stmt.setString(5, nuovoUtente.getEmail());
            stmt.setString(6, "");
            
            set = stmt.executeQuery();
            
            
        }
        catch(SQLException e) {
            Logger.getLogger(UtenteFactory.class.getName()).log(Level.SEVERE,null,e);
            return false;
        }
        finally{
        try{set.close();}catch(Exception e){ }  
        try{stmt.close();}catch(Exception e){ }  
        try{conn.close();}catch(Exception e){ }  
        
        } 
        return true;
            
        
    }
    
    public Utente getUtentebyUsernamePassword(String username, String password){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet set = null;
        
        try {
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "SELECT * FROM utenti WHERE username =? and pass =?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1,username);
            stmt.setString(2, password);
            
            set = stmt.executeQuery();
            
            if(set.next()){
                Utente utente = new Utente();
                utente.setUsername(set.getString("username"));
                utente.setPassword(set.getString("pass"));
                utente.setNome(set.getString("nome"));
                utente.setCognome(set.getString("cognome"));
                utente.setEmail(set.getString("email"));
                utente.setFoto(set.getString("foto"));
                return utente;
            }
            else {
                return null;
            }
        } catch(SQLException e) {
            Logger.getLogger(UtenteFactory.class.getName()).log(Level.SEVERE,null,e);
        }
        
      finally{
        try{set.close();}catch(Exception e){ }  
        try{stmt.close();}catch(Exception e){ }  
        try{conn.close();}catch(Exception e){ }  
        
        } 
      
        return null;
        
    }
}
