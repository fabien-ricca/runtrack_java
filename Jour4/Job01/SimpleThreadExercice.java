public class SimpleThreadExercice extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Salut du Thread!");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
