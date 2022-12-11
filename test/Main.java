import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import data.Chambre;
import data.Client;
import services.implementions.ReservationService;
import utils.Utils;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws ParseException {
    // public static void main(String[] args) throws ParseException {
        Utils utils = new Utils();

        // Création des 2 clients 
        Client client1 = new Client("Doe", "John");
        Client client2 = new Client("O", "Anna");

        // Instancie la classe Singleton ReservationService
        ReservationService maReservation = ReservationService.getInstance();

        //    maReservation.reserverChambre(chambre1, client1, 16);
        // Initie 3 listes pour l'affichage de toutes les chambres, celles occupées, et celles nettoyées.
        List<Chambre> hotel = new ArrayList<Chambre>();
        List<Chambre> chambresOccupees = new ArrayList<Chambre>();
        List<Chambre> chambresNettoyees = new ArrayList<Chambre>();

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

        // Créé 11 commandes du client1
        System.out.println("\n======== Réservation(s) en cours ========");
        for (int i = 0; i < 11; i++) {
            Chambre chambre = hotel.get(i);
            if(true == maReservation.reserverChambre(chambre, client1, 16)) {
                chambre.setEtatReservation(true);
                chambre.setEtatDisponibilite(false);
                chambre.setEtatProprete(false);

                chambresOccupees.add(chambre);
            }
            // Collections.reverse(chambresOccupees);

            // maReservation.reserverChambre(chambre, client1, 16);
        }
        // System.out.println(chambresOccupees);



        // Créé 11 commandes du client2
        System.out.println("\n======== Réservation(s) en cours ========");
        for (int i = 11; i < 22; i++) {
            Chambre chambre = hotel.get(i);
            // maReservation.reserverChambre(chambre, client2, 16);
            if(true == maReservation.reserverChambre(chambre, client2, 16)) {
                chambre.setEtatReservation(true);
                chambre.setEtatDisponibilite(false);
                chambre.setEtatProprete(false);

                chambresOccupees.add(chambre);
            }
        }

        // Nettoie 10 chambres par la femme de ménage
        for (int i = 0; i < 10; i++) {
            // maReservation.planifieNettoyage(chambre1, null, i);
            Chambre chambreANettoyer = chambresOccupees.get(i);
            int chambresNettoyeesSize = chambresNettoyees.size();
            // if(0 < chambresNettoyeesSize) System.out.println(chambreANettoyer);

            if(false == chambreANettoyer.getEtatProprete()) {
                chambreANettoyer.setEtatProprete(true);
                chambreANettoyer.setEtatDisponibilite(true);
                chambreANettoyer.setEtatReservation(false);
                chambresNettoyees.add(chambreANettoyer);
                // Collections.reverse(chambresNettoyees);
            }
        }
        System.out.println(
            "////////////////////\n" + 
            "Les chambres suivantes ont été nettoyées : \n" + 
            chambresNettoyees + 
            "////////////////////"
        );

        // Nettoie les 10 chambres suivantes par la femme de ménage
        for (int i = 10; i < 20; i++) {
            // maReservation.planifieNettoyage(chambre1, null, i);
            Chambre chambreANettoyer = chambresOccupees.get(i);
            int chambresNettoyeesSize = chambresNettoyees.size();
            // if(0 < chambresNettoyeesSize) System.out.println(chambreANettoyer);

            if(false == chambreANettoyer.getEtatProprete()) {
                chambreANettoyer.setEtatProprete(true);
                chambreANettoyer.setEtatDisponibilite(true);
                chambreANettoyer.setEtatReservation(false);
                chambresNettoyees.add(chambreANettoyer);
                // Collections.reverse(chambresNettoyees);
            }
        }
        System.out.println(
            "////////////////////\n" + 
            "Les chambres suivantes ont été nettoyées : \n" + 
            chambresNettoyees + 
            "////////////////////"
        );

        // TODO : tester que je ne peux pas réserver une chambre disponible ou inoccupée mais pas nettoyée
        // -> on peut avoir une chambre libre mais sale, dans ce cas on ne peut pas la réserver. A tester !

        // TODO :
        // FAIRE cette méthode  - Gérer les réservations (vérifier si chambre disponible et nettoyée et libérée)
        // FAIRE cette méthode - Gérer le nettoyage des chambres (vérifier si la chambre a été réservée)
        // FAIRE cette méthode  - Gérer les clients et leurs commandes (la liste des réservations du client)
    
        // TODO : 
        // -> elle nettoie que les chambres qui ont été réservée (ou occupée selon si on distingue)


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

        // // nettoie chambre 303
        if(false == chambre303.getEtatProprete()) {
            chambre303.setEtatProprete(true);
            chambre303.setEtatDisponibilite(true);
            chambre303.setEtatReservation(false);
        } else {
            System.out.println("La chambre est déjà propre et ne peut pas être nettoyée davantage.");
        }


        // // Il faut ajouter des commentaire pour chaque point tester juste en-dessous
        // //     par ex : ici on teste les 2 constructeurs 
        // Client clientConstructeurVide = new Client();
        // Client clientConstructeurPlein = new Client("Kant", "Emmanuel");
        // //     par ex : ici on teste l'override de toString()
        // System.out.println(clientConstructeurVide);
        // clientConstructeurVide.setNom("Locke");
        // clientConstructeurVide.setPrenom("John");
        // System.out.println(clientConstructeurVide);
        // System.out.println(clientConstructeurPlein);

    }

}