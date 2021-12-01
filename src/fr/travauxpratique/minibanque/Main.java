package fr.travauxpratique.minibanque;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        Compte compte1 = new Compte(1);
        Compte compte2 = new Compte(2);
        //System.out.println(compte1.getSolde());
        //compte1.afficherSolde();

        Client client1 = new Client("Bertrand");
        Client client2 = new Client("Thomas");
        Client client3 = new Client("Michel");
        //System.out.println(client1.getNom());
        //System.out.println(client1.getSolde(compte1));

        Banque banque = new Banque();

        client1.ajouterCompte();
        client1.ajouterCompte();

        //client1.afficherSolde();
        //System.out.println(client1.getSolde(0));

        banque.ajouterClient("Bertrand");
        banque.ajouterClient("Thomas");
        banque.ajouterClient("Michel");

        banque.interaction_2();
    }
}
