
package garage;

public class Car {
    
    private int year;
    private Color color;
    private Model model;
    private int price;
    
    
    public Car (Model model, Color color, int year, int price){
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return  "[" + model + "  " + color + "  "+ year + "   " + price + "]";
    }
    
}
