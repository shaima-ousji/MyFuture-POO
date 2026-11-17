import java.util.Scanner;

public class mainAppv {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        voiture v=new voiture("Mercedes", 150, "Rouge");

        int choix=0;

        while (choix!=3) {

            System.out.println("\n____ MENU VOITURE ____");
            System.out.println("1. Afficher les détails");
            System.out.println("2. Afficher la couleur");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    v.afficherDetails();
                    break;

                case 2:
                    System.out.println("Couleur : " + v.getCouleur());
                    break;

                case 3:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        }

        sc.close();
    }
}
