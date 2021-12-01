package fr.travauxpratique.minibanque;

public class Client {

    public int nbComptes = 0;
    public Compte[]comptes = new Compte[100];
    private String nom = new String();

    Client(String nom_du_client){
        this.nom = nom_du_client;
    }

    public String getNom(){
        return "toto";
    }

    public float getSolde() {
        return 0;
    }

    public void afficherSolde() {

    }

    public void ajouterCompte() {

    }
}
