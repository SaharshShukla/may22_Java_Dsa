/*a
A B
a b c d
A B C D E
 */

package may.week2.Assignment4;

public class Qst3 {

    static void upperCaseTriangleWithAscii(){
        System.out.println("Printing upper case triangle by using ascii value");
        for( int i = 65; i <= 70; i++){
            for( char j = 65; j <= (i - 1); j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        upperCaseTriangleWithOutAscii();
        System.out.println("-------------------------------");
        upperCaseTriangleWithAscii();
    }

    static void upperCaseTriangleWithOutAscii(){
        System.out.println("Printing upper case triangle by not using ascii value");
        for( char i = 'A'; i <= 'E'; i++){
            for( char j = 'A'; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
