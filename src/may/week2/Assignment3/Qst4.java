/*- WAP to input n, loop for n times and input 2 numbers in each iteration,
if iteration is even(0th,2nd,4th..) print sum else print multplication.
 */

package may.week2.Assignment3;
import java.util.Scanner;

public class Qst4 {

    static void iteration(int n){
        Scanner scn = new Scanner(System.in);
        int sum, pro ;
        for(int i = 1; i <= n; i++){
            System.out.println("Enter number One: ");
            int numOne = scn.nextInt();
            System.out.println("Enter number Two: ");
            int numTwo = scn.nextInt();

            if(i % 2 == 0){
                sum = numOne + numTwo;
                System.out.println("Sum is " + sum);
            }else{
                pro = numOne * numTwo;;
                System.out.println("Product is " + pro);
            }
        }


    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter n value: ");
        int n = scn.nextInt();
        iteration(n);
    }
}
