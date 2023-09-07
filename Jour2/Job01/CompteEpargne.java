public class CompteEpargne implements CompteBancaire{
    static int solde = 100;
    static double interet = 0.05;

    static int depot(int somme){
        solde += somme;
        System.out.println(somme + "€ déposés. Nouveau solde : " + solde + "€");
        return solde;
    }

    static int retrait(int somme){
        int newsolde = solde - somme;

        if(newsolde >= 0){
            solde -= somme;
            System.out.println(somme + "€ déposés. Nouveau solde : " + solde + "€");
        }
        else{
            System.out.println("Tentative de retrait de " + somme + "€... Solde insuffisant.");
        }
        return solde;
    }

    static void display(){
        System.out.println("Solde actuel : " + solde + "€.");
    }

    static void ajouterInteret(){
        int montantInteret = (int)Math.ceil(solde * interet);
        solde += montantInteret;

        System.out.println("Ajout de " + montantInteret + "€. Nouveau solde : " + solde + "€.");
    }
}
