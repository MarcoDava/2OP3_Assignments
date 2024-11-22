package Q5;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;
/**
 * @author      Marco Dava <davam@mcmaster.ca>
 */ 
public class TextAnalyzer extends StringAnalyzer{//extends String analyzer, meaning it inherits all of stringanalyzers methods
    private String text="";
    StringCleaner cleaner=new StringCleaner();

    TextAnalyzer(String word){
        super(word);//refers to the word from the super class
        if(word.length()==0||word.isEmpty()){//checks if null
            throw new IllegalArgumentException("The string cannot be null of empty");
        }//if it is null, will cause error
        
        text=cleaner.cleanString(word);
    }
    public String getText(){
        return text;
    }
    public double getAverageWordLength(){//uses method getWordFrequencies to reuse the map.
        Map<String, Integer> textFrequency=getWordFrequencies();
        int sum=0;
        int numberOfText=0;
        for(Map.Entry<String, Integer> textList:textFrequency.entrySet()){//map is used to sum all the words and be able to divide by an accurate number
            sum+=textList.getKey().length()*textList.getValue();//getkey returns the word, value returns the int number associated with it
            numberOfText+=textList.getValue();
        }
        double average=sum/numberOfText;
        return average;
    }
    public String getOccuringString(){
        Map<String, Integer> textFrequency=getWordFrequencies();//reuses map
        int mostOccurances=0;
        String mostOccuringString="";
        for(Map.Entry<String, Integer> textList:textFrequency.entrySet()){//will split map into seperate integers
            if(textList.getValue()>mostOccurances){//if the map has a larger value, it will mean theres more occurances
                mostOccurances=textList.getValue();
                mostOccuringString=textList.getKey();
            }
        }
        return mostOccuringString;//returns the most occuring string
    }
    public void getAlphabeticalOrder(){
        String[] alphabeticalOrder=text.split(" ");
        Arrays.sort(alphabeticalOrder);//sorts everything into alphabetical order
        for (int i=0;i<alphabeticalOrder.length-1;i++){
            if(!alphabeticalOrder[i].equals(alphabeticalOrder[i+1])){//if the string in front of the array index is the same, it wont print, because it is a duplicate, otherwise, it will print
                System.out.print(alphabeticalOrder[i]+" ");
            }
        }
        System.out.println(alphabeticalOrder[alphabeticalOrder.length-1]);//the only index that isnt printed is the last index. because the for loop already checks for duplicates, it is safe to just print the last index.
    }

}