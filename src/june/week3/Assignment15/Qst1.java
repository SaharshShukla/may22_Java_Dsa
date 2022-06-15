/* Check if a string is palindrome or not */

package june.week3.Assignment15;

public class Qst1 {

    static boolean isPalindrom(String str) {
        boolean flag = true;
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;

    }


    public static void main(String[] args) {
        String str = "Saharsh";
        boolean flag = isPalindrom(str);

        if (flag == true) {
            System.out.println("Given string is a palindromne ");
        } else {
            System.out.println("Given string is not a palindromne ");
        }

    }
}
