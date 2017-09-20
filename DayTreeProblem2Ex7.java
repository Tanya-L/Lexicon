/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
