package Q2;

public class Calculator {
    public static void main(String[] args) {
        try {
            int[] data = {};
            StatisticsCalculator calculator = new StatisticsCalculator(data);

            System.out.println("Average: " + calculator.calculateAverage());
            System.out.println("Median: " + calculator.calculateMedian());

            // Example of handling an exception
            int[] emptyData = {};
            calculator.updateArray(emptyData); // Should handle exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
