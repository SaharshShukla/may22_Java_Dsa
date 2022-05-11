/*
a
b a
c b a
d c b
*/

package may.week3.Assignment4;

public class Qst2 {

    static void characterTriangle(){
        System.out.println("Printing lower case triangle by not using ascii value");

        for(char i = 'a'; i <= 'd'; i++){
            for(char j = i; j >= 'a' ; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        characterTriangle();
        System.out.println("-----------------");
        withCharacterTriangle();

    }

    static void withCharacterTriangle(){
        System.out.println("Printing lower case triangle by using ascii value");
        for(int i = 97; i <= 101; i++){
            for(int j = (i - 1); j >= 97 ; j--){
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
