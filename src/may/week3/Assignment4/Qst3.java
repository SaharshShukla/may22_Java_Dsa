/*
a
A B
a b c d
A B C D E
 */

package may.week3.Assignment4;

public class Qst3 {

    static void upperCaseTriangleWithAscii(){
        System.out.println("Printing  lowercase and uppercase triangle by using ascii value");
        for(int i = 97 ; i <= 102; i++){
            for(int j = 97 ; j <= i ; j++){
                if(i % 2 != 0 ){
                    System.out.print((char)(j) + " ");
                }else{
                    System.out.print((char)(j - 32) + " ");
                    }
                }
                System.out.println();
            }


    }

    public static void main(String[] args){
        upperCaseTriangleWithAscii();
    }


}
