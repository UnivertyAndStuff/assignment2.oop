/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2.oop;

/**
 *
 * @author User
 */
public class Customer {
    private String name;
    private int age;
    private String paymentInfo;
    private String address;
    private String email;

    public void Customer(String name, int phoneNo, String paymentInfo, String address, String email){
        this.name = name;
        this.age = age;
        this.paymentInfo = paymentInfo;
        this.address = address;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPaymentInfo(){
        return paymentInfo;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    
}