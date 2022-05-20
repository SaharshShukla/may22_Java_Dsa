/* Build a program for nCr. */
package may.week4.Assignment5;

import java.util.Scanner;

public class Qst1 {

    static int nCr(int n, int r){
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scn.nextInt();
        System.out.println("Enter value of r: ");
        int r = scn.nextInt();


        System.out.println("ncr is : " + nCr(n, r));
    }


    static int fact(int n) {
        int prod = 1;
        for (int i = 2; i <= n; i++){
            prod = prod * i;
        }
        return prod;
    }


}
