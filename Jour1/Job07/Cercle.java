public class Cercle {
    public static void displayAire(int x){
        double rayon = x;
        double aire = Math.PI * Math.pow(rayon, 2);
        System.out.println("Aire du cercle de rayon : " + x + " : " + String.format("%.2f", aire));
    }
}
