/*5) Sum of elements with index = value (EX :- [5, 1, 2, 7, 4])
   o/p :- 7*/

package may.week4.Assignment7;

public class Qst5 {
    public static void main(String[] args){
        int[] arr = {5, 1, 2, 7, 4};

        int reslt = sum(arr, arr.length);
        System.out.print(reslt);
    }

    static int sum(int[] arr, int n){
         int i = 0;
         int sum = 0;
         while(i < n){

             if(arr[i] == i){
                 sum += i;
             }

             i++;
         }

         return sum;
    }

}
