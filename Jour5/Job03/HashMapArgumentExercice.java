import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap;


public class HashMapArgumentExercice {
    HashMap<String, String> myMap = new LinkedHashMap<>();

    public HashMapArgumentExercice(String[] args){
        for(int i=0; i<args.length; i+=2){
            this.myMap.put(args[i], args[i+1]);
        }
    }

    public void display(){
        this.myMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
