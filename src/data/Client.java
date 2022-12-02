package data;

public class Client extends Personne {
    // initialize attributes
    private Chambre chambre;

    // constructors
    public Client() {}
    public Client(Chambre chambre) {
        this.chambre = chambre;
    }

    // getters / setters    
    // chambreList
    public Chambre getChambreList() {
        return chambre;
    }
    public void setChambreList(Chambre chambre) {
        this.chambre = chambre;
    }
}
