/*Sort by parity (Odds first then evens)

INPUT :- arr :-> 1 2 4 3 6 7 8 9
OUTPUT :- arr :-> 1 3 7 9 2 4 6 8
using dutch national flag algorithm
*/

package may.week6.Assignment10;

public class Qst1 {
    public static void main (String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 7, 8, 9};
        dutchNationalFlag(arr, arr.length);


    }
    static void dutchNationalFlag (int[] arr, int leng) {

        int i = 0;
        int j = 0;
        int k = leng - 1;

        while (j <= k) {

            if (arr[j] % 2 != 0) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++;
                j++;
            } else if (arr[j] % 2 == 0) {
                j++;
            } else {
                int tmp = arr[k];
                arr[k] = arr[j];
                k--;
            }
        }

        print(arr, leng);
    }

    static void print (int[] arr, int leng) {
        for (int i = 0; i < leng; i++) {
            System.out.print (arr[i] + " ");
        }

    }


}
