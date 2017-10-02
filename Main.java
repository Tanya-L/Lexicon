/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_02monday;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
       //Person 
       Person p1 = new Person("Tanya", 18);
       Person p2 = new Person(12334,"Anya","Women" ,18);
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();
        
       //Computer
        Computer comp1 = new Computer (1, "MAC pro", "IOS", 7500 );
        System.out.println(comp1); // old info
        Computer comp2 = new Computer (2, "MAC air", "IOS", 5000 );
        System.out.println(comp2);
        Computer comp3 = new Computer (3, "Dell", "Windows", 2500 );
        Computer comp4 = new Computer (4, "Asos", "Linux", 2000 );
        System.out.println(comp3);
        
                // change info 
        comp1.setPrice(10000);
        comp2.setModel("HP");
        comp3.setOperationSystem("Ubunty");
        
                //print new info
        System.out.println(comp1);
        
        System.out.println(comp2);
        System.out.println(comp3);
        System.out.println(comp4);
        System.out.println();
        
       // Car 
        Car c1 = new Car (290, "Volvo", "gold" );
        Car c2 = new Car (291, "BMV", "black" );
        
        System.out.println(c1);
        System.out.println(c2);
        
        //house
        House h1 = new House ("appartment", 200000, 2, "Svenson");
        House h2 = new House ("villa", 3000000, 5, "Carlsson");
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();
        
        
        System.out.println("Uppdate information: ");
        h1.setOwnerName("Bullesson");
        h2.setTypeOfHouse("rådhus");
        
        System.out.println(h1);
        System.out.println(h2);
        
        h1.getPrice();
        
        System.out.println("new price "+ h1.getPrice() + " kronor" );
    }
    
}
