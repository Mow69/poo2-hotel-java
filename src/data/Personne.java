package data;

public abstract class Personne {
    // initialize attributes
    protected String nom;
    protected String prenom;

    // constructors
    public Personne() {}
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // override toString()
    @Override
    public String toString() {
        return this.getPrenom() + " " + this.getNom();
    }

    // getters / setters
    // nom
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
