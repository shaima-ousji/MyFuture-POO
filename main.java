import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        produit p1 = new produit("P101", "clavier", 50.000, 10);
        int choix;

        do {
            System.out.println("\nMenu");
            System.out.println("1:Afficher");
            System.out.println("2:Calculer la valeur du stock");
            System.out.println("3:Appliquer une remise");
            System.out.println("4:Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    p1.afficher(sc);
                    break;
                case 2:
                    p1.calculerValeur(sc);
                    break;
                case 3:
                    System.out.println("Entrez le pourcentage de remise :");
                    double remise = sc.nextDouble();
                    p1.appliquerRemise(remise);
                    break;
                case 4:
                    System.out.println("programme quitté");
                    break;
            }
        } while (choix != 4);

        sc.close();

    }
}