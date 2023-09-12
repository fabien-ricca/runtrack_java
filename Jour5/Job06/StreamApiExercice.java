import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExercice {
    ArrayList<String> names = new ArrayList<>();
    List<String> namesUpper;

    public StreamApiExercice(String[] args){
        for(String name : args){
            names.add(name);
        }
    }

    public List<String> toUpper() {
        this.namesUpper = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        return this.namesUpper;
    }

    public void display(){
        for(String name : namesUpper){
            System.out.print(name + " ");
        }
    }
}
