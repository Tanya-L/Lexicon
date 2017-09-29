/*
 * Write a program that lets a user guess a number

• Keep the user guessing until the guess is correct

• For each guess the user is told whether the guess is too small
or too large

• Each time the program starts it picks a random value between
1 and 1000

• Hint: Math.random() delivers a random decimal number
between 0 och 0.99999999...

• (Extras, if you like: let the program repeat the game, ask each
time if the user wants another game, keep running averages of
number of guesses... )
 */
package homeworkulf;

import javax.swing.JOptionPane;

public class HomeworkUlf {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 1000 + 1);
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Cuess my number"));
        while (guess != n) {
            if (guess < n) {
                guess = Integer.parseInt(s);
                System.out.println(guess + "your number is too small. Try again");
            } else {
                System.out.println(guess + "your number is too large. Try again");
            }
            
        }

    }
}
