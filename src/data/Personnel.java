package data;

public class Personnel extends Personne {
    // initialize attributes
    private String identifiant;
    private Chambre[] chambreList;

    // constructors
    public Personnel() {}
    public Personnel(String nom, String prenom, String identifiant, Chambre[] chambreList) {
        this.identifiant = identifiant;
        this.chambreList = chambreList;

        // get attributes inherited from parent class Personne
        this.nom = nom;
        this.prenom = prenom;
    }

    // override toString()
    @Override
    public String toString() {
        return this.getPrenom() + " " + this.getNom() + " Agent n°" + this.getIdentifiant() + " \n";
    }

    // getters / setters
    // identifiant
    public String getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    // chambreList
    public Chambre[] getChambreList() {
        return chambreList;
    }
    public void setChambreList(Chambre[] chambreList) {
        this.chambreList = chambreList;
    }
}
