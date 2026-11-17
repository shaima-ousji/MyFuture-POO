import java.util.Scanner;
public class etudiant {
    String codeE;
    String nom;
    String prenom;
    int age;
    String ville;

    public etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public void saisirE(Scanner sc) {
        System.out.println("Code : ");
        codeE = sc.nextLine();
        System.out.println("Nom : ");
        nom = sc.nextLine();
        System.out.println("Prénom : ");
        prenom = sc.nextLine();
        System.out.println("Age : ");
        age =sc.nextInt();
        System.out.println("Ville : ");
        ville = sc.nextLine();
    }

    public void afficherE() {
        System.out.println(codeE + " | " + nom + " | " + prenom + " | " + age + " ans | " + ville);
    }
}

