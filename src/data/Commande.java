package data;

import utils.Utils;

public class Commande {
        // initialize attributes
        private String m_identifiant;
        private int m_jourReservation;
        private Chambre m_chambre;
        private Client m_client;


        // constructors
        public Commande() {}
        public Commande(String p_identifiant, int p_jourReservation, Chambre p_chambre, Client p_client) {
            this.m_identifiant = p_identifiant;
            this.m_jourReservation = p_jourReservation;
            this.m_chambre = p_chambre;
            this.m_client = p_client;
        }

        Utils utils = new Utils();

        @Override
        public String toString() {
            return "=================================" +
            "\nNouvelle Commande n°" + this.getIdentifiant() + 
            "\nRéservation du " + this.getJourReservation() + "/12/2022" +
            "\nChambre  n°" + this.getChambre().getNumero() + 
            " Par " + this.getClient();
        }
    
        // getters / setters    
        // identifiant
        public String getIdentifiant() {
            return m_identifiant;
        }
        public void setIdentifiant(String p_identifiant) {
            this.m_identifiant = p_identifiant;
        }

        // jourReservation
        public int getJourReservation() {
            return m_jourReservation;
        }
        public void setJourReservation(int p_jourReservation) {
            this.m_jourReservation = p_jourReservation;
        }

        // chambre
        public Chambre getChambre() {
            return m_chambre;
        }
        public void setChambre(Chambre p_chambre) {
            this.m_chambre = p_chambre;
        }

        // client
        public Client getClient() {
            return m_client;
        }
        public void setClient(Client p_client) {
            this.m_client = p_client;
        }
}
