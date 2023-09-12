public class LambdaArgumentExercice {

    public void dispaly(String[] args){

        MyInterface test = (str, nb) -> {
          if(str.length() < nb){
              System.out.println("La chaine " + str + " est longue de " + nb);
          }
        };

        test.display(args[0], Integer.parseInt(args[1]));
    }
}
