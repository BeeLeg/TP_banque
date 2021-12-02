package fr.travauxpratique.minibanque;

import java.util.ArrayList;

public class Client {

    private static final int NB_COMPTES_MAX = 100;
    private String nom;
    private Compte [] comptes;
    private int nbComptes;

    public Client(String nom_du_client){
        this.nbComptes = 0;
        this.nom = nom_du_client;
        this.comptes = new Compte[NB_COMPTES_MAX];
    }

    public String getNom() {
        return this.nom;
    }

    public float getSolde() {
        int somme=0;
        for (int i = 0; i < this.nbComptes; i++) {
            somme += this.comptes[i].getSolde();
        }
        return somme;
    }

    public void afficherSolde() {
        System.out.println("Le solde du compte est de :"+this.getSolde());
    }

    public void ajouterCompte() {
        this.comptes[this.nbComptes++] = new Compte(this.nbComptes);
    }
}
