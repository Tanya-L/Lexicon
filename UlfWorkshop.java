/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulfworkshop;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UlfWorkshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=34;
        int j=56;
        int heltal = i*j+56;
        
        System.out.println(heltal); // number with out .00
        
        double d= 45.78;
        double decimalTal = d/2.23;
        System.out.println(decimalTal); // number with .00 
        
        System.out.println(heltal*decimalTal); 
        int avhugget = (int) decimalTal; //chop off decimals, lost .00
        System.out.println(avhugget);
        // TODO code application logic here 
        String namn = "Ulf";
        String s = "Hej";
        System.out.println(s+ " "+ namn + "!");
        System.out.println(namn.toUpperCase());
        System.out.println(s.length());
        
        //*String inString = JOptionPane.showInputDialog("How your name?");
        //System.out.println("Hej" + inString+ "!"); 
        //*
        Date nu = nu Date();
        String                                                                                                                                                                                                                                                                                                                                                                                                  nowString = nu.toString();
        System.out.println(nowString);
        
    }

    private static void Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
