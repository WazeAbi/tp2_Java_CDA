package Exo8;

public class Voiture {


    private String modele;
    private double prix;
    public Voiture(String modele, double prix) {
        modele = modele;
        prix = prix;
    }
    public Voiture(Voiture obj2){
        modele = obj2.modele;
        prix = obj2.prix;
    }
    Voiture(){
        modele ="";
        prix = 0.0;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        prix = prix;
    }


}
