import java.util.Scanner;
public class classification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Application 1 : Affichage du double d'un nombre ");
        System.out.print("\n Saisissez un nombre ");
        double nbrApp1 = scanner.nextDouble();
        double doubleNbr = nbrApp1 * 2;
        System.out.println("Le double de " + nbrApp1 + " est " + doubleNbr);
    }
}
