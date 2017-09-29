/*
 * Write a Java program that accepts two integer values from the user and
return the larger values. However, if the two values are the same, return
0. 

Return the smaller value if the two values have the same remainder
when divided by 6.
Sample Output:
Input the first number : 12
Input the second number: 13
Result: 13
 */
package Problem3ex1;

import java.util.Scanner;

public class Problem3ex1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input the first number : ");
        int a = sc.nextInt();

        System.out.println("Input the second number : ");
        int b = sc.nextInt();

        System.out.println("Result: " + solution(a, b));

    }

    public static int solution(int x, int y) {
        if (x == y) {
            System.out.println("both are both same numbers so we return 0");
            return 0;
            
        } else if (x % 6 == y % 6) {
            System.out.println("we have the same reminder" + "we return lowest");
            return (x < y) ? x : y;

        } else {
            return -1;
        }
    }
}

