package Q3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);//creates new object reader for taking userinput
        boolean pass=false;//pass is used to ensure the user is putting it the correct numbers. if not, pass will be false
        int userInput=0;//defined a variable outside so it is accessible outside the while loop
        while(!pass){//if pass is false, it will keep looping, however, if the user does the proper input, it will leave the while loop
            try{//if user inputs a non integer number, it will throw an error, so this prevents the program from stopping.
                reader=new Scanner(System.in);//opens the reader object because after each loop, the reader object closes. not defining it again, will cause issues
                System.out.print("Input a number: ");
                userInput=reader.nextInt();//reads the next int value that user inputs 
                if(userInput<1){//the program cannot handle inputs under 1, so I have to ensure user cannot input it
                    throw new Exception();//this will throw an exception in try so that it goes to catch and outputs a generalized error message
                }
                pass=true;//because no error was thrown above, it is safe to assume the input is correct and the while loop is no longer needed
                reader.close();//closes reader to prevent semantic bug
            }
            catch(Exception e){//catches errors in try
                System.out.println("Try again");
            }
        }
        rightTriangle(userInput);//calls the rightTriangle method to modify the userInput into the desired output
        
    }
    public static void rightTriangle(int n){// made it void because it did not have to return anything and static so it is accessible by the main class.
        String triangleNumbers="1";//decided to use string because double and int did not have enough space to handle inputs over 100 and would create semantic errors
        System.out.println(triangleNumbers);
            for(int i=1;i<n;i++){//only loops until the specified user input
                triangleNumbers=triangleNumbers+(i+1);//adds the next number to the String variable
                System.out.println(triangleNumbers);
            }
        }
}
