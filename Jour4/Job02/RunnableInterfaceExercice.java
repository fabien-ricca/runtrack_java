public class RunnableInterfaceExercice implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("En cours d'execution...");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Erreur capturée :: InterruptedException.");
            }
        }
    }
}
