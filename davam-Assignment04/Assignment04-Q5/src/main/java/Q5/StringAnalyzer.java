package Q5;
import java.util.Map;
import java.util.HashMap;

public class StringAnalyzer {
    private String word="";
    StringCleaner cleaner=new StringCleaner();
    StringAnalyzer(String inputWord){
        if(inputWord.length()==0||inputWord.isEmpty()){
            throw new IllegalArgumentException("The string cannot be null of empty");
        }
        word=inputWord;
    }
    public Map<String, Integer> getWordFrequencies(){
        Map<String, Integer> wordFrequency = new HashMap<>();
        String cleanedWord=cleaner.cleanString(word);
        String[] cleanedWords=cleanedWord.split(" ");
        for(String key:cleanedWords){
            if(wordFrequency.get(key)==null){
                wordFrequency.put(key,1);
            }
            else{
                wordFrequency.put(key,wordFrequency.get(key)+1);
            }
        }
        return wordFrequency;
    }
    public String getLongestWord(){
        String longestWord="";
        String cleanedWord=cleaner.cleanString(word);
        String[] cleanedWords=cleanedWord.split(" ");
        for(String key:cleanedWords){
            if(key.length()>longestWord.length()){
                longestWord=key;
            }
        }
        return longestWord;
    }
    public String isPalindrome(){
        String reversedWord="";
        String cleanedWord=cleaner.cleanString(word).replaceAll(" ","");
        for(int i=cleanedWord.length();i>0;i--){
            reversedWord+=cleanedWord.substring(i-1,i);
        }
        if(reversedWord.equals(cleanedWord)){
            return "True";
        }
        return "False";
    }
}
