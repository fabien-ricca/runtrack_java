public class Job02 {
    public static void main(String[] args){
        Words words = new Words();

        String str = words.uniques("chat", "chien", "chat", "oiseau", "poisson", "oiseau");
        System.out.println(str);
    }
}
