public class Banque {
    private int solde;

    public Banque(int solde){
        this.solde = solde;
    }

    public synchronized void retirer(int somme){
        this.solde -= somme;
        System.out.println(Thread.currentThread().getName() + " a retiré " + somme);
        System.out.println("Il vous reste : " + this.solde);
    }



}
