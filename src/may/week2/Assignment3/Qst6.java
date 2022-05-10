/*- WAP to count number of pairs in 1-n with sum even.*/

package may.week2.Assignment3;
import java.util.Scanner;

public class Qst6 {

    static int count(int n ){
        int cntEvenSum = 0;
       // System.out.println("Even sum paris are: ");
        for(int i = 1; i <= n; i++ ){
            for(int j = i + 1; j <= n; j++ ){
                if((i + j) % 2 == 0){
                    //System.out.println(i + " " + j);
                    cntEvenSum++;
                }
            }
        }
        return cntEvenSum;

    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = scn.nextInt();

        int rslt = count(n);
        System.out.println("Count of even sum pair is " + rslt);
    }
}
