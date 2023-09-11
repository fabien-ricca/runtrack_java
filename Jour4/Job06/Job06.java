public class Job06 {
    public static void main(String[] args){
        Banque banque = new Banque(Integer.parseInt(args[0]));


        Thread t1 = new Thread(() -> banque.retirer(Integer.parseInt(args[1])), "Thread1");
        Thread t2 = new Thread(() -> banque.retirer(Integer.parseInt(args[1])), "Thread2");

        t1.start();
        t2.start();

    }
}