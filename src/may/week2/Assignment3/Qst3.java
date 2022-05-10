/*- WAP to count multiples of 3, multiples of 5 and both 3,5 in range 1-n.*/

package may.week2.Assignment3;
import java.util.Scanner;

public class Qst3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scn.nextInt();
        countMulti(n);
    }

    static void countMulti(int n){
        int cntThree = 0;
        int cntFive = 0;
        for (int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 ==0 ){
                cntThree++;
                cntFive++;
            }else if (i % 3 == 0){
                cntThree++;
            }else if (i % 5 == 0){
                cntFive++;
            }
        }

        System.out.println("Multiple of 3 is " + cntThree);
        System.out.println("Multiple of 5 is " + cntFive);

    }
}
