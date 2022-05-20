/*- WAP to print alternate elements in reverse */

package may.week4.Assignment6;
import java.util.Scanner;

public class Qst2 {

    static void evenIndex(int[] arr){

        System.out.println("\n---Even---Index--in--reverse--order--");
        for(int i = (arr.length - 1); i >= 0; i--){
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void oddIndex(int[] arr){


        System.out.println("\n-----Odd----Index--in--reverse--order--");
        for(int i = (arr.length - 1); i >= 0; i--){
            if(i % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }



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

        evenIndex(arr);
        oddIndex(arr);
    }
}
