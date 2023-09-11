import java.util.concurrent.*;

public class Job04 {
    public static void main(String[] args){

        // Création d'un pool de threads à un seul thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Création d'un objet Callable.
        Callable<Integer> multiplication = new CallableFutureExercice(5, 6);

        // Soumission de la tâche Callable au service d'exécution.
        Future<Integer> future = executor.submit(multiplication);

        // Récupération du résultat.
        try{
            int result = future.get();
            System.out.println("resultat : " + result);
        }
        catch(InterruptedException | ExecutionException e){
            System.out.println("Erreur capturée :: InterruptedException ou ExecutionException.");
        }

        // Arrêt du service d'exécution.
        executor.shutdown();
    }
}