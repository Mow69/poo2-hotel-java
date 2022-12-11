package services.implementions;

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
    public boolean reserverChambre(Chambre m_chambre, Client m_client, int m_jourReservation) {
        utils.Utils utils = new utils.Utils();

        String identifiant = utils.getIdentifiant();

        // if() {

            if(true == m_chambre.getEtatReservation()) {
                System.out.println("La chambre n°" + m_chambre.getNumero() + " n'est pas actuellement réservable.");
                return false;
            }
            if(false == m_chambre.getEtatDisponibilite()) {
                System.out.println("La chambre n°" + m_chambre.getNumero() + " est indisponible.");
                return false;
            }
            if(false == m_chambre.getEtatProprete()) {
                System.out.println("La chambre n°" + m_chambre.getNumero() + " n'est pas encore nettoyée.");
                return false;
            }

            m_chambre.setEtatReservation(true);
            m_chambre.setEtatDisponibilite(false);

            Commande commande = new Commande(identifiant, m_jourReservation,  m_chambre, m_client);

            System.out.println(commande);
        // } 

        // if() {
        //     System.out.println("Les dates saisies ne sont pas correctes.");
        // } 
            return true;

    }

    @Override
    public boolean planifieNettoyage(Chambre m_chambre, Personnel m_hotesse, int m_jourNettoyageSaisie) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
