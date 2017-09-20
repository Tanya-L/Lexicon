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
