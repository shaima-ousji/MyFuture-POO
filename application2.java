import java.util.Scanner;
public class application2 {
    public class classification {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Application 2 : Affichage du nombre max");
            System.out.print("\n Saisissez 1er nombre ");
            double nbr1 = scanner.nextDouble();
            System.out.print("\n Saisissez un 2éme nombre ");
            double nbr2 = scanner.nextDouble();
            if (nbr1>nbr2) {
                System.out.println("Le nombre le plus grand est " + nbr1 );
            }
            System.out.println("Le nombre le plus grand est " );
        }
    }
    
}
