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
public class DayTreeProblem1Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a S");
        float S = sc.nextFloat();
        sc.nextLine();

        System.out.println("Give me a R1");
        float R1 = sc.nextFloat();
        sc.nextLine();

        System.out.println(Calc(S, R1));
        
           }
    

    public static float Calc(float a, float b) {

        float r2;
        r2 = (2 * a) - b;
        return r2;
    }
}

