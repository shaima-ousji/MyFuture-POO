import java.util.Scanner;

public class appweb {

    public static void main(String[] args) {

        int Cin;
        String Nom;
        String Prénom;
        int Numcompte;
        double Solde;

        final double Plafond_Retrait = 500.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le CIN :");
        Cin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrez le Nom :");
        Nom = scanner.nextLine();

        System.out.println("Entrez le Prénom :");
        Prénom = scanner.nextLine();

        System.out.println("Entrez le Numcompte :");
        Numcompte = scanner.nextInt();

        System.out.println("Entrez le Solde Initial (TND) :");
        Solde = scanner.nextDouble();

        int choix;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Consulter le compte");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.println("Votre choix (1-4) :");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("\n--- Informations du compte ---");
                    System.out.println("Client : " + Nom + " " + Prénom);
                    System.out.println("CIN : " + Cin);
                    System.out.println("N° de Compte : " + Numcompte);
                    System.out.println("Solde Actuel : " + Solde + " TND");
                    System.out.println("Plafond Max : " + Plafond_Retrait + " TND");
                    break;

                case 2:
                    double depot;

                    System.out.println("Entrez le montant du dépôt :");
                    depot = scanner.nextDouble();

                    if (depot > 0) {
                        Solde = Solde + depot;
                        System.out.println("Dépôt effectué avec succès.");
                        System.out.println("Nouveau solde : " + Solde + " TND");
                    } else {
                        System.out.println("Montant invalide.");
                    }

                    break;

                case 3:
                    double retrait;

                    System.out.println("Entrez le montant du retrait :");
                    retrait = scanner.nextDouble();

                    if (retrait > 0 && retrait <= Plafond_Retrait && retrait <= Solde) {
                        Solde = Solde - retrait;
                        System.out.println("Retrait effectué avec succès.");
                        System.out.println("Nouveau solde : " + Solde + " TND");
                    } else {
                        System.out.println("Retrait impossible.");
                    }

                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");

            }

        } while (choix != 4);

        scanner.close();
    }
}