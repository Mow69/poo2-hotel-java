package data;

public class Personnel extends Personne {
    // initialize attributes
    private String identifiant;
    private Chambre[] chambreList;

    // constructors
    public Personnel() {}
    public Personnel(String identifiant, Chambre[] chambreList) {
        this.identifiant = identifiant;
        this.chambreList = chambreList;
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
