package fr.travauxpratique.minibanque;

import java.util.Scanner;

public class Compte {

    private int numero;
    private float solde;

    public Compte(int numero) {
        this.numero = numero;
        this.solde = 30;
    }

    private void depot(float valeur){
        this.solde += valeur;
    }
    private void retrait(float valeur) {
        this.solde -= valeur;
    }

    public float getSolde() {
        return solde;
    }

    public void afficherSolde() {
        System.out.println("Le solde du client "+this.numero+" est de : "+this.solde+" Euros");
    }

    public void virer(float valeur, Compte compteDestinataire) {
        this.retrait(valeur);
        compteDestinataire.depot(valeur);
    }

}
