package Q1;
import java.util.Scanner;
import java.lang.Math;
/**
 * Hello world!
 */
public class Discriminant {
    public static void main(String[] args) {
        int pass=0;//used in while loop and to iterate through each case, see while loop under to see effect.
        float a=0;//declare outside of while loop so it can be used in another scope
        float b=0;
        float c=0;
        Scanner reader=new Scanner(System.in);//declares new scanner reader object. this class is used to take in inputs from user
        while(pass!=3){//pass will eventually get to 3 because of the cases. once it reaches 3, it will exit the loop because the desired input was taken
            try{//I used try so if the user inputs the wrong value, the program will not crash
                if(pass==0){//pass starts as 0, and if the user inputs a float, it will increase float by 1, and pass will allow for a different if statement to be executed
                    System.out.println("Enter a: ");
                    a=reader.nextFloat();//will take in the float input, if the input is not float, it will produce an error and go straight to catch 
                    pass++;
                }
                else if(pass==1){
                    System.out.println("Enter b: ");
                    b=reader.nextFloat();
                    pass++;
                    
                }
                else if(pass==2){
                    System.out.println("Enter c: ");
                    c=reader.nextFloat();
                    pass++;
                    
                }
                
            }
            catch(Exception e){
                System.out.println("Please try again");
                reader.next();//this makes sure the reader object is not filled when the while loop iterates through it again, without it, it will create an infinite loop
            }
        }
        findRoots(a,b,c);//calls the findRoots method, see below
        //System.out.println(discriminantValue);//DEBUGGING
    }

    static void findRoots(float a , float b , float c){
        double eps=Math.pow(10,-9);//this is used because of float inaccuracies. Whenever I compare two floats, I will use this value
        float discriminantValue=b*b-4*a*c;//used to determine how many roots there are
        double root1=0;//There are 2 in case there are 2 roots
        double root2=0;

        if(discriminantValue>0){//if discriminant is greater than 0
            root1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            root2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("For a= "+a+", b= "+b+", c= "+c+", the roots are "+Math.round(root1*100)/100.00+" and "+Math.round(root2*100)/100.00);//there is 100 times and 100 divided 
            //so that the decimal point is to the hundreths
        }
        else if (discriminantValue<eps&&discriminantValue>-eps){//if it is within a certain tolerance, it will count as being equal to 0
            root1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println("For a= "+a+", b= "+b+", c= "+c+", the root is "+Math.round(root1*100)/100.00);
        }
        else if(discriminantValue<0){
            System.out.println("The Equation has no real roots.");
        }
        else{//in case a special case happens, which it should not.
            System.out.println("Something went wrong");
        }
    }
}
