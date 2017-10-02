/*
 * Class Exercises:
We have some objects below, and we need to create a class for each of them. Please try to
find out which properties and which methods they should have.
Note: Each class should have constructor, getter and setter methods.
 */
package pkg20_02monday;

/**
 *
 * @author User
 */
public class Car {
    private int carID;
    private String model;
    private String color;
    
    public Car (int carID, String model, String color){
        this.carID = carID;
        this.model = model;
        this.color = color;
    }
    public String toString(){
        return carID +" : " + model + " with color "+ color;
       
    }
}
