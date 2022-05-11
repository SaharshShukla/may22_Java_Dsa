// WAP find area of rectangle.
package may.week2.Assignment1;
import java.util.Scanner;
public class Qst2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        int l = scn.nextInt();
        System.out.println("Enter breath of rectangle: ");
        int b = scn.nextInt();

        int area = areaOfRec(l,b);
        System.out.println("Area of rectangle of " + l + " and " + b + " is " + area);
    }

    static int areaOfRec(int l, int b){
        int area = l * b;
        return area;
    }
}
