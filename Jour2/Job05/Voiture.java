public class Voiture {
    String marque;
    String couleur;
    int vitesse;
    Boolean demarre;

    public Voiture(String marque, String couleur){
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
        this.demarre = false;
    }

    public void demarrage(){
        this.demarre = !this.demarre;
        System.out.println("La voiture démarre.");
    }

    public void accelere() throws LimiteVitesse{

        if((this.vitesse += 10) > 100){
            throw new LimiteVitesse();
        }

        this.vitesse += 10;
        System.out.println("La vitesse est maintenant de " + this.vitesse + "km/h.");
    }

    public void stop(){
        this.vitesse = 0;
        System.out.println("La voiture s'arrête. La vitesse est réinitialisée à " + this.vitesse + "km/h.");
    }

}
