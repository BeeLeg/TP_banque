package fr.travauxpratique.minibanque;

public class Main {

    public static void main(String args[]) {
        Compte compte1 = new Compte(1);
        Compte compte2 = new Compte(2);
        //System.out.println(compte1.getSolde());
        //compte1.afficherSolde();

        Client client1 = new Client("Bertrand");
        System.out.println(client1.getNom());
        System.out.println(client1.getSolde(compte1));
        System.out.println("J'ai un nouveau text");
    }
}
