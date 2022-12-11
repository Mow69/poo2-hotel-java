package services.implementions;

import data.Chambre;
import data.Client;
import data.Commande;
import services.interfaces.ReservationServiceInterface;

public class ReservationService implements ReservationServiceInterface {
    // Static variable reference of reservationService
    // of type ReservationService
    private static ReservationService reservationService = null;

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
        // Instancie la classe Utils pour utiliser la méthode getIdentifiant qui génère un identifiant aléatoire pour le numéro de commande
        utils.Utils utils = new utils.Utils();
        String identifiant = utils.getIdentifiant();

        // Vérifications qu'on peut réserver la chambre (elle doit être réservable, disponible et propre)
        // sinon on affiche un message en fonction de la situation
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

        // on réserve la chambre en changeant son état
        m_chambre.setEtatReservation(true);
        m_chambre.setEtatDisponibilite(false);

        // La réservation de la chambre conduit à la création d'une commande
        Commande commande = new Commande(identifiant, m_jourReservation,  m_chambre, m_client);

        // On affiche les informations de la commande
        System.out.println(commande);

        return true;

    }

    @Override
    public boolean planifieNettoyage(Chambre m_chambre) {
        // On vérifie que la chambre est sale
        if(false == m_chambre.getEtatProprete()) {
            // Si oui, on la nettoie puis on la rend prête pour être réservée
            m_chambre.setEtatProprete(true);
            m_chambre.setEtatDisponibilite(true);
            m_chambre.setEtatReservation(false);
        }  else {
            // Sinon on affiche le message qu'est n'est pas nettoyable
            System.out.println("La chambre est déjà propre et ne peut pas être nettoyée davantage.");
        }

        return false;
    }
    
}
