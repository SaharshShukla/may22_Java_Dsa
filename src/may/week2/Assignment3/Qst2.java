
/*- WAP to print all multiples of 7 till n*/

package may.week1.Assignment3;
import java.util.Scanner;

public class Qst2 {

    static void mul(int num){
        System.out.println("Multiple of 7 till " + num + " is ");
        for(int i = 1; i <= num; i++){
            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter range: ");
        int num = scn.nextInt();
        mul(num);
    }

}
