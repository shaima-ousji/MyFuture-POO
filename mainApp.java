
public class mainApp {

    public static void main(String[] args) {

        // Création des clients
        client c1=new client("07123456", "Ben Salah",
                "Sonia", "98765432");

        client c2=new client("09876543", "Kacem",
                "Ahmed", "50112233");

        // Création des comptes
        comptebancaire compte1=new comptebancaire("CB-1001", 500.0, c1);

        comptebancaire compte2=new comptebancaire("CB-1002", 1500.0, c2);

        // Affichage initial des comptes
        System.out.println("___ INFORMATIONS INITIALES ___");
        compte1.afficherDetails();
        compte2.afficherDetails();

        // Test des dépôts et retraits
        System.out.println("\n___ TEST DEPOT ___");
        compte1.deposer(200.0);
        // Test du retrait
        System.out.println("\n___ TEST RETRAIT ___");
        compte1.retirer(1000.0);
        compte1.retirer(300.0);

        // Test du virement
        System.out.println("\n___ TEST VIREMENT___");
        compte2.virement(compte1, 500.0);

        // etat final et statistiques
        System.out.println("\n___ SOLDES FINAL ___");
        compte1.afficherDetails();
        compte2.afficherDetails();

        // Nombre de comptes
        System.out.println("\nNombre total de comptes créés : "+ comptebancaire.getNombreComptes());
    }
}

