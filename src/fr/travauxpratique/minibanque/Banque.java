package fr.travauxpratique.minibanque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Banque {

    public Client[] clients = new Client[100];


    public void ajouterClient(String nom_du_client) {
        ArrayList<String> arrayClients = new ArrayList<String>();
    }

    public void bilanClient(int numero_du_client) {

    }

    public void afficherClient() {

    }

    public void interaction_1() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Entrez le nom du client: ");
        String nom_client = scanner.next();
        ajouterClient(nom_client);
        System.out.println("Le client "+nom_client+" a été créé.");
    }

    public static void interaction_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel client?");

    }

    public void interaction() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        boolean isMenu = true;
        while(isMenu==true) {
            System.out.println("Quelle opération voulez-vous effectuer?");
            System.out.println("1) Ajouter un client");
            System.out.println("2) Effectuer une opération sur un client");
            System.out.println("3) Afficher un bilan général");
            System.out.println("4) Quitter");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    interaction_1();
                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:
                    isMenu = false;
                    break;
            }
            System.out.println("Au revoir");
        }
    }
}
