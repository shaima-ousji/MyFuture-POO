import java.util.Scanner;
public class mainE {
        public static void plusGrandAge(etudiant[] t) {
            int max = t[0].age;
            for (int i = 1; i < t.length; i++) {
                if (t[i].age > max) {
                    max = t[i].age;
                }
            }
            System.out.println("Le plus grand âge est : " + max);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            etudiant[] tab = new etudiant[3];
            tab[0] = new etudiant("E1", "Ben Ali", "Sara", 20, "Tunis");
            tab[1] = new etudiant("E2", "Trabelsi", "Ahmed", 22, "Sfax");
            tab[2] = new etudiant("E3", "Gharbi", "Leila", 21, "Sousse");
    
            double[] notes = new double[3];
            int choix;
    
            do {
                System.out.println("===== Menu gestion étudiant =====");
                System.out.println("1) Ajout, saisie et affichage");
                System.out.println("2) Création et affichage des notes des étudiants");
                System.out.println("3) Quitter");
                choix = Integer.parseInt(sc.nextLine());
    
                switch (choix) {
                    case 1:
                        for (int i = 0; i < tab.length; i++) {
                            System.out.println("--- Etudiant n°" + i + " ---");
                            tab[i].saisirE(sc);
                        }
                        System.out.println("===== Affichage =====");
                        for (int i = 0; i < tab.length; i++) {
                            tab[i].afficherE();
                        }
                        plusGrandAge(tab);
                        break;
    
                    case 2:
                        for (int i = 0; i < tab.length; i++) {
                            System.out.println("Note de " + tab[i].getNom() + " : ");
                            notes[i] = Double.parseDouble(sc.nextLine());
                        }
                        System.out.println("===== Notes =====");
                        for (int i = 0; i < tab.length; i++) {
                            System.out.println(tab[i].getNom() + " " + tab[i].getPrenom() + " : " + notes[i]);
                        }
                        break;
    
                    case 3:
                        System.out.println("Au revoir ");
                        break;
    
                    default:
                        System.out.println("Choix invalide");
                }
            } while (choix != 3);
    
            sc.close();
        }
    }
