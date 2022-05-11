/*- WAP print       1 2 3 4
                    5 6 7 8
                    9 10 11 12

 */

package may.week1.Assignment3;
import java.util.Scanner;

public class Qst5 {

    static void pattern(int n){
        int count = 1;
        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= n; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = scn.nextInt();// enter 4 for above pattern

        pattern(n);
    }
}
