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
public class Person {
    private int personalID;
    private String name;
    private int age;
    private String gender;
    
    
    public Person(int personalID, String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.personalID = personalID;
        this.gender = gender;      
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.personalID = 1234445;
        this.gender = "Women";
    }

    @Override
    public String toString() {
        return personalID +": "+name+" - "+ age +" - "+gender;
    }
    
    
}
