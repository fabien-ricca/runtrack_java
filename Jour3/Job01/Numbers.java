import java.util.ArrayList;
public class Numbers {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public Numbers(int nb){
        for(int i=1; i<=nb; i++){
            numbers.add(i);
        }
    }

    public int calcul(){
        int result = 0;

        for(int nb : numbers){
            result += (nb % 2 == 0) ? nb : 0;
        }
        return result;
    }
}
