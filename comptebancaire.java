public class comptebancaire {

    private String numeroCompte;
    private double solde;
    private client titulaire;
    private static int nombreComptes = 0;

    public comptebancaire(String num, double s, client c) {
        numeroCompte=num;
        titulaire=c;

        if (s>=0) {
            solde=s;
        } 
        else {
            solde=0;
        }

        nombreComptes++;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public double getSolde() {
        return solde;
    }
    public client getTitulaire() {
        return titulaire;
    }
    public void setTitulaire(client c) {
        titulaire = c;
    }
    public static int getNombreComptes() {
        return nombreComptes;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            solde = solde + montant;
            System.out.println("Dépôt effectué : " + montant + " TND");
        } 
        else {
            System.out.println("montant invalide.");
        }
    }
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde = solde - montant;
            System.out.println("Retrait effectué : " + montant + " TND");
        }
        else {
            System.out.println("montant invalide.");
        }
    }
    public void virement(comptebancaire destination, double montant) {
        System.out.println("\nTentative de virement de " + montant
                + " TND vers le compte "
                + destination.getNumeroCompte() + "...");

        if (montant>0 && montant<=solde) {
            retirer(montant);
            destination.deposer(montant);
            System.out.println("virement réussi ");
        } 
        else {
            System.out.println("Echec du virement : solde insuffisant "+ "ou montant invalide.");
        }
    }
    public void afficherDetails() {
        System.out.println("Compte N° : " + numeroCompte);
        System.out.print("Titulaire : ");
        titulaire.afficherClient();
        System.out.println("Solde Actuel : " + solde + " TND");
    }
}

