/* WAP to sort a string */
package june.week3.Assignment14;

public class Qst2 {

    static String insertionSort(String str){

        char[] chArray = str.toCharArray();
        for(int i = 0; i < chArray.length; i++){
            char temp = chArray[i];
            int j = i - 1;

            while(j >= 0 && chArray[j] > temp){
                chArray[j + 1] = chArray[j];
                j = j - 1;
            }
            chArray[j + 1] = temp;
        }

        return new String(chArray);

    }


    public static void main(String[] args){

        String str = "saharsh";
        String newString = insertionSort(str);
        System.out.println(newString);


    }
}
