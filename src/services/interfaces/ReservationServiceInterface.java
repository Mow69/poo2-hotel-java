package services.interfaces;

import data.Chambre;
import data.Client;

public interface ReservationServiceInterface {
    /**
     * Fonction pour réserver une chambre à un client pour une date choisie : créer une commande
     * @param m_chambre
     * @param m_client
     * @param m_jourReservation
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean reserverChambre(Chambre m_chambre, Client m_client, int m_jourReservation);

/**
 * Fonction pour planifier le nettoyage d'une chambre
 * @param m_chambre : chambre en paramètre à nettoyer
 * @return : false si l'opération a réussi 
 */
    public boolean planifieNettoyage(Chambre m_chambre);

}
