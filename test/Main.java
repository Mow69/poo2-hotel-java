import java.text.ParseException;
import java.util.Date;

import data.Chambre;
import data.Client;
import services.implementions.ReservationService;
import utils.Utils;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws ParseException {
    // public static void main(String[] args) throws ParseException {
        Utils utils = new Utils();

        Chambre chambre1 = new Chambre(1, false, false, false);
        Client monClient = new Client();

        Date dateDebutReservation = utils.formatStringToDate("08/12/2022");
        Date dateFinReservation = utils.formatStringToDate("16/12/2022");
        // Date dateAchat = utils.convertStringToDate(utils.getDateDuJour());

        // ReservationService maReservation = new ReservationService();
        ReservationService maReservation = ReservationService.getInstance();

       maReservation.reserverChambre(chambre1, monClient, dateDebutReservation, dateFinReservation);


        

        //____________________________________________

        // String date1 = utils.getDateDuJour();
        // String date2 = "21/09/2021";

        // Date formattedDate1 = utils.formatStringToDate(date1);
        // Date formattedDate2 = utils.formatStringToDate(date2);


        // System.out.println(date1); 
        // System.out.println(date2); 
        // System.out.println(utils.compareDates(formattedDate1, formattedDate2)); 

        // System.out.println(utils.getIdentifiant()); 


    }

}