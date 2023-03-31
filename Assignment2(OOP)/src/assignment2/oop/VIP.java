/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.oop;

/**
 *
 * @author User
 */
public class VIP {
    private boolean vip;
    private String name;
    private int age; 
    private String email;
    
    public boolean getVIP(){
        return vip;
    }
    
    public String getName(){
        return name; 
    }
    
    public int getAge(){
        return age; 
    }
    
    public String getEmail(){
        return email;
    }
    
    public void toString(boolean vip, String name, int age, String email){
        this.vip = vip;
        this.name = name;
        this.age = age;
        this.email = email;
        
        if(vip === true){
               System.out.println(vip)
        }
    }
    
}
