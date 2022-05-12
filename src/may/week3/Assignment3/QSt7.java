/*- WAP to find number of pairs with given sum*/
package may.week3.Assignment3;
import java.util.Scanner;

    public class QSt7 {
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter value of n: ");
            int n = scn.nextInt();

             pairs(n);
        }

        static void pairs(int n ){
            int sum = 0;
            System.out.println("Pair sum  are: ");
            for(int i = 1; i <= n; i++ ){
                for(int j = i + 1; j <= n; j++ ){
                        sum = (i + j);
                    System.out.println(i + " " + j + " = " + sum);
                    }
                }
            }

        }




