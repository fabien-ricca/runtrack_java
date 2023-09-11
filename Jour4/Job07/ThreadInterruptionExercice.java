public class ThreadInterruptionExercice extends Thread{
    private int time;
    public ThreadInterruptionExercice(int nb){
        this.time = (nb / 2) * 1000;
    }


    public void run(){
        try{
            Thread.sleep(this.time);
        }
        catch(InterruptedException e){
            System.out.println("Thread interrompu, Terminaison...");
        }
    }
}
