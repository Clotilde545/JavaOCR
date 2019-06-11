package fr.cc.garage;

public class Moteur {
    protected TypeMoteur type;
    protected String cylindre;
    protected double prixMoteur;



    public void  Moteur(String cylindre, double prixMoteur){
        this.cylindre = cylindre;
        this.prixMoteur=prixMoteur;

    }

    public TypeMoteur getType() {
        return type;
    }

    public void setType(TypeMoteur type) {
        this.type = type;
    }

    public String getCylindre() {
        return cylindre;
    }

    public void setCylindre(String cylindre) {
        this.cylindre = cylindre;
    }

    public double getPrixMoteur() {
        return prixMoteur;
    }

    public void setPrixMoteur(double prixMoteur) {
        this.prixMoteur = prixMoteur;
    }
}
