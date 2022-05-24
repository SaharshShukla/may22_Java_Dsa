/*3) find sum of even and odd element (EX :- [5, 6, 7, 2, 3]) */


package may.week4.Assignment7;

public class Qst3 {

    static void sumOfEvenOdd(int[] arr ,int n){
        int sumEven = 0;
        int sumOdd = 0;

        int i = 0;

        while(i < n){

            if(arr[i] % 2 == 0){
                sumEven += arr[i];
            }else{
                sumOdd += arr[i];
            }

            i++;
        }

        System.out.println("Even element sum is: " + sumEven);
        System.out.println("Odd element sum is: " + sumOdd);


    }

    public static void main(String[] args){
        int[] arr = {5, 6, 7, 2, 3};
        sumOfEvenOdd(arr, arr.length);

    }
}
