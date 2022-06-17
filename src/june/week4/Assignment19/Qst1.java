/* Implement GCD and LCM */
package june.week4.Assignment19;

public class Qst1 {
    public static void main(String[] args){
        int numOne = 20;
        int numTwo = 28;
        lcmAndHcf(numOne, numTwo);

    }

    static void lcmAndHcf(int numOne, int numTwo){

        int orignalNumOne = numOne;
        int orignalNumTwo = numTwo;
        while (numOne % numTwo != 0){
            int rem = numOne % numTwo;
            numOne = numTwo;
            numTwo = rem;
        }

        int hcf = numTwo;
        int lcm = (orignalNumOne * orignalNumTwo) / (hcf);

        System.out.println("HCF is : " + hcf);
        System.out.println("LCM is : " + lcm);

    }


}
