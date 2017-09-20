/*
*2. Write a Java program to accept a number and check the number is even
or not. Prints 1 if the number is even or 0 if the number is odd.
Sample Output:
Input a number: 20
1
*
*/
package daytree;

import java.util.Scanner;

public class DayTreeProblem2Ex2 {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println ("Impur a number: ");
        
          int i = sc.nextInt();
          sc.nextLine();
       
            if (i % 2 == 0) {
                System.out.println(1);
            } else {
            System.out.println(0);
        }

    }
}
