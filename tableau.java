import java.util.Scanner;
public class tableau{
    public static void main(String[] args) {
    double[] moyenne={10.50,11.50,14};
    System.out.println("=====Affichage du tableau=====");
    for(int i=0;i<3;i++){
        System.out.println(moyenne[i]);
    }
    System.out.println("=====Rénitialisation du 2éme case du 1er tableau=====");
    moyenne[1]=0;
    for(int i=0;i<3;i++){
        System.out.println(moyenne[i]);
    }
    System.out.println("=====Longueur du tableau=====");
    System.out.println(moyenne.length);
    System.out.println("=====Remplissage du tableau=====");
    Scanner sc=new Scanner(System.in);
    System.out.println("Donner un taille de le tableau");
    int n=sc.nextInt();
    double[] tab2 = new double[n];
    for(int i=0;i<n;i++){
        System.out.println("Donner une valeur pour la case n°"+i);
        tab2[i]=sc.nextDouble();
    }
    System.out.println("=====Affichage du tableau rempli par l'utilisateur=====");
    for(int i=0;i<tab2.length;i++){
        System.out.println(tab2[i]);
    }
    System.out.println("=====Somme des elements de deux tableaux=====");
    double[] somme = new double[3];
    for (int i = 0; i < 3; i++) {
        somme[i] = moyenne[i] + tab2[i];
        System.out.println(somme[i]);
    }
    sc.close();



    }
}