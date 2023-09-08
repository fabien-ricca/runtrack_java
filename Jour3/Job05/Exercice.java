import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercice {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void sortList(int... params){

        for(int nb : params){
            numbers.add(nb);
        }

        List<Integer> result = numbers.stream()                         // On convertit l'ArrayList en stream
                                        .map(nb -> nb * 2)              // On transforme chaque élément 'nb' du flux par 'nb * 2'
                                        .filter(nb -> nb <= 10)         // On filtre le flux pour ne garder que ceux inferieurs ou égaux à 10
                                        .collect(Collectors.toList());  // On convertit tous les éléments du flux en une autre collection, ici une List


        System.out.println(result);
    }
}
