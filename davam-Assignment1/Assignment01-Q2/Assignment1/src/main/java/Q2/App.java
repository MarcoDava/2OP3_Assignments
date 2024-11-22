package Q2;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius=reader.nextInt();
        reader.close();
        double Area=(Math.round(radius*radius*3.141*100.000))/100.00;
        double Perimeter=(Math.round(radius*2*3.141*100.000))/100.00;
        System.out.println("The Area is: "+Area+" and the Perimeter is: "+Perimeter );
    }
}
