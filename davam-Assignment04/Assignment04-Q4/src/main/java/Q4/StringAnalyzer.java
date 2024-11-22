package Q4;
import java.util.Map;
import java.util.HashMap;
/**
 * @author      Marco Dava <davam@mcmaster.ca>
 */
public class StringAnalyzer {
    private String word="";
    StringCleaner cleaner=new StringCleaner();
    StringAnalyzer(String inputWord){
        if(inputWord.length()==0||inputWord.isEmpty()){//checks if string is empty or null
            throw new IllegalArgumentException("The string cannot be null of empty");// if empty, it will cause an error message
        }
        word=inputWord;
    }
    public Map<String, Integer> getWordFrequencies(){//map is used to count to append on top of data structure while keeping its value alongside it.
        Map<String, Integer> wordFrequency = new HashMap<>();
        String cleanedWord=cleaner.cleanString(word);//uses cleanstring from string cleaner class to remove any unwanted effects
        String[] cleanedWords=cleanedWord.split(" ");//splits according to spaces and puts it into array indexes
        for(String key:cleanedWords){
            if(wordFrequency.get(key)==null){//if there is no value in the key, it will assign a value
                wordFrequency.put(key,1);
            }
            else{//if it does have a value, it will add on to it
                wordFrequency.put(key,wordFrequency.get(key)+1);
            }
        }
        return wordFrequency;
    }
    public String getLongestWord(){
        String longestWord="";
        String cleanedWord=cleaner.cleanString(word);
        String[] cleanedWords=cleanedWord.split(" ");
        for(String key:cleanedWords){//will iterate through each index named key and check if the word is longer than the word that is saved, if so, itwill update its value
            if(key.length()>longestWord.length()){
                longestWord=key;
            }
        }
        return longestWord;
    }
    public String isPalindrome(){
        String reversedWord="";
        String cleanedWord=cleaner.cleanString(word).replaceAll(" ","");//removes spaces
        for(int i=cleanedWord.length();i>0;i--){
            reversedWord+=cleanedWord.substring(i-1,i);//starts at the end of the array and goes towards the start, loading the chars into reversed word string through substring
        }
        if(reversedWord.equals(cleanedWord)){//if the string equals its reversed word, it is a palindrome
            return "True";
        }
        return "False";
    }
}
