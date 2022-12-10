package services.interfaces;

import java.text.ParseException;
import java.util.Date;

import data.Chambre;
import data.Client;
import data.Personnel;

public interface ReservationServiceInterface {
    /**
     * Fonction pour réserver une chambre à un client pour un créneau de dates choisi 
     * entre une date de début et une date de fin : créer une commande
     * @param m_chambre
     * @param m_client
     * @param m_dateDebutReservationSaisies
     * @param m_dateFinReservationSaisies
     * @return : l'instance de Commande créée si l'opération s'est bien déroulée
     * @throws ParseException
     */
    public boolean reserverChambre(Chambre m_chambre, Client m_client, Date m_dateDebutReservationSaisies, Date m_dateFinReservationSaisies) throws ParseException;

    /**
     * Fonction pour planifier le nettoyage d'une chambre par une hôtesse à une date choisie
     * @param m_chambre
     * @param m_hotesse
     * @param m_dateNettoyageSaisie
     * @return : true si l'opération s'est bien déroulée
     */
    public boolean planifieNettoyage(Chambre m_chambre, Personnel m_hotesse, Date m_dateNettoyageSaisie);

}
