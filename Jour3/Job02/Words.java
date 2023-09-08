import java.util.ArrayList;
import java.util.Collections;
public class Words {

        public String uniques(String... params){
            ArrayList<String> wordList = new ArrayList<>();
            String saveWord = "";

            for(String word : params){
                wordList.add(word);
            }

            for(String word : wordList){
                int frequency = Collections.frequency(wordList, word);

                if(frequency == 1){
                    saveWord += word + ", ";
                }
            }

            return saveWord.substring(0, saveWord.length() - 2);
        }

}
