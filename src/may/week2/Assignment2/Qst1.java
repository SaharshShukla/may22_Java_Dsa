/*
WAP to input hour(24 hour format) and print good morning(<12)
/ good afternoon(<=16) / good evening(<=20) / good night
 */
package may.week1.Assignment2;
import java.util.Scanner;
public class Qst1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = scn.nextInt();
        check(time);
    }
    static void check(int time){

        if(time <= 12 && time <= 15){
            System.out.println("Good morning");
        }else if(time <= 16 && time <= 19){
            System.out.println("Good afternoon");
        }else if(time <= 20){
            System.out.println("Good evening");
        }else{
            System.out.println("Good night");
        }
    }
}
