/*
 * 3- The number S is called the mean of two numbers R1 and R2, if S is equal to (R1 +R2)/2.
Input
The first and only line of input contains two integers R1 and S.
Output
Output R2 on a single line.
 */
package daytree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DayTreeProblem1Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a S");
        float S = sc.nextFloat();
        sc.nextLine();

        System.out.println("Give me a R1");
        float R1 = sc.nextFloat();
        sc.nextLine();

        System.out.println(Calc(S, R1));
        
           }
    

    public static float Calc(float a, float b) {

        float r2;
        r2 = (2 * a) - b;
        return r2;
    }
}

