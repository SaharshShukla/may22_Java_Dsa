/*  Count all duplicates in sorted array (Ex:- [1,1,2,2,3,4,5,6,7,7,7]) */
package may.week5.Assignment9;

public class Qst1 {

    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 7};
        int result = count(arr, arr.length);
        System.out.println("Count of duplicate in array is:  " + result);
    }

    static int count(int[] arr, int n){

        int count = 0;

        for(int i = 0; i < (n - 1); i++){
            if(arr[i] == arr[i + 1]){
                System.out.println("Duplicate element are: " + arr[i]);
                count ++;
            }
        }

        return count;

    }
}
