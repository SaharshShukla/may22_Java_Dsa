/*- WAP to take input of an array and find the sum */

package may.week4.Assignment6;
import java.util.Scanner;

public class Qst3 {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int length = scn.nextInt();
        int[] arr = new int[length];

        System.out.println("---Taking--user--Input---");
        for(int i = 0 ; i < length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("---Displaying--user--Input---");
        for(int i = 0 ; i < length; i++){
            System.out.print(arr[i] + " ");
        }

        int rslt = sum(arr);
        System.out.println("\nSum of array is "+ rslt);
    }

    static int sum(int[] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
