
package it.unica.mensa.utils;
import java.util.Calendar;
import java.util.TimeZone;
import it.unica.mensa.exceptions.InvalidParamException;

public class Utils {
    public static void checkString(String param, int min, int max) throws InvalidParamException{
        if (param == null)
            throw new InvalidParamException("Parametro Nullo");
        
       if (param.length() < min || param.length() > max)
               throw new InvalidParamException("Devi inserire un minimo di "+ min + " e un massimo di " + max + " caratteri.");
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
