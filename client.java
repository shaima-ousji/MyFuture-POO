public class client {
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;
    public client(String c, String n, String p, String t) {
        cin = c;
        nom = n;
        prenom = p;
        telephone = t;
    }
    public String getCin() {
        return cin;
    }
    public void setCin(String c) {
        cin = c;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String n) {
        nom = n;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String p) {
        prenom = p;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String t) {
        telephone = t;
    }
    public void afficherClient() {
        System.out.println("[cin: " + cin + "] nom et prenom : "+ nom + " " + prenom + " | tel : " + telephone);
    }
}
