import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import data.Chambre;
import data.Client;
import data.Commande;
import data.Personnel;
import services.implementions.ReservationService;
import utils.Utils;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
    // public static void main(String[] args) throws ParseException {
        Utils utils = new Utils();

        Chambre maChambre = new Chambre();
        Client monClient = new Client();
        Date dateDebutReservation = new Date();
        Date dateFinReservation = new Date();
        try {
            dateDebutReservation = utils.formatStringToDate("08/12/2022");
            dateFinReservation = utils.formatStringToDate("16/12/2022");

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        ReservationService maReservation = new ReservationService();

        Commande commande = maReservation.reserverChambre(maChambre, monClient, dateDebutReservation, dateFinReservation);



        //____________________________________________

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