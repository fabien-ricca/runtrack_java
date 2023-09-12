import java.util.HashSet;

public class HashSetArgumentExercice {
    HashSet<String> wordList;

    public HashSetArgumentExercice(String[] words){
        this.wordList = new HashSet<>();

        for(String word : words){
            wordList.add(word);
        }
    }

    public void display(){
        wordList.forEach(word -> System.out.println(word));
    }

}
