/*
 * 1. Write a Java program to print the odd numbers from 1 to 99. Prints one
number per line.
Sample Output:
1
3
5
7
9
11
....
91
93
95
97
99
 */
package daytree;

/**
 *
 * @author User
 */
public class DayTreeProblem2Ex1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            System.out.println(" " + i++);
        }
    }
}
