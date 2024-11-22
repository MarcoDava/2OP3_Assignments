package Q2;
import java.util.Scanner;

public class App {
    public static void main(    ) {
        Scanner reader=new Scanner(System.in);// calls scanner object reader. This object has the ability of taking in user input
        boolean pass=false;//pass is used to ensure the user is inputting the correct value for the program. 
        int x=0;
        while(!pass){//user cannot move on until they input a reasonable value. must be int data type
            try{
                reader=new Scanner(System.in);//reopens the reader object because it is closed after every loop
                System.out.print("Input a Number in decimal: ");
                x=reader.nextInt();//takes user input of the next int
                pass=true;//because no exception was created, it means user can finally escape while loop
                reader.close();//closes to ensure there is no semantic error(If it was closed outside, it would not take user input and repeatedly while loop)
            }
            catch(Exception e){
                System.out.println("Please try again");//catches when user doesnt input int value
            }
            
        }
        int octalNumber=convertOctal(x);// calls static method to perform the task
        System.out.println("The Octal Number is: ",octalNumber);
    }
    public static int convertOctal(int x){
        int octalNumber=0;
        int placing=1;//placing is used as a way to place every number in a unique spot in the right order
        while(x>8 || x<-8){
            octalNumber+=(x%8)*placing;//takes remainder and multiplies it by the placing for it to be a new digit.
            x=x/8;
            placing*=10;//ensures it will make a new digit place after each iteration
        }
        octalNumber+=placing*x;//for the last iteration when the number is smaller than 8
        return octalNumber;
    }
}
