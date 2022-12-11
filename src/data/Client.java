package data;

public class Client extends Personne {
    // constructors
    public Client() {}
    public Client(String nom, String prenom) {
        // get attributes from parent class Personne
        this.nom = nom;
        this.prenom = prenom;
    }

}
