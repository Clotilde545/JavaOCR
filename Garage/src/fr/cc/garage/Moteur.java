package fr.cc.garage;

/**
 * @Moteur: est une classe qui définit le type de moteur du véhicule
 * @TypeMoteur : définit son type
 * @cylindre: définit le cylindre du véhicule
 * @prixMoteur: définit le prix du moteur
 */
public class Moteur {
    private TypeMoteur type;
    private String cylindre;
    private double prixMoteur;


    /**
     * @Moteur : constructeur de la classe
     * @param cylindre: String : est le type de cylindre du véhicule
     * @param prixMoteur: Double : est le prix du moteur
     */
    public  Moteur(String cylindre, double prixMoteur){
        this.cylindre = cylindre;
        this.setPrixMoteur(prixMoteur);

    }

    /**
     * @toString(): méthode permettant de faire un résumé du moteur
     * @return: String : Résumé du moteur
     */
    @Override
    public String toString() {
        return "Moteur{" +
                "type=" + type +
                ", cylindre='" + cylindre + '\'' +
                ", prixMoteur=" + prixMoteur +
                '}';
    }

    //Getters and Setters
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
