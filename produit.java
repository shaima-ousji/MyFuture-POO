import java.util.Scanner;

public class produit {
    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public produit(String ref, String des, double prix, int qte) {
        reference = ref;
        designation = des;
        prixHT = prix;
        quantiteStock = qte;
    }

    public String getReference() { 
        return reference;
    }
    public void setReference(String ref) {
        reference = ref; 
    }

    public String getDesignation() { 
        return designation; 
    }
    public void setDesignation(String des) { 
        designation = des; 
    }

    public double getPrixHT() { 
        return prixHT; 
    }
    public void setPrixHT(double prix) {
        prixHT = prix; 
    }

    public int getQuantiteStock() {
        return quantiteStock; 
    }
    public void setQuantiteStock(int qte) { 
        quantiteStock = qte; 
    }

    public double calculerValeur(Scanner sc) {
        System.out.println("Entrez la quantite :");
        quantiteStock = sc.nextInt();
        System.out.println("Entrez le prix :");
        prixHT = sc.nextDouble();
        double valeur = quantiteStock * prixHT;
        System.out.println("La valeur du stock = " + valeur);
        return valeur;
    }
    public void appliquerRemise(double pourcentage) {
    prixHT = prixHT - (prixHT * pourcentage / 100);
    System.out.println("prix apres remise de " + pourcentage + "% = " + prixHT);
    }
    public void afficher(Scanner sc) {
    sc.nextLine();

    System.out.println("Entrez la reference :");
    reference = sc.nextLine();

    System.out.println("Entrez la designation :");
    designation = sc.nextLine();

    System.out.println("Entrez la quantite :");
    quantiteStock = sc.nextInt();

    System.out.println("Entrez le prix HT :");
    prixHT = sc.nextDouble();
    System.out.println("Reference : " + reference);
    System.out.println("Designation : " + designation);
    System.out.println("Quantite : " + quantiteStock);
    System.out.println("Prix HT : " + prixHT);
    System.out.println("Valeur du stock : " + (prixHT * quantiteStock));
}
}