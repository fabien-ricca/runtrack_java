import java.util.concurrent.Callable;

public class CallableFutureExercice implements Callable<Integer> {
    private int x;
    private int y;

    public CallableFutureExercice(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Implémentation de la méthode 'Call()' qui retourne de le resultat de la multiplication.
    public Integer call(){
        return x * y;
    }
}
