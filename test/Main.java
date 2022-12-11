import java.util.ArrayList;
import java.util.List;

import data.Chambre;
import data.Client;
import services.implementions.ReservationService;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Création des 2 clients 
        Client client1 = new Client("Doe", "John");
        Client client2 = new Client("O", "Anna");

        // Instancie la classe Singleton ReservationService
        ReservationService maReservation = ReservationService.getInstance();

        // Initie 3 listes pour l'affichage de toutes les chambres, celles occupées, et celles nettoyées.
        List<Chambre> hotel = new ArrayList<Chambre>();
        List<Chambre> chambresOccupees = new ArrayList<Chambre>();
        List<Chambre> chambresNettoyees = new ArrayList<Chambre>();

        // Test la création de toutes les chambres de l'hôtel
        // Créé les 30 chambres (étage 1 : de 100 à 109 etc sur 3 étages)
        for (int i = 100; i < 109; i++) {
            hotel.add(new Chambre(i, true, true, false));
        }
        for (int i = 200; i < 209; i++) {
            hotel.add(new Chambre(i, true, true, false));
        }
        for (int i = 300; i < 309; i++) {
            hotel.add(new Chambre(i, true, true, false));
        }

        // ----- Test de la réservation des chambres -----
        //// ----------- Tests sur plusieurs chambres ----------- ///

        // Créé 11 commandes du client1
        System.out.println("\n======== Réservation(s) en cours ========");
        for (int i = 0; i < 11; i++) {
            Chambre chambre = hotel.get(i);
            // Si la chambre est réservable, on change son état pour la rendre réservée, 
            // et on l'ajoute à la liste des chambres occupées qu'on va afficher ensuite
            if(true == maReservation.reserverChambre(chambre, client1, 16)) {
                chambre.setEtatReservation(true);
                chambre.setEtatDisponibilite(false);
                chambre.setEtatProprete(false);

                chambresOccupees.add(chambre);
            }
        }

        // Créé 11 commandes du client2
        System.out.println("\n======== Réservation(s) en cours ========");
        for (int i = 11; i < 22; i++) {
            Chambre chambre = hotel.get(i);
            // Si la chambre est réservable, on change son état pour la rendre réservée, 
            // et on l'ajoute à la liste des chambres occupées qu'on va afficher ensuite
            if(true == maReservation.reserverChambre(chambre, client2, 16)) {
                chambre.setEtatReservation(true);
                chambre.setEtatDisponibilite(false);
                chambre.setEtatProprete(false);

                chambresOccupees.add(chambre);
            }
        }

        // ----- Test du nettoyage des chambres sales -----
        // Nettoie 10 chambres par la femme de ménage
        for (int i = 1; i < 10; i++) {
            Chambre chambreANettoyer = chambresOccupees.get(i);
            maReservation.planifieNettoyage(chambreANettoyer);

            // Une fois la chambre nettoyée, on l'ajoute 
            // à la liste des chambres nettoyées qu'on va afficher ensuite
            chambresNettoyees.add(chambreANettoyer);
        }
        System.out.println(
            "////////////////////\n" + 
            "Les chambres suivantes ont été nettoyées : \n" + 
            chambresNettoyees + 
            "////////////////////"
        );

        // Nettoie les 10 chambres suivantes par la femme de ménage
        for (int i = 10; i < 20; i++) {
            Chambre chambreANettoyer = chambresOccupees.get(i);
            maReservation.planifieNettoyage(chambreANettoyer);

            // Une fois la chambre nettoyée, on l'ajoute 
            // à la liste des chambres nettoyées qu'on va afficher ensuite
            chambresNettoyees.add(chambreANettoyer);
        }
        System.out.println(
            "////////////////////\n" + 
            "Les chambres suivantes ont été nettoyées : \n" + 
            chambresNettoyees + 
            "////////////////////"
        );

        //// ----------- Tests sur une seule chambre ----------- ///
        Chambre chambre303 = chambresOccupees.get(21);
        System.out.println(chambre303);

        // Tente de réserver la chambre 303
        // teste l'impossibilité de réserver une chambre disponible et non réservée mais pas nettoyée
        chambre303.setEtatReservation(false);
        chambre303.setEtatDisponibilite(true);
        chambre303.setEtatProprete(false);
        maReservation.reserverChambre(chambre303, client2, 16);
        System.out.println(chambre303);

        // teste l'impossibilité de réserver une chambre propre et disponible mais pas déja réservée
        chambre303.setEtatReservation(true);
        chambre303.setEtatDisponibilite(true);
        chambre303.setEtatProprete(true);
        maReservation.reserverChambre(chambre303, client2, 16);
        System.out.println(chambre303);

        // teste l'impossibilité de réserver une chambre propre et libre mais indisponible
        chambre303.setEtatReservation(false);
        chambre303.setEtatDisponibilite(false);
        chambre303.setEtatProprete(true);
        maReservation.reserverChambre(chambre303, client2, 16);
        System.out.println(chambre303);

        // teste l'impossibilité du nettoyage de la chambre 303 si déjà propre
        if(false == chambre303.getEtatProprete()) {
            chambre303.setEtatProprete(true);
            chambre303.setEtatDisponibilite(true);
            chambre303.setEtatReservation(false);
        } else {
            System.out.println("La chambre est déjà propre et ne peut pas être nettoyée davantage.");
        }

        // teste les 2 constructeurs de la classe Client()
        Client clientConstructeurVide = new Client();
        Client clientConstructeurPlein = new Client("Kant", "Emmanuel");
        // teste l'override de la méthode toString() de la classe Client() et du extends de la classe Personne()
        System.out.println(clientConstructeurVide); // test sans valeur affectée aux propriétés et constructeur vide
        clientConstructeurVide.setNom("Locke");
        clientConstructeurVide.setPrenom("John");
        System.out.println(clientConstructeurVide); // test avec valeur affectée via setters aux propriétés
        System.out.println(clientConstructeurPlein); // test avec valeur affectée via constructeur aux propriétés

    }

}