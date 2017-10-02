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
public class Computer {

    private int computerID;
    private String model;
    private String operationSystem;
    private int price;

    public Computer(int computerID, String model, String operationSystem, int price) {
        this.computerID = computerID;
        this.model = model;
        this.operationSystem = operationSystem;
        this.price = price;
    }
    
    public int getComputerID() {
        return computerID;
    }
    
    public void setComputerID(int computerID) {
        this.computerID = computerID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return computerID + " : " + model + " with " + operationSystem + " operation system " + " the cost $" + price;

    }

}
