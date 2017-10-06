package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    Scanner sc = new Scanner(System.in);

    private static ArrayList<Car> cars = new ArrayList<>();

    public void addToGarage(Car car) {
        cars.add(car);
    }

    public void showMeGarage() {
        System.out.println(cars);
    }

    public void deleteCar(Model model, Color color, int year) {
        Car temp = null;

        for (Car c : cars) {
            if (c.getModel() == model && c.getColor() == color || c.getYear() == year) {
                temp = c;
            }
        }
        cars.remove(temp);
    }
public ArrayList<Car> findCar (Model model, Color color, int year) {
   ArrayList<Car> temps = new ArrayList<>();
    for (Car c : cars) {
        if (c.getModel().equals( model) || c.getColor().equals(color) || c.getYear() == year){
            temps.add(c);
        }
        
    }
    return temps;
}

    public ArrayList<Car> findCar(Model model) {
        ArrayList<Car> temps = new ArrayList<>();
        for (Car c : cars) {
            if (c.getModel().equals(model)) {
                temps.add(c);
            }
        }
        return temps;

    }
}
