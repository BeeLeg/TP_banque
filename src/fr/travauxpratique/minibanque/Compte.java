package fr.travauxpratique.minibanque;

public class Compte {

    private int numero;
    private float solde;

    private void depot(float valeur){
        this.solde += valeur;
    }
    private void retrait(float valeur) {
        this.solde -= valeur;
    }

    public float getSolde() {
        return solde;
    }

    private void afficherSolde() {
        System.out.println("Le solde du client "+this.numero+" est de : "+this.solde+" Euros");
    }

    public static void virer(float valeur, String compteDestinataire) {

    }

}
