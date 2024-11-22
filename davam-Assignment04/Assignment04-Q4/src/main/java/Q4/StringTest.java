package Q4;


public class StringTest {
    public static void main(String[] args) {
        try {
            StringAnalyzer analyzer = new StringAnalyzer("Lowol");

            System.out.println("Word Frequencies: " + analyzer.getWordFrequencies());
            System.out.println("Longest Word: " + analyzer.getLongestWord());
            System.out.println("Is Palindrome: " + analyzer.isPalindrome());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
