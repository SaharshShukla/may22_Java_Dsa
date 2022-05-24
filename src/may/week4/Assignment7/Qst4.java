/*4) print alterative element (EX :- [1, 6, 8, 9, 5, 3, 7]) */


package may.week4.Assignment7;

public class Qst4 {

    public static void main(String[] args){
        int[] arr = {1, 6, 8, 9, 5, 3, 7};

        System.out.print("\nEven index element ");
         evenElment(arr, arr.length);
        System.out.println("\n------------------");
        System.out.print("Odd index element ");
         oddElment(arr, arr.length);


    }


    static void evenElment(int[] arr, int n){


        int i = 0;

        while(i < n){
            System.out.print(arr[i] + " ");

            i += 2;
        }
    }

    static void oddElment(int[] arr, int n){

        int i = 1;

        while(i < n){
            System.out.print(arr[i] + " ");

            i += 2;
        }
    }
}
