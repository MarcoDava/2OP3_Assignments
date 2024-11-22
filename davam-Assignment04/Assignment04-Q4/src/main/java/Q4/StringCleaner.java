package Q4;

/**
 * Hello world!
 */
public class StringCleaner {
    StringCleaner(){}
    public String cleanString(String inputString){
        String outputString=inputString.toLowerCase().replaceAll("[?.!,:]","").replaceAll("\s\s+"," ").trim();
        return outputString;
    }
}
