import java.util.Random;
public class Job05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int de1 = rand.nextInt(6) + 1;
        int de2 = rand.nextInt(6) + 1;
        int somme = de1 + de2;
        
        System.out.println("Dé n°1 : " + de1);
        System.out.println("Dé n°2 : " + de2);
        System.out.println("Somme : " + somme);

    }
}
