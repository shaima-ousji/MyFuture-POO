
public class voiture{

    private String marque;
    private int vitesse;
    private String couleur;

    public voiture(String m, int v, String c){
        marque=m;
        vitesse=v;
        couleur=c;
    }

    public String getCouleur(){
        return couleur;
    }

    public void afficherDetails(){
        System.out.println("Marque : " + marque);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Couleur : " + couleur);
    }
}
