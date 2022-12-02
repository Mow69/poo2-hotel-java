package services.implementions;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Date;

import data.Chambre;
import data.Client;
import data.Commande;
import data.Personnel;
import services.interfaces.ReservationServiceInterface;

public class ReservationService implements ReservationServiceInterface {

    @Override
    public boolean reserverChambre(Chambre m_chambre, Client m_client, Date m_dateDebutReservationSaisies, Date m_datesFinReservationSaisies) {
        utils.Utils utils = new utils.Utils();

        String identifiant = utils.getIdentifiant();
        String dateAchat = utils.getDateDuJour();
        Date formattedDateAchat = new Date();

        try {
            formattedDateAchat = utils.formatStringToDate(dateAchat);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        Commande commande = new Commande(identifiant, formattedDateAchat, m_dateDebutReservationSaisies, m_datesFinReservationSaisies,  m_chambre);
        
        // return commande;

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

        return false;
    }

    @Override
    public boolean planifieNettoyage(Chambre m_chambre, Personnel m_hotesse, Date m_dateNettoyageSaisie) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
