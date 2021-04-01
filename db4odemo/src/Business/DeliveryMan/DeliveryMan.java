/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    String name;
    String password;
    String userName;
    String phoneNumber;
    String address;
    ArrayList<Order> orders;
       
    public DeliveryMan(String name, String userName, String password, String phoneNumber, String address){
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public ArrayList<Order> getorders(){
        if(orders == null){
            orders = new ArrayList<Order>();
        }
        return orders;
    }
    
      @Override
    public String toString() {
        return name;
    }
    
    
    
}
