package daytwo;

import java.util.Scanner;

public class DayTwo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        while (loop) {

            System.out.println("Give me a first number ");
            float x = sc.nextInt();
            sc.nextLine();

            System.out.println("Give me a second number");
            float y = sc.nextInt();
            sc.nextLine();

            //System.out.println("The result is: " + division(x, y));
            System.out.println("What do you prefer? add/division/multy/substraction");
            System.out.println("+,/,*,-");
            String s = sc.nextLine();

            switch (s) {
                case "+":System.out.println(add(x, y));
                    add(x, y);
                    break;
            

                case "/":System.out.println(division(x, y));
                    division(x, y);
                    break;

                case "*":System.out.println(multy(x, y));
                    multy(x, y);
                    break;

                case "-":System.out.println(substraction(x, y));
                    substraction(x, y);
                    break;

                default:
                    System.out.println("Not a valid input");
            }

           /* if (s.equals("add")) {
                System.out.println("The result is: " + add(x, y));

            } else if (s.equals("division")) {
                System.out.println("The result is: " + division(x, y));

            } else if (s.equals("multy")) {
                System.out.println("The result is: " + multy(x, y));

            } else if (s.equals("substraction")) {
                System.out.println("The result is: " + substraction(x, y));
            } else {
                loop = false;
            }
            
            */
           
            System.out.println("Do you want to do more operation? y/n");
            String a = sc.nextLine();

            if (a.equals("y")) {
            } else {
                loop = false;
            }
        }
    }

    public static float add(float a, float b) {

        return a + b;
    }

    public static float division(float a, float b) {

        return a / b;
    }

    public static float multy(float a, float b) {

        return a * b;
    }

    public static float substraction(float a, float b) {

        return a - b;
    }

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void swith(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
