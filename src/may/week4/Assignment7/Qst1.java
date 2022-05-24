/*
1) print sum of array */

package may.week4.Assignment7;

public class Qst1 {



        static int sum(int[] arr, int n){

            int sum = 0;

            int i = 0;
            while(i < n ){
                sum += arr[i];
                i++;
            }

            return sum;
        }


        public static void main(String[] args){

            int[] arr = {12, 23, 14, 32, 42, 13};
            int result = sum(arr,arr.length);

            System.out.println("Sum of array is:  " + result);

        }
}

