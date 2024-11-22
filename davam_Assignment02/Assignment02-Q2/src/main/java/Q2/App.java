package Q2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);//creates new object reader for taking userinput
        boolean pass=false;//pass is used to ensure the user is putting it the correct numbers. if not, pass will be false
        String div3="Divided by 3 -->";
        String div5="Divided by 5 -->";
        String divboth="Divided by 3 and 5 -->";
        int userInput=0;//defined a variable outside so it is accessible outside the while loop
        while(!pass){//if pass is false, it will keep looping, however, if the user does the proper input, it will leave the while loop
            try{//if user inputs a non integer number, it will throw an error, so this prevents the program from stopping.
                reader=new Scanner(System.in);//opens the reader object because after each loop, the reader object closes. not defining it again, will cause issues
                System.out.print("Input a number: ");
                userInput=reader.nextInt();//reads the next int value that user inputs 
                if(userInput<0){//the program cannot handle negative numbers, so I have to ensure user cannot input it
                    throw new Exception();//this will throw an exception in try so that it goes to catch and outputs a generalized error message
                }
                pass=true;//because no error was thrown above, it is safe to assume the input is correct and the while loop is no longer needed
                reader.close();//closes reader to prevent semantic bug
            }
            catch(Exception e){//catches errors in try
                System.out.println("Try again");
            }

        }
        returnFactors(userInput);//uses a method to ensure encapsulation principle.
    }
    public static void returnFactors(int n){
        for(int i=1;i<=n;i++){//I started at 0 because if user inputs 
            if(i%3==0){
                div3+=i
            }
            else if (i%5==0){
                if (i%3==0){
                    divboth+=i
                }
                div5+=i+", "
            }
        }
    
    }
}
