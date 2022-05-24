/*2) multiply all the element present inside array */


package may.week4.Assignment7;

public class Qst2 {

    static int product(int[] arr, int n){
        int prod = 1;

        int i = 0;
        while(i < n){
            prod *= arr[i];
            i++;
        }
        return prod;

    }

    public static void main(String[] args){
        int[] arr = {34, 56, 53, 4};

        int result = product(arr, arr.length);

        System.out.println("Product of array is: " + result);


    }
}
