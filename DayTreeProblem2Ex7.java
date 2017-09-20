/*
 * 7. Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:
Input seconds: 86399
23:59:59
 */
package daytree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DayTreeProblem2Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        int min;
        int hour;
        System.out.println("Enter the number of seconds : ");
        sec = input.nextInt();
        hour = sec / 3600;
        min = (sec / 3600) / 60;
        int sec_output = (sec % 3600) % 60;

        System.out.println("Time in hours,minutes and seconds is:");
        System.out.println(hour + " hours :" + min + " minutes:" + sec_output + " seconds");
    }

}
