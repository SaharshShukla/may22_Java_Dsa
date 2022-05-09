//5.  WAP to input two integers and print sum.
package may.week2.Assignment1;
import java.util.Scanner;
public class Qst1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo = scn.nextInt();

        int result = sum(numOne, numTwo);
        System.out.println("Sum of " + numOne + " and " + numTwo + " is " + result);
    }

    static int sum(int numOne, int numTwo){
        int sumOfTwo = (numOne + numTwo);
        return sumOfTwo;
    }
}
