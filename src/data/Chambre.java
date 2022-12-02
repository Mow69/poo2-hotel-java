package data;

public class Chambre {
    // initialize attributes
    private int numero;
    private Boolean etatProprete;
    private Boolean etatDisponibilite;
    private Boolean etatReservation;

    // constructors
    public Chambre() {
    }

    public Chambre(int numero, Boolean etatProprete, Boolean etatDisponibilite, Boolean etatReservation) {
        this.numero = numero;
        this.etatProprete = etatProprete;
        this.etatDisponibilite = etatDisponibilite;
        this.etatReservation = etatReservation;
    }

    // getters / setters
    // numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // etatProprete
    public Boolean getEtatProprete() {
        return etatProprete;
    }

    public void setEtatProprete(Boolean etatProprete) {
        this.etatProprete = etatProprete;
    }

    // etatDisponibilite
    public Boolean getEtatDisponibilite() {
        return etatDisponibilite;
    }

    public void setEtatDisponibilite(Boolean etatDisponibilite) {
        this.etatDisponibilite = etatDisponibilite;
    }

    // etatReservation
    public Boolean getEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(Boolean etatReservation) {
        this.etatReservation = etatReservation;
    }
}
