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

        Chambre chambre1 = new Chambre(1, false, false, false);
        Client monClient = new Client();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateDebutReservation = new Date();
        Date dateFinReservation = new Date();
        Date dateAchat = new Date();

        try {
            dateDebutReservation = simpleDateFormat.parse("11/12/2022");
            dateFinReservation = simpleDateFormat.parse("16/12/2022");
            dateAchat = simpleDateFormat.parse(utils.getDateDuJour());


        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // ReservationService maReservation = new ReservationService();
        ReservationService maReservation = ReservationService.getInstance();

       Commande commande = maReservation.reserverChambre(chambre1, monClient, dateDebutReservation, dateFinReservation);


        System.out.println(commande); 
        

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