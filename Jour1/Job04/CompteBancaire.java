public class CompteBancaire {
    int solde = 100;

    public void depot(int somme){
        this.solde += somme;
        System.out.println(somme + "€ déposés. Nouveau solde : " + this.solde + "€");
    }

    public void retrait(int somme){
        int newsolde = this.solde - somme;

        if(newsolde >= 0){
            this.solde -= somme;
            System.out.println(somme + "€ déposés. Nouveau solde : " + this.solde + "€");
        }
        else{
            System.out.println("Tentative de retrait de " + somme + "€... Solde insuffisant.");
        }
    }

    public void display(){
        System.out.println("Solde actuel : " + this.solde + "€.");
    }
}
