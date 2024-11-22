package Q4;
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);//calls Scanner class and instantiates object reader.
        int userGuess=0;
        Random random=new Random();//calls Random class and instantiates object random.
        int randomNumber=random.nextInt(-100,100);//chooses an int number between -100 and 100 including -100 and 100
        boolean check=false;//used to check if user found the correct number
        int attempts=10;
        //System.out.println(randomNumber);//DEBUGGING
        while(!check){
            attempts--;//will remove 1 attempt every loop
            boolean pass=true;//will be used to check if user is inputting the right numbers
            while(pass){//while loop so that user is forced to input the correct value
                try{//try so that whenever an error is produced it will not crash
                    System.out.println("Input a number between -100 and 100");
                    userGuess=reader.nextInt();//reads next occurance of an int
                    if(userGuess<-100||userGuess>100){//if user input is greater than 100 or less than -100, it will not allow user to continue
                        throw new Exception();//will throw exception so that user is prompted about the mistake in catch
                    }
                    else{
                        pass=false;//will allow user to escape this while loop because the desired input was taken
                    }
                }
                catch(Exception e){//catches if user doesnt put a number or if the number is not within the bounds of -100 and 100
                    System.out.println("Please try again, the number must be between -100 and 100.");
                    reader.next();//clears reader value to ensure that nextInt isnt loaded(Causes errors without next())
                }
            }
            //System.out.println("You inputted: "+userGuess);//DEBUGGING
            check=checkGuess(userGuess,randomNumber,attempts);//calls checkGuess and also assigns check a boolean value. if user guessed correctly, guess is equal to 
            //true, and the while loop ends.
        }
    }
    static boolean checkGuess(int guess, int randomNumber, int attempts){//boolean so that check can be assigned a value
        if(attempts>0){//if user still has more than 0 attempts, they will be able to see if the number they guessed was correct
            if(guess==randomNumber){//if user guessed the random number it will prompt user that they did it
                System.out.println("You successfully guessed the number!");
                return true;//returns true so that the while loop ends
            }
            else if(guess>randomNumber){
                System.out.println("The number is lower than "+guess+".");
                return false;//returns false because user did not guess correctly
            }
            else if(guess<randomNumber){
                System.out.println("The number is higher than "+guess+".");
                return false;
            }
            else{
                System.out.println("Something went wrong");
            }
        }
        else{
            System.out.println("You have exhausted your trials.");
            return true;//returns true because the user has exhausted their tries, so they need to exit the while loop
        }
        return false;//returns false if the if statement is somehow bypassed, which should not be possible and also to allow for compilation of class
    }
}
