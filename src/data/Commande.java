package data;

import java.util.Date;

public class Commande {
        // initialize attributes
        private String identifiant;
        private Date dateAchat;
        private Date dateDebutReservation;
        private Date dateFinReservation;

        private Chambre chambre;

        // constructors
        public Commande() {}
        public Commande(String identifiant, Date dateAchat, Date dateDebutReservation, Date dateFinReservation, Chambre chambre) {
            this.identifiant = identifiant;
            this.chambre = chambre;
        }
    
        // getters / setters    
        // chambreList
        public String getIdentifiant() {
            return identifiant;
        }
        public void setIdentifiant(String identifiant) {
            this.identifiant = identifiant;
        }

        // dateAchat
        public Date getDateAchat() {
            return dateAchat;
        }
        public void setDateAchat(Date dateAchat) {
            this.dateAchat = dateAchat;
        }

        // dateDebutReservation
        public Date getDateDebutReservation() {
            return dateDebutReservation;
        }
        public void setDatesDebutReservation(Date dateDebutReservation) {
            this.dateDebutReservation = dateDebutReservation;
        }

        // dateFinReservation
        public Date getDateFinReservation() {
            return dateFinReservation;
        }
        public void setDatesFinReservation(Date dateFinReservation) {
            this.dateFinReservation = dateFinReservation;
        }

        // chambreList
        public Chambre getChambreList() {
            return chambre;
        }
        public void setChambreList(Chambre chambre) {
            this.chambre = chambre;
        }
}
