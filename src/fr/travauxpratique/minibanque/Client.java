package fr.travauxpratique.minibanque;

import java.util.ArrayList;

public class Client {

    public ArrayList<Compte> comptes = new ArrayList<Compte>();
    private String nom = new String();

    public Client(String nom_du_client){
        this.nom = nom_du_client;
    }

    public String getNom() {
        return nom;
    }

    public float getSolde(int numeroCompte) {
        return comptes.get(numeroCompte).getSolde();
    }

    public void afficherSolde() {
        float total=0;
        for (int i = 0; i < comptes.size(); i++) {
            total = total + comptes.get(i).getSolde();
        }
        System.out.println("Le solde du client "+this.nom+" est de : "+total+" Euros");
    }

    public void ajouterCompte() {
        comptes.add(new Compte(comptes.size()+1));
    }
}
