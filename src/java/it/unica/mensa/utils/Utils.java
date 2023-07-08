
package it.unica.mensa.utils;
import java.util.Calendar;
import java.util.TimeZone;
import it.unica.mensa.exceptions.InvalidParamException;

public class Utils {
    
    public static final int minNomeCognome=3;
    public static final int maxNomeCognome=30;
    public static final int minUsername=3;
    public static final int maxUsername=20;
    public static final int maxEmail=50;
    public static final int minNome=3;
    public static final int minPassword=4;
    public static final int maxPassword=20;


    
    
    
    public static void checkNomeCognome(String param) throws InvalidParamException{
        if (param == null)
            throw new InvalidParamException("Parametro Nullo");
        
       if (param.length() < minNomeCognome || param.length() > maxNomeCognome)
               throw new InvalidParamException("Devi inserire un minimo di "+ minNomeCognome + " e un massimo di " + maxNomeCognome + " caratteri.");
    }
    
    public static void checkUsername(String param) throws InvalidParamException{
        if (param == null)
            throw new InvalidParamException("Parametro Nullo");
        
       if (param.length() < minPassword || param.length() > maxPassword)
               throw new InvalidParamException("Per il tuo username devi inserire un minimo di "+ minUsername + " e un massimo di " + maxUsername + " caratteri.");
    }
    public static void checkPassword(String param) throws InvalidParamException{
        if (param == null)
            throw new InvalidParamException("Parametro Nullo");
        
       if (param.length() < minPassword || param.length() > maxPassword)
               throw new InvalidParamException("Per la tua password devi inserire un minimo di "+ minPassword + " e un massimo di " + maxPassword + " caratteri.");
    }
    
    public static void checkEmail(String param) throws InvalidParamException{
        if (param == null)
            throw new InvalidParamException("Parametro Nullo");
        
       if (param.length() > maxEmail)
               throw new InvalidParamException("Per il tuo indirizzo email devi inserire un massimo di " + maxEmail + " caratteri.");
    }
  
    public static void checkInteger (String param, int min, int max) throws InvalidParamException {
      try
        {
           int value = Integer.valueOf(param);
           if( value < min || value>max)
               throw new InvalidParamException("Devi inserire un minimo di "+ min + " e un massimo di " + max + ".");
        } catch(NumberFormatException e) {
            throw new InvalidParamException("La stringa" + param + "non rappresenta un numero intero");
        }
    }
    
    public static String convertTime(long time){
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(time);
        return (cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.MONTH)+1)+ "/" +
                cal.get(Calendar.YEAR) + " " + cal.get(Calendar.HOUR_OF_DAY)+ ":" +
                cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
}
