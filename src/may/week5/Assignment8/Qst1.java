/* -Find smallest number in an array. */

package may.week5.Assignment8;

public class Qst1 {

    static int smallest(int[] arr){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }


    public static void main(String[] args){
        int[] arr = {54, 32, 53, 24, 322,13};

        int result = smallest(arr);
        System.out.println("Smallest element int the array is : " + result);

        System.out.println("------------------------------------------");
        int resultOne = greatest(arr);
        System.out.println("Greatest element int the array is : " + resultOne);


    }

    static int greatest(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }



}
