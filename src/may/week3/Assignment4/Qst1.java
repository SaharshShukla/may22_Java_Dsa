/*
1
2 1
3 2 1
4 3 2 1
 */
package may.week3.Assignment4;
import java.util.Scanner;

public class Qst1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();

        triangle(n);
    }

    static void triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}




