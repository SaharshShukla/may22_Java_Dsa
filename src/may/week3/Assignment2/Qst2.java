/* Make a full report card program. */
package may.week3.Assignment2;
import java.util.Scanner;

public class Qst2 {

    static void grade(int percentage){

        if(percentage >= 90 && percentage <= 100){
            System.out.println("grade is A");
        }else if(percentage <= 89 && percentage >= 80){
            System.out.println("grade is B");
        }else if(percentage <= 79 && percentage >= 70){
            System.out.println("grade is C");
        }else if(percentage <= 69 && percentage >= 60){
            System.out.println("grade is D");
        }else{
            System.out.println(" you are fail ");
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter marks of subject First: ");
        int subOne = scn.nextInt();
        System.out.println("Enter marks of subject Second: ");
        int subTwo = scn.nextInt();
        System.out.println("Enter marks of subject Third: ");
        int subThree = scn.nextInt();
        System.out.println("Enter marks of subject Fourth: ");
        int subFour = scn.nextInt();
        System.out.println("Enter marks of subject Fifth: ");
        int subFive = scn.nextInt();

        int per = total(subOne,subTwo,subThree,subFour,subFive);
        grade(per);
        System.out.println("Percentage is " + per + " %");
    }

    static int total(int subOne, int subtwo, int subThree, int subFourth, int subFifth){
        int sum = (int) ( subOne + subtwo + subThree + subFourth + subFifth) / 5;
        return sum;
    }
}
