package services.interfaces;

import data.Chambre;
import data.Client;
import data.Personnel;

public interface ReservationServiceInterface {
    /**
     * Fonction pour réserver une chambre à un client pour une date choisie : créer une commande
     * @param m_chambre
     * @param m_client
     * @param m_jourReservation
     * @return : l'instance de Commande créée si l'opération s'est bien déroulée
     */
    public boolean reserverChambre(Chambre m_chambre, Client m_client, int m_jourReservation);

    /**
     * Fonction pour planifier le nettoyage d'une chambre par une hôtesse à une date choisie
     * @param m_chambre
     * @param m_hotesse
     * @param m_jourNettoyageSaisie
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean planifieNettoyage(Chambre m_chambre, Personnel m_hotesse, int m_jourNettoyageSaisie);

}
