import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import data.Client;
import data.Personnel;
import utils.Utils;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
    // public static void main(String[] args) throws ParseException {
        Utils utils = new Utils();
        // String date1 = utils.getDateDuJour();
        // String date2 = "21/09/2021";

        // Date formattedDate1 = utils.formatStringToDate(date1);
        // Date formattedDate2 = utils.formatStringToDate(date2);


        // System.out.println(date1); 
        // System.out.println(date2); 
        // System.out.println(utils.compareDates(formattedDate1, formattedDate2)); 

        System.out.println(utils.getIdentifiant()); 


    }

}