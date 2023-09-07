public class Job05 {
    public static void main(String[] args) throws LimiteVitesse {
        Voiture voiture = new Voiture("Dacia", "Noire");

        try{
            voiture.accelere();
            voiture.accelere();
            voiture.accelere();
            voiture.accelere();
            voiture.accelere();
            voiture.accelere();
        }
        catch(LimiteVitesse errorMess){
            System.out.println(errorMess);
        }
    }
}
