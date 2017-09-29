/*
 * Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
 */
package Problem3;

import java.util.Scanner;

public class Problem3ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a word: ");
        String a = in.nextLine();
        String result = "";
        char[] ch = a.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.println("Reverse word: " + result);
    }
}
