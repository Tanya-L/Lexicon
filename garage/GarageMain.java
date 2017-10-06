// create garage with cars. Make methods: add car in garage, remove, find, ask user about serching car
package garage;

import java.util.*;


public class GarageMain{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Car c1 = new Car(Model.VOLVO, Color.GOLD, 2017, 1000000);
        
        Car c2 = new Car(Model.AUDI, Color.RED, 2015, 500000);
        
        Car c3 = new Car(Model.HONDA, Color.BLACK, 2000, 250000);
        
        Car c4 = new Car(Model.HONDA, Color.SILVER, 2004, 1000);
        
    
    Garage g = new Garage();
    
    g.addToGarage(c1);
    g.addToGarage(c2);
    g.addToGarage(c3);
    g.addToGarage(c4);
    
    g.showMeGarage();
//    g.findCar(Model.MERCEDES, Color.GOLD, 2000);
    //g.deleteCar(Model.VOLVO, Color.GOLD);
    //g.deleteCar(Model.SAAB, Color.YELLOW, 2017);
   g.showMeGarage();
   
   
    System.out.println("Which model  would you like to find?");
    String model = sc.nextLine().toUpperCase();
    System.out.println("Which Color  would you like to find?");
    String color = sc.nextLine().toUpperCase();
    System.out.println("Which year  would you like to find?");
    int year = sc.nextInt();
    
    
    System.out.println(g.findCar(Model.valueOf(model),Color.valueOf(color),year));
    
    }
    
}
