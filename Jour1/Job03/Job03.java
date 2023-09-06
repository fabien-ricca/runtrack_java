import java.util.Scanner;
public class Job03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Premier nombre : ");
        int x = scanner.nextInt();

        System.out.print("Deuxième nombre : ");
        int y = scanner.nextInt();

        Calculatrice result = new Calculatrice(x, y);


    }
}
