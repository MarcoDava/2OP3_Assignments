package Q2;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);//calls Scanner class and instantiates object reader.
        String userNumber="";
        String unfilteredUserNumber="";//This is used so that the userinput can eventually be filtered. if the raw input from the user is taken, it will most likely break the program
        boolean pass=true;//used to check if userinput is valid

        while(pass){//can only leave if pass is false. pass is false when user inputs correct format
            try{
                System.out.println("Please Input the Phone Number in format XXX-XXX-XXXX");
                unfilteredUserNumber=reader.nextLine();//takes in user input in string
                userNumber=unfilteredUserNumber.toLowerCase().trim();//ensures there are no empty spaces outside of string and that all string are lowercase for simplified filtering
                if(userNumber.replaceAll("-","").length()==10 && userNumber.matches("[0-9a-z]{3}-[0-9a-z]{3}-[0-9a-z]{4}")){//this regex checks for the correct format.
                //The character inputted cannot be special and can only be int, string and the dashes in between. Checks if the length is correct
                    pass=false;//if the input was correct and the format was correct, it will exit the while loop
                }
                else{
                    System.out.println("Please input the correct format and ensure there are only 10 digits.");
                }
            }
            catch(Exception e){//if any error was created somehow, it will catch it and not produce a crash
                System.out.println("Please try again");
            }
        }
        convertNumber(userNumber,unfilteredUserNumber);//calls method, see below. takes in two parameters that are both string
    }
    static void convertNumber(String userNumber,String unfilteredUserNumber){//is void because it does not need to return anything
        System.out.print("The number for "+unfilteredUserNumber.trim()+" is ");
        for(int i=0;i<userNumber.length();i++){//this for loop is to iterate through each letter/number/dash
            String userNumberIndex=userNumber.substring(i,i+1);//substring creates a new string with characters from usernumber from i to i+1
            if(userNumberIndex.matches("[a-z]")){//if the character is a letter, it will go through this if statement
                if(userNumberIndex.matches("[a-c]")){//regex checks if the letter is between a and c
                    System.out.print("2");//will print the number in place for the letter
                }
                else if(userNumberIndex.matches("[d-f]")){//regex will check is the character is in between d and f
                    System.out.print("3");
                }
                else if(userNumberIndex.matches("[g-i]")){//continued...
                    System.out.print("4");
                }
                else if(userNumberIndex.matches("[j-l]")){
                    System.out.print("5");
                }
                else if(userNumberIndex.matches("[m-o]")){
                    System.out.print("6");
                }
                else if(userNumberIndex.matches("[p-s]")){
                    System.out.print("7");
                }
                else if(userNumberIndex.matches("[t-v]")){
                    System.out.print("8");
                }
                else if(userNumberIndex.matches("[w-z]")){
                    System.out.print("9");
                }
                else{
                    System.out.println("Something went wrong");
                }
            }
            else if(userNumberIndex.equals("-")){//will simply print - if it detects a -
                System.out.print("-");
            }
            else if(userNumberIndex.matches("[0-9]")){//if the character in this index is a number, it will simply output the number
                System.out.print(userNumberIndex);
            }
            else{//in case theres an unexpected input, which should not be possible
                System.out.println("Something went wrong.");
            }

        }
        System.out.println("");//for new line
    }
}
