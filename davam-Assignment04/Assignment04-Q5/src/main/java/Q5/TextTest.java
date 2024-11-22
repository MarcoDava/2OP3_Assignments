package Q5;


public class TextTest {
    public static void main(String[] args) {
        try {
            TextAnalyzer analyzer = new TextAnalyzer("hello hello bello bello sello sello");
            System.out.println("Word Average: " + analyzer.getAverageWordLength());
            System.out.println("Alphabetical Order: ");
            analyzer.getAlphabeticalOrder();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
