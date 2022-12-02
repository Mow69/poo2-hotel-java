package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {
    public final int DATE1_BEFORE_DATE2 = 1;
    public final int DATE1_AFTER_DATE2 = 2;
    public final int DATE1_EQUALS_DATE2 = 3;

    /**
     * Fonction utilitaire qui récupère, formate en "dd/MM/yyyy" et retourne la date du jour.
     * @return la date du jour en chaîne de caractères
     */
    public String getDateDuJour() {
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        // LocalDateTime now = LocalDateTime.now();  
        // return dtf.format(now);  

        // Locale locale = new Locale("fr", "FR");
        // DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD, locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = simpleDateFormat.format(new Date());

        return date;
    }

    /**
     * Fonction qui compare 2 dates et affiche si elles sont égale ou non, 
     * et dans ce cas laquelle est supérieure à l'autre
     * @param m_date1
     * @param m_date2
     * @return : 1 si m_date1 > m_date2, 2 si m_date1 < m_date2, 3 si m_date1 = m_date2, 
     */
    public int compareDates(Date m_date1, Date m_date2) {

        if (m_date1.before(m_date2)) {
            return DATE1_BEFORE_DATE2;        
        }

        if (m_date1.equals(m_date2)) {
            return DATE1_EQUALS_DATE2;        
        }
  
        if (m_date1.after(m_date2)) {
            return DATE1_AFTER_DATE2;        
        }

        return 0;
    }

    public Date formatStringToDate(String m_dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date formattedDate = sdf.parse(m_dateString);
        
        return formattedDate;
    }

    public String getIdentifiant() {
        // create a string of uppercase and lowercase characters and numbers
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 10;

        for(int i = 0; i < length; i++) {

        // generate random index number
        int index = random.nextInt(characters.length());

        // get character specified by index
        // from the string
        char randomChar = characters.charAt(index);

        // append the character to string builder
        sb.append(randomChar);
        }

        String randomString = sb.toString();

        return randomString;

    }
    //     /**
    //  * Fonction utilitaire qui récupère et retourne la date du jour.
    //  * @return la date du jour 
    //  */
    // public LocalDateTime donneDateDuJour() {
    //     LocalDateTime now = LocalDateTime.now();  
    //     return now;  
    // }
}
