package fr.travauxpratique.minibanque;

public class Client {

    public int nbComptes = 0;
    public Compte[]comptes = new Compte[100];
    private String nom = new String();

    Client(String nom_du_client){
        this.nom = nom_du_client;
    }

    public static String getNom(){
        return "toto";
    }

    public static float getSolde() {
        return 0;
    }

    public static void afficherSolde() {

    }

    public static void ajouterCompte() {

    }
}
