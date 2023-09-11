public class Job03 {
    public static void main(String[] args){
        Banque banque = new Banque(200);

        Thread t1 = new Thread(() -> banque.retirer(50), "Thread1");
        Thread t2 = new Thread(() -> banque.retirer(50), "Thread2");

        t1.start();
        t2.start();

    }
}