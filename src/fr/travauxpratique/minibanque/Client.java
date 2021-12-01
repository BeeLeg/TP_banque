package fr.travauxpratique.minibanque;

public class Client {

    public int nbComptes = 0;
    private Compte[]comptes = new Compte[100];
    private String nom = new String();

    public Client(String nom_du_client){
        this.nom = nom_du_client;
    }

    public String getNom() {
        return nom;
    }

    public float getSolde(Compte compte) {
        return compte.getSolde();
    }

    public void afficherSolde() {

    }

    public void ajouterCompte() {
        Compte compte = new Compte(1);
    }
}
