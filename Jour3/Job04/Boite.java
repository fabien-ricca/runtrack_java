public class Boite<Type> {
    Type elem;
    String nom = "toto";

    public void addElement(Type elem){
        this.elem = elem;
        System.out.println("L'élément " + elem + " a été ajouté.");
    }

    public void removeElem(){
        System.out.println("L'élément " + this.elem + " a été supprimé.");
        this.elem = null;
    }


}
