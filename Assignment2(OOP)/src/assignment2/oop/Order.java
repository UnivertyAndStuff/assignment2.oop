/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2.oop;

/**
 *
 * @author User
 */
public class order {
    private String foods;
    private String beverage;
    private int amount;
    
    public void order(String foods, String beverage, int amount){
        this.foods = foods;
        this.beverage = beverage;
        this.amount = amount;
    }
    
    public String getFoods(){
        return foods;
    }
    
    public String getBeverage(){
        return beverage;
    }
    
    public int getAmount(){
        return amount;
    }
}
