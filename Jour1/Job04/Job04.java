import java.util.Scanner;
public class Job04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompteBancaire monCompte = new CompteBancaire();

        monCompte.display();
        monCompte.depot(100);
        monCompte.retrait(200);

    }
}
