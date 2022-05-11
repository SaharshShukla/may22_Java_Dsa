/*- WAP to print even numbers till n. */
package may.week1.Assignment3;
import java.util.Scanner;
public class Qst1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = scn.nextInt();
        printEven(n);
    }

    static void printEven(int n){
        System.out.print("Even number between " + "1 and " + n + " is ");
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}


