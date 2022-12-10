package data;

import java.text.SimpleDateFormat;
import java.util.Date;

import utils.Utils;

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
            this.dateAchat = dateAchat;
            this.dateDebutReservation = dateDebutReservation;
            this.dateFinReservation = dateFinReservation;
            this.chambre = chambre;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Utils utils = new Utils();
        // String formattedDateAchat = utils.formatDateToString(this.getDateAchat());
        // String formattedDateDebutReservation = utils.formatDateToString(this.getDateDebutReservation());
        // String formattedDateFinReservation = utils.formatDateToString(this.getDateFinReservation());

        // String formattedDateAchat = simpleDateFormat.format(this.getDateAchat());
        // String formattedDateAchat = simpleDateFormat.format(new Date());
        // String formattedDateDebutReservation = simpleDateFormat.format(this.getDateDebutReservation());
        // String formattedDateFinReservation = simpleDateFormat.format(this.getDateFinReservation());
        
        // override toString()
        @Override
        public String toString() {
            String formattedDateAchat = simpleDateFormat.format(new Date());
            String formattedDateDebutReservation = simpleDateFormat.format(this.getDateDebutReservation());
            String formattedDateFinReservation = simpleDateFormat.format(this.getDateFinReservation());

            return "Commande n° " + this.getIdentifiant() + "\nTransaction du " + formattedDateAchat + "\nChambre n°" + this.getChambre().getNumero() + "\nRéservation du " + formattedDateDebutReservation + " au " + formattedDateFinReservation;
        }
    
        // getters / setters    
        // identifiant
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
        public void setDateDebutReservation(Date dateDebutReservation) {
            this.dateDebutReservation = dateDebutReservation;
        }

        // dateFinReservation
        public Date getDateFinReservation() {
            return dateFinReservation;
        }
        public void setDateFinReservation(Date dateFinReservation) {
            this.dateFinReservation = dateFinReservation;
        }

        // chambre
        public Chambre getChambre() {
            return chambre;
        }
        public void setChambre(Chambre chambre) {
            this.chambre = chambre;
        }
}
