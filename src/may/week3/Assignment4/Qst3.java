/*a
A B
a b c d
A B C D E
 */

package may.week3.Assignment4;

public class Qst3 {

    static void upperCaseTriangleWithAscii(){
        System.out.println("Printing upper case triangle by using ascii value");
        for(int i = 1 ; i <= 4; i++){
            for(int j = 1 ; j <= i; j++){
                if(i % 2 != 0 ){
                    for(char c = 'a'; c <= 'd'; c++){
                        System.out.print(c + " ");
                    }
                }else{
                    for(char c = 'A'; c <= 'E'; c++){
                        System.out.print(c + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        upperCaseTriangleWithAscii();
    }


}
