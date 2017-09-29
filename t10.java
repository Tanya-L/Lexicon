/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour;


import java.util.Scanner;

public class t10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give me a number?");
        int a = sc.nextInt();
        for (int i=0; i<=50; i+=a){
            System.out.println(i);
        }
    }
}