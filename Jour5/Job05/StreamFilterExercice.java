import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExercice {
    ArrayList<Integer> array = new ArrayList<>();
    List<Integer> result;

    public StreamFilterExercice(String[] args){
        for(String nb : args){
            this.array.add(Integer.parseInt(nb));
        }
    }

    public void  filter(){
        this.result = array.stream().filter(nb -> nb > array.get(0)).collect(Collectors.toList());

        System.out.print("Nombres superieurs à " + array.get(0) + ": ");
        for(Integer nb : result){
            System.out.print(nb + " ");
        }
    }
}
