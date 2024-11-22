package Q3;
// import statements

/**
 * @author      Marco Dava <davam@mcmaster.ca>
 */
public class StringCleaner {
    StringCleaner(){}
    public String cleanString(String inputString){
        String outputString=inputString.toLowerCase().replaceAll("[?.!,:]","").replaceAll("\s\s+"," ").trim();//uses 4 methods
// first it turns everything lowercase, then it deletes all punctuation, it replaces extra space in between words to just one. finally it  trims the ends to make sure there is no spaces
        return outputString;//
    }
}
