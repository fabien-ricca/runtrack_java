public class Job02 {
    public static void main(String[] args){
        Thread runnableThread = new Thread(new RunnableInterfaceExercice());

        runnableThread.start();
    }
}