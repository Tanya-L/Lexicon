package DayFour;

import java.util.Scanner;

public class t9 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How old is you?");
        int a = sc.nextInt();
        if ((a >= 0) && (a <= 20)) {
            System.out.println("Half price");
        }
        else if ((a >= 20) && (a <= 60)) {
            System.out.println("Full price");
        }
        else if ((a >= 60) && (a <= 100)) {
            System.out.println("Half price");
        } else {
            System.out.println("Free of charge");
        }
    }
}
