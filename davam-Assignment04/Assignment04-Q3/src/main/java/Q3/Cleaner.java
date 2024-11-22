package Q3;
public class Cleaner {
    public static void main(String[] args) {
        StringCleaner cleaner = new StringCleaner();
        String text = "   Hello, World!                                                                                         How's it going?   ";
        String cleanedText = cleaner.cleanString(text);
        System.out.println("Not Cleaned Text: " + text);
        System.out.println("Cleaned Text: " + cleanedText);
    }
}
