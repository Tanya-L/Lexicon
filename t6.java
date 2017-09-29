/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour;

/**
 *
 * @author User
 */
public class t6 {
    public static void main(String[] args) {
        start();   
    }
    public static void start() {
        String s1 = "Something";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);   
    }
    public static String fix(String s1) {
        s1 = s1 + " new ";
        System.out.println(s1);   
        return s1;
    }
}
