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
public class House {
    
    private String typeOfHouse;
    private int price;
    private int numberOfRooms;
    private String ownerName;
    
    public House (String typeOfHouse, int price, int numberOfRooms, String ownerName){
        this.typeOfHouse = typeOfHouse;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.ownerName = ownerName;    
    }
    
    public void setTypeOfHouse(String typeOfHouse){
        this.typeOfHouse = typeOfHouse;  
    }
    
    public String getTypeOfHouse(){
        return typeOfHouse;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
    
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;  
    }
    public String getOwnerNAme(){
        return ownerName;
    }
    
    public String toString (){
        return numberOfRooms + " rooms "+ typeOfHouse +" "+ ownerName+ " was sold at "+ price + " kronor";
    }
    
}
