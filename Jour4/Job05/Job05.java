import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Job05 {
    public static void main(String[] args){

        // On créé un pool contenant 5 threads.
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // On soumet un nombre i de tâches au pool de threads.
        for(int i=1; i<=3; i++){
            int factor = i;

            // Soumet la tâche à exécutée à l'un des threads disponible dans le pool.
            executor.submit(() -> MultiplyByFactor.multiply(factor, 3));
        }

        // On ferme le pool de threads.
        executor.shutdown();
    }
}