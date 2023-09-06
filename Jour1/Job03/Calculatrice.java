public class Calculatrice {
    double x;
    double y;

    public Calculatrice(int x, int y){
        this.x = x;
        this.y = y;

        display();
    }

    public double addition(){
        return this.x + this.y;
    }

    public double soustraction(){
        return this.x - this.y;
    }

    public double multiplication(){
        return this.x * this.y;
    }

    public double division(){
        return this.x / this.y;
    }

    public void display(){
        System.out.println("Somme : " + addition());
        System.out.println("Différence : " + soustraction());
        System.out.println("Produit : " + multiplication());
        System.out.println("Division : " + division());
    }

}
