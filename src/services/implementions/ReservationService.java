package services.implementions;

import java.text.ParseException;
import java.util.Date;

import data.Chambre;
import data.Client;
import data.Commande;
import data.Personnel;
import services.interfaces.ReservationServiceInterface;
import utils.Utils;

public class ReservationService implements ReservationServiceInterface {
    // Static variable reference of reservationService
    // of type ReservationService
    private static ReservationService reservationService = null;

    // Static method
    // Static method to create instance of ReservationService class
    public static ReservationService getInstance()
    {
        if (reservationService == null)
        reservationService = new ReservationService();
  
        return reservationService;
    }

    private ReservationService() {};

    @Override
    public boolean reserverChambre(Chambre m_chambre, Client m_client, Date m_dateDebutReservationSaisies, Date m_dateFinReservationSaisies) throws ParseException {
        utils.Utils utils = new utils.Utils();

        String identifiant = utils.getIdentifiant();
        // Date dateAchat = utils.convertStringToDate(utils.getDateDuJour());
        Date dateAchat = new Date();

        // Comparaison date début et date fin pour la réservation
        int resultatComparaisonDatesReservation = utils.compareDates(m_dateDebutReservationSaisies, m_dateFinReservationSaisies);

        if(Utils.DATE1_BEFORE_DATE2  == resultatComparaisonDatesReservation
            || (Utils.DATE1_EQUALS_DATE2 == resultatComparaisonDatesReservation)) {
            Commande commande = new Commande(identifiant, dateAchat, m_dateDebutReservationSaisies, m_dateFinReservationSaisies,  m_chambre);

            System.out.println(commande);
        } 

        if(Utils.DATE1_AFTER_DATE2  == resultatComparaisonDatesReservation) {
            System.out.println("Les dates saisies ne sont pas correctes.");
        } 

        // Comparaison pour la date début de réservation et la date de fin d'occupation de la chambre
        // int resultatComparaisonDatesDebutReservationFinChambre = utils.compareDates(m_dateDebutReservationSaisies);



        // int comparaisonDates = utils.compareDates(m_dateDebutReservationSaisies, m_dateFinReservationSaisies);
        // switch(comparaisonDates) {
        //     case Utils.DATE1_BEFORE_DATE2:
        //         Commande commande = new Commande(identifiant, dateAchat, m_dateDebutReservationSaisies, m_dateFinReservationSaisies,  m_chambre);
                
        //         System.out.println(commande);
        //         break;
        //     case Utils.DATE1_AFTER_DATE2:
        //       // code block
        //       break;
        //       case Utils.DATE1_EQUALS_DATE2:
        //       // code block
        //       break;
        //     default:
        //       // code block
        //   }

            return false;




        // TODO: Créer ici la commande en mettant son param de date au format lisible par un humain,
        //  mais je le mettrais ensuite en string pour l'affichage dans le main

        // getDateNow :
        // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        // LocalDateTime now = LocalDateTime.now();  
        // System.out.println(dtf.format(now));  

        // Commande
        // private String identifiant;
        // private Date dateAchat;
        // private Date[] datesReservation;
        // private Chambre chambre;

        // return false;
    }

    @Override
    public boolean planifieNettoyage(Chambre m_chambre, Personnel m_hotesse, Date m_dateNettoyageSaisie) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
