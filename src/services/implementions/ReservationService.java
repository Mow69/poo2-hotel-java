package services.implementions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import data.Chambre;
import data.Client;
import data.Commande;
import data.Personnel;
import services.interfaces.ReservationServiceInterface;

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
    public Commande reserverChambre(Chambre m_chambre, Client m_client, Date m_dateDebutReservationSaisies, Date m_dateFinReservationSaisies) {
        utils.Utils utils = new utils.Utils();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String identifiant = utils.getIdentifiant();
        String dateAchat = utils.getDateDuJour();
        Date formattedDateAchat = new Date();
        // Date formattedDateDebutReservationSaisies = new Date();
        // Date formattedFinReservationSaisies = new Date();

        try {
            formattedDateAchat = simpleDateFormat.parse("08/12/2022");

            // formattedDateAchat = utils.formatStringToDate("08/12/2022");
            // formattedDateDebutReservationSaisies = utils.formatStringToDate(m_dateDebutReservationSaisies);
            // formattedFinReservationSaisies = utils.formatStringToDate(m_dateFinReservationSaisies);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        Commande commande = new Commande(identifiant, formattedDateAchat, m_dateDebutReservationSaisies, m_dateFinReservationSaisies,  m_chambre);


        return commande;

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
