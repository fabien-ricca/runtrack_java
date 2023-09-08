import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordSort {
    ArrayList<String> wordList = new ArrayList<>();

    public List<String> sortWords(String... words){
        for(String word : words){
            wordList.add(word);
        }

        List<String> result = wordList.stream()
                                        .filter(word -> word.length() == 3)
                                        .filter(word -> word.charAt(0) == 'a')
                                        .collect(Collectors.toList());

        return result;
    }
}
