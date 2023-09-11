public class Job07 {
    public static void main(String[] args){
        ThreadInterruptionExercice thread = new ThreadInterruptionExercice(6);

        thread.start();
        thread.interrupt();
    }
}