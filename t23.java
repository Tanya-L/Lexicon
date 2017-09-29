/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class t23 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input values");
        int a = sc.nextInt();
        blackJack(a);
        }
   
    private static void blackJack(int b){
        System.out.println();

            if ((b >= 0) && (b <= 21)) {
            System.out.println(21);
        }
        else if ((b >= 21) && (b <= 25)) {
            System.out.println(21);
        }
        else if ((b>= 19) && (b <= 22)) {
            System.out.println(19);
        }
    }
}
