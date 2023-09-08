import java.util.Optional;

public class Exercice {

    public void calculerLongueur(String str){
        // On créé un conteneur Optional pour une String
                                            // Si 'str' est nulle l'instance d'Optional ne sera pas créée.
        Optional<String> optionalStrNull = Optional.ofNullable(str);

        //Si l'instance d'Optional est présente c'est que la chaîne n'était pas vide.
        String result = (optionalStrNull.isPresent()) ? "Longueur de la chaîne : " + str.length() : "La chaîne est null";

        System.out.println(result);
    }
}
