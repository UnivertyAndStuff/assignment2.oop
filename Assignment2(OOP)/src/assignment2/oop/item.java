/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.oop;

/**
 *
 * @author user
 */
public class item {
    private String name;
    private String discription;
    private double price;
    private String category;
    private boolean availability;
    
    public String getName(){
        return name;
    }
    public String getDiscription(){
        return discription;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public boolean getAviable(){
        return availability;
    }
    
    public void setValue(String name, String discription, double price, String category, boolean availability){
        this.name = name;
        this.discription = discription;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }
    
    public String Foods(){
    }
    public String Merchandise(){
    }
    public String Service(){
    }
    
    
}
