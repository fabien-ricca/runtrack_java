import java.util.Scanner;

public class Job01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir votre nom : ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + ".");
    }
}